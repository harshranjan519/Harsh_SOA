package com.accolite.repos;

import java.util.ArrayList;  
import java.util.HashMap;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


import com.accolite.repos.Student;

// interface for five function that is to be implement
@WebService
public interface StudentService {
	
	@WebMethod 
	Student get_student(String id);
	
	@WebMethod
	void add_student(Student stu);
	

	@WebMethod
	void delete_student(String id);
	
	@WebMethod
	int num_of_scholar();

}




