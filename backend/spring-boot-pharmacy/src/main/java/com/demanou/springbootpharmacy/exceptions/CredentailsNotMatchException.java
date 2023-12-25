package com.demanou.springbootpharmacy.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@NoArgsConstructor
@Getter
@Setter
public class CredentailsNotMatchException extends RuntimeException {
    private String message;
    public CredentailsNotMatchException(String message) {
        super(message);
        this.message = message;
    }
}
