package com.trainingbasket.javaee.modal;

import javax.persistence.*;


@Entity
@Table(name="User")
public class Player 
{
	
	@Id
	@GeneratedValue
	@Column(name="name")
	String name;
	@Column(name="dob")
	MyDate dob;
	@Column(name="contact")
	String contact;
	@Column(name="Address")
	String address;
	@Column(name="email")
	String email;
	@Column(name="gender")
	String gender;
	@Column(name="league")
	League league;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public MyDate getDob() 
	{
		return dob;
	}
	public void setDob(MyDate dob) 
	{
		this.dob = dob;
	}
	public String getContact() 
	{
		return contact;
	}
	public void setContact(String contact) 
	{
		this.contact = contact;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	}
	
	@Override
	public String toString() 
	{
		return "Player [name=" + name + ", dob=" + dob + ", contact=" + contact + ", address=" + address + ", email="
				+ email + ", gender=" + gender + ", league=" + league + "]";
	}
	
	
	
}
