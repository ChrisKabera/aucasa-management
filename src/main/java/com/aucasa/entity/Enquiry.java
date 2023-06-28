package com.aucasa.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Enquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long enquiryNumber;
    private Date submissionDate;
    private String leaderInCharge;
    
    private String description;
    
    private String addedBy;

	public long getEnquiryNumber() {
		return enquiryNumber;
	}

	public void setEnquiryNumber(long enquiryNumber) {
		this.enquiryNumber = enquiryNumber;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getLeaderInCharge() {
		return leaderInCharge;
	}

	public void setLeaderInCharge(String leaderInCharge) {
		this.leaderInCharge = leaderInCharge;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
    
    
}
