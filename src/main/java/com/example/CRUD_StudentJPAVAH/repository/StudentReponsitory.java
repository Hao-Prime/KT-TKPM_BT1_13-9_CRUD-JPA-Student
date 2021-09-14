package com.example.CRUD_StudentJPAVAH.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.CRUD_StudentJPAVAH.entity.Student;


public interface StudentReponsitory extends JpaRepository<Student, Integer>{

    @Query("select s from Student s")
    List<Student> findAll_JPQL();
    
    //Không có câu lệnh INSERT trong JPA
    @Transactional
    @Modifying
    @Query(value = "insert into Student(name,sdt,diachi) values(?1,?2,?3)", nativeQuery = true)
    void addStudent_JPQL(String name, String sdt, String diachi);
    
    @Transactional
    @Modifying
    @Query(value = "update Student s set s.name=?2, s.sdt=?3, s.diachi = ?4 where s.id = ?1")
    void updateStudent_JPQL(int id ,String name, String sdt, String diachi);

    @Transactional
    @Modifying
    @Query("delete from Student s where s.id = ?1")
    void deleteStudent_JPQL(int id);
    
    
}
