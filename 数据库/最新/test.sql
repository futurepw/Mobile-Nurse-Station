-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 2018-06-10 08:02:57
-- 服务器版本： 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- 表的结构 `calls`
--

CREATE TABLE `calls` (
  `call_id` varchar(20) NOT NULL COMMENT '呼叫id',
  `patient_id` varchar(20) NOT NULL COMMENT '病人id',
  `type` varchar(30) NOT NULL COMMENT '类型',
  `remark` varchar(200) NOT NULL COMMENT '备注'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `care`
--

CREATE TABLE `care` (
  `care_id` varchar(20) NOT NULL COMMENT '护理id',
  `patient_id` varchar(20) NOT NULL COMMENT '病人id',
  `time` date NOT NULL COMMENT '护理时间',
  `way` varchar(200) NOT NULL COMMENT '方式',
  `remark` varchar(200) NOT NULL COMMENT '备注'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `department`
--

CREATE TABLE `department` (
  `department_id` varchar(20) NOT NULL COMMENT '科室编号',
  `name` varchar(30) NOT NULL COMMENT '科室名字',
  `nurse` int(11) NOT NULL COMMENT '护士数量',
  `doctor` int(11) NOT NULL COMMENT '医生数量'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `docter`
--

CREATE TABLE `docter` (
  `doctor_id` varchar(20) NOT NULL COMMENT '医生id',
  `name` varchar(30) NOT NULL COMMENT '姓名',
  `birthday` date NOT NULL COMMENT '出生日期',
  `sex` varchar(10) NOT NULL COMMENT '性别',
  `department_id` varchar(30) NOT NULL COMMENT '科室',
  `entry_time` date NOT NULL COMMENT '入职日期'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `infusion`
--

CREATE TABLE `infusion` (
  `infusion_id` varchar(20) NOT NULL COMMENT '输液 id',
  `patient_id` varchar(20) NOT NULL COMMENT '病人',
  `time` date NOT NULL COMMENT '输液时间',
  `formula` varchar(500) NOT NULL COMMENT '配方',
  `remark` varchar(200) NOT NULL COMMENT '备注'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `nurse`
--

CREATE TABLE `nurse` (
  `nurse_id` varchar(20) NOT NULL COMMENT '护士id',
  `name` varchar(30) NOT NULL COMMENT '姓名',
  `birthday` date NOT NULL COMMENT '出生日期',
  `sex` varchar(10) NOT NULL COMMENT '性别',
  `department_id` varchar(30) NOT NULL COMMENT '科室',
  `entry_time` date NOT NULL COMMENT '入职日期'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `orders`
--

CREATE TABLE `orders` (
  `order_sn` varchar(20) NOT NULL COMMENT '医嘱序号',
  `ward_no` varchar(20) NOT NULL COMMENT '病房号',
  `patient_id` varchar(20) NOT NULL COMMENT '病人id',
  `department_id` varchar(20) NOT NULL COMMENT '科室id',
  `bed_no` varchar(20) NOT NULL COMMENT '床号',
  `order_code` varchar(20) NOT NULL COMMENT '医嘱编码',
  `pack_sn` varchar(50) NOT NULL COMMENT '包装序号',
  `frequ_code` varchar(20) NOT NULL COMMENT '执行频率',
  `supply_code` varchar(100) NOT NULL COMMENT '给药方式',
  `drug_specification` varchar(50) NOT NULL COMMENT '医嘱规格',
  `dosage` double NOT NULL COMMENT '每次剂量',
  `dosage_unit` varchar(20) NOT NULL COMMENT '剂量单位',
  `persist_days` int(11) NOT NULL COMMENT '天数',
  `start_time` date NOT NULL COMMENT '医嘱开始时间',
  `end_time` date NOT NULL COMMENT '医嘱停止时间',
  `start_doctor_id` varchar(20) NOT NULL COMMENT '开医嘱医生id',
  `end_doctor_id` varchar(20) NOT NULL COMMENT '停止医嘱医生id'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `patient`
--

CREATE TABLE `patient` (
  `patient_id` varchar(20) NOT NULL COMMENT '病人id',
  `name` varchar(30) NOT NULL COMMENT '姓名',
  `birthday` date NOT NULL COMMENT '出生日期',
  `sex` varchar(10) NOT NULL COMMENT '性别',
  `social_code` varchar(30) NOT NULL COMMENT '身份证号',
  `response_type` varchar(20) NOT NULL COMMENT '身份类型',
  `setup_date` date NOT NULL COMMENT '建档日期'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `report`
--

CREATE TABLE `report` (
  `report_id` varchar(20) NOT NULL COMMENT '检验表id',
  `item_id` varchar(20) NOT NULL COMMENT '检验项目编码',
  `name` varchar(30) NOT NULL COMMENT '检验项目名称',
  `price` double NOT NULL COMMENT '价格',
  `order_sn` varchar(20) NOT NULL COMMENT '医嘱号',
  `charge_status` varchar(50) NOT NULL COMMENT '收费情况',
  `patient_id` varchar(20) NOT NULL COMMENT '病人'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `reportresult`
--

CREATE TABLE `reportresult` (
  `report_id` varchar(20) NOT NULL COMMENT '检验表id',
  `item_id` varchar(20) NOT NULL COMMENT '检验项目编码',
  `reference_id` varchar(20) NOT NULL COMMENT '检验指标编码',
  `patient_id` varchar(20) NOT NULL COMMENT '病人',
  `name` varchar(30) NOT NULL COMMENT '检验指标名称',
  `result` varchar(500) NOT NULL COMMENT '检验结果',
  `remark` varchar(200) NOT NULL COMMENT '备注'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `signs`
--

CREATE TABLE `signs` (
  `signs_no` varchar(20) NOT NULL COMMENT '体征表号',
  `patient_id` varchar(20) NOT NULL COMMENT '病人',
  `temperature` double NOT NULL COMMENT '体温',
  `breathe` double NOT NULL COMMENT '呼吸量',
  `blood_pressureL` double NOT NULL COMMENT '血压低',
  `blood_pressureH` double NOT NULL COMMENT '血压高',
  `pulse` int(11) NOT NULL COMMENT '脉搏',
  `height` double NOT NULL COMMENT '身高',
  `weight` double NOT NULL COMMENT '体重',
  `in_out` double NOT NULL COMMENT '出入量'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `ward`
--

CREATE TABLE `ward` (
  `ward_no` varchar(20) NOT NULL COMMENT '病房号',
  `department_id` varchar(20) NOT NULL COMMENT '科室编号',
  `bed_no` varchar(20) NOT NULL COMMENT '床号',
  `patient_id` varchar(20) NOT NULL COMMENT '病人',
  `doctors_id` varchar(20) NOT NULL COMMENT '负责医生',
  `nurse_id` varchar(20) NOT NULL COMMENT '负责护士',
  `type` varchar(10) NOT NULL COMMENT '床位类型',
  `comment` varchar(100) NOT NULL COMMENT '备注',
  `lend_flag` varchar(10) NOT NULL COMMENT '加床标识'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `work`
--

CREATE TABLE `work` (
  `work_id` varchar(20) NOT NULL COMMENT '工作id',
  `patient_id` varchar(20) NOT NULL COMMENT '病人',
  `department_id` varchar(20) NOT NULL COMMENT '科室',
  `ward_no` varchar(20) NOT NULL COMMENT '病房',
  `bed_no` varchar(20) NOT NULL COMMENT '床号',
  `order_sn` varchar(20) NOT NULL COMMENT '医嘱号',
  `infusion_id` varchar(20) NOT NULL COMMENT '输液号',
  `care_id` varchar(20) NOT NULL COMMENT '护理号',
  `signs_no` varchar(20) NOT NULL COMMENT '体征表号',
  `check_order` varchar(10) NOT NULL COMMENT '执行医嘱',
  `check_infusion` varchar(10) NOT NULL COMMENT '执行输液',
  `check_care` varchar(10) NOT NULL COMMENT '执行护理',
  `check_signs` varchar(10) NOT NULL COMMENT '执行体征 ',
  `time` date NOT NULL COMMENT '执行时间'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `calls`
--
ALTER TABLE `calls`
  ADD PRIMARY KEY (`call_id`);

--
-- Indexes for table `care`
--
ALTER TABLE `care`
  ADD PRIMARY KEY (`care_id`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`department_id`);

--
-- Indexes for table `docter`
--
ALTER TABLE `docter`
  ADD PRIMARY KEY (`doctor_id`);

--
-- Indexes for table `infusion`
--
ALTER TABLE `infusion`
  ADD PRIMARY KEY (`infusion_id`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`nurse_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_sn`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patient_id`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`report_id`,`item_id`);

--
-- Indexes for table `reportresult`
--
ALTER TABLE `reportresult`
  ADD PRIMARY KEY (`report_id`,`item_id`,`reference_id`);

--
-- Indexes for table `signs`
--
ALTER TABLE `signs`
  ADD PRIMARY KEY (`signs_no`,`patient_id`);

--
-- Indexes for table `ward`
--
ALTER TABLE `ward`
  ADD PRIMARY KEY (`ward_no`,`department_id`,`bed_no`,`patient_id`);

--
-- Indexes for table `work`
--
ALTER TABLE `work`
  ADD PRIMARY KEY (`work_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
