package com.example.CRUD_StudentJPAVAH.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CRUD_StudentJPAVAH.entity.Student;

public interface StudentReponsitory extends JpaRepository<Student, Integer>{

}
