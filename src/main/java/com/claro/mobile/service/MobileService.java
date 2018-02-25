package com.claro.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.claro.mobile.dao.IMobileDAO;
import com.claro.mobile.model.MobileConverter;
import com.claro.mobile.model.MobileDTO;

@Service
public class MobileService implements IMobileService {

	@Autowired(required = true)
	private IMobileDAO dao;

	public MobileService() {
		super();
	}

	public List<MobileDTO> list() throws Exception {
		return MobileConverter.toListDTO(dao.list());
	}

	@Transactional
	public MobileDTO create(MobileDTO dto) throws Exception {
		return MobileConverter.toDTO(dao.create(MobileConverter.toMobile(dto)));
	}

	public MobileDTO find(long code) throws Exception {
		return MobileConverter.toDTO(dao.find(code));
	}

}
