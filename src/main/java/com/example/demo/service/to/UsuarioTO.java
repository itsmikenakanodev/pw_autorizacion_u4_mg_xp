package com.example.demo.service.to;

import java.io.Serializable;

public class UsuarioTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;

	private String password;
	
	private String semilla;
	
	private Integer tiempo;



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSemilla() {
		return semilla;
	}

	public void setSemilla(String semilla) {
		this.semilla = semilla;
	}

	public Integer getTiempo() {
		return tiempo;
	}

	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
	
	
}
