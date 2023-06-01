package org.example.service;

import org.example.dao.IStudentDao;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private IStudentDao studentDao;
    @Override
    public Iterable<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {

        return studentDao.findById(id);
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public void delete(Long id) {
        studentDao.deleteById(id);
    }

    @Override
    public Iterable<Student> findStudentMoreAge(String age) {
        return studentDao.findStudentMoreAge(age);
    }
}
