-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 06, 2022 at 07:44 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mathquiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `players`
--

DROP TABLE IF EXISTS `players`;
CREATE TABLE IF NOT EXISTS `players` (
  `playerID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(8) NOT NULL,
  `email` varchar(200) NOT NULL,
  PRIMARY KEY (`playerID`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `players`
--

INSERT INTO `players` (`playerID`, `username`, `password`, `email`) VALUES
(1, 'test1', 'test1', 'test1@gmail.com'),
(2, 'test2', 'test2', 'test2@gmail.com'),
(3, 'admin', 'admin', 'admin@gmail.com'),
(4, 'akiiJazz', 'akira', 'akiiJazz@gmail.com'),
(5, 'thul', 'thul123', 'thulani98.tw@gmail.com'),
(6, 'user1', 'user1', 'user1@gmail.com'),
(7, 'test', 'test', 'test@gmail.com'),
(8, 'test3', 'test3', 'test3@gmail.com'),
(9, 'user', 'user', 'user@gmail.com'),
(10, 'user2', 'user2', 'user2@gmail.com'),
(11, 'user3', 'user3', 'user3@gmail.com'),
(12, 'test4', 'test4', 'test4@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `ranking`
--

DROP TABLE IF EXISTS `ranking`;
CREATE TABLE IF NOT EXISTS `ranking` (
  `rankID` int(11) NOT NULL AUTO_INCREMENT,
  `playerID` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`rankID`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ranking`
--

INSERT INTO `ranking` (`rankID`, `playerID`, `score`) VALUES
(1, 1, 6),
(2, 2, 6),
(3, 5, 2),
(4, 4, 6),
(5, 7, 6),
(6, 8, 7),
(7, 9, 5),
(8, 11, 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
