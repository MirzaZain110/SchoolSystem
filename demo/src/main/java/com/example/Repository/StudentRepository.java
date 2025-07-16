package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.School.*;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
