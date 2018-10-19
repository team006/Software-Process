package com.softwareprocess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectRepository subjectRepository;
	
	public Subject findOneSubject(){
		return subjectRepository.getOne(1);
	}
	
	public Subject findByName(String name){
		return subjectRepository.findBySubject(name);
	}
}
