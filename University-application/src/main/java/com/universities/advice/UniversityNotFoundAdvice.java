package com.universities.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.universities.Exception.Hand.UniversityNotFoundException;

@ControllerAdvice
public class UniversityNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(UniversityNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String  universityNotFoundHandler(UniversityNotFoundException ex) {
		return ex.getMessage();
	}
}
