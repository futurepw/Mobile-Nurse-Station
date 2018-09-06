/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50710
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50710
 File Encoding         : 65001

 Date: 21/06/2018 15:37:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for calls
-- ----------------------------
DROP TABLE IF EXISTS `calls`;
CREATE TABLE `calls`  (
  `call_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '呼叫id',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病人id',
  `type` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`call_id`) USING BTREE,
  INDEX `patient_id`(`patient_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of calls
-- ----------------------------
INSERT INTO `calls` VALUES ('HJ20180621145133abc', 'P1001', '', NULL);
INSERT INTO `calls` VALUES ('HJ20180621155233abc', 'P1002', '', NULL);
INSERT INTO `calls` VALUES ('HJ20180621165233cbc', 'P1003', '', NULL);
INSERT INTO `calls` VALUES ('HJ20180621175133abd', 'P1004', '', NULL);
INSERT INTO `calls` VALUES ('HJ20180621185233abc', 'P1005', '', NULL);
INSERT INTO `calls` VALUES ('HJ20180621195131abc', 'P1006', '', NULL);
INSERT INTO `calls` VALUES ('HJ20180621205333abc', 'P1007', '', NULL);
INSERT INTO `calls` VALUES ('HJ20180621215133agc', 'P1008', '', NULL);
INSERT INTO `calls` VALUES ('HJ20180621225133xbc', 'P1009', '', NULL);
INSERT INTO `calls` VALUES ('HJ20180621235133azc', 'P1010', '', NULL);

-- ----------------------------
-- Table structure for care
-- ----------------------------
DROP TABLE IF EXISTS `care`;
CREATE TABLE `care`  (
  `care_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '护理id',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病人id',
  `time` date NULL DEFAULT NULL COMMENT '护理时间',
  `way` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '方式',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`care_id`) USING BTREE,
  INDEX `patient_id`(`patient_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of care
-- ----------------------------
INSERT INTO `care` VALUES ('HL20180621145133abc', 'P1001', '0009-00-00', '按摩', '');
INSERT INTO `care` VALUES ('HL20180621155233abc', 'P1002', '0009-00-00', '按摩', '');
INSERT INTO `care` VALUES ('HL20180621165233cbc', 'P1003', '0009-00-00', '按摩', '');
INSERT INTO `care` VALUES ('HL20180621175133abd', 'P1004', '0009-00-00', '按摩', '');
INSERT INTO `care` VALUES ('HL20180621185233abc', 'P1005', '0009-00-00', '按摩', '');
INSERT INTO `care` VALUES ('HL20180621195131abc', 'P1006', '0009-00-00', '按摩', '');
INSERT INTO `care` VALUES ('HL20180621205333abc', 'P1007', '0009-00-00', '按摩', '');
INSERT INTO `care` VALUES ('HL20180621215133agc', 'P1008', '0009-00-00', '按摩', '');
INSERT INTO `care` VALUES ('HL20180621225133xbc', 'P1009', '0009-00-00', '按摩', '');
INSERT INTO `care` VALUES ('HL20180621235133azc', 'P1010', '0009-00-00', '按摩', '');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `department_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '科室编号',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科室名字',
  `nurse` int(11) NULL DEFAULT NULL COMMENT '护士数量',
  `doctor` int(11) NULL DEFAULT NULL COMMENT '医生数量',
  PRIMARY KEY (`department_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('K1001', '外科', 100, 100);
INSERT INTO `department` VALUES ('K1002', '内科', 100, 100);
INSERT INTO `department` VALUES ('K1003', '儿科', 100, 100);
INSERT INTO `department` VALUES ('K1004', '妇科', 100, 100);

-- ----------------------------
-- Table structure for docter
-- ----------------------------
DROP TABLE IF EXISTS `docter`;
CREATE TABLE `docter`  (
  `doctor_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '医生id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `birthday` date NULL DEFAULT NULL COMMENT '出生日期',
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `department_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科室',
  `entry_time` date NULL DEFAULT NULL COMMENT '入职日期',
  PRIMARY KEY (`doctor_id`) USING BTREE,
  INDEX `department_id`(`department_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of docter
-- ----------------------------
INSERT INTO `docter` VALUES ('D1001', '米培燕', '1997-10-11', '女', '内科', '2018-06-01');
INSERT INTO `docter` VALUES ('D1002', '连保健', '1997-10-12', '男', '外科', '2018-06-02');
INSERT INTO `docter` VALUES ('D1003', '齐旺梅', '1997-10-13', '男', '内科', '2018-06-03');
INSERT INTO `docter` VALUES ('D1004', '连伟杰', '1997-10-14', '男', '外科', '2018-06-04');
INSERT INTO `docter` VALUES ('D1005', '齐明明', '1997-10-15', '男', '外科', '2018-06-05');

-- ----------------------------
-- Table structure for infusion
-- ----------------------------
DROP TABLE IF EXISTS `infusion`;
CREATE TABLE `infusion`  (
  `infusion_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '输液 id',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病人',
  `time` date NULL DEFAULT NULL COMMENT '输液时间',
  `formula` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配方',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`infusion_id`) USING BTREE,
  INDEX `patient_id`(`patient_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of infusion
-- ----------------------------
INSERT INTO `infusion` VALUES ('SY20180621225133xbc', 'P1009', '0009-00-00', '10％GS250ml VC 2.0 VB6 0.2 10％kcl5ml 静脉滴注 一日一次', NULL);
INSERT INTO `infusion` VALUES ('SY20180621215133agc', 'P1008', '0009-00-00', '10％GS250ml VC2.0 VB60.2 10％kcl(氯化钾)5ml静脉滴注 一日一次', NULL);
INSERT INTO `infusion` VALUES ('SY20180621205333abc', 'P1007', '0009-00-00', '10％GS250ml VC2.0 VB60.2 10％kcl5ml静脉滴注 一日一次', NULL);
INSERT INTO `infusion` VALUES ('SY20180621185233abc', 'P1005', '0009-00-00', '0.9%NS250ml 血塞通300mg 5%GS500ml 川芎秦 3支静点 1/日', NULL);
INSERT INTO `infusion` VALUES ('SY20180621195131abc', 'P1006', '0009-00-00', '0.9%NS250ml 川芎秦200mg 5%GS250ml 脉络宁20ml 静点 1/日', NULL);
INSERT INTO `infusion` VALUES ('SY20180621175133abd', 'P1004', '0009-00-00', '0.9%NS250ml 维脑路通0.6 胞二磷胆碱0.5 0.9%NS250ml 复方丹参16ml 血塞通300mg 0.9%NS250m 脑蛋白水解物20mg 静点 1/日 　', NULL);
INSERT INTO `infusion` VALUES ('SY20180621165233cbc', 'P1003', '0009-00-00', '5%GS350ml 复方丹参14ml 维脑路通0.6 胞二磷胆碱0.5 5%GS250ml 血塞 通300mg 静点 1/日', NULL);
INSERT INTO `infusion` VALUES ('SY20180621155233abc', 'P1002', '0009-00-00', '5%GS500ml 脉络宁20ml 复方丹参12ml 5%GS250ml 维脑路通0.6 胞二磷胆碱0.5 静点 1/日', NULL);
INSERT INTO `infusion` VALUES ('SY20180621145133abc', 'P1001', '0009-00-00', '0.9%NS250ml ATP 40ml CO-A 100u 胞二磷胆碱0.5 5%GS250ml 脉络宁20ml 静点 1/日', NULL);
INSERT INTO `infusion` VALUES ('SY20180621235133azc', 'P1010', '0009-00-00', '10%氯化钾5ml静滴 日一次 2、5%葡萄糖水250ml 10%氯化钾5ml 25%硫酸镁5ml RI 4U 静滴 日一次', NULL);

-- ----------------------------
-- Table structure for nurse
-- ----------------------------
DROP TABLE IF EXISTS `nurse`;
CREATE TABLE `nurse`  (
  `nurse_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '护士id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `birthday` date NULL DEFAULT NULL COMMENT '出生日期',
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `department_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科室',
  `entry_time` date NULL DEFAULT NULL COMMENT '入职日期',
  PRIMARY KEY (`nurse_id`) USING BTREE,
  INDEX `department_id`(`department_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nurse
-- ----------------------------
INSERT INTO `nurse` VALUES ('N1001', '樊振玲', '1997-10-11', '女', '内科', '2018-06-01');
INSERT INTO `nurse` VALUES ('N1002', '龚岩琳', '1997-10-12', '女', '外科', '2018-06-02');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `order_sn` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '医嘱序号',
  `ward_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病房号',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病人id',
  `department_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科室id',
  `bed_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '床号',
  `order_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医嘱编码',
  `pack_sn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包装序号',
  `frequ_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执行频率',
  `supply_code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '给药方式',
  `drug_specification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医嘱规格',
  `dosage` double(10, 3) NULL DEFAULT NULL COMMENT '每次剂量',
  `dosage_unit` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '剂量单位',
  `persist_days` int(11) NULL DEFAULT NULL COMMENT '天数',
  `start_time` date NULL DEFAULT NULL COMMENT '医嘱开始时间',
  `end_time` date NULL DEFAULT NULL COMMENT '医嘱停止时间',
  `start_doctor_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开医嘱医生id',
  `end_doctor_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '停止医嘱医生id',
  PRIMARY KEY (`order_sn`) USING BTREE,
  INDEX `patient_id`(`patient_id`) USING BTREE,
  INDEX `department_id`(`department_id`) USING BTREE,
  INDEX `bed_no`(`bed_no`) USING BTREE,
  INDEX `ward_no`(`ward_no`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('YZ20180621145133abc', 'NK1001', 'P1001', 'K1002', '1', '001', '001', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-21', '2018-07-21', 'D1001', 'D1001');
INSERT INTO `orders` VALUES ('YZ20180621155233abc', 'NK1002', 'P1002', 'K1003', '2', '002', '002', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-22', '2018-07-22', 'D1003', 'D1003');
INSERT INTO `orders` VALUES ('YZ20180621165233cbc', 'NK1003', 'P1003', 'K1004', '3', '003', '003', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-23', '2018-07-23', 'D1001', 'D1001');
INSERT INTO `orders` VALUES ('YZ20180621175133abd', 'NK1004', 'P1004', 'K1005', '4', '004', '004', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-24', '2018-07-24', 'D1003', 'D1003');
INSERT INTO `orders` VALUES ('YZ20180621185233abc', 'NK1005', 'P1005', 'K1006', '5', '005', '005', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-25', '2018-07-25', 'D1003', 'D1003');
INSERT INTO `orders` VALUES ('YZ20180621195131abc', 'WK1001', 'P1006', 'K1001', '1', '006', '006', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-26', '2018-07-26', 'D1004', 'D1004');
INSERT INTO `orders` VALUES ('YZ20180621205333abc', 'WK1002', 'P1007', 'K1002', '2', '007', '007', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-27', '2018-07-27', 'D1005', 'D1005');
INSERT INTO `orders` VALUES ('YZ20180621215133agc', 'WK1003', 'P1008', 'K1003', '3', '008', '008', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-28', '2018-07-28', 'D1002', 'D1002');
INSERT INTO `orders` VALUES ('YZ20180621225133xbc', 'WK1004', 'P1009', 'K1004', '4', '009', '009', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-29', '2018-07-29', 'D1005', 'D1005');
INSERT INTO `orders` VALUES ('YZ20180621235133azc', 'WK1005', 'P1010', 'K1005', '5', '010', '010', '每天三次', '自取', '', 3.000, '克', 30, '2018-06-30', '2018-07-30', 'D1002', 'D1002');

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient`  (
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '病人id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `birthday` date NULL DEFAULT NULL COMMENT '出生日期',
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `social_code` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `response_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份类型',
  `setup_date` date NULL DEFAULT NULL COMMENT '建档日期',
  PRIMARY KEY (`patient_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('P1001', '龚小虹', '1997-10-11', '女', '420026199708285000', '身份证', '2018-06-21');
INSERT INTO `patient` VALUES ('P1002', '黄益洪', '1997-10-12', '男', '420026199706285000', '身份证', '2018-06-21');
INSERT INTO `patient` VALUES ('P1003', '龙家锐', '1997-10-13', '男', '420026199708685000', '身份证', '2018-06-21');
INSERT INTO `patient` VALUES ('P1004', '龚尧莞', '1997-10-14', '女', '420026199708785000', '身份证', '2018-06-21');
INSERT INTO `patient` VALUES ('P1005', '齐新燕', '1997-10-15', '女', '420026199707285000', '身份证', '2018-06-21');
INSERT INTO `patient` VALUES ('P1006', '车少飞', '1997-10-16', '男', '420026199708288000', '身份证', '2018-06-21');
INSERT INTO `patient` VALUES ('P1007', '龙家铸', '1997-10-17', '男', '420026199708285800', '身份证', '2018-06-21');
INSERT INTO `patient` VALUES ('P1008', '赖鸿华', '1997-10-18', '男', '420026199708285080', '身份证', '2018-06-21');
INSERT INTO `patient` VALUES ('P1009', '龙宣霖', '1997-10-19', '男', '420026199708285080', '身份证', '2018-06-21');
INSERT INTO `patient` VALUES ('P1010', '连丽英', '1997-10-20', '女', '420026199708285080', '身份证', '2018-06-21');

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report`  (
  `report_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '检验表id',
  `item_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '检验项目编码',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '检验项目名称',
  `price` double(20, 3) NULL DEFAULT NULL COMMENT '价格',
  `charge_status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收费情况',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病人',
  PRIMARY KEY (`report_id`, `item_id`) USING BTREE,
  INDEX `patient_id`(`patient_id`) USING BTREE,
  INDEX `report_id`(`report_id`) USING BTREE,
  INDEX `item_id`(`item_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of report
-- ----------------------------
INSERT INTO `report` VALUES ('JY20180621145133abc', '001', '血常规', 20.000, '已收费', 'P1001');
INSERT INTO `report` VALUES ('JY20180621155233abc', '002', '尿常规', 20.000, '已收费', 'P1002');
INSERT INTO `report` VALUES ('JY20180621165233cbc', '003', '便常规', 20.000, '已收费', 'P1003');
INSERT INTO `report` VALUES ('JY20180621175133abd', '004', '血涂片', 30.000, '已收费', 'P1004');
INSERT INTO `report` VALUES ('JY20180621185233abc', '005', '血气分析', 20.000, '已收费', 'P1005');
INSERT INTO `report` VALUES ('JY20180621195131abc', '006', '甲肝', 50.000, '已收费', 'P1006');
INSERT INTO `report` VALUES ('JY20180621205333abc', '007', 'HIV', 100.000, '已收费', 'P1007');
INSERT INTO `report` VALUES ('JY20180621215133agc', '008', '血型检查', 10.000, '已收费', 'P1008');
INSERT INTO `report` VALUES ('JY20180621225133xbc', '009', '配血', 60.000, '已收费', 'P1009');
INSERT INTO `report` VALUES ('JY20180621235133azc', '010', '淀粉酶', 10.000, '已收费', 'P1010');

-- ----------------------------
-- Table structure for reportresult
-- ----------------------------
DROP TABLE IF EXISTS `reportresult`;
CREATE TABLE `reportresult`  (
  `report_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '检验表id',
  `item_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '检验项目编码',
  `reference_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '检验指标编码',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病人',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '检验指标名称',
  `result` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '检验结果',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`report_id`, `item_id`, `reference_id`) USING BTREE,
  INDEX `item_id`(`item_id`) USING BTREE,
  INDEX `patient_id`(`patient_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reportresult
-- ----------------------------
INSERT INTO `reportresult` VALUES ('JY20180621145133abc', '001', '001', 'P1001', '血常规', '正常', NULL);
INSERT INTO `reportresult` VALUES ('JY20180621155233abc', '002', '002', 'P1002', '尿常规', '正常', NULL);
INSERT INTO `reportresult` VALUES ('JY20180621165233cbc', '003', '003', 'P1003', '便常规', '正常', NULL);
INSERT INTO `reportresult` VALUES ('JY20180621175133abd', '004', '004', 'P1004', '血涂片', '正常', NULL);
INSERT INTO `reportresult` VALUES ('JY20180621185233abc', '005', '005', 'P1005', '血气分析', '正常', NULL);
INSERT INTO `reportresult` VALUES ('JY20180621195131abc', '006', '006', 'P1006', '甲肝', '正常', NULL);
INSERT INTO `reportresult` VALUES ('JY20180621205333abc', '007', '007', 'P1007', 'HIV', '正常', NULL);
INSERT INTO `reportresult` VALUES ('JY20180621215133agc', '008', '008', 'P1008', '血型检查', '正常', NULL);
INSERT INTO `reportresult` VALUES ('JY20180621225133xbc', '009', '009', 'P1009', '配血', '正常', NULL);
INSERT INTO `reportresult` VALUES ('JY20180621235133azc', '010', '010', 'P1010', '淀粉酶', '正常', NULL);

-- ----------------------------
-- Table structure for signs
-- ----------------------------
DROP TABLE IF EXISTS `signs`;
CREATE TABLE `signs`  (
  `signs_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '体征表号',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '病人',
  `temperature` double(10, 3) NULL DEFAULT NULL COMMENT '体温',
  `breathe` double(10, 3) NULL DEFAULT NULL COMMENT '呼吸量',
  `blood_pressureL` double(10, 3) NULL DEFAULT NULL COMMENT '血压低',
  `blood_pressureH` double(10, 3) NULL DEFAULT NULL COMMENT '血压高',
  `pulse` int(11) NULL DEFAULT NULL COMMENT '脉搏',
  `height` double(10, 3) NULL DEFAULT NULL COMMENT '身高',
  `weight` double(10, 3) NULL DEFAULT NULL COMMENT '体重',
  `in_out` double(10, 3) NULL DEFAULT NULL COMMENT '出入量',
  PRIMARY KEY (`signs_no`, `patient_id`) USING BTREE,
  INDEX `signs_no`(`signs_no`) USING BTREE,
  INDEX `patient_id`(`patient_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of signs
-- ----------------------------
INSERT INTO `signs` VALUES ('TZ20180621145133abc', 'P1001', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);
INSERT INTO `signs` VALUES ('TZ20180621155233abc', 'P1002', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);
INSERT INTO `signs` VALUES ('TZ20180621165233cbc', 'P1003', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);
INSERT INTO `signs` VALUES ('TZ20180621175133abd', 'P1004', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);
INSERT INTO `signs` VALUES ('TZ20180621185233abc', 'P1005', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);
INSERT INTO `signs` VALUES ('TZ20180621195131abc', 'P1006', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);
INSERT INTO `signs` VALUES ('TZ20180621205333abc', 'P1007', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);
INSERT INTO `signs` VALUES ('TZ20180621215133agc', 'P1008', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);
INSERT INTO `signs` VALUES ('TZ20180621225133xbc', 'P1009', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);
INSERT INTO `signs` VALUES ('TZ20180621235133azc', 'P1010', 36.500, 2000.000, 70.000, 110.000, 70, 1.650, 62.300, NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户类型 1护士 2医生 3管理员',
  `login` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录',
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('N1001', '1234', '1', '');
INSERT INTO `user` VALUES ('N1002', '1234', '1', '');

-- ----------------------------
-- Table structure for ward
-- ----------------------------
DROP TABLE IF EXISTS `ward`;
CREATE TABLE `ward`  (
  `ward_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '病房号',
  `department_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '科室编号',
  `bed_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '床号',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '病人',
  `doctors_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责医生',
  `nurse_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责护士',
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '床位类型',
  `comment` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `lend_flag` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '加床标识',
  PRIMARY KEY (`ward_no`, `department_id`, `bed_no`, `patient_id`) USING BTREE,
  INDEX `ward_no`(`ward_no`) USING BTREE,
  INDEX `bed_no`(`bed_no`) USING BTREE,
  INDEX `department_id`(`department_id`) USING BTREE,
  INDEX `patient_id`(`patient_id`) USING BTREE,
  INDEX `doctors_id`(`doctors_id`) USING BTREE,
  INDEX `nurse_id`(`nurse_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ward
-- ----------------------------
INSERT INTO `ward` VALUES ('NK1001', 'K1002', '1', 'P1001', 'D1001', 'N1001', '普通', NULL, NULL);
INSERT INTO `ward` VALUES ('NK1002', 'K1003', '2', 'P1002', 'D1003', 'N1001', '普通', NULL, NULL);
INSERT INTO `ward` VALUES ('NK1003', 'K1004', '3', 'P1003', 'D1001', 'N1001', '普通', NULL, NULL);
INSERT INTO `ward` VALUES ('NK1004', 'K1005', '4', 'P1004', 'D1003', 'N1001', '普通', NULL, NULL);
INSERT INTO `ward` VALUES ('NK1005', 'K1006', '5', 'P1005', 'D1003', 'N1001', '普通', NULL, NULL);
INSERT INTO `ward` VALUES ('WK1001', 'K1001', '1', 'P1006', 'D1004', 'N1002', '普通', NULL, NULL);
INSERT INTO `ward` VALUES ('WK1002', 'K1002', '2', 'P1007', 'D1005', 'N1002', '普通', NULL, NULL);
INSERT INTO `ward` VALUES ('WK1003', 'K1003', '3', 'P1008', 'D1002', 'N1002', '普通', NULL, NULL);
INSERT INTO `ward` VALUES ('WK1004', 'K1004', '4', 'P1009', 'D1005', 'N1002', '普通', NULL, NULL);
INSERT INTO `ward` VALUES ('WK1005', 'K1005', '5', 'P1010', 'D1002', 'N1002', '普通', NULL, NULL);

-- ----------------------------
-- Table structure for work
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work`  (
  `work_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工作id',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病人',
  `department_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科室',
  `ward_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病房',
  `bed_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '床号',
  `order_sn` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医嘱号',
  `infusion_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '输液号',
  `care_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '护理号',
  `check_order` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执行医嘱',
  `check_infusion` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执行输液',
  `check_care` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执行护理',
  `check_signs` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执行体征 ',
  `time` date NULL DEFAULT NULL COMMENT '执行时间',
  PRIMARY KEY (`work_id`) USING BTREE,
  INDEX `patient_id`(`patient_id`) USING BTREE,
  INDEX `department_id`(`department_id`) USING BTREE,
  INDEX `ward_no`(`ward_no`) USING BTREE,
  INDEX `bed_no`(`bed_no`) USING BTREE,
  INDEX `order_sn`(`order_sn`) USING BTREE,
  INDEX `infusion_id`(`infusion_id`) USING BTREE,
  INDEX `care_id`(`care_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of work
-- ----------------------------
INSERT INTO `work` VALUES ('GZ20180621145133abc', 'P1001', 'K1002', 'NK1001', '1', 'YZ20180621145133abc', 'SY20180621145133abc', 'HL20180621145133abc', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `work` VALUES ('GZ20180621155233abc', 'P1002', 'K1003', 'NK1002', '2', 'YZ20180621155233abc', 'SY20180621155233abc', 'HL20180621155233abc', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `work` VALUES ('GZ20180621165233cbc', 'P1003', 'K1004', 'NK1003', '3', 'YZ20180621165233cbc', 'SY20180621165233cbc', 'HL20180621165233cbc', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `work` VALUES ('GZ20180621175133abd', 'P1004', 'K1005', 'NK1004', '4', 'YZ20180621175133abd', 'SY20180621175133abd', 'HL20180621175133abd', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `work` VALUES ('GZ20180621185233abc', 'P1005', 'K1006', 'NK1005', '5', 'YZ20180621185233abc', 'SY20180621185233abc', 'HL20180621185233abc', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `work` VALUES ('GZ20180621195131abc', 'P1006', 'K1001', 'WK1001', '1', 'YZ20180621195131abc', 'SY20180621195131abc', 'HL20180621195131abc', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `work` VALUES ('GZ20180621205333abc', 'P1007', 'K1002', 'WK1002', '2', 'YZ20180621205333abc', 'SY20180621205333abc', 'HL20180621205333abc', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `work` VALUES ('GZ20180621215133agc', 'P1008', 'K1003', 'WK1003', '3', 'YZ20180621215133agc', 'SY20180621215133agc', 'HL20180621215133agc', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `work` VALUES ('GZ20180621225133xbc', 'P1009', 'K1004', 'WK1004', '4', 'YZ20180621225133xbc', 'SY20180621225133xbc', 'HL20180621225133xbc', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `work` VALUES ('GZ20180621235133azc', 'P1010', 'K1005', 'WK1005', '5', 'YZ20180621235133azc', 'SY20180621235133azc', 'HL20180621235133azc', NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
