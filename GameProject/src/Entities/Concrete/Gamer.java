package Entities.Concrete;

import java.sql.Date;

import Entities.Abstract.Customer;

public class Gamer extends Company implements Customer{
	
	private String name;
	private String lastName;
	private String tcknu;
	private Date birthOfDate;
	
	
	public Gamer() {}


	public Gamer( String name, String lastName, String tcknu, Date birthOfDate) {
		this.name = name;
		this.lastName = lastName;
		this.tcknu = tcknu;
		this.birthOfDate = birthOfDate;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getTcknu() {
		return tcknu;
	}


	public void setTcknu(String tcknu) {
		this.tcknu = tcknu;
	}


	public Date getBirthOfDate() {
		return birthOfDate;
	}


	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	

}
