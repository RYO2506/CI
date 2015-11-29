package tn.esprit.tp3jpa.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.esprit.tp3jpa.dao.contracts.IStudentDao;
import tn.esprit.tp3jpa.entities.Student;

public class Bootstrap {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentDao studentDao = context.getBean(IStudentDao.class);
		studentDao.addStudent(new Student("Mohamed", "Bouaouina"));

	}

}
