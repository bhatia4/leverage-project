package com.massinc.leverage.blocks.txtFileProperties;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.massinc.leverage.blocks.dataBlock.DataBlockInterface;
import com.massinc.leverage.blocks.dataBlock.GetDataParametersInterface;

public class TxtFileProperties implements DataBlockInterface {

	@Override
	public Object getData(GetDataParametersInterface param) {
		if (param instanceof TxtFilePropertiesInputParameter)
		{
			String propertyKey = ((TxtFilePropertiesInputParameter)param).getPropertyKey();
			try {
				return TxtFilePropertiesSingleton.getInstance().getProperties().getProperty(propertyKey);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		else
			return null;
	}

	@Override
	public Object setData(Object newData, Object getParameters) {
		return null;
	}

}
