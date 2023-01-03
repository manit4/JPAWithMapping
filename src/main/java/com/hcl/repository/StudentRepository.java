package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String>{
	
	

}
