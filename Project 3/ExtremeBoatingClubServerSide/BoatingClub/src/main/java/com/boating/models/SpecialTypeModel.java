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
public class SpecialTypeModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "specialtypeid")
	int specialtypeid;
	
	String specialtyping;

	@ManyToMany(mappedBy = "specialtypeid")
	private List <BoatModel> boatid;

	public SpecialTypeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpecialTypeModel(int specialtypeid, String specialtyping, List<BoatModel> boatid) {
		super();
		this.specialtypeid = specialtypeid;
		this.specialtyping = specialtyping;
		this.boatid = boatid;
	}

	@Override
	public String toString() {
		return "SpecialTypeModel [specialtypeid=" + specialtypeid + ", specialtyping=" + specialtyping + ", boatid="
				+ boatid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boatid == null) ? 0 : boatid.hashCode());
		result = prime * result + specialtypeid;
		result = prime * result + ((specialtyping == null) ? 0 : specialtyping.hashCode());
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
		SpecialTypeModel other = (SpecialTypeModel) obj;
		if (boatid == null) {
			if (other.boatid != null)
				return false;
		} else if (!boatid.equals(other.boatid))
			return false;
		if (specialtypeid != other.specialtypeid)
			return false;
		if (specialtyping == null) {
			if (other.specialtyping != null)
				return false;
		} else if (!specialtyping.equals(other.specialtyping))
			return false;
		return true;
	}

	public int getSpecialtypeid() {
		return specialtypeid;
	}

	public void setSpecialtypeid(int specialtypeid) {
		this.specialtypeid = specialtypeid;
	}

	public String getSpecialtyping() {
		return specialtyping;
	}

	public void setSpecialtyping(String specialtyping) {
		this.specialtyping = specialtyping;
	}

	public List<BoatModel> getBoatid() {
		return boatid;
	}

	public void setBoatid(List<BoatModel> boatid) {
		this.boatid = boatid;
	}
	

}
