package com.learning.basics.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.basics.model.Speaker;
import com.learning.basics.repositorry.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
	@Autowired
	SpeakerRepository speakerRepository ;

	public SpeakerServiceImpl() {
		System.out.println("speakerServiceImpl no args constructor");
	}
	

	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		System.out.println("speakerServiceImpl repository constructor");
		this.speakerRepository = speakerRepository;
	}

	@PostConstruct()
	private void initialize() {
		System.out.println("i am in initiaize");
	}

	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
		System.out.println("speakerServiceImpl setter");
		this.speakerRepository = speakerRepository;
	}

	@Override
	public List<Speaker> getSpeakers(){
		
		return speakerRepository.getSpeakers();
		
	}

}
