package com.hpperc.model;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Configuration 
@ConfigurationProperties(prefix="hpperc.app")
@Data
public class AppProperties {

	 private String createUserMailSubject;
	 private String createUserMailBody;
	 private String jwtSecret;
	 private int jwtExpirationMs;
}
