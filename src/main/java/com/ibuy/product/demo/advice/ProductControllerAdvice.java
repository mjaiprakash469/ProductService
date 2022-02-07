package com.ibuy.product.demo.advice;

@ControllerAdvice
public class ProductControllerAdvice extends ResponseEntityExceptionHandler{
	
	
	
	@ExceptionHandler(PurchaseItenNotFoundException.class)
	public ResponseEntity<String> emtyHandler(PurchaseItenNotFoundException purchaseItenNotFoundException){
		return new ResponseEntity<String>("Invalid Username or Password", HttpStatus.BAD_REQUEST);
	}



	}



