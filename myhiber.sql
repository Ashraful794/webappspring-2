-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 14, 2022 at 09:51 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myhiber`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact_table`
--

CREATE TABLE `contact_table` (
  `id` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `mobile_number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `contact_table`
--

INSERT INTO `contact_table` (`id`, `address`, `mobile_number`) VALUES
(1, '17/22', 198888);

-- --------------------------------------------------------

--
-- Table structure for table `course_table`
--

CREATE TABLE `course_table` (
  `id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `ct_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course_table`
--

INSERT INTO `course_table` (`id`, `description`, `title`, `ct_fk`) VALUES
(1, 'Java Core', 'Java', 1),
(145, 'This is Spring Boot', 'Spring Boot', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(3);

-- --------------------------------------------------------

--
-- Table structure for table `image_table`
--

CREATE TABLE `image_table` (
  `id` int(11) NOT NULL,
  `path` varchar(255) DEFAULT NULL,
  `it_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `image_table`
--

INSERT INTO `image_table` (`id`, `path`, `it_fk`) VALUES
(1, 'E:\\Problem Solving New\\webappspring-2\\src\\main\\resources\\static\\imagepng-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png', 1),
(2, 'E:\\Problem Solving New\\webappspring-2\\src\\main\\resources\\static\\imageOHPQE700.jpg', 1);

-- --------------------------------------------------------

--
-- Table structure for table `teacher_table`
--

CREATE TABLE `teacher_table` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `tc_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_table`
--

INSERT INTO `teacher_table` (`id`, `name`, `tc_fk`) VALUES
(1, 'Sabbir', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contact_table`
--
ALTER TABLE `contact_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course_table`
--
ALTER TABLE `course_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKs9ymy25aeyuv8ob4mllwqdv5e` (`ct_fk`);

--
-- Indexes for table `image_table`
--
ALTER TABLE `image_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKp3o3s712xxdmvci80rngbioh3` (`it_fk`);

--
-- Indexes for table `teacher_table`
--
ALTER TABLE `teacher_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKncyeeql6w0vx9vyuqiv6li0tx` (`tc_fk`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `course_table`
--
ALTER TABLE `course_table`
  ADD CONSTRAINT `FKs9ymy25aeyuv8ob4mllwqdv5e` FOREIGN KEY (`ct_fk`) REFERENCES `teacher_table` (`id`);

--
-- Constraints for table `image_table`
--
ALTER TABLE `image_table`
  ADD CONSTRAINT `FKp3o3s712xxdmvci80rngbioh3` FOREIGN KEY (`it_fk`) REFERENCES `teacher_table` (`id`);

--
-- Constraints for table `teacher_table`
--
ALTER TABLE `teacher_table`
  ADD CONSTRAINT `FKncyeeql6w0vx9vyuqiv6li0tx` FOREIGN KEY (`tc_fk`) REFERENCES `contact_table` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
