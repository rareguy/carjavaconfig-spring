package com.rifqi.carjavaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.rifqi.carjavaconfig")
@PropertySource("classpath:configuration.properties")
public class CarConfig {
	
}
