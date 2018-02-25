package com.claro.mobile.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.claro.mobile.entity.Mobile;

@Repository("mobileDAO")
public class MobileDAO extends AbstractDAO implements IMobileDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7982713956037719530L;

	public List<Mobile> list() throws Exception {
		return this.getEntityManager().createQuery("select m from Mobile m").getResultList();
	}

	public Mobile create(Mobile mob) throws Exception {
		this.getEntityManager().persist(mob);
		this.getEntityManager().flush();
		return mob;
	}

	public Mobile find(long code) throws Exception {
		return this.getEntityManager().find(Mobile.class, code);
	}

}
