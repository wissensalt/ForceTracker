package com.zisal.jelling.rest.dto.response.impl;

import java.io.Serializable;

/**
 * Created on 1/19/2015.
 * achmad.fauzi@sigma.co.id
 */
public class DTOPasswordValidMessenger implements Serializable{

    private String message;

    private boolean result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
