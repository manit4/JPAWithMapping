package com.hcl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hcl.entity.Address;
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
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Laptop laptop = new Laptop("5", "1300");
//		
//		Student student = new Student("105", "4568", "Sowmya");
//
//		student.setLaptop(laptop);
//		
//		laptop.setStudent(student);
//		
//		
//		studentService.save(student);
//	
//		
//	}
	
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		System.out.println("running...");
//		
//		Address address1 = new Address("a_11", "Gurgaon", "102", "Haryana");
//		Address address2 = new Address("a_12", "Noida", "202", "U.P");
//		
//		List<Address> addresses = new ArrayList<Address>();
//		addresses.add(address1);    addresses.add(address2);
//		
//		Laptop laptop = new Laptop("l_10", "1000");
//		
//		Student student = new Student("100", "1234", "Suhail");
//		
//		student.setLaptop(laptop);
//		laptop.setStudent(student);
//		
//		address1.setStudent(student);
//		address2.setStudent(student);
//		
//		student.setAddresses(addresses);
//		
//		
//		studentService.save(student);
//	
//	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println();
		
		Student student = studentService.findStudent("100");
		
		System.out.println("Here is the Student Primary Details");
		
		System.out.println(student.getId()+", "+student.getPassword()+", "+student.getName());
		
		System.out.println("Here is the Student' Laptop Details");
		
		System.out.println(student.getLaptop().getSerialNo()+", "+student.getLaptop().getPrice());
		
		System.out.println("Here is the Student' Address/s Details");
		
		List<Address> addresses = student.getAddresses();
		
		System.out.println("Addressess are "+addresses);
		
		for(Address address : addresses) {
			
			System.out.println(address.getId()+", "+address.getHouseNumber()+", "+address.getCity()+", "+address.getState());
		}
	
	}
	
	

}
