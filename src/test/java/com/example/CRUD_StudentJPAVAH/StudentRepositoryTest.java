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
		System.out.println("getAll: " + studentRepository.findAll_Native());
	}

	@Test
	public void add() {
		studentRepository.addStudent_Native("Vo Anh Hao ", "0522977010", "Long An");
		System.out.println("Add");
	}

	@Test
	public void update() {
		studentRepository.updateStudent_Native(14,"Update", "Update", "Update An");
		System.out.println("Update:");
	}

	@Test
	public void delete() {
		studentRepository.deleteStudent_Native(15);
		System.out.println("Delete");
	}

}
