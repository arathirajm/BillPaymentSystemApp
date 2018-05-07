package com.billpayment.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="customerdetails")
public class Customer implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String cusId;
	@NotBlank
	private String cusName;
	@NotBlank
	private String cusAddress;
	@NotBlank
	private String cusContactNumber;
	@NotBlank
	private String cusCountry;
	@NotBlank
	private String cusState;
	@NotBlank
	private String cusMailId;
	@NotBlank
	private String cusIdentDoc;
	@NotBlank
	private String cusDocDetail;
	@Column(nullable=false,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date cusRegDate;
	@NotBlank
	private String typeVendor;
	@NotBlank

	private String cusElectricity;
	@NotBlank

	private String cusTelephone;
	@NotBlank

	private String cusTax;
	@NotBlank

	private String cusInsurance;
	@NotBlank

	private BigInteger cusCardNumber;
	@NotBlank

	private Double cusBalance;
	
	public String getCusId() {
		return cusId;
	}
	public void setCusId(String cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	public String getCusContactNumber() {
		return cusContactNumber;
	}
	public void setCusContactNumber(String cusContactNumber) {
		this.cusContactNumber = cusContactNumber;
	}
	public String getCusCountry() {
		return cusCountry;
	}
	public void setCusCountry(String cusCountry) {
		this.cusCountry = cusCountry;
	}
	public String getCusState() {
		return cusState;
	}
	public void setCusState(String cusState) {
		this.cusState = cusState;
	}
	public String getCusMailId() {
		return cusMailId;
	}
	public void setCusMailId(String cusMailId) {
		this.cusMailId = cusMailId;
	}
	public String getCusIdentDoc() {
		return cusIdentDoc;
	}
	public void setCusIdentDoc(String cusIdentDoc) {
		this.cusIdentDoc = cusIdentDoc;
	}
	public String getCusDocDetail() {
		return cusDocDetail;
	}
	public void setCusDocDetail(String cusDocDetail) {
		this.cusDocDetail = cusDocDetail;
	}
	public Date getCusRegDate() {
		return cusRegDate;
	}
	public void setCusRegDate(Date cusRegDate) {
		this.cusRegDate = cusRegDate;
	}
	public String getTypeVendor() {
		return typeVendor;
	}
	public void setTypeVendor(String typeVendor) {
		this.typeVendor = typeVendor;
	}
	public String getCusElectricity() {
		return cusElectricity;
	}
	public void setCusElectricity(String cusElectricity) {
		this.cusElectricity = cusElectricity;
	}
	public String getCusTelephone() {
		return cusTelephone;
	}
	public void setCusTelephone(String cusTelephone) {
		this.cusTelephone = cusTelephone;
	}
	public String getCusTax() {
		return cusTax;
	}
	public void setCusTax(String cusTax) {
		this.cusTax = cusTax;
	}
	public String getCusInsurance() {
		return cusInsurance;
	}
	public void setCusInsurance(String cusInsurance) {
		this.cusInsurance = cusInsurance;
	}
	public BigInteger getCusCardNumber() {
		return cusCardNumber;
	}
	public void setCusCardNumber(BigInteger cusCardNumber) {
		this.cusCardNumber = cusCardNumber;
	}
	public Double getCusBalance() {
		return cusBalance;
	}
	public void setCusBalance(Double cusBalance) {
		this.cusBalance = cusBalance;
	}
	
	
	

}
