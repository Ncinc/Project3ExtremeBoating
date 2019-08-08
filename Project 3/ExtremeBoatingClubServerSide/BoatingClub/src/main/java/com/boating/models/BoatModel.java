package com.boating.models;

import java.util.List;

import javax.persistence.Column;
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
public class BoatModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "boatid")
	private int boatid;
	
	
	private String boatname;
	private int speed;
	private float handleing;
	
	private int turbo;
	
	@ManyToMany(mappedBy = "boatid") // there can be many user to many boat ids
	private List <UserModel> userid;
	
	
	@ManyToMany // left side belongs to the class the multiplicity is in
	@JoinTable(name = "BoatModel_SpecialTypeModel", joinColumns = {
			@JoinColumn(name = "boatid", referencedColumnName = "boatid") }, inverseJoinColumns = {
					@JoinColumn(name = "specialtypeid", referencedColumnName = "specialtypeid") })
	private List <SpecialTypeModel> specialtypeid;// there can be many specialtypeid to many boats


	public BoatModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BoatModel(int boatid, String boatname, int speed, float handleing, int turbo, List<UserModel> userid,
			List<SpecialTypeModel> specialtypeid) {
		super();
		this.boatid = boatid;
		this.boatname = boatname;
		this.speed = speed;
		this.handleing = handleing;
		this.turbo = turbo;
		this.userid = userid;
		this.specialtypeid = specialtypeid;
	}


	@Override
	public String toString() {
		return "BoatModel [boatid=" + boatid + ", boatname=" + boatname + ", speed=" + speed + ", handleing="
				+ handleing + ", turbo=" + turbo + ", userid=" + userid + ", specialtypeid=" + specialtypeid + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boatid;
		result = prime * result + ((boatname == null) ? 0 : boatname.hashCode());
		result = prime * result + Float.floatToIntBits(handleing);
		result = prime * result + ((specialtypeid == null) ? 0 : specialtypeid.hashCode());
		result = prime * result + speed;
		result = prime * result + turbo;
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
		BoatModel other = (BoatModel) obj;
		if (boatid != other.boatid)
			return false;
		if (boatname == null) {
			if (other.boatname != null)
				return false;
		} else if (!boatname.equals(other.boatname))
			return false;
		if (Float.floatToIntBits(handleing) != Float.floatToIntBits(other.handleing))
			return false;
		if (specialtypeid == null) {
			if (other.specialtypeid != null)
				return false;
		} else if (!specialtypeid.equals(other.specialtypeid))
			return false;
		if (speed != other.speed)
			return false;
		if (turbo != other.turbo)
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}


	public int getBoatid() {
		return boatid;
	}


	public void setBoatid(int boatid) {
		this.boatid = boatid;
	}


	public String getBoatname() {
		return boatname;
	}


	public void setBoatname(String boatname) {
		this.boatname = boatname;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public float getHandleing() {
		return handleing;
	}


	public void setHandleing(float handleing) {
		this.handleing = handleing;
	}


	public int getTurbo() {
		return turbo;
	}


	public void setTurbo(int turbo) {
		this.turbo = turbo;
	}


	public List<UserModel> getUserid() {
		return userid;
	}


	public void setUserid(List<UserModel> userid) {
		this.userid = userid;
	}


	public List<SpecialTypeModel> getSpecialtypeid() {
		return specialtypeid;
	}


	public void setSpecialtypeid(List<SpecialTypeModel> specialtypeid) {
		this.specialtypeid = specialtypeid;
	}


}
