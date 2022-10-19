package com.itheima.server;

import java.util.List;

import com.itheima.po.Student;

public interface StudentService {
	public List<Student> findAllStu();
	
	public boolean addStudent(Student student);
	
	public void delStu(int id);
	
	public Student findStuById(int id);
	
	public boolean uqdateStu(Student student);
	
	public Student findStuByName(String name);
}
