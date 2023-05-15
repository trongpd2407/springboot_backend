package com.example.springboot_backend.exception;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Long id){
        super("Could not found Employee id"+ id);
    }
}
