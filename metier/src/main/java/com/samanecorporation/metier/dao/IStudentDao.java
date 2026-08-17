package com.samanecorporation.metier.dao;

import com.samanecorporation.metier.entity.StudentEntity;

public interface IStudentDao {
    StudentEntity findByMatricule(String matricule);
    StudentEntity save(StudentEntity student);
}
