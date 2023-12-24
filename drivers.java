package com.Hibernate.Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class drivers {
	@Id	
	private int Id;
	private String Name;
	private String Team;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	@Override
	public String toString() {
		return "drivers [Id=" + Id + ", Name=" + Name + ", Team=" + Team + "]";
	}

}
