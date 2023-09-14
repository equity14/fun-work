package com.example.demopro.Service;

import com.example.demopro.Entity.Student;
import com.example.demopro.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private  StudentRepo studentRepo;

   /* public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }*/

    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }
}
