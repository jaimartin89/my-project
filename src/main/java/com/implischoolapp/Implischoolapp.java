package com.implischoolapp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.interschoolapp.Interschoolapp;
import com.stuschoolapp.Students;

import java.util.ArrayList;
import java.util.Iterator;
@Service
public class Implischoolapp implements Interschoolapp {
	
	List <Students> student=new ArrayList<Students>();

	@Override
	public List<Students> getallstudents() {
		return student;
	}

	@Override
	public void addstudents(Students addstudent) {
		student.add(addstudent);
		
	}

	@Override
	public Students deletestudent(int id) {
		Iterator<Students> itr=student.iterator();
			while(itr.hasNext()) {
				Students student=itr.next();
			if(student.getStudentId()==id) {
				itr.remove();
				return student;
			}
		}
		return null;
	}

}
