//package com.lhtrung.healthyfirst.service;
//
//import com.fasterxml.jackson.databind.util.JSONPObject;
//import org.json.JSONArray;
//import org.springframework.stereotype.Component;
//
//import io.jsonwebtoken.*;
//
//import java.util.Date;
//
//@Component
//public class tokenService {
//    private final String JWT_SECRET = "trung";
//    private final long JWT_EXPIRATION = 604800000L;
//    public String createToken() {
//        Date now = new Date();
//        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);
//        return Jwts.builder()
//                .setSubject("test")
//                .setIssuedAt(now)
//                .setExpiration(expiryDate)
//                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
//                .compact();
//    }
//
//    public String verifyToken(String token) {
//        try {
//            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token);
//            return "OK";
//        } catch (MalformedJwtException ex) {
//            return "NOT OK";
//        } catch (ExpiredJwtException ex) {
//            return "NOT OK";
//        } catch (UnsupportedJwtException ex) {
//            return "NOT OK";
//        } catch (IllegalArgumentException ex) {
//            return "NOT OK";
//        }
//    }
//
//    public String getDataFromToken(String token) {
//        Claims claims = Jwts.parser()
//                            .setSigningKey(JWT_SECRET)
//                            .parseClaimsJws(token)
//                            .getBody();
//        return claims.getSubject();
//    }
//
//}
