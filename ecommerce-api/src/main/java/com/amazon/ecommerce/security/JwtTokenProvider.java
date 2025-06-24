package com.amazon.ecommerce.security;

import io.jsonwebtoken.Jwts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    @Value("${jwt.secret}")
    private  String token;

    @Value("${jwt.expirationMs}")
    private int jwtExpirationMs;

    public String createToken(Authentication authentication) {
        // Implement token creation logic here
        // For example, using JWT library to create a token with the username and expiration time
       // Placeholder for actual token generation logic
        return "";
    }

    public String getUsernameFromToken(String token){
        return Jwts.parser()
                .setSigningKey(this.token)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
