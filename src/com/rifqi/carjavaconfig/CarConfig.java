package com.rifqi.carjavaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//The actual configuration, no XML, just... Java
@Configuration
@ComponentScan("com.rifqi.carjavaconfig")
// The property file declared here
@PropertySource("classpath:configuration.properties")
public class CarConfig {
	
}
