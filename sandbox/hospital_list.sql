-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2017 at 05:07 AM
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
-- Table structure for table `hospital_list`
--

CREATE TABLE `hospital_list` (
  `id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `short_name` varchar(50) NOT NULL,
  `address` text NOT NULL,
  `moic` varchar(50) NOT NULL,
  `licence` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `district` enum('Kolkata','HOOGHLY','HOWRAH','BANKURA','PURULIA','BURDWAN','DARJEELING','JALPAIGURI','COOCH BEHAR','UTTAR DINAJPUR','DAKSHIN DINAJPUR','MALDA','MURSHIDABAD','NADIA','NORTH 24 PGS','SOUTH 24 PGS','BIRBHUM','WEST MEDINIPUR','EAST MEDINIPUR') NOT NULL,
  `type` enum('Government','Central Government','Private') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospital_list`
--

INSERT INTO `hospital_list` (`id`, `name`, `short_name`, `address`, `moic`, `licence`, `phone`, `district`, `type`) VALUES
('3', 'R G Kar Govt. Hospital', 'R G Kar Hospital', '', '', '', '', 'Kolkata', 'Government');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
