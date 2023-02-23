package com.example.springapp.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Student;
import com.example.springapp.Repositories.StudentRepo;

@Service
public class ApiService {

	@Autowired
	StudentRepo stRepo;
	
	public Student saveDetails(Student e)
	{
		return stRepo.save(e);
	}
	
	public List<Student> getDetails(){
		return stRepo.findAll();
	}
	
	public Student updateDetails(Student e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails(int Id)
	{
		stRepo.deleteById(Id);
	}

	
}