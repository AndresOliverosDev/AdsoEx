CREATE DATABASE IF NOT EXISTS academy;
USE academy;

CREATE TABLE IF NOT EXISTS courses (
    id_course BIGINT AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    description VARCHAR(40),

    PRIMARY KEY (id_course)
);

CREATE TABLE IF NOT EXISTS customers (
    ced BIGINT,
    fullname VARCHAR(20) NOT NULL,
    lastname VARCHAR(20) NOT NULL,
    Phone BIGINT NOT NULL UNIQUE,
    address VARCHAR(30) NOT NULL,

    PRIMARY KEY (ced)
);

/* PROCEDURES */

/* SEARCH BY ID */
DELIMITER //
CREATE PROCEDURE find_by_id(IN id INT)
BEGIN
    SELECT * FROM courses WHERE id_course = id;
    END //
DELIMITER ;