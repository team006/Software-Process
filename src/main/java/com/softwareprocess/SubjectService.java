package com.softwareprocess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface SubjectService {
	Subject findOneSubject();
	Subject findByName(String name);
}
