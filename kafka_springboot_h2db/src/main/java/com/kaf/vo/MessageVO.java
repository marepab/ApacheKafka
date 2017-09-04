package com.kaf.vo;

import java.io.Serializable;

public class MessageVO implements Serializable{

	public MessageVO(String customerId, String phoneNo, String sourceName, String field1, String field2, String field3,
			String field4, String field5, String field6) {
		super();
		this.customerId = customerId;
		this.phoneNo = phoneNo;
		this.sourceName = sourceName;
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.field5 = field5;
		this.field6 = field6;
	}
	
	public MessageVO() {
		super();
	}
	private static final long serialVersionUID = 1L;
	
	private String customerId;
	private String phoneNo;
	private String sourceName;
	private String field1;
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	
	@Override
	public String toString() {
		return "MessageVO [customerId=" + customerId + ", phoneNo=" + phoneNo + ", sourceName=" + sourceName
				+ ", field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4
				+ ", field5=" + field5 + ", field6=" + field6 + "]";
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
	private String field6;
}
