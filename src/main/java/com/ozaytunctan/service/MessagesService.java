package com.ozaytunctan.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import com.ozaytunctan.service.spec.Messages;

@Service
public class MessagesService implements Messages {

	@Autowired
	private MessageSource messageSource;

	
	@Override
	public String get(String key) {
		return get(key,LocaleContextHolder.getLocale().getLanguage());
	}

	@Override
	public String get(String key, String lang) {
		return messageSource.getMessage(key, null, Locale.forLanguageTag(lang));
	}

}
