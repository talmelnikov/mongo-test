package demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.entity.Student;
import demo.service.StudentService;
@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public Student creatStudent(@RequestBody Student student) {
		return studentService.creatStudent(student);
	}
}
