package com.demanou.springbootpharmacy.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@SuppressWarnings("serial")
@NoArgsConstructor
@Setter
@Getter
public class EntityNotExistException extends RuntimeException{
    private String message;

    public EntityNotExistException(String message) {
        super(message);
        this.message = message;
    }
}
