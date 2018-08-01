package com.sura.FormatAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sura.FormatAPI.Model.LetterAcute;

@SpringBootApplication
public class FormatApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormatApiApplication.class, args);
		System.out.println("************************************");
		LetterAcute.getInstance();
		System.out.println(LetterAcute.LETTERS_SMALL_ACUTE.get("í"));
		System.out.println("************************************");
	}
}
