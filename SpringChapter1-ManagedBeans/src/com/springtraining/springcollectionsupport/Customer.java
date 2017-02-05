package com.springtraining.springcollectionsupport;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {

	private List phoneNumberList;
	
	private Set phoneNumberSet;
	
	private Map phoneNumberMap;
	
	private Properties phoneNumberProperty;

	public List getPhoneNumberList() {
		return phoneNumberList;
	}

	public void setPhoneNumberList(List phoneNumberList) {
		this.phoneNumberList = phoneNumberList;
	}

	public Set getPhoneNumberSet() {
		return phoneNumberSet;
	}

	public void setPhoneNumberSet(Set phoneNumberSet) {
		this.phoneNumberSet = phoneNumberSet;
	}

	public Map getPhoneNumberMap() {
		return phoneNumberMap;
	}

	public void setPhoneNumberMap(Map phoneNumberMap) {
		this.phoneNumberMap = phoneNumberMap;
	}

	public Properties getPhoneNumberProperty() {
		return phoneNumberProperty;
	}

	public void setPhoneNumberProperty(Properties phoneNumberProperty) {
		this.phoneNumberProperty = phoneNumberProperty;
	}

	@Override
	public String toString() {
		return "Customer [phoneNumberList=" + phoneNumberList
				+ ", phoneNumberSet=" + phoneNumberSet + ", phoneNumberMap="
				+ phoneNumberMap + ", phoneNumberProperty="
				+ phoneNumberProperty + "]";
	}

}
