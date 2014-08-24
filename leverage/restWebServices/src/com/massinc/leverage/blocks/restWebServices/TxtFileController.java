package com.massinc.leverage.blocks.restWebServices;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.massinc.leverage.blocks.txtFileProperties.TxtFileProperties;
import com.massinc.leverage.blocks.txtFileProperties.TxtFilePropertiesInputParameter;

@RestController
@RequestMapping("/txtProperty")
public class TxtFileController {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody String getPropertyValue(@PathVariable String name) {
		String val = null;
		TxtFilePropertiesInputParameter param = new TxtFilePropertiesInputParameter();
		param.setPropertyKey(name);
		val = (String) new TxtFileProperties().getData(param);
		
		if (val != null)
			return new StringBuilder(name).append(" = '").append(val).append("'").toString();
		else
			return new StringBuilder(name).append(" = ").append(val).toString();
 
	}
}
