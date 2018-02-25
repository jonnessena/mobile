package com.claro.mobile.service;

import java.util.List;

import com.claro.mobile.model.MobileDTO;

public interface IMobileService {
	
	List<MobileDTO> listMobiles() throws Exception;
	MobileDTO add(MobileDTO mob) throws Exception;

}
