package com.claro.mobile.service;

import java.util.List;

import com.claro.mobile.model.MobileDTO;

public interface IMobileService {
	
	public List<MobileDTO> list() throws Exception;
	public MobileDTO create(MobileDTO mob) throws Exception;
	public MobileDTO find(long code) throws Exception;

}
