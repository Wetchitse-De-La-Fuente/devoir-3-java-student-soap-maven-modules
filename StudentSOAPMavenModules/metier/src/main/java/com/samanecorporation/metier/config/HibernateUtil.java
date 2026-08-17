package com.samanecorporation.metier.config;

import com.samanecorporation.metier.entity.StudentEntity;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory buildSessionFactory() {
        try {
            Properties db = PropertiesReader.load("database.properties");

            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(StudentEntity.class);
            configuration.setProperty("hibernate.connection.driver_class", db.getProperty("database.driver"));
            configuration.setProperty("hibernate.connection.url", db.getProperty("database.url"));
            configuration.setProperty("hibernate.connection.username", db.getProperty("database.username"));
            configuration.setProperty("hibernate.connection.password", db.getProperty("database.password"));
            configuration.setProperty("hibernate.dialect", db.getProperty("hibernate.dialect"));
            configuration.setProperty("hibernate.show_sql", db.getProperty("hibernate.show_sql", "true"));
            configuration.setProperty("hibernate.format_sql", db.getProperty("hibernate.format_sql", "true"));
            configuration.setProperty("hibernate.hbm2ddl.auto", db.getProperty("hibernate.hbm2ddl.auto", "update"));

            return configuration.buildSessionFactory();
        } catch (Exception e) {
            throw new ExceptionInInitializerError("Initialisation Hibernate impossible : " + e.getMessage());
        }
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
