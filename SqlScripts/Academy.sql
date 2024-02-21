CREATE DATABASE IF NOT EXISTS Academy;
USE Academy;

CREATE TABLE IF NOT EXISTS Courses (
    idCourse SMALLINT AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    description VARCHAR(40),

    PRIMARY KEY (idCourse)
);

CREATE TABLE IF NOT EXISTS Customers (
    ced VARCHAR(10),
    fullName VARCHAR(20) NOT NULL,
    lastName VARCHAR(20) NOT NULL,
    phoneNumber VARCHAR(10) NOT NULL UNIQUE,
    address VARCHAR(30) NOT NULL,

    PRIMARY KEY (ced)
);

CREATE TABLE IF NOT EXISTS CustomerCourses (
    customer VARCHAR(10),
    course TINYINT,

    PRIMARY KEY (customer,course),
    CONSTRAINT FK_Customer FOREIGN KEY (customer)
        REFERENCES Customers (ced),
    CONSTRAINT FK_Course FOREIGN KEY (course)
        REFERENCES Courses (idCourse)
);

/* CREATE DATABASE IF NOT EXISTS Academy;
USE Academy;

CREATE TABLE IF NOT EXISTS Customers (
    ced VARCHAR(10),
    fullName VARCHAR(20) NOT NULL,
    lastName VARCHAR(20) NOT NULL,
    phoneNumber VARCHAR(10) NOT NULL UNIQUE,
    address VARCHAR(30) NOT NULL,

    PRIMARY KEY (ced)
);

CREATE TABLE IF NOT EXISTS Course (
    idCourse SMALLINT AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    description VARCHAR(40),

    PRIMARY KEY (idCourse)
); */




