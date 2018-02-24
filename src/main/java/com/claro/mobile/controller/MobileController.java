package com.claro.mobile.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claro.mobile.model.MobileDTO;
import com.claro.mobile.service.MobileService;

@RestController()
public class MobileController {
	MobileService service;
	Logger log;

	public MobileController() {
		this.service = new MobileService();
	}

	@RequestMapping("/claro/mobiles")
	public List<MobileDTO> mobiles() throws Exception {
		try {
			return service.listMobiles();
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return null;
	}

	@RequestMapping(value = "/claro/mobile", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public MobileDTO mobile(@RequestBody MobileDTO input) throws Exception {
		try{
			service.add(input);
		}catch(Exception e){
			log.error(e);
		}
		return input;
	}
}
