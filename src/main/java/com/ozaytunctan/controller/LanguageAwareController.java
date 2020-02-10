package com.ozaytunctan.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ozaytunctan.controller.spec.Loggable;
import com.ozaytunctan.service.spec.Messages;

@RestController
@RequestMapping(path = "/api/language")
public class LanguageAwareController extends Loggable {
	
	@Autowired
	Messages messages;
	
	public LanguageAwareController() {
		super(LanguageAwareController.class);
	}
	
	@GetMapping(path = "/changeLanguage")
	public ResponseEntity<Locale> setLanguage(@RequestParam ("lang") String lang ){
		logger.info("[LanguageAwareController.class][setLanguage] metod call ...");
		Locale locale=Locale.forLanguageTag(lang);
		LocaleContextHolder.setLocale(locale);
		return ResponseEntity.ok(locale);
	}

}
