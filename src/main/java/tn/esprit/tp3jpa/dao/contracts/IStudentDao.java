package tn.esprit.tp3jpa.dao.contracts;

import java.util.List;

import tn.esprit.tp3jpa.entities.Student;

public interface IStudentDao {

	public void addStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudent(int cin);

	public Student findStudentByCin(int cin);

	public List<Student> findAllStudents();

}
