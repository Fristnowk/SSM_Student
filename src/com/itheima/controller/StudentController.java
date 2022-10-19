package com.itheima.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itheima.po.Student;
import com.itheima.server.StudentService;



@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value="/main",method=RequestMethod.GET)
    public String main(Model model) {
    	List<Student> students=null;
    	students=studentService.findAllStu();
    	//model.addAllAttributes("student",student);
    	model.addAttribute("students", students);
		return "main";
    }
    
    @RequestMapping(value="/addStudent",method=RequestMethod.POST)
    public String sendMail(Model model,String name,String profession,String age,String gender,
    		                            HttpServletRequest request,HttpServletResponse response) {
	    int success=0;	
	    Student student=new Student();
	    student.setName(name);
	    student.setProfession(profession);
	    student.setAge(age);
	    student.setGender(gender);
	    if(studentService.addStudent(student)) {
	    	success=1;
	    }
	    try {
			response.getWriter().write("{\"success\":"+success+"}");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return "redirect:main";
    	
    }
    @RequestMapping(value="/delete", method=RequestMethod.GET)
	public String del(int id){
		studentService.delStu(id);
		return "redirect:main";
	}
    @RequestMapping(value="/findStuByName.action", method=RequestMethod.GET)
	public String findStuByid(String name,Model model){
		Student student=null;
		System.out.println(name);
		List<Student> students= new ArrayList<Student>();
		student= studentService.findStuByName(name);
		if (student!=null) {
			students.add(student);
		}else {
			students = studentService.findAllStu();
		}
		System.out.println(students);
		model.addAttribute("students",students);
		return "main";
	}
    @RequestMapping(value="/editStudent",method=RequestMethod.GET)
    public String editUser(int param,String name,String profession,String age,String gender,int id,Model model ) {
		Student student=new Student();
		try {
			if(param==0) {
				student=studentService.findStuById(id);
				System.out.println(student);
				model.addAttribute("student", student);
				return"editStudent";
			}else if(param==1) {
				student.setId(id+"");
				student.setGender(gender);
				student.setName(name);
				student.setProfession(profession);
				student.setAge(age);
				System.out.println(student);
				Boolean aBoolean=studentService.uqdateStu(student);
				System.out.println(aBoolean);			
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return "redirect:main";
    	
    }
    
}
