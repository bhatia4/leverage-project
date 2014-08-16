package com.massinc.leverage.blocks.restWebServices;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.massinc.leverage.blocks.txtFileProperties.TxtFilePropertiesSingleton;

@RestController
@RequestMapping("/txtProperty")
public class TxtFileController {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody String getPropertyValue(@PathVariable String name) {
		String val = null;
		try {
			TxtFilePropertiesSingleton txtFilePropertiesSingleton = TxtFilePropertiesSingleton.getInstance();
			val = txtFilePropertiesSingleton.getProperties().getProperty(name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (val != null)
			return new StringBuilder(name).append(" = '").append(val).append("'").toString();
		else
			return new StringBuilder(name).append(" = ").append(val).toString();
 
	}
}
