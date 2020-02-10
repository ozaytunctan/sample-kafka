package com.ozaytunctan.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class CustomConfiguration {

	
	@SuppressWarnings("unused")
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:i18n/messages");
		messageSource.setDefaultLocale(LocaleContextHolder.getLocale());
		return messageSource;
	}
	
	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper=new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
//		objectMapper.configure(SerializationFeature., state))
		objectMapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
		return objectMapper;
	}
	
	@Bean("taskExecutor")
	public TaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
		executor.setMaxPoolSize(1000);
		executor.setThreadNamePrefix("otunctan-");
		return executor;
	}
	
//	@Bean("quartzScheduler")
//	@Primary
//	public SimpleThreadPool taskScheduler() {
//		SimpleThreadPoolTaskExecutor executor=new SimpleThreadPoolTaskExecutor();
//		executor.setThreadNamePrefix("TASK-SCH-");
//		executor.setThreadCount(1000);
//		return executor;
//	}
	
	
}
