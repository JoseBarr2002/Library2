package com.josebarrera.Library2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @RestController // Lets framework know that it is an REST API controller
public class Library2Application {

	public static void main(String[] args) {
		SpringApplication.run(Library2Application.class, args);
	}

	// @GetMapping("/root")
	// public String apiRoot() {
	// return "Hello world!";
	// }

}
