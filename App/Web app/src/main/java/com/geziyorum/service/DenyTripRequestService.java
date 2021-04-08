package com.geziyorum.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geziyorum.argumentresolver.TokenId;
import com.geziyorum.dao.CommonDao;
import com.geziyorum.dao.TripDao;

@Service
public class DenyTripRequestService implements GeneralProcess{
	
	@Autowired
	CommonDao commonDao;
	
	@Autowired
	TripDao tripDao;
	TokenId tokenId;
	
	@Override
	public Object startService() throws IOException {
		validateService();
		return processService();
	}

	@Override
	public Object validateService() throws IOException {
		commonDao.checkSessionExistByToken(tokenId.getToken());
		return true;
	}

	@Override
	public Object processService() throws IOException {
		tripDao.deleteTripRequestById(tokenId.getId());
		return true;
	}
	
	public TokenId getTokenId() {
		return tokenId;
	}

	public void setTokenId(TokenId tokenId) {
		this.tokenId = tokenId;
	}
		

}
