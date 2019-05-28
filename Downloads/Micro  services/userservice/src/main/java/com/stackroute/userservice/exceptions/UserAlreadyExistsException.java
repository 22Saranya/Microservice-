package com.stackroute.userservice.exceptions;

import com.stackroute.userservice.domain.User;

public class UserAlreadyExistsException extends Exception {
    private String message;
    public UserAlreadyExistsException(){}
    public UserAlreadyExistsException(String message)
    {
        super(message);
        this.message=message;
    }

}
