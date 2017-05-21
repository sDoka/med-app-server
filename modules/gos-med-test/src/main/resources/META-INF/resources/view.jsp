<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
<liferay-theme:defineObjects />
<portlet:defineObjects />

<portlet:renderURL var="nextQuestionURL"></portlet:renderURL>

<c:choose>
	<c:when test="${testItem != null}">
		<div class="test-item-container container-fluid">
			<div class="test-item question-block row-fluid animated fadeInLeft">${testItem.question.getQuestionNumber() + 1}.
				${testItem.question.getQuestion() }</div>
			<c:forEach var="answer" items="${testItem.answers }">
				<div class="test-item answer-block animated fadeInLeft"
					answer-id="${answer.answerId}" ${answer.isCorrect ? 'correct' : ''}>${answer.answer}</div>
			</c:forEach>
			<div
				class="button-row test-item test-item-buttons-row animated fadeInLeft">
				<button class="btn btn-success" disabled id="check-answer-btn">
					<liferay-ui:message key="check.answer" />
				</button>
				<button class="btn btn-primary" disabled id="next-question-btn">
					<liferay-ui:message key="next.question" />
				</button>
			</div>
		</div>
	</c:when>
	<c:otherwise>
		<liferay-ui:message key="test.doesnt.exist"></liferay-ui:message>
		<c:if test="<%=permissionChecker.isOmniadmin()%>">
			<portlet:actionURL name="uploadTest" var="uploadTestUrl">
			</portlet:actionURL>
			<aui:form name="testUploadForm" action="<%=uploadTestUrl%>">
				<aui:input name="testFileInput" type="file" label=""></aui:input>
				<aui:button cssClass="btn btn-success" type="submit"></aui:button>
			</aui:form>
		</c:if>
	</c:otherwise>
</c:choose>

<script>
	$(document)
			.ready(
					function() {
						var $selectedAnswer = null, $checkAnswerBtn = $('#check-answer-btn'), $nextQuestionBtn = $('#next-question-btn'), $answersBlocks = $('.answer-block');
						;

						$answersBlocks.on('click', function(e) {
							if ($selectedAnswer != null) {
								$selectedAnswer.removeClass('selected-answer');
							}

							$selectedAnswer = $(this);
							$(this).addClass('selected-answer');
							$checkAnswerBtn.removeAttr('disabled');
						});

						$checkAnswerBtn.on('click', function(e) {
							if ($($selectedAnswer)[0].hasAttribute("correct")) {
								$($selectedAnswer).addClass('correct-answer');
							} else {
								$($selectedAnswer).addClass('wrong-answer')
								$('.answer-block[correct]').addClass(
										'correct-answer');
							}
							$nextQuestionBtn.removeAttr('disabled');
							$checkAnswerBtn.prop('disabled', true);
						});

						$nextQuestionBtn.on('click', function(e) {
							//$answersBlocks.css('animation-delay', '0s').addClass('fadeOutRight');
							window.location.reload();
						});

						var blockAnswerSelect = function() {
							$answersBlocks.unbind();
						}
					});
</script>

<style>
footer#footer {
	display: none;
}

div.test-item-container {
	margin: 5px 10px;
	padding: 5px;
	min-height: 390px;
}

.test-item {
	margin: 3px 5px;
	min-height: 50px;
	padding: 15px;
	border-radius: 5px;
}

.question-block {
	min-height: 50px;
	background: white;
	border: 1px solid black;
	margin-bottom: 10px;
	-webkit-animation-delay: 0.5s; /* Safari 4.0 - 8.0 */
	animation-delay: 0.5s;
}

.answer-block {
	background: lightblue;
	border: 1px solid grey;
	-webkit-transition-duration: 0.4s; /* Safari */
	transition-duration: 0.4s;
	-webkit-animation-delay: 0.9s; /* Safari 4.0 - 8.0 */
	animation-delay: 0.9s;
}

.test-item-buttons-row {
	-webkit-animation-delay: 1.3s; /* Safari 4.0 - 8.0 */
	animation-delay: 1.3s;
}

.answer-block:hover {
	background: white;
	cursor: pointer;
}

.selected-answer {
	background: white;
	border-color: lightblue;
}

.correct-answer {
	background: white;
	border-color: green;
}

.wrong-answer {
	background: white;
	border-color: red;
}
</style>