package in.akash.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akash.model.Student;

public interface IStudentDao extends JpaRepository<Student, Integer> {
}