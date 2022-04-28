DROP DATABASE IF EXISTS `login_info`;
CREATE DATABASE `login_info`;
USE `login_info`;
CREATE TABLE `users` (
  `UID` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Usertype` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  PRIMARY KEY (`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO login_info.users (UID, Username, Password, Usertype, Name)
VALUES (001, "abcd", 1234, "Admin", "John Doe");

SELECT * FROM login_info.users;