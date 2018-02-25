package com.claro.mobile.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claro.mobile.model.MobileDTO;
import com.claro.mobile.service.IMobileService;

@RestController()
public class MobileController {
	@Autowired
	IMobileService service;
	Logger log;

	@RequestMapping(value = "/claro/mobile", method = RequestMethod.GET)
	public List<MobileDTO> mobiles() throws Exception {
		try {
			return service.list();
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return null;
	}

	@RequestMapping(value = "/claro/mobile", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public MobileDTO mobile(@RequestBody MobileDTO input) throws Exception {
		try {
			service.create(input);
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	@RequestMapping(value = "/claro/mobile/{code}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public MobileDTO find(@PathVariable("code") long code) throws Exception {
		try {
			service.find(code);
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}
}
