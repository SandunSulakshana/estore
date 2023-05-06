package com.sandcodes.estore.model;

import org.springframework.beans.factory.annotation.Value;

public class JWT {
    @Value("${JWT.secretKey}")
    private String secretKey;
    @Value("${JWT.expirationTime}")
    private String expirationTime;

    public String getSecretKey() {
        return secretKey;
    }

    public String getExpirationTime() {
        return expirationTime;
    }
}
