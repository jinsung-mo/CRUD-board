package com.ssafy.crud_board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CrudBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudBoardApplication.class, args);
	}

}
