package com.luv2code.demo.rest;

public class StudentErrorResponse {
    // set up status, message and timestamp fields
    private int status;
    private String message;
    private long timestamp;
    // no-arg constructor
    public StudentErrorResponse() {
    }
    // constructor
    public StudentErrorResponse(int status, String message, long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
    // getters and setters
    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
