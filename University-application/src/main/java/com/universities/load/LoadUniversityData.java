package com.universities.load;

//import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
//import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.universities.dao.UniversityRepository;
import com.universities.entities.University;

//import ch.qos.logback.classic.Logger;
@Configuration
public class LoadUniversityData {
	private static final Logger log = LoggerFactory.getLogger(LoadUniversityData.class);
	
	CommandLineRunner initLoadUniversityData(UniversityRepository universityRepository) {
		return ArgsAnnotationPointcut -> {
			log.info("Preloading "+universityRepository.save(new University(1,"SGBUA",20)));
			log.info("Preloading "+universityRepository.save(new University(2,"RTMNU",15)));
			log.info("Preloading "+universityRepository.save(new University(3,"BATU",8)));
			log.info("Preloading "+universityRepository.save(new University(4,"JNU",25)));
			log.info("Preloading "+universityRepository.save(new University(5,"Gondwana",22)));
			log.info("Preloading "+universityRepository.save(new University(6,"Dr.Ambedkar",15)));
			log.info("Preloading "+universityRepository.save(new University(7,"IIT",22)));
			log.info("Preloading "+universityRepository.save(new University(8,"NIT",33)));
			log.info("Preloading "+universityRepository.save(new University(9,"IIIT",9)));
			log.info("Preloading "+universityRepository.save(new University(10,"Phule univ",19)));
		};
	}

}
