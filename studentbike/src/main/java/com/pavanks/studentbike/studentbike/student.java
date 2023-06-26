package com.pavanks.studentbike.studentbike;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity // entity will create the table
public class student {
@Id // creates primary key
		int s_id;
		String name;
		@OneToOne
		bike bike;
		public student(int s_id, String name, com.pavanks.studentbike.studentbike.bike bike) {
			super();
			this.s_id = s_id;
			this.name = name;
			this.bike = bike;
		}
		
	
			}
		

