package com.sandcodes.estore.security;

public class JwtResponse {
    private String token;
    private String email;
    private String firstName;
    private String lastName;
    private String userType;

    public JwtResponse(String token, String email, String firstName, String lastName, String userType) {
        this.token = token;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }



    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
