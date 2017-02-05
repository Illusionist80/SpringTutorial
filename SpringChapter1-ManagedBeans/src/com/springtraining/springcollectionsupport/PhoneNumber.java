package com.springtraining.springcollectionsupport;

public class PhoneNumber {
	String areaCode;

	String phone;

	String extn;

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getExtn() {
		return extn;
	}

	public void setExtn(String extn) {
		this.extn = extn;
	}

	@Override
	public String toString() {
		return "PhoneNumber [areaCode=" + areaCode + ", phone=" + phone
				+ ", extn=" + extn + "]";
	}

}
