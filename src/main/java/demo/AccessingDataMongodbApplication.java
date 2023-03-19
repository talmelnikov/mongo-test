package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.stereotype.Component;


@SpringBootApplication
//@EnableMongoRepositories("com.example.repositoy")
//@ComponentScan("com.example.*")

public class AccessingDataMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

}
