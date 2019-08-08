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
public class InsuranceModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "insuranceid")
	int insuranceid;
	
	String insurancecoverage;

	@ManyToMany(mappedBy = "insuranceid")
	private List <UserModel> userid;

	public InsuranceModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsuranceModel(int insuranceid, String insurancecoverage, List<UserModel> userid) {
		super();
		this.insuranceid = insuranceid;
		this.insurancecoverage = insurancecoverage;
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "InsuranceModel [insuranceid=" + insuranceid + ", insurancecoverage=" + insurancecoverage + ", userid="
				+ userid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((insurancecoverage == null) ? 0 : insurancecoverage.hashCode());
		result = prime * result + insuranceid;
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
		InsuranceModel other = (InsuranceModel) obj;
		if (insurancecoverage == null) {
			if (other.insurancecoverage != null)
				return false;
		} else if (!insurancecoverage.equals(other.insurancecoverage))
			return false;
		if (insuranceid != other.insuranceid)
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}

	public int getInsuranceid() {
		return insuranceid;
	}

	public void setInsuranceid(int insuranceid) {
		this.insuranceid = insuranceid;
	}

	public String getInsurancecoverage() {
		return insurancecoverage;
	}

	public void setInsurancecoverage(String insurancecoverage) {
		this.insurancecoverage = insurancecoverage;
	}

	public List<UserModel> getUserid() {
		return userid;
	}

	public void setUserid(List<UserModel> userid) {
		this.userid = userid;
	}

	
}