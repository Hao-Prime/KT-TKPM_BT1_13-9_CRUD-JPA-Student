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
		System.out.println("getAll: " + studentRepository.findAll_JPQL());
	}

	@Test
	public void add() {
		studentRepository.addStudent_JPQL("Vo Anh Hao ", "0522977010", "Long An");
		System.out.println("Đã add 1 student " );
	}

	@Test
	public void update() {
		studentRepository.updateStudent_JPQL(9,"update","update","update");
		System.out.println("Update ");
	}

	@Test
	public void delete() {
		studentRepository.deleteStudent_JPQL(10);
		System.out.println("Delete");
	}

}
