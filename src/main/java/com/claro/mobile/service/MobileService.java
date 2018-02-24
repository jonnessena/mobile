package com.claro.mobile.service;

import java.util.ArrayList;
import java.util.List;

import com.claro.mobile.model.MobileDTO;

public class MobileService {

	public List<MobileDTO> listMobiles() throws Exception {
		List<MobileDTO> mobilesReturn = new ArrayList<MobileDTO>();
		MobileDTO m1 = new MobileDTO("Modelo de testes1", 300, "brand de testes1", "url de photos1", "01/01/2001");
		MobileDTO m2 = new MobileDTO("Modelo de testes1", 300, "brand de testes1", "url de photos1", "01/01/2001");
		MobileDTO m3 = new MobileDTO("Modelo de testes1", 300, "brand de testes1", "url de photos1", "01/01/2001");
		MobileDTO m4 = new MobileDTO("Modelo de testes1", 300, "brand de testes1", "url de photos1", "01/01/2001");
		MobileDTO m5 = new MobileDTO("Modelo de testes1", 300, "brand de testes1", "url de photos1", "01/01/2001");
		mobilesReturn.add(m1);
		mobilesReturn.add(m2);
		mobilesReturn.add(m3);
		mobilesReturn.add(m4);
		mobilesReturn.add(m5);
		return mobilesReturn;
	}

	public MobileDTO add(MobileDTO mob) throws Exception {
		System.out.println(mob.toString());
		return mob;
	}

}
