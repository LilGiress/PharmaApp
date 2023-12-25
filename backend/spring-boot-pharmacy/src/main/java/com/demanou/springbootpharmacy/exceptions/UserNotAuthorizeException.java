package com.demanou.springbootpharmacy.exceptions;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@SuppressWarnings("serial")
@NoArgsConstructor
@Getter
@Setter
public class UserNotAuthorizeException extends RuntimeException{
    private String message;

    public UserNotAuthorizeException(String message) {
        super(message);
        this.message = message;
    }
}
