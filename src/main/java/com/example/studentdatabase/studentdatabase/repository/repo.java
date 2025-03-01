package com.example.studentdatabase.studentdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentdatabase.studentdatabase.Entity.Student;

@Repository
public interface repo extends JpaRepository<Student, Integer>{
	
	

}
