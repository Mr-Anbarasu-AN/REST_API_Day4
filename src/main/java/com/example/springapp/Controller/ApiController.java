package com.example.springapp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Student;
import com.example.springapp.Service.ApiService;

@RestController
public class ApiController {


	@Autowired
	ApiService stuService;
	@PostMapping("/addDetails")
	public Student addinfo(@RequestBody Student st) {
		return stuService.saveDetails(st);
	}
	
	@GetMapping("/showDetails")
	public List<Student> fetchDetails(){
		return stuService.getDetails();
	}
	
	@PutMapping("/updateDetails")
	public Student updateInfo(@RequestBody Student st1) {
		return stuService.updateDetails(st1);
	}
	
	@DeleteMapping("/deleteDetails/{id}")
	public String deleteInfo(@PathVariable("id") int id) {
		stuService.deleteDetails(id);

		return "Details is Deleted Successfully";
		
		
	}
	
	
	
}