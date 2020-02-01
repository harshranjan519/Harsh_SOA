package com.accolite.repos;
import java.util.ArrayList;  
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.accolite.repos.Student;
import com.accolite.repos.StudentDB;


@WebService(endpointInterface = "com.accolite.repos.StudentServiceImpl")
public class StudentServiceImpl implements StudentService{

	StudentDB sdObj;

	@Override
	public Student get_student(String id) {
		return sdObj.get_student(id);
	}

	@Override
	public void add_student(Student stu) {
		sdObj.add_student(stu);
	}

	@Override
	public void delete_student(String id) {
		sdObj.delete_student(id);
		
	}

	@Override
	public int num_of_scholar() {
		return sdObj.num_of_scholar();
	}
}
