package org.grails.plugins.routing

import org.apache.camel.spring.SpringRouteBuilder

public class GrailsRouteBuilder extends SpringRouteBuilder {

	def configuration

	public GrailsRouteBuilder(Closure configuration) {
		this.configuration = configuration
	}

	public void configure() {
		configuration.delegate = this
		configuration()
	}
}
