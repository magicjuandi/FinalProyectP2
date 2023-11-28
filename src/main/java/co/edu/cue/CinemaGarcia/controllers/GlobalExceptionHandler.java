package co.edu.cue.CinemaGarcia.controllers;

import co.edu.cue.CinemaGarcia.exceptions.ExceptionOnTyping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {


        @ExceptionHandler(ExceptionOnTyping.class)
        public ResponseEntity<String> handleException(ExceptionOnTyping ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }

}
