package com.boating.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class MembershipModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "membershipid")
	int membershipid;
	
	
	String membershiplevel;

	
	@ManyToMany(mappedBy = "membershipid")
	private List <UserModel> userid;


	public MembershipModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MembershipModel(int membershipid, String membershiplevel, List<UserModel> userid) {
		super();
		this.membershipid = membershipid;
		this.membershiplevel = membershiplevel;
		this.userid = userid;
	}


	@Override
	public String toString() {
		return "MembershipModel [membershipid=" + membershipid + ", membershiplevel=" + membershiplevel + ", userid="
				+ userid + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((membershiplevel == null) ? 0 : membershiplevel.hashCode());
		result = prime * result + membershipid;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
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
		MembershipModel other = (MembershipModel) obj;
		if (membershiplevel == null) {
			if (other.membershiplevel != null)
				return false;
		} else if (!membershiplevel.equals(other.membershiplevel))
			return false;
		if (membershipid != other.membershipid)
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}


	public int getMembershipid() {
		return membershipid;
	}


	public void setMembershipid(int membershipid) {
		this.membershipid = membershipid;
	}


	public String getmembershiplevel() {
		return membershiplevel;
	}


	public void setmembershiplevel(String membershiplevel) {
		this.membershiplevel = membershiplevel;
	}


	public List<UserModel> getUserid() {
		return userid;
	}


	public void setUserid(List<UserModel> userid) {
		this.userid = userid;
	}

	
}
