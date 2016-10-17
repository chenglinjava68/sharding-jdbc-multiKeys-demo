/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : multikeys

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2016-10-08 17:15:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_order_0_2016_q0`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0_2016_q0`;
CREATE TABLE `t_order_0_2016_q0` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19999999 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_0_2016_q0
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_0_2016_q1`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0_2016_q1`;
CREATE TABLE `t_order_0_2016_q1` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19999999 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_0_2016_q1
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_0_2016_q2`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0_2016_q2`;
CREATE TABLE `t_order_0_2016_q2` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19999999 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_0_2016_q2
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_0_2016_q3`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0_2016_q3`;
CREATE TABLE `t_order_0_2016_q3` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19999999 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_0_2016_q3
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_1_2016_q0`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1_2016_q0`;
CREATE TABLE `t_order_1_2016_q0` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11667012 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_1_2016_q0
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_1_2016_q1`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1_2016_q1`;
CREATE TABLE `t_order_1_2016_q1` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11667012 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_1_2016_q1
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_1_2016_q2`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1_2016_q2`;
CREATE TABLE `t_order_1_2016_q2` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11667012 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_1_2016_q2
-- ----------------------------
INSERT INTO `t_order_1_2016_q2` VALUES ('1', '10', 'INSERT_TEST_12', '2016-10-08 17:08:38');

-- ----------------------------
-- Table structure for `t_order_1_2016_q3`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1_2016_q3`;
CREATE TABLE `t_order_1_2016_q3` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11667012 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_1_2016_q3
-- ----------------------------

CREATE TABLE `t_user_order_0` (
  `user_id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `remark` varchar(50) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_user_order_1` (
  `user_id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `remark` varchar(50) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT '1990-01-01 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_user_kind_0` (
  `kind_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`kind_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `t_user_kind_1` (
  `kind_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`kind_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_item` (
  `item_id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_vender` (
  `vender_id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `vender_name` varchar(50) NOT NULL,
  PRIMARY KEY (`vender_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
