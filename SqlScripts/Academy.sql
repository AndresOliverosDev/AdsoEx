CREATE DATABASE IF NOT EXISTS Academy;
USE Academy;

CREATE TABLE IF NOT EXISTS Courses (
    idCourse BIGINT AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    description VARCHAR(40),

    PRIMARY KEY (idCourse)
);

CREATE TABLE IF NOT EXISTS Customers (
    ced BIGINT,
    fullname VARCHAR(20) NOT NULL,
    lastname VARCHAR(20) NOT NULL,
    phoneNumber VARCHAR(10) NOT NULL UNIQUE,
    address VARCHAR(30) NOT NULL,

    PRIMARY KEY (ced)
);