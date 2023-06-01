package org.example.dao;

import org.example.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends PagingAndSortingRepository<Student,Long> {
    @Query("Select s from Student  as s where s.studentName like concat('%',:age,'%')")
    Iterable<Student> findStudentMoreAge(@Param("age") String age);

}
