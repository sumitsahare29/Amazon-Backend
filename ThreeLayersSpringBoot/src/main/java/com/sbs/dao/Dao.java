package com.sbs.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sbs.entity.Student;

@Repository
public class Dao {

	@Autowired
	SessionFactory sessionFactory;

	
	public List<Student> databaseCode() {

		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Student");

		List<Student> list = query.list();

		return list;

	}

}
