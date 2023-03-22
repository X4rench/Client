package com.example.telegrambotches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication ( exclude = {DataSourceAutoConfiguration.class })
public class TelegramBotChseduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelegramBotChseduleApplication.class, args);
	}

}
