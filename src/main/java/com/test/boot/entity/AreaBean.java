package com.test.boot.entity;

import java.io.Serializable;

public class AreaBean implements Serializable{
    
    
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5205071523431239056L;
	
	private String areaNum;
	
	private String areaName;

	/**
	 * @return the areaNum
	 */
	public String getAreaNum() {
		return areaNum;
	}

	/**
	 * @param areaNum the areaNum to set
	 */
	public void setAreaNum(String areaNum) {
		this.areaNum = areaNum;
	}

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
}
