//package com.claro.mobile.dao;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;
//import javax.transaction.Transactional;
//
//import org.springframework.data.jpa.repository.support.JpaEntityInformation;
//import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
//import org.springframework.data.rest.webmvc.RepositoryRestController;
//
//import com.claro.mobile.entity.Mobile;
//import com.claro.mobile.model.MobileDTO;
//
//@RepositoryRestController
//public class MobileRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> {
//
//	private EntityManager entityManager;
//
//	public MobileRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
//		super(entityInformation, entityManager);
//		this.entityManager = entityManager;
//	}
//
//	public MobileDTO add(Mobile mob) {
//		// CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//		// CriteriaQuery<T> query = builder.createQuery(getDomainClass());
//		// Root<T> root = query.from(getDomainClass());
//		// query.
//		return null;
//	}
//
//	@Transactional
//	public List<Mobile> list() {
//		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<T> query = builder.createQuery(getDomainClass());
//		Root<T> root = query.from(getDomainClass());
//		query.select(root);
//		TypedQuery<T> q = entityManager.createQuery(query);
//		return (List<Mobile>) q.getResultList();
//	}
//
//}
