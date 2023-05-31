package com.example.egm.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {


	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> anyException(Exception ex, WebRequest request) {

		String errMsgDesc = ex.getLocalizedMessage();

		if(errMsgDesc == null) errMsgDesc = ex.toString();

		ErrorMessage errorMessage = new ErrorMessage(new Date(),errMsgDesc);
		return new ResponseEntity<>(
				errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
		);

	}

}
