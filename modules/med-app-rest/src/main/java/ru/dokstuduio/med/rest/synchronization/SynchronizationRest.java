package ru.dokstuduio.med.rest.synchronization;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

@ApplicationPath("/synchronization")
@Component(immediate = true, service = Application.class)
public class SynchronizationRest extends Application {
	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}
	@GET
	@Produces("text/plain")
	public String working() {
		return "Synchronization works!";
	}
}
