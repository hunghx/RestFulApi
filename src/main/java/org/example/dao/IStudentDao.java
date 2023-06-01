package org.example.dao;

import org.example.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends PagingAndSortingRepository<Student,Long> {
}
