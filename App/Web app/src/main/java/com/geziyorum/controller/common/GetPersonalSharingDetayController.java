package com.geziyorum.controller.common;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.geziyorum.argumentresolver.TokenId;
import com.geziyorum.service.GetPersonalSharingDetayService;

@RestController
public class GetPersonalSharingDetayController {
	
	@Autowired
	GetPersonalSharingDetayService getPersonalSharingDetayService;
	
	@RequestMapping(method = RequestMethod.POST , value="/getPersonalSharingDetay")
	public Object getPersonalSharingDetay(@RequestBody TokenId tokenId) throws IOException{
		getPersonalSharingDetayService.setTokenId(tokenId);
		return getPersonalSharingDetayService.startService();
	}
	
	

}
