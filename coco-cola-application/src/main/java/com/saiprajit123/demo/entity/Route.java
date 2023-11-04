package com.saiprajit123.demo.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uid;
	private String codee;
	private String namee;
	private String fromDate;
	private String toDate;
	private Boolean isActive;
	private String warehouseUID;
	private String userUID;
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getCodee() {
		return codee;
	}
	public void setCodee(String codee) {
		this.codee = codee;
	}
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getWarehouseUID() {
		return warehouseUID;
	}
	public void setWarehouseUID(String warehouseUID) {
		this.warehouseUID = warehouseUID;
	}
	public String getUserUID() {
		return userUID;
	}
	public void setUserUID(String userUID) {
		this.userUID = userUID;
	}
	@Override
	public String toString() {
		return "Route [uid=" + uid + ", codee=" + codee + ", namee=" + namee + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", isActive=" + isActive + ", warehouseUID=" + warehouseUID + ", userUID=" + userUID
				+ ", getUid()=" + getUid() + ", getCodee()=" + getCodee() + ", getNamee()=" + getNamee()
				+ ", getFromDate()=" + getFromDate() + ", getToDate()=" + getToDate() + ", getIsActive()="
				+ getIsActive() + ", getWarehouseUID()=" + getWarehouseUID() + ", getUserUID()=" + getUserUID()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Route(Long uid, String codee, String namee, String fromDate, String toDate, Boolean isActive,
			String warehouseUID, String userUID) {
		super();
		this.uid = uid;
		this.codee = codee;
		this.namee = namee;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.isActive = isActive;
		this.warehouseUID = warehouseUID;
		this.userUID = userUID;
	}
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}