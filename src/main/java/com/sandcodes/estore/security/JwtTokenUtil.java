package com.sandcodes.estore.security;

import com.sandcodes.estore.model.User;
//import io.jsonwebtoken.*;
//import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenUtil {
//    private String secret = "your-secret-key";
//
//    public String generateToken(Authentication authentication) {
//        User user = (User) authentication.getPrincipal();
//        Date now = new Date();
//        Date expiryDate = new Date(now.getTime() + 3600000);
//
//        return Jwts.builder()
//                .setSubject(user.getEmail())
//                .setIssuedAt(new Date())
//                .setExpiration(expiryDate)
//                .signWith(SignatureAlgorithm.HS512, secret)
//                .compact();
//    }
//
//    public boolean validateToken(String token) {
//        try {
//            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
//            return true;
//        } catch (SignatureException ex) {
//            System.out.println("Invalid JWT signature");
//        } catch (MalformedJwtException ex) {
//            System.out.println("Invalid JWT token");
//        } catch (ExpiredJwtException ex) {
//            System.out.println("Expired JWT token");
//        } catch (UnsupportedJwtException ex) {
//            System.out.println("Unsupported JWT token");
//        } catch (IllegalArgumentException ex) {
//            System.out.println("JWT claims string is empty");
//        }
//
//        return false;
//    }
}
