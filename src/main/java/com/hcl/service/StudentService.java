package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.Student;
import com.hcl.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student findStudent(String id) {
		
		return studentRepository.findById(id).get();
	}
	
	public void save(Student student) {
		
		studentRepository.save(student);
	}

}
