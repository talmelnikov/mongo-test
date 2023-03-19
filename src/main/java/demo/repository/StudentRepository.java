package demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import demo.entity.Student;

@Repository
public interface StudentRepository  extends MongoRepository<Student,String>{

}
