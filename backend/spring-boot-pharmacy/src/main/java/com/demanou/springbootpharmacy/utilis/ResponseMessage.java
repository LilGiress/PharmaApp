package com.demanou.springbootpharmacy.utilis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class ResponseMessage <T>{
    int status;
    String message;
    T data;

    public ResponseMessage(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseMessage(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
