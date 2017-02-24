-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 24, 2017 at 05:04 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bbms`
--

-- --------------------------------------------------------

--
-- Table structure for table `blood_inventory`
--

CREATE TABLE `blood_inventory` (
  `blood_bag_number` varchar(50) NOT NULL,
  `abo` enum('A+','A-','B+','B-','AB+','AB-','O+','O-') NOT NULL,
  `rh` enum('Positive','Negative') NOT NULL,
  `date_of_collection` date NOT NULL,
  `expiry_date` date NOT NULL,
  `type` enum('Whole Blood','Component') NOT NULL,
  `Component` enum('Whole Blood','Packed Red Cell','Platelet Concentrate','Fresh Frozen Plasma','Cyro Precipitate') NOT NULL,
  `bbid` varchar(50) NOT NULL,
  `donorid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_inventory`
--

INSERT INTO `blood_inventory` (`blood_bag_number`, `abo`, `rh`, `date_of_collection`, `expiry_date`, `type`, `Component`, `bbid`, `donorid`) VALUES
('#123', 'B+', 'Positive', '2017-02-15', '2017-02-18', 'Component', 'Fresh Frozen Plasma', '789', '456'),
('#123456789', 'O-', 'Negative', '2017-01-09', '2020-01-14', 'Component', 'Packed Red Cell', 'A456', 'D4512A23'),
('#BB1124', 'A-', 'Positive', '2017-01-17', '2017-01-05', 'Component', 'Cyro Precipitate', '121232dsad', '454df5f4'),
('#BB452', 'AB+', 'Negative', '2017-01-13', '2021-01-12', 'Whole Blood', 'Whole Blood', 'BB56523', 'D12121b12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `blood_inventory`
--
ALTER TABLE `blood_inventory`
  ADD PRIMARY KEY (`blood_bag_number`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
