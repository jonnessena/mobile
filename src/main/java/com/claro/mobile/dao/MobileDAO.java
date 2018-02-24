package com.claro.mobile.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.claro.mobile.entity.Mobile;
import com.claro.mobile.model.MobileDTO;

@RepositoryRestResource(collectionResourceRel = "mobileDAOImpl", path = "mobileDAOImpl")
public interface MobileDAO extends PagingAndSortingRepository<Mobile, Long> {

	public List<MobileDTO> list();

	public MobileDTO add(Mobile mob);

}
