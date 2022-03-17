package com.hpperc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hpperc.service.LoginService;
import com.hpperc.utils.AjaxResponse;
import com.hpperc.utils.LoginDetails;

@RestController
@RequestMapping("/login")
@SuppressWarnings({ "rawtypes", "unchecked" })
public class LoginController {
	
	@Autowired 
	LoginService loginService;

	
	@GetMapping("/universityAdmin")
	public AjaxResponse universityAdminLogin(@RequestBody LoginDetails loginDetails) {
		Boolean result = false;
		AjaxResponse ajax = new AjaxResponse();
		result = loginService.getUserID(loginDetails);
			if(result) {
				ajax.setResponse_code("200");
				ajax.setResponse_message("Login Successful.!!");
				ajax.setData("User Is Present");
				return ajax;
			}
	   
		return ajax;
		
		
		
	}

}
