package com.model;

public class ArtBoxUser {
	
	private long id;
	private String name;
	private String email;
	private String password;
	
	public ArtBoxUser() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id =id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ArtBoxUser [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
}