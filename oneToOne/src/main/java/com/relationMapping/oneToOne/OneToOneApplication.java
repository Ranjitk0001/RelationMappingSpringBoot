package com.relationMapping.oneToOne;

import com.relationMapping.oneToOne.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {

//	private AppService appService;
	private final AppService appService;

	@Autowired
	public OneToOneApplication(AppService appService) {
		this.appService = appService;
	}

	@Override
	public void run(String... args) throws Exception {
//		appService.saveData();
		appService.fetchStudentRecord();

	}
	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
		System.out.println("Welcome to RelationMapping");
	}

//	@Override
//	public void run(String... args) throws Exception {
//		appService.saveData();
//	}
}
