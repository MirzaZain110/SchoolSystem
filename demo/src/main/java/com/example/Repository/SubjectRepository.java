package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.School.*;

public interface SubjectRepository extends JpaRepository<Subject, Long> {}
