package com.controllerschoolapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.implischoolapp.Implischoolapp;
import com.stuschoolapp.Students;

@RestController
public class MainController {
	
	@Autowired
	Implischoolapp impapp;
	
	@GetMapping("/getallstudents")
	public List<Students> getallstudents(){
		return impapp.getallstudents();
	}
	
	@PostMapping("/addstudents")
	public void addstudents(@RequestBody Students addstudent) {
		impapp.addstudents(addstudent);
	}
	
	@DeleteMapping("/delelestudent/{id}")
		public Students deletestudent(@PathVariable int id) {
		return impapp.deletestudent(id);
		
	}
	

}
