package com.example.SpringData;

import com.example.SpringData.entities.U5S1G4.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class SpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.example.SpringData.SpringDataApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.example.SpringData.SpringDataApplication.class);

		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}
