package com.samanecorporation.metier.dao;

import com.samanecorporation.metier.config.HibernateUtil;
import com.samanecorporation.metier.entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao implements IStudentDao {
    @Override
    public StudentEntity findByMatricule(String matricule) {
        if (matricule == null || matricule.isBlank()) {
            return null;
        }
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(StudentEntity.class, matricule.trim());
        }
    }

    @Override
    public StudentEntity save(StudentEntity student) {
        if (student == null) {
            return null;
        }

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            StudentEntity saved = session.merge(student);
            transaction.commit();
            return saved;
        } catch (RuntimeException e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }
}
