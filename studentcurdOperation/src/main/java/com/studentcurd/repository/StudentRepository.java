package com.studentcurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentcurd.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
