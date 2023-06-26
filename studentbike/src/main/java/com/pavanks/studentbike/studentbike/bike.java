package com.pavanks.studentbike.studentbike;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class bike {
	@Id 
 int b_id;
 String name;
public bike(int b_id, String name) {
	super();
	this.b_id = b_id;
	this.name = name;
	}
 
}
