package com.hcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hcl.entity.Laptop;
import com.hcl.entity.Student;
import com.hcl.service.StudentService;

@SpringBootApplication
public class JpaWithMappingApplication implements CommandLineRunner{
	
	@Autowired
	StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(JpaWithMappingApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		Student student = studentService.findStudent("101");
//		
//		System.out.println("Here are the Student Details..");
//		
//		System.out.println(student.getId()+", "+student.getPassword()+", "+student.getName());
//		
//		System.out.println("Below is the Laptop' details..");
//		
//		System.out.println(student.getLaptop().getSerialNo()+", "+student.getLaptop().getPrice());
//	
//		
//	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Laptop laptop = new Laptop("5", "1300");
		
		Student student = new Student("105", "4568", "Sowmya");

		student.setLaptop(laptop);
		
		laptop.setStudent(student);
		
		
		studentService.save(student);
	
		
	}

}
