-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 12, 2017 at 11:38 AM
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
-- Table structure for table `blood_transaction`
--

CREATE TABLE `blood_transaction` (
  `serial` int(11) NOT NULL,
  `bbid` varchar(50) NOT NULL,
  `bag_no` varchar(50) NOT NULL,
  `blood_group` enum('A+','A-','B+','B-','AB+','AB-','O+','O-') NOT NULL,
  `rh` enum('Positive','Negative') NOT NULL,
  `type` enum('Whole Blood','Component') NOT NULL,
  `component` enum('Not Applicable','Packed Red Cell','Platelet Concentrate','Fresh Frozen Plasma','Cyro Precipitate') NOT NULL,
  `health_center` text NOT NULL,
  `hc_reg_no` varchar(50) NOT NULL,
  `doctor_name` text NOT NULL,
  `patient_name` text NOT NULL,
  `p_reg_no` varchar(50) NOT NULL,
  `p_age` tinyint(4) NOT NULL,
  `p_gender` enum('Male','Female') NOT NULL,
  `p_req_date` date NOT NULL,
  `indication_of_transfusion` enum('Acute Haemorrhage','Acute Life Saving Surgery','Routine Surgery','Chronic Anaemia','Thalasseamia','Cancer','Others') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood_transaction`
--

INSERT INTO `blood_transaction` (`serial`, `bbid`, `bag_no`, `blood_group`, `rh`, `type`, `component`, `health_center`, `hc_reg_no`, `doctor_name`, `patient_name`, `p_reg_no`, `p_age`, `p_gender`, `p_req_date`, `indication_of_transfusion`) VALUES
(0, '2', 'BB1', 'A+', 'Positive', 'Whole Blood', 'Not Applicable', 'Calcutta Medical College', '142/26/31', 'Farukh Shah', 'Mostafa Seikh', '142/26/31', 42, 'Male', '2017-02-14', 'Acute Haemorrhage'),
(1, '2', 'BB2', 'A+', 'Positive', 'Whole Blood', 'Not Applicable', 'SSKM', '100/20/31', 'Debarpan Ganguly', 'Debdyut Hajra', '100/20/31', 52, 'Male', '2017-02-13', 'Routine Surgery');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `blood_transaction`
--
ALTER TABLE `blood_transaction`
  ADD PRIMARY KEY (`serial`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
