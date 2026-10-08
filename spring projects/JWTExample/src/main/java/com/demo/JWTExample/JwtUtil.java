package com.demo.JWTExample;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    private String secret =
            "mysecretkeymysecretkeymysecretkey123";

    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(System.currentTimeMillis()
                                + 1000 * 60 * 60))
                .signWith(
                        Keys.hmacShaKeyFor(secret.getBytes()),
                        SignatureAlgorithm.HS256)
                .compact();
    }
}
