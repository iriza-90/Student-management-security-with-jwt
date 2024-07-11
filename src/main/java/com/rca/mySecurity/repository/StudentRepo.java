package com.rca.mySecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rca.mySecurity.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
