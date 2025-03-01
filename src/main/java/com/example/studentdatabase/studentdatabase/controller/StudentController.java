package com.example.studentdatabase.studentdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdatabase.studentdatabase.Entity.Student;
import com.example.studentdatabase.studentdatabase.studentService.StudentService;


@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public Student savestudent(@RequestBody Student student)
	{
		return service.savestudent(student);
	}
	
	@GetMapping("/getall")
	public List<Student> getallstudent()
	{
		return service.getallstudent();
	}
	
	@GetMapping("/get/{id}")
	public Student getByStudentId(@PathVariable int id)
	{
		return service.getByStudentId(id);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudentId(@RequestBody Student student,@PathVariable int id)
	{
		return service.updateStudentId(student, id);
	}

	@DeleteMapping("/delete/{id}")
	public Student deleteStudent(@PathVariable int id)
	{
		return service.deleteStudent(id);
	}
}
