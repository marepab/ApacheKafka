package com.kaf.apachekafka.storage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MESSAGE")
public class MessageEntity {
	@Override
	public String toString() {
		return "MessageEntity [id=" + id + ", customerId=" + customerId + ", phoneNo=" + phoneNo + ", sourceName="
				+ sourceName + ", field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4
				+ ", field5=" + field5 + ", field6=" + field6 + "]";
	}

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="CUST_ID")
	private String customerId;
	
	@Column(name="PHONE_NO")
	private String phoneNo;
	
	@Column(name="SOURCE_NAME")
	private String sourceName;
	
	@Column(name="FIELD1")
	private String field1;
	
	@Column(name="FIELD2")
	private String field2;
	
	@Column(name="FIELD3")
	private String field3;
	
	@Column(name="FIELD4")
	private String field4;
	
	@Column(name="FIELD5")
	private String field5;
	
	@Column(name="FIELD6")
	private String field6;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getField4() {
		return field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public String getField5() {
		return field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

	public String getField6() {
		return field6;
	}

	public void setField6(String field6) {
		this.field6 = field6;
	}
}
