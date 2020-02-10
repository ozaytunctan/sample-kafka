package com.ozaytunctan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@EnableRetry
public class SampleQueueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleQueueApplication.class, args);
	}

}
