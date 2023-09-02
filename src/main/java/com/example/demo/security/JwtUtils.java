package com.example.demo.security;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {
	
	private static final Logger LOG=LoggerFactory.getLogger(JwtUtils.class);
	
	public String generateJwtToken(String nombre, String secret, Integer expiracion) {

		LOG.info("Semilla:  " + secret + "Tiempo: " + expiracion);
		return Jwts.builder().setSubject(nombre).
				setIssuedAt(new Date())
				.setExpiration
				(new Date(System.currentTimeMillis() + expiracion))
				.signWith(SignatureAlgorithm.HS512, secret)
				.compact();

	}
}
