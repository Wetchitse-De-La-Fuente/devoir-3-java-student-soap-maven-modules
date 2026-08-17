package com.samanecorporation.metier.service;

import com.samanecorporation.metier.dto.StudentDto;

public interface IStudentService {
    StudentDto getByMatricule(String matricule);
    StudentDto save(StudentDto student);
}
