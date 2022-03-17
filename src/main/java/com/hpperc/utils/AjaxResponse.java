package com.hpperc.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxResponse<T> {
	
	private T data;
	private String response_code = "";
	private String response_message = "";
}
