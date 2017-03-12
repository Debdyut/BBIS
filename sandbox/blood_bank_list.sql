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
-- Table structure for table `blood_bank_list`
--

CREATE TABLE `blood_bank_list` (
  `id` varchar(20) NOT NULL,
  `name` varchar(150) NOT NULL,
  `short_name` varchar(50) NOT NULL,
  `address` text NOT NULL,
  `moic` varchar(150) NOT NULL,
  `licence` varchar(50) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `district` enum('Kolkata','HOOGHLY','HOWRAH','BANKURA','PURULIA','BURDWAN','DARJEELING','JALPAIGURI','COOCH BEHAR','UTTAR DINAJPUR','DAKSHIN DINAJPUR','MALDA','MURSHIDABAD','NADIA','NORTH 24 PGS','SOUTH 24 PGS','BIRBHUM','WEST MEDINIPUR','EAST MEDINIPUR') NOT NULL,
  `type` enum('Government','Central Government','Private') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_bank_list`
--

INSERT INTO `blood_bank_list` (`id`, `name`, `short_name`, `address`, `moic`, `licence`, `phone`, `district`, `type`) VALUES
('1', 'Institute of Blood Transfusion Medical & Immunohaematology', 'Manictala Blood Bank', '205, Vivekananda Road, Manicktala, Kolkata – 6', 'Dr. R.K. Ganguly ', '', '23510619,9433892164 ', 'Kolkata', 'Government'),
('2', 'SSKM Hospital Blood Bank', 'SSKM Blood Bank', 'AJC Bose Road, Kolkata – 20', 'Dr. Saha ', 'DL-33-MB/SLA/CLAA/WB', '22234174,9339207842', 'Kolkata', 'Government');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `blood_bank_list`
--
ALTER TABLE `blood_bank_list`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `name` (`name`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
