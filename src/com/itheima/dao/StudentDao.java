package com.itheima.dao;

import java.util.List;

import com.itheima.po.Student;
import org.apache.ibatis.annotations.Param;




public interface StudentDao {
    public int addStudnet(Student studnet);
	
	public List<Student> findAllStu();

	public void delStu(int id);
	
	public Student findStuById(int id);
	
	public int updateStu(Student student);

	public Student findStuByName(@Param("name")String name);
}
