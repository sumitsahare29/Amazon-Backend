package com.sbs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import com.sbs.dao.Dao;
import com.sbs.entity.Student;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	Dao dao;

	ArrayList<Student> aList=new ArrayList<Student>();
	
	public List<Student> businessLogic() {

		List<Student> list = dao.databaseCode();

		for (Student student : list) {
			if (student.getName().startsWith("R")) {
				aList.add(student);
			}
		}

		return  aList;

	}

}
