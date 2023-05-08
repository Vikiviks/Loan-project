package com.example.loan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoanModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loanId;
	@Column(name="loantype",nullable=false)
	private String loantype;
	@Column(name="applicantName",nullable=false)
	private String applicantName;
	@Column(name="applicantAddress",nullable=false)
	private String applicantAddress;
	@Column(name="applicantMobile",nullable=false,unique=true)
	private String applicantMobile;
	@Column(name="applicantEmail",nullable=false,unique=true)
	private String applicantEmail;
	@Column(name="applicantAadhar",nullable=false,unique=true)
	private String applicantAadhaar;
	@Column(name="applicantPan",nullable=false,unique=true)
	private String applicantPan;
	@Column(name="applicantSalary",nullable=false)
	private String applicantSalary;
	@Column(name="loanAmountRequired",nullable=false)
	private String loanAmountRequired;
	@Column(name="loanRepaymentMonths",nullable=false)
	private String loanRepaymentMonths;
	public LoanModel() {}
	
	public LoanModel(int loanId, String loantype, String applicantName, String applicantAddress, String applicantMobile,
			String applicantEmail, String applicantAadhaar, String applicantPan, String applicantSalary,
			String loanAmountRequired, String loanRepaymentMonths) {
		this.loanId = loanId;
		this.loantype = loantype;
		this.applicantName = applicantName;
		this.applicantAddress = applicantAddress;
		this.applicantMobile = applicantMobile;
		this.applicantEmail = applicantEmail;
		this.applicantAadhaar = applicantAadhaar;
		this.applicantPan = applicantPan;
		this.applicantSalary = applicantSalary;
		this.loanAmountRequired = loanAmountRequired;
		this.loanRepaymentMonths = loanRepaymentMonths;
	}

	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantAddress() {
		return applicantAddress;
	}
	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}
	public String getApplicantMobile() {
		return applicantMobile;
	}
	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantAadhaar() {
		return applicantAadhaar;
	}
	public void setApplicantAadhaar(String applicantAadhaar) {
		this.applicantAadhaar = applicantAadhaar;
	}
	public String getApplicantPan() {
		return applicantPan;
	}
	public void setApplicantPan(String applicantPan) {
		this.applicantPan = applicantPan;
	}
	public String getApplicantSalary() {
		return applicantSalary;
	}
	public void setApplicantSalary(String applicantSalary) {
		this.applicantSalary = applicantSalary;
	}
	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
    
}
