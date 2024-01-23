package com.java5.slide6.entity;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@SuppressWarnings("serial")
@Data
@Getter
@Setter
@Entity 
public class Clazz {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String semester;
	int numberOfStudents;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createdate")
	Date createDate = new Date();
	public Clazz(String name, String semester, int numberOfStudents, Date createDate) {
		super();
		this.name = name;
		this.semester = semester;
		this.numberOfStudents = numberOfStudents;
		this.createDate = createDate;
	}
	public Clazz() {
		super();
	}
	
}
