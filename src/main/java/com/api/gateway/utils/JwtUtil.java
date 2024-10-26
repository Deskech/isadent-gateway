package com.api.gateway.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private final Dotenv dotenv = Dotenv.load();
    private final String SECRET_KEY = dotenv.get("SECRET_KEY");
    private final Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);

    public boolean isTokenValid(String token) {

        try {
            JWTVerifier tokenVerifier = JWT.require(algorithm).build();
            tokenVerifier.verify(token);
            return true;
        } catch (JWTVerificationException e) {
            System.out.println("Invalid token: " + e.getMessage());
            return false;
        }

    }
}
