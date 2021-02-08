package com.futureDroneV5K.droneApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//tell spring the name of the bean
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class DroneAppApplication {
// get username by Bean thru Spring sec
	@Bean
	public AuditorAware<String> auditorAware() {
		return new SpringSecurityAuditorAware();
	}

	public static void main(String[] args) {
		SpringApplication.run(DroneAppApplication.class, args);
	}

}
