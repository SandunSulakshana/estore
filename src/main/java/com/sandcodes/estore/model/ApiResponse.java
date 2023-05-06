package com.sandcodes.estore.model;

public class ApiResponse {
    private boolean status;
    private String message;

    public ApiResponse(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String message() {
        return message;
    }

    public void message(String message) {
        this.message = message;
    }
}
