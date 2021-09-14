package com.example.CRUD_StudentJPAVAH.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.CRUD_StudentJPAVAH.entity.Student;

public interface StudentReponsitory extends JpaRepository<Student, Integer>{
	
    @Query(value = "select * from student", nativeQuery = true)
    List<Student> findAll_Native();

    @Transactional
    @Modifying
    @Query(value = "insert into student(name, sdt, diachi) values(?1,?2,?3)", nativeQuery = true)
    void addStudent_Native(String name,String sdt,String diachi);

    @Transactional
    @Modifying
    @Query(value = "update student set name = ?2,sdt = ?3,diachi = ?4 where id = ?1", nativeQuery = true)
    void updateStudent_Native(int id, String name,String sdt,String diachi);

    @Transactional
    @Modifying
    @Query(value = "delete from student where id = ?1", nativeQuery = true)
    void deleteStudent_Native(int id);

}
