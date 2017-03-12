-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 12, 2017 at 11:39 AM
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
-- Table structure for table `donor_list`
--

CREATE TABLE `donor_list` (
  `donor_id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` text NOT NULL,
  `age` int(2) NOT NULL,
  `sex` enum('Male','Female') NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `blood_group` enum('A+','A-','B+','B-','AB+','AB-','O+','O-') NOT NULL,
  `rh` enum('Positive','Negative') NOT NULL,
  `emergency_donor` tinyint(1) NOT NULL,
  `last_donated` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor_list`
--

INSERT INTO `donor_list` (`donor_id`, `name`, `address`, `age`, `sex`, `phone`, `email`, `blood_group`, `rh`, `emergency_donor`, `last_donated`) VALUES
('D00000000000', 'Debdyut Hajra', '22, Ballygaunge Place (EAST), Kolkata - 19', 21, 'Male', '7852642321', 'debdyut@fleckens.hu', 'B+', 'Positive', 0, '2017-02-13'),
('D00000000001', 'Ranajoy Hajra', '13B, Paramhansa Deb Road, Kolkata', 19, 'Male', '7278852456', 'ranajoy@fleckens.hu', 'A+', 'Positive', 1, '2017-03-02'),
('D00000000002', 'MD Galib', '138, VIP Road, Kolkata', 22, 'Male', '9805478796', 'galib@teleworm.us', 'A-', 'Negative', 1, '2017-02-23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donor_list`
--
ALTER TABLE `donor_list`
  ADD PRIMARY KEY (`donor_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
