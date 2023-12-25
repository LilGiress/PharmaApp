package com.demanou.springbootpharmacy.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  /*  @ExceptionHandler(value = UsernameNotFoundException.class)
    public ResponseEntity<?> usernameNotFoundExceptionHandler(UsernameNotFoundException usernameNotFoundException){
        log.warn(usernameNotFoundException.getMessage(),usernameNotFoundException.getCause());
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(new ResponseMessage(401,usernameNotFoundException.getMessage()));

    }

    @ExceptionHandler(value= UserNotAuthorizeException.class)
    public ResponseEntity<?> userNotAuthorizeExceptionHandler(UserNotAuthorizeException userNotAuthorizeException){
        log.warn(userNotAuthorizeException.getMessage(),userNotAuthorizeException.getCause());
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(new ResponseMessage(401, userNotAuthorizeException.getMessage()));
    }

    @ExceptionHandler(value= EntityAlreadyExistsException.class)
    public ResponseEntity<?> objectAlreadyExistsExceptionHandler(EntityAlreadyExistsException objectAlreadyExistsException){
        log.warn(objectAlreadyExistsException.getMessage(),objectAlreadyExistsException.getCause());
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(new ResponseMessage(401, objectAlreadyExistsException.getMessage()));
    }

    @ExceptionHandler(value= EntityNotExistException.class)
    public ResponseEntity<?> objectNotFoundExceptionHandler(EntityNotExistException objectNotFoundException){
        log.warn(objectNotFoundException.getMessage(),objectNotFoundException.getCause());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ResponseMessage(404, objectNotFoundException.getMessage()));
    }

    @ExceptionHandler(value= CredentailsNotMatchException.class)
    public ResponseEntity<?> cedentailsNotMatchExceptionHandler(CredentailsNotMatchException credentailsNotMatchException){
        log.warn(credentailsNotMatchException.getMessage(),credentailsNotMatchException.getCause());
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(new ResponseMessage(401, credentailsNotMatchException.getMessage()));
    }

    @ExceptionHandler(value= HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<?> cedentailsNotMatchExceptionHandler(HttpRequestMethodNotSupportedException httpRequestMethodNotSupportedException){
        log.warn(httpRequestMethodNotSupportedException.getMessage(),httpRequestMethodNotSupportedException.getCause());
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ResponseMessage(400, httpRequestMethodNotSupportedException.getMessage()));
    }

    @ExceptionHandler(value= MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException methodArgumentNotValidException){
        log.warn(methodArgumentNotValidException.getMessage(),methodArgumentNotValidException.getCause());
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ResponseMessage(400, methodArgumentNotValidException.getAllErrors().get(0).getDefaultMessage()));
    }

    @ExceptionHandler(value= {MailSendException.class})
    public ResponseEntity<?> mailSendExceptionHandler(MailSendException messagingException){
        log.warn(messagingException.getMessage(),messagingException.getCause());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ResponseMessage(400, "invalide email adresse or smtp port is disable"));

    }

    @ExceptionHandler(value= {MissingServletRequestParameterException.class})
    public ResponseEntity<?> missingServletRequestParameterExceptionHandler(MissingServletRequestParameterException requestParameterException){
        log.warn(requestParameterException.getMessage(),requestParameterException.getCause());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ResponseMessage(400,requestParameterException.getMessage()));

    }

    @ExceptionHandler(value= {SessionNumberExceededException.class})
    public ResponseEntity<?> sessionNumberExceededHandler(SessionNumberExceededException sessionNumberExceededException,WebRequest webRequest){
        log.warn(sessionNumberExceededException.getMessage(),sessionNumberExceededException.getCause());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(new ResponseMessage(401,sessionNumberExceededException.getMessage()));

    }

    @ExceptionHandler(value= {CredentialNotExistException.class})
    public ResponseEntity<?> credentialNotExistExceptionHandler(CredentialNotExistException credentialNotExistException){
        log.warn(credentialNotExistException.getMessage(),credentialNotExistException.getCause());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ResponseMessage(400,credentialNotExistException.getMessage()));

    }*/

}
