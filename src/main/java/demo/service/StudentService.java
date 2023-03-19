package demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entity.Student;
import demo.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	public Student creatStudent(Student student) {
		 return studentRepository.save(student);
	}

}
