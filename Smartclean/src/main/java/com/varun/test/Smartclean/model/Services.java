package com.varun.test.Smartclean.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "services_entry")
public class Services {
	@Id
	@Column(name="Sl No")
	private String Sl;
	@Column(name="UniqueID")
	private String UniqueID;
	@Column(name="Time_Stamp")
	private String time_stamp;

	public Services() {
		super();
	}

	public Services(String sl,String uniqueID, String time_stamp) {
		super();
		this.Sl = sl;
		UniqueID = uniqueID;
		this.time_stamp = time_stamp;
	}
	
	public String getSl() {
		return Sl;
	}

	public void setSl(String sl) {
		this.Sl = sl;
	}

	public String getUniqueID() {
		return UniqueID;
	}

	public void setUniqueID(String uniqueID) {
		UniqueID = uniqueID;
	}

	public String getCreatedTime() {
		return time_stamp;
	}

	public void setCreatedTime(String time_stamp) {
		this.time_stamp = time_stamp;
	}

}
