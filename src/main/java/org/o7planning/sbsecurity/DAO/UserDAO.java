package org.o7planning.sbsecurity.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.o7planning.sbsecurity.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public User findUser(String username) {
		Session session = sessionFactory.getCurrentSession();
		return (User) session.createQuery("select from User where username = " + username);
	}

}
