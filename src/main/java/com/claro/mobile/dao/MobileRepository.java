//package com.claro.mobile.dao;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//import com.claro.mobile.entity.Mobile;
//import com.claro.mobile.model.MobileDTO;
//
//@RepositoryRestResource(collectionResourceRel = "mobileDAOImpl", path = "mobileDAOImpl")
//public interface MobileRepository extends JpaRepository<Mobile, Long> {
//
//	public List<MobileDTO> list();
//
//	public MobileDTO add(Mobile mob);
//
//}
