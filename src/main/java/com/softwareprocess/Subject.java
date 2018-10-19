package com.softwareprocess;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Subject implements Serializable {

	@Id
	private int id;

	@NotBlank
	private String subject;

	public Subject() {

	}

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	@Override
	public String toString() {
		return "Subject{" + "ID :" + id
						  + "Subject :" + subject
						  +"}";
	}
}
