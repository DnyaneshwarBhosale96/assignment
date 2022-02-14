package com.example.demo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Usertable")
@Entity
public class User implements Serializable
{
	   private static final long serialVersionUID = -8017419482859508803L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long userID;
	    public User() {
			super();
		}
		public User(Long userID, String userName, Address address) {
			super();
			this.userID = userID;
			this.userName = userName;
			this.address = address;
		}
		@Override
		public String toString() {
			return "User [userID=" + userID + ", userName=" + userName + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(userID, userName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(userID, other.userID) && Objects.equals(userName, other.userName);
		}
		public Long getUserID() {
			return userID;
		}
		public void setUserID(Long userID) {
			this.userID = userID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		private String userName;
	    @OneToOne(cascade = CascadeType.ALL)
	    private Address address;
}
