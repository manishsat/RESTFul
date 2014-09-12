package com.scb.restful.ws;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.message.filtering.EntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.scb.resftful.resource.EmployeeResource;

public class RestFulApplication  extends ResourceConfig{
	/**
	 * Register the JAX-RS application components.
	 */
	
	
	public RestFulApplication() {
		
		register(EmployeeResource.class);
		
		
		// register features
		register(JacksonFeature.class);
		register(MultiPartFeature.class);
		register(EntityFilteringFeature.class);
				
				
				
	}
}
