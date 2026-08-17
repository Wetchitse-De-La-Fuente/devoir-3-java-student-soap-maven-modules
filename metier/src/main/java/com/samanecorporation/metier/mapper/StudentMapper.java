package com.samanecorporation.metier.mapper;

import com.samanecorporation.metier.dto.StudentDto;
import com.samanecorporation.metier.entity.StudentEntity;

public final class StudentMapper {
    private StudentMapper() {
    }

    public static StudentDto toDto(StudentEntity entity) {
        if (entity == null) {
            return null;
        }
        return new StudentDto(
                entity.getMatricule(),
                entity.getNom(),
                entity.getPrenom(),
                entity.getNumeroTelephone()
        );
    }

    public static StudentEntity toEntity(StudentDto dto) {
        if (dto == null) {
            return null;
        }
        return new StudentEntity(
                dto.getMatricule(),
                dto.getNom(),
                dto.getPrenom(),
                dto.getNumeroTelephone()
        );
    }
}
