package com.ozaytunctan.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity<ID extends Number> implements Serializable{
	
	@Id
	@GeneratedValue(generator = "idGenerator",strategy = GenerationType.SEQUENCE)
	private ID id;
	
    private Date createdDate=new Date();
    
    private String createdBy="ozaytunctan";
    
    public BaseEntity(ID id) {
    	this.setId(id);
	}

	

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}



	/**
	 * @return the id
	 */
	public ID getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(ID id) {
		this.id = id;
	}



	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
    
    
    

}
