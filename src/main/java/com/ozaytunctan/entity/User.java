/**
 * 
 */
package com.ozaytunctan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * User entity class 
 * 
 * @author ozaytunctan
 *
 */
@Entity()
@Table(name = "USER")
@SequenceGenerator(name = "idGenerator",initialValue = 1, sequenceName = "SQ_USER")
public class User extends BaseEntity<Integer> {

	@Column(unique = true,length = 50,nullable = false)
	private String username;
	
	@Column(unique = true,length = 50)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	
	public User(Integer id) {
		super(id);
	}
	
	public User() {
     super(0);
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
