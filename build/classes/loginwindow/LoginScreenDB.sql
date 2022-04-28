DROP DATABASE IF EXISTS `studentManagementSystem`;
CREATE DATABASE `studentManagementSystem`;
USE `studentManagementSystem`;
CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `usertype` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  PRIMARY KEY (`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO login_info.users (uid, username, password, usertype, firstname, lastname)
VALUES (001, "abcd", 1234, "Admin", "John", "Doe");

SELECT * FROM login_info.users;