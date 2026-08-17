CREATE DATABASE IF NOT EXISTS studentsoap_db
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE studentsoap_db;

CREATE TABLE IF NOT EXISTS student (
    matricule VARCHAR(30) PRIMARY KEY,
    nom VARCHAR(120) NOT NULL,
    prenom VARCHAR(120) NOT NULL,
    numero_telephone VARCHAR(30) NOT NULL
);

INSERT INTO student (matricule, nom, prenom, numero_telephone)
VALUES ('M123', 'DIOP', 'Aminata', '770001122')
ON DUPLICATE KEY UPDATE
    nom = VALUES(nom),
    prenom = VALUES(prenom),
    numero_telephone = VALUES(numero_telephone);
