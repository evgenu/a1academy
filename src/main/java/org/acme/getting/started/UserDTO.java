package org.acme.getting.started;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.GenerationType;

@Entity
@Table(name = "ClientData")
public class UserDTO {

    @Id
    @Column(name = "user_id")
    public long id;
    @Column(name = "name")
    public String name;
    @Column(name = "password")
    public String password;
    @Column(name = "email")
    public String email;

    public UserDTO() {}

    public UserDTO(String name, String password, String email) {
	this.name = name;
	this.password = password;
	this.email = email;
	this.id = id;
    }

    public Long getId() {
	return this.id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getPassword() {
	return this.password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getEmail() {
	return this.email;
    }

    public void setEmail(String email) {
	this.email = email;
    }
}
