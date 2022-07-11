package com.mpaiement.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class PaymentExistingException extends RuntimeException {

    public PaymentExistingException(String message) {
        super(message);
    }
}
