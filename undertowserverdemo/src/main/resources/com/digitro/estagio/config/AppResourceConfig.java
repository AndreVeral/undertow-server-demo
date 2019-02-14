package com.digitro.estagio.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/*")
public class AppResourceConfig extends ResourceConfig {

	public AppResourceConfig() {
		packages("com.digitro.estagio.resource");
	}
	
}
