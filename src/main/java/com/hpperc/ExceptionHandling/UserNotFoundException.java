package com.hpperc.ExceptionHandling;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserNotFoundException extends RuntimeException{
	
	private String error_message;
	
	private String error_code;
	
	

}
