package com.juaracoding.MFKJavaWeb.repo;

import com.juaracoding.MFKJavaWeb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
