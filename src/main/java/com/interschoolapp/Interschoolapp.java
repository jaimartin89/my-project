package com.interschoolapp;
import java.util.List;

import com.stuschoolapp.Students;

public interface Interschoolapp {
	
	public List<Students> getallstudents();
	public void addstudents(Students addstudent);
	public Students deletestudent(int id);

}
