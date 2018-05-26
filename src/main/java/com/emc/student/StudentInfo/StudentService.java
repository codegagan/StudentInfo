package com.emc.student.StudentInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service /*
			 * to indicate that its a Service class
			 */
public class StudentService {

	private List<Student> students = new ArrayList<Student>(Arrays.asList(

			new Student("1", "Ravi", "Java"), new Student("2", "Ram", ".NET"), new Student("3", "Sam", "Spring")));

	public List<Student> getAllStudent() {
		return students;
	}

	public Student getStudent(String id) {
		for (Student student : students) {
			if (student.getId().equals(id)) {

				return student;
			}

		}
		return null;
	}

	public void addStudent(Student st) {
		students.add(st);
	}

	public void updateStudent(String id, Student S) {

		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (s.getId().equals(id)) {
				students.set(i, S);
				return;
			}

		}
	}
}
