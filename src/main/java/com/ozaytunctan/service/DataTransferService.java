package com.ozaytunctan.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.ozaytunctan.controller.spec.Loggable;

@Service
public class DataTransferService extends Loggable {

	
	
	
	public DataTransferService() {
		super(DataTransferService.class);
	}

	@Retryable(
			value = { Exception.class },
			maxAttempts = 3, 
			backoff = @Backoff(delay = 5000)
			  )
	@Scheduled(fixedDelay = 15000)
	public String transfer() {
        System.out.println("Data transfer loading...");
		return "";
	}

}
