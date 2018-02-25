package com.claro.mobile.dao;

import java.util.List;

import com.claro.mobile.entity.Mobile;

public interface IMobileDAO {

	public List<Mobile> list() throws Exception;

	public Mobile create(Mobile mob) throws Exception;

	public Mobile find(long code) throws Exception;

}
