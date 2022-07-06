package com.cricket.load;

	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.context.annotation.Configuration;


import com.cricket.mode.CricketPlayers;
import com.cricket.repository.PlayersRepository;

	//import ch.qos.logback.classic.Logger;
	@Configuration
	public class LoadPlayersData {
		private static final Logger log = LoggerFactory.getLogger(LoadPlayersData.class);
		
		CommandLineRunner initLoadUniversityData(PlayersRepository playersRepository) {
			return ArgsAnnotationPointcut -> {
				log.info("Preloading "+playersRepository.save(new CricketPlayers(1,40,"Batsman")));
				log.info("Preloading "+playersRepository.save(new CricketPlayers(2,22,"Allrounder")));
				log.info("Preloading "+playersRepository.save(new CricketPlayers(3,50,"Batsman")));
				log.info("Preloading "+playersRepository.save(new CricketPlayers(4,4,"Bowler")));
				log.info("Preloading "+playersRepository.save(new CricketPlayers(5,100,"Allrounder")));
				log.info("Preloading "+playersRepository.save(new CricketPlayers(6,7,"Batsman")));
				log.info("Preloading "+playersRepository.save(new CricketPlayers(7,60,"Batsman")));
				log.info("Preloading "+playersRepository.save(new CricketPlayers(8,30,"Allrounder")));
				log.info("Preloading "+playersRepository.save(new CricketPlayers(9,9,"bowler")));
				log.info("Preloading "+playersRepository.save(new CricketPlayers(10,19,"bowler")));
			};
		}

	}


