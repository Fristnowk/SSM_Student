package com.itheima.server.ipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.StudentDao;
import com.itheima.po.Student;
import com.itheima.server.StudentService;
@Service("studentService")
@Transactional
public class StudentServerImpl implements StudentService{
     @Autowired
     private StudentDao studentDao;
	public List<Student> findAllStu() {
		// TODO Auto-generated method stub
		return this.studentDao.findAllStu();
	}

	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.addStudnet(student)>0?true:false;
	}

	public void delStu(int id) {
		// TODO Auto-generated method stub
		this.studentDao.delStu(id);
	}

	public Student findStuById(int id) {
		// TODO Auto-generated method stub
		return this.studentDao.findStuById(id);
	}

	public boolean uqdateStu(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.updateStu(student)>0?true:false;
	}

	public Student findStuByName(String name) {
		// TODO Auto-generated method stub
		return this.studentDao.findStuByName(name);
	}

}
