package com.ProjetMaBanque.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
Tout comme en SQL, on peut définir quatre types de relations entre entités JPA :

    relation 1:1 : annotée par @OneToOne ;

    relation n:1 : annotée par @ManyToOne ;

    relation 1:p : annotée par @OneToMany ;

    relation n:p : annotée par @ManyToMany -> Creation d"une table de jointure
 */


@SuppressWarnings("serial")
@Entity
public class User_Role implements Serializable {

	//Attributs
	@Id
	@GeneratedValue(generator="Seq_User_Role")
	private Long id_userRole;
	
	@OneToOne
	@JoinColumn(name="username")
	private Users users;
	
	@OneToOne
	@JoinColumn(name="role")
	private Role role;

	//Constructeurs
	public User_Role() {
		super();
	}

	public User_Role(Users users, Role role) {
		super();
		this.users = users;
		this.role = role;
		final Log log = LogFactory.getLog(User_Role.class);
		log.info("Passage dans le constructeur User_Role (2param)" + users + role );
	}

	
	//Getters / Setters
	public Long getId_userRole() {
		final Log log = LogFactory.getLog(User_Role.class);
		log.info("Passage dans GETTER getId_userRole :" + id_userRole );
		return id_userRole;
	}

	public void setId_userRole(Long id_userRole) {
		this.id_userRole = id_userRole;
		final Log log = LogFactory.getLog(User_Role.class);
		log.info("Passage dans SETTER setId_userRole  :" + id_userRole   );
	}

	public Users getUsers() {
		final Log log = LogFactory.getLog(User_Role.class);
		log.info("Passage GETTER getUsers : " + users  );
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
		final Log log = LogFactory.getLog(User_Role.class);
		log.info("Passage dans SETTER setUsers  :" + users  );
	}

	public Role getRole() {
		final Log log = LogFactory.getLog(User_Role.class);
		log.info("Passage dans GETTER getRole	" + role );
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
		final Log log = LogFactory.getLog(User_Role.class);
		log.info("Passage dans SETTER  :" + role );
	}
	
	
	
}
