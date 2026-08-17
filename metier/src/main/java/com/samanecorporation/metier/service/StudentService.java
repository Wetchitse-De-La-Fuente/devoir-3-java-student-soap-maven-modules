package com.samanecorporation.metier.service;

import com.samanecorporation.metier.dao.IStudentDao;
import com.samanecorporation.metier.dao.StudentDao;
import com.samanecorporation.metier.dto.StudentDto;
import com.samanecorporation.metier.entity.StudentEntity;
import com.samanecorporation.metier.mapper.StudentMapper;

public class StudentService implements IStudentService {
    private final IStudentDao studentDao;

    public StudentService() {
        this(new StudentDao());
    }

    public StudentService(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public StudentDto getByMatricule(String matricule) {
        return StudentMapper.toDto(studentDao.findByMatricule(matricule));
    }

    @Override
    public StudentDto save(StudentDto student) {
        validate(student);
        StudentEntity saved = studentDao.save(StudentMapper.toEntity(student));
        return StudentMapper.toDto(saved);
    }

    private void validate(StudentDto student) {
        if (student == null) {
            throw new IllegalArgumentException("L'etudiant est obligatoire.");
        }
        if (student.getMatricule() == null || student.getMatricule().isBlank()) {
            throw new IllegalArgumentException("Le matricule est obligatoire.");
        }
        if (student.getNom() == null || student.getNom().isBlank()) {
            throw new IllegalArgumentException("Le nom est obligatoire.");
        }
        if (student.getPrenom() == null || student.getPrenom().isBlank()) {
            throw new IllegalArgumentException("Le prenom est obligatoire.");
        }
        if (student.getNumeroTelephone() == null || student.getNumeroTelephone().isBlank()) {
            throw new IllegalArgumentException("Le numero de telephone est obligatoire.");
        }
    }
}
