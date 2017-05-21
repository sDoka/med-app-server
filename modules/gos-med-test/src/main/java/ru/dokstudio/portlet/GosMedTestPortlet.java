package ru.dokstudio.portlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.PortalUtil;

import ru.dokstudio.model.TestItemAnswer;
import ru.dokstudio.model.TestItemQuestion;
import ru.dokstudio.portlet.testimport.TestItemImporterUtil;
import ru.dokstudio.portlet.testimport.model.TestItemImportModel;
import ru.dokstudio.service.TestItemAnswerLocalService;
import ru.dokstudio.service.TestItemQuestionLocalService;
import javax.portlet.ProcessAction;

/**
 * @author bmm
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=gos-med-test Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class GosMedTestPortlet extends MVCPortlet {
	private static final Log log = LogFactoryUtil.getLog(GosMedTestPortlet.class);

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {
			
			int questionsCount = _questionService.getTestItemQuestionsCount();
			Random randomizer = new Random();
			if (questionsCount <= 0) {
				throw new PortalException("No question available.");
			}
			
			int index = randomizer.nextInt(questionsCount);
			TestItemQuestion question = _questionService.getQuestionByQuestionNumber(index);
			List<TestItemAnswer> answers = _answerService.getAnswersByQuestionId(question.getQuestionId());
			TestItem testItem = new TestItem(question, answers);
			renderRequest.setAttribute("testItem", testItem);
		} catch (SystemException | PortalException e) {
			log.error(e.getMessage());
		}
		super.render(renderRequest, renderResponse);
	}

	@ProcessAction(name = "uploadTest")
	public void uploadTest(ActionRequest actionRequest, ActionResponse actionResponse) {
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		File testImportFile = uploadRequest.getFile("testFileInput");
		// TODO add validations
		try {
			List<TestItemImportModel> importedItems = TestItemImporterUtil.importTestItems(testImportFile);
			generateTest(importedItems);
		} catch (Exception e) {
			log.error(e.getMessage());
			//SessionErrors.add(actionRequest, e.getMessage());
		}
	}

	private List<TestItem> generateTest(List<TestItemImportModel> importedItems) {
		List<TestItem> testItems = new ArrayList<>();
		TestItemQuestion question;
		List<TestItemAnswer> answers;
		TestItem testItem;
		for (TestItemImportModel importedItem : importedItems) {
			question = generateQuestion(importedItem.getQuestion(), importedItems.indexOf(importedItem));
			answers = generateAnswers(question, importedItem.getAnswers());
			testItem = new TestItem(question, answers);
			testItems.add(testItem);
		}
		return testItems;
	}

	private TestItemQuestion generateQuestion(String questionContent, int questionNumber) {
		TestItemQuestion question = _questionService
				.createTestItemQuestion(_counterLocalService.increment(TestItemQuestion.class.getName()));
		question.setQuestion(questionContent);
		question.setModifiedDate(new Date());
		question.setQuestionNumber(questionNumber);
		_questionService.updateTestItemQuestion(question);
		return question;
	}

	private List<TestItemAnswer> generateAnswers(TestItemQuestion question, List<String> answersContents) {
		List<TestItemAnswer> answers = new ArrayList<>();
		boolean isCorrect;
		TestItemAnswer answer;
		for (String answerContent : answersContents) {
			answer = _answerService
					.createTestItemAnswer(_counterLocalService.increment(TestItemAnswer.class.getName()));
			answer.setAnswer(answerContent); 
			if (answersContents.indexOf(answerContent) == 0) {
				isCorrect = true;
			} else {
				isCorrect = false;
			}
			answer.setIsCorrect(isCorrect);
			answer.setQuestionId(question.getQuestionId());
			answers.add(answer);
			_answerService.updateTestItemAnswer(answer);
		}
		return answers;
	}

	@Reference(unbind = "-")
	private CounterLocalService _counterLocalService;
	@Reference(unbind = "-")
	private TestItemQuestionLocalService _questionService;
	@Reference(unbind = "-")
	private TestItemAnswerLocalService _answerService;

}