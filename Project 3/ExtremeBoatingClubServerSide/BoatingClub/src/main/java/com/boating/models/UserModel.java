package com.boating.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;

	private String username;
	private String firstname;
	private String lastname;
	private String password;
	private int money;
	private int wins;
	private int level;
	private double experience;
	

	@ManyToMany // left side belongs to the class the multiplicity is in
	@JoinTable(name = "UserModel_MembershipModel", joinColumns = {
			@JoinColumn(name = "userid", referencedColumnName = "userid") }, inverseJoinColumns = {
					@JoinColumn(name = "membershipid", referencedColumnName = "membershipid") })
	private List<MembershipModel> membershipid;// there can be one memebershipid to one user

	@ManyToMany // there can be one user to many boat ids
	@JoinTable(name = "UserModel_BoatModel", joinColumns = {
			@JoinColumn(name = "userid", referencedColumnName = "userid") }, inverseJoinColumns = {
					@JoinColumn(name = "boatid", referencedColumnName = "boatid") })
	private List<BoatModel> boatid;

	@ManyToMany
	@JoinTable(name = "UserModel_InsuranceModel", joinColumns = {
			@JoinColumn(name = "userid", referencedColumnName = "userid") }, inverseJoinColumns = {
					@JoinColumn(name = "insuranceid", referencedColumnName = "insuranceid") })
	private List<InsuranceModel> insuranceid;

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(int userid, String username, String firstname, String lastname, String password, int money,
			int wins, int level, double experience, List<MembershipModel> membershipid, List<BoatModel> boatid,
			List<InsuranceModel> insuranceid) {
		super();
		this.userid = userid;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.money = money;
		this.wins = wins;
		this.level = level;
		this.experience = experience;
		this.membershipid = membershipid;
		this.boatid = boatid;
		this.insuranceid = insuranceid;
	}

	@Override
	public String toString() {
		return "UserModel [userid=" + userid + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", password=" + password + ", money=" + money + ", wins=" + wins + ", level=" + level
				+ ", experience=" + experience + ", membershipid=" + membershipid + ", boatid=" + boatid
				+ ", insuranceid=" + insuranceid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boatid == null) ? 0 : boatid.hashCode());
		long temp;
		temp = Double.doubleToLongBits(experience);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((insuranceid == null) ? 0 : insuranceid.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + level;
		result = prime * result + ((membershipid == null) ? 0 : membershipid.hashCode());
		result = prime * result + money;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + userid;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + wins;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		if (boatid == null) {
			if (other.boatid != null)
				return false;
		} else if (!boatid.equals(other.boatid))
			return false;
		if (Double.doubleToLongBits(experience) != Double.doubleToLongBits(other.experience))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (insuranceid == null) {
			if (other.insuranceid != null)
				return false;
		} else if (!insuranceid.equals(other.insuranceid))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (level != other.level)
			return false;
		if (membershipid == null) {
			if (other.membershipid != null)
				return false;
		} else if (!membershipid.equals(other.membershipid))
			return false;
		if (money != other.money)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userid != other.userid)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (wins != other.wins)
			return false;
		return true;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public List<MembershipModel> getMembershipid() {
		return membershipid;
	}

	public void setMembershipid(List<MembershipModel> membershipid) {
		this.membershipid = membershipid;
	}

	public List<BoatModel> getBoatid() {
		return boatid;
	}

	public void setBoatid(List<BoatModel> boatid) {
		this.boatid = boatid;
	}

	public List<InsuranceModel> getInsuranceid() {
		return insuranceid;
	}

	public void setInsuranceid(List<InsuranceModel> insuranceid) {
		this.insuranceid = insuranceid;
	}

	
}