package com.example.pocexc.exceptions;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class NotFoundExceptions extends RuntimeException{
    Logger logger = LoggerFactory.getLogger(NotFoundExceptions.class);
    public NotFoundExceptions(String message) {
        super(message);
        logger.error(message);
    }
}

