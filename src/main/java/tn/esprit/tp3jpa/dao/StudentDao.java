package tn.esprit.tp3jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.tp3jpa.dao.contracts.IStudentDao;
import tn.esprit.tp3jpa.entities.Student;

@Repository
@Transactional
public class StudentDao implements IStudentDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addStudent(Student student) {
		em.persist(student);
	}

	@Override
	public void updateStudent(Student student) {
		em.merge(student);
	}

	@Override
	public void deleteStudent(int cin) {
		em.remove(findStudentByCin(cin));
	}

	@Override
	public Student findStudentByCin(int cin) {
		return em.find(Student.class, cin);
	}

	@Override
	public List<Student> findAllStudents() {
		TypedQuery<Student> query = em.createQuery("select s from Student s", Student.class);
		return query.getResultList();
	}

}
