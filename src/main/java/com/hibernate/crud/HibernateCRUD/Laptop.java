package com.hibernate.crud.HibernateCRUD;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Laptop {
	@Id
	int Lap_Id;
	String Lap_name;
	int Lap_cost;
	
	
	
	@Override
	public String toString() {
		return "Laptop [Lap_Id=" + Lap_Id + ", Lap_name=" + Lap_name + ", Lap_cost=" + Lap_cost + "]";
	}
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int lap_Id, String lap_name, int lap_cost) {
		super();
		Lap_Id = lap_Id;
		Lap_name = lap_name;
		Lap_cost = lap_cost;
	}
	public int getLap_Id() {
		return Lap_Id;
	}
	public void setLap_Id(int lap_Id) {
		Lap_Id = lap_Id;
	}
	public String getLap_name() {
		return Lap_name;
	}
	public void setLap_name(String lap_name) {
		Lap_name = lap_name;
	}
	public int getLap_cost() {
		return Lap_cost;
	}
	public void setLap_cost(int lap_cost) {
		Lap_cost = lap_cost;
	}
	
	
	

}
