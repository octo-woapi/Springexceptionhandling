package com.example.pocexc.infra;

import com.example.pocexc.exceptions.NotFoundExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(assignableTypes = {CartController.class})
public class CartControllerAdvice {

    @ExceptionHandler(NotFoundExceptions.class)
    @ResponseBody
    ResponseEntity<String> handleNotFoundException(NotFoundExceptions exc){
        return new ResponseEntity<>(exc.getMessage(), HttpStatus.NOT_FOUND);
    }
}
