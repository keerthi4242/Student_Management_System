package com.example.springbootdemo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo1.model.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student,Integer>{

}
