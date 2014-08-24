package com.massinc.leverage.blocks.txtFileProperties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class TxtFilePropertiesSingleton {
	
	private static TxtFilePropertiesSingleton txtFilePropertiesSingleton;
	private TxtFilePropertiesSingleton()
	{}
	
	protected static TxtFilePropertiesSingleton getInstance() throws FileNotFoundException, IOException
	{
		if (txtFilePropertiesSingleton==null)
		{
			txtFilePropertiesSingleton = new TxtFilePropertiesSingleton();
			
			Properties currProperties = new Properties();
			currProperties.load(txtFilePropertiesSingleton.getClass().getResourceAsStream("/com/massinc/leverage/blocks/txtFileProperties/properties.txt"));
			txtFilePropertiesSingleton.setProperties(currProperties);
		}
		
		return txtFilePropertiesSingleton;
	}
	
	private Properties properties;
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
