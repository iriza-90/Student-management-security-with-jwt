package com.rca.mySecurity.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rca.mySecurity.entity.Student;
import com.rca.mySecurity.repository.StudentRepo;
@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;
    public void addStudent(Student st) {
        repo.save(st);
    }
}

