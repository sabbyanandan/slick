package com.example.slick;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SlickApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlickApplication.class, args);
	}

	@Bean
	public Supplier<String> data() {
		return () -> "super";
	}

	@Bean
	public Consumer<String> print() {
		return val -> System.out.println(val);
	}

	@Bean
	public Consumer<String> up() {
		return val -> System.out.println(val.toUpperCase());
	}
}
