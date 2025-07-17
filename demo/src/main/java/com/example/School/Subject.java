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

    public Long getCourseID() {
		return CourseID;
	}

	public void setCourseID(Long courseID) {
		CourseID = courseID;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

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
