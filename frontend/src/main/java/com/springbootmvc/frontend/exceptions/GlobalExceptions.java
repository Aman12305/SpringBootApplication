package com.springbootmvc.frontend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptions {
	
	@ExceptionHandler(HttpClientErrorException.class)
    public ModelAndView handleBackendServiceException(HttpClientErrorException ex) {
        // Handle the exception and return an error response
		
		String errorMessage = ex.getMessage();
		HttpStatus errorStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
		
		System.out.println(errorMessage + errorStatusCode);
		
		String str="Some Error occured";
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", str);
		mv.setViewName("view1");
		return mv;
//        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
