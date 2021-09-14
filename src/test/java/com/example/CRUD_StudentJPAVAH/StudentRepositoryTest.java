package com.example.CRUD_StudentJPAVAH;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.CRUD_StudentJPAVAH.entity.Student;
import com.example.CRUD_StudentJPAVAH.repository.StudentReponsitory;

@SpringBootTest
public class StudentRepositoryTest {

	@Autowired
	private StudentReponsitory studentRepository;

	@Test
	public void getAll() {
		System.out.println("getAll: " + studentRepository.findAll());
	}

	@Test
	public void add() {
		Student student = new Student("Vo Anh Hao ", "0522977010", "Long An");
		System.out.println("Add: " + studentRepository.save(student));
	}

	@Test
	public void update() {
		Student student = studentRepository.findById(5).get();
		student.setName("Hao da update");
		System.out.println("Update: " + studentRepository.save(student));
	}

	@Test
	public void delete() {
		studentRepository.deleteById(6);
		System.out.println("Delete");
	}

}
