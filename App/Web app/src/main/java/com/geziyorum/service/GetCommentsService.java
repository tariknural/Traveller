package com.geziyorum.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geziyorum.argumentresolver.TokenPersonalSharing;
import com.geziyorum.dao.CommonDao;

@Service
public class GetCommentsService implements GeneralProcess{

	@Autowired
	CommonDao commonDao;
	
	TokenPersonalSharing tokenPersonalSharing;
	
	@Override
	public Object startService() throws IOException {
		validateService();
		return processService();
	}

	@Override
	public Object validateService() throws IOException {
		commonDao.checkSessionExistByToken(tokenPersonalSharing.getToken());
		return true;
	}

	@Override
	public Object processService() throws IOException {
		return commonDao.getCommentListByPersonalSharingId(tokenPersonalSharing.getPersonalSharingId());
	}

	public TokenPersonalSharing getTokenPersonalSharing() {
		return tokenPersonalSharing;
	}

	public void setTokenPersonalSharing(TokenPersonalSharing tokenPersonalSharing) {
		this.tokenPersonalSharing = tokenPersonalSharing;
	}
	
	
	
	
	
	

}
