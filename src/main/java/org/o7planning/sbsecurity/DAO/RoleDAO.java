package org.o7planning.sbsecurity.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class RoleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<String> getListRole(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from UserRole where  ")
		
		
	}
}
