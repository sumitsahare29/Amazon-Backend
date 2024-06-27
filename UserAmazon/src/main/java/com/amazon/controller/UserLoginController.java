package com.amazon.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.amazon.entity.User;

@RestController
@RequestMapping("/amazon/user")
public class UserLoginController {

	@Autowired
	SessionFactory sessionFactory;
 
	@PostMapping("/login")
	public boolean userLogin(@RequestBody User user) {
		Session session = sessionFactory.openSession();
		Query<User> query = session.createQuery("from User where name=:username", User.class);
		query.setParameter("username", user.getName());
//		List<User> list = query.list();
		User userFromDatabase = query.uniqueResult();

		if (userFromDatabase != null && user.getPassword().equals(userFromDatabase.getPassword())) {
			return true;
		} else {
			return false;
		}

	}
}
