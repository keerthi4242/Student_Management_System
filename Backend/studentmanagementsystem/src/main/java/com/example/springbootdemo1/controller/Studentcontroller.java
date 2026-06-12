package com.example.springbootdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo1.model.Student;
import com.example.springbootdemo1.service.Studentservice;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/students")
public class Studentcontroller {
	  @Autowired
	private Studentservice studentservice;
	  @PostMapping("/add")
	public Student addstudent(@RequestBody Student student) {
		 return studentservice.addstudent(student); 
	}
	  @GetMapping("/get")
	public List<Student> getstudents(){
		 return studentservice.getstudents();
	}
	  @GetMapping("/get/{studId}")
   public Student getstudentsbyid(@PathVariable int studId){
		 return studentservice.getstudentsbyid(studId);
	}
	  @PutMapping("/update")
	public Student updatestudent(@RequestBody Student student) {
		return studentservice.updatestudent(student);
	}
	  @DeleteMapping("/delete/{studId}")
	public String deletestudentbyid(@PathVariable int studId) {
		 studentservice.deletestudentsbyid(studId);
		 return "Student deleted successfully";
	}

}
