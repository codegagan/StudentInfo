package com.emc.student.StudentInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService StudentService;
	
	@RequestMapping("")
	public List<Student> getAllStudent()
	{
		return StudentService.getAllStudent();
}

	@RequestMapping("/{id}")
	public Student getStudent(@PathVariable String id)
	{
		return StudentService.getStudent(id);
	}
	
	@RequestMapping(value="",method=RequestMethod.POST, consumes="application/json")
	public void addStudent(@RequestBody Student st) {
           StudentService.addStudent(st);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT, consumes="application/json")
	public void updateStudent(@PathVariable String id,@RequestBody Student S)
	{
		StudentService.updateStudent(id,S);
	}
}
