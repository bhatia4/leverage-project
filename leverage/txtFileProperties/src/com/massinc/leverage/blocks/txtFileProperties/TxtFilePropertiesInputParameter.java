package com.massinc.leverage.blocks.txtFileProperties;

import com.massinc.leverage.blocks.dataBlock.GetDataParametersInterface;

public class TxtFilePropertiesInputParameter implements GetDataParametersInterface {
	String propertyKey;

	public String getPropertyKey() {
		return propertyKey;
	}

	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}
}
