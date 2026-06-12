package com.example.springbootdemo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo1.model.Student;
import com.example.springbootdemo1.repository.Studentrepository;

@Service
public class Studentservice {
	          @Autowired
	          private Studentrepository studentrepository;
	public Student addstudent(Student student) {
		 return studentrepository.save(student);
	}
     public List<Student> getstudents(){
		return studentrepository.findAll();
	}
     public Student getstudentsbyid(int studId){
 		return studentrepository.findById(studId).orElse(null);
 	}
     public Student updatestudent(Student student) {
         return studentrepository.save(student);
     }
    
     public void deletestudentsbyid(int studId){
  		 studentrepository.deleteById(studId);
  	}
}
