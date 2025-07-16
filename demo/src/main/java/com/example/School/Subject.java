package com.example.School;

import java.util.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CourseID;

    private String CourseName;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students = new HashSet<>();

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
}
