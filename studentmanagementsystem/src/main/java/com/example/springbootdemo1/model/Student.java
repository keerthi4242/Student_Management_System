package com.example.springbootdemo1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Students_Details")
@Data
public class Student {
       @Id
        private int studId;
       @Column
        private String studName;
       @Column
        private String studBranch;
       @Column
        private String studEmail;
       @Column
        private double studGpa;
       @Column
        private String studContact;
       @Column
        private String studAdd;
        
        
        
}
