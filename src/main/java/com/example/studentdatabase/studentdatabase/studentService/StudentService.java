package com.example.studentdatabase.studentdatabase.studentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentdatabase.studentdatabase.Entity.Student;
import com.example.studentdatabase.studentdatabase.repository.repo;

@Service
public class StudentService {
	
	@Autowired
	private repo repo;

	public Student savestudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	public List<Student> getallstudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
		}

	public Student getByStudentId(int id) {
		// TODO Auto-generated method stub
		Optional<Student> optional=repo.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}

	public Student updateStudentId(Student student, int id) {
		// TODO Auto-generated method stub
		Optional<Student> optional=repo.findById(id);
		Student dbstudent=new Student();
		if(optional.isPresent())
		{
			dbstudent=optional.get();
			dbstudent.setName(dbstudent.getName());
			return repo.save(student);
					
		}
		return null;
		
	}

	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
	Optional<Student> optional=repo.findById(id);
	if(optional.isPresent())
	{
		repo.deleteById(id);
		return optional.get();
		}
	return null;
	}


	
	

	
	
	

}
