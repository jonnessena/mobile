package com.claro.mobile.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.claro.mobile.dao", "com.claro.mobile.service" })
public class PersistenceXMLConfiguration {

	public PersistenceXMLConfiguration() {
		super();
	}

}
