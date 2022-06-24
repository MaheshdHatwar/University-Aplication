package com.universities.Exception.Hand;

public class UniversityNotFoundException extends RuntimeException{
	public UniversityNotFoundException(int id) {
		super("Could not  find university or Invalid Id" + id);
	}

}
