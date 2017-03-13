-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2017 at 05:05 AM
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
  `Component` enum('Packed Red Cell','Platelet Concentrate','Fresh Frozen Plasma','Cyro Precipitate','Not Applicable') NOT NULL,
  `bbid` varchar(50) NOT NULL,
  `donorid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_inventory`
--

INSERT INTO `blood_inventory` (`blood_bag_number`, `abo`, `rh`, `date_of_collection`, `expiry_date`, `type`, `Component`, `bbid`, `donorid`) VALUES
('BB1', 'A+', 'Positive', '2017-02-24', '2018-02-16', 'Whole Blood', 'Not Applicable', '2', 'D000000000001'),
('BB10', 'A+', 'Positive', '2017-02-01', '2018-02-09', 'Whole Blood', 'Not Applicable', '1', 'D00000000002'),
('BB2', 'A+', 'Positive', '2017-03-15', '2018-04-11', 'Whole Blood', 'Not Applicable', '2', 'D0000000001'),
('BB3', 'B+', 'Positive', '2017-03-05', '2018-03-05', 'Component', 'Cyro Precipitate', '2', 'D00000000003'),
('BB5', 'B+', 'Positive', '2017-02-07', '2017-06-14', 'Component', 'Packed Red Cell', '1', 'D00000000001'),
('BB6', 'AB-', 'Negative', '2017-02-24', '2017-04-12', 'Whole Blood', 'Not Applicable', '2', 'D00000000003'),
('BB7', 'A+', 'Positive', '2017-02-10', '2017-09-20', 'Whole Blood', 'Not Applicable', '2', 'D00000000002'),
('BB9', 'A+', 'Positive', '2017-02-09', '2017-05-23', 'Whole Blood', 'Not Applicable', '1', 'D000000000001');

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
