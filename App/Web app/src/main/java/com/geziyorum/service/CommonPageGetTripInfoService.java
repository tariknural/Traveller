package com.geziyorum.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class CommonPageGetTripInfoService  implements GeneralProcess{

	@Override
	public Object startService() throws IOException {
		validateService();
		return processService();
	}

	@Override
	public Object validateService() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object processService() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
