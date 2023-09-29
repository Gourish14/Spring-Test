package com.cozentus.CRUD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cozentus.CRUD.DAO.StudentDAO;

public class CrudMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/coznetus/CRUD/crudbean.xml");
		StudentDAO studentDAO = (StudentDAO) ac.getBean("jdbcTemplate");
		
		studentDAO.setID(1);
		studentDAO.setName("Gourish");
		studentDAO.insertStudent();
	}
}
