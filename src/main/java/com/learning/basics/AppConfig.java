package com.learning.basics;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learning.basics.repositorry.SpeakerRepository;
import com.learning.basics.repositorry.SpeakerRepositoryImpl;
import com.learning.basics.service.SpeakerService;
import com.learning.basics.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"com.learning.basics"})
public class AppConfig {
	
//	@Bean(name="speakerService")
//	@Scope(value= BeanDefinition.SCOPE_SINGLETON)
//	public SpeakerService getUserService() {
////		SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//		SpeakerServiceImpl service = new SpeakerServiceImpl();
////		service.setSpeakerRepository(getSpeakerRepository());
//		return service;
//	}
	
//	@Bean(name="speakerRepository")
//	public SpeakerRepository getSpeakerRepository() {
//		return new SpeakerRepositoryImpl();
//		
//	}

}
