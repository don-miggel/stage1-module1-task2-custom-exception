package com.epam.mjc;

public class WrongParameterException extends IllegalArgumentException{

    WrongParameterException(long id){
        super("Could not find student with ID "+id);
    }
}
