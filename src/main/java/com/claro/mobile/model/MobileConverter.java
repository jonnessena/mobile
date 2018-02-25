package com.claro.mobile.model;

import java.util.ArrayList;
import java.util.List;

import com.claro.mobile.entity.Mobile;

public class MobileConverter {

	public static MobileDTO toDTO(Mobile mobile) {
		if (mobile != null) {
			MobileDTO dto = new MobileDTO();
			dto.setBrand(mobile.getBrand());
			dto.setCode(mobile.getCode());
			dto.setDate(mobile.getDate());
			dto.setModel(mobile.getModel());
			dto.setPhot​oUrl(mobile.getImageLink());
			dto.setPrice(mobile.getPrice());
			return dto;
		}
		return null;
	}

	public static Mobile toMobile(MobileDTO mobileDTO) {
		if (mobileDTO != null) {
			Mobile mobile = new Mobile();
			mobile.setBrand(mobileDTO.getBrand());
			mobile.setCode(mobileDTO.getCode());
			mobile.setDate(mobileDTO.getDate());
			mobile.setModel(mobileDTO.getModel());
			mobile.setImageLink(mobileDTO.getPhot​oUrl());
			mobile.setPrice(mobileDTO.getPrice());
			return mobile;
		}
		return null;
	}

	public static List<MobileDTO> toListDTO(List<Mobile> listMobile) {
		if (listMobile != null) {
			List<MobileDTO> listDTO = new ArrayList<MobileDTO>();
			for (Mobile mob : listMobile) {
				listDTO.add(toDTO(mob));
			}
			return listDTO;
		}
		return null;
	}

	public static List<Mobile> toListMobile(List<MobileDTO> listDTO) {
		if (listDTO != null) {
			List<Mobile> listMobile = new ArrayList<Mobile>();
			for (MobileDTO dto : listDTO) {
				listMobile.add(toMobile(dto));
			}
			return listMobile;
		}
		return null;
	}

}
