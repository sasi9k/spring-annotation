package com.learning.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.basics.service.SpeakerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new  AnnotationConfigApplicationContext(AppConfig.class);
    	
    	
    	SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
    	System.out.println(speakerService);
    	
    	SpeakerService speakerService2 = appContext.getBean("speakerService", SpeakerService.class);
     	System.out.println(speakerService2);
    	//SpeakerService speakerService = new SpeakerServiceImpl();
    	
    	
        System.out.println( "Hello World! "+ speakerService.getSpeakers().get(0).getFirstName() );
    }
}
