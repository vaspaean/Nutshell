package com.nutshell;

import com.nutshell.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.nutshell"})
public class NutshellApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutshellApplication.class, args);
	}
}
