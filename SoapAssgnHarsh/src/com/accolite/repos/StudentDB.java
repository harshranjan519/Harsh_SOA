package com.accolite.repos;
import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StudentDB {
	
	
	static HashMap<String,Student> student_data = new HashMap<String,Student>();
	static{
		Student stu1 = new Student("1","harsh ranjan" , 100);
		Student stu2 = new Student("2","harshita ranjan" , 98);
		
		student_data.put("1", stu1);
		student_data.put("2", stu2);
	}	
	
	
	public Student get_student(String id) {
		return student_data.get(id);
	}
	
	
	public void add_student(Student stu) {
		student_data.put(stu.getId(), stu);
	}
	
	public void delete_student(String id) {
		student_data.remove(id);
	}
	
	public int num_of_scholar() {
		int count_scho=0;
		for (Student stu : student_data.values()) {
			if(stu.getMarks()>=95)count_scho++;
		}
		return count_scho;
	}
}

