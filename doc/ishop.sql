/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ishop

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-04-12 17:45:59
*/
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;

/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;

/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;

/*!40103 SET SQL_NOTES='ON' */;


SET FOREIGN_KEY_CHECKS = 0;

DROP DATABASE
IF EXISTS `ishop`;

CREATE DATABASE `ishop` DEFAULT
CHARSET utf8;

USE `ishop`;
DROP TABLE
IF EXISTS `role`;

CREATE TABLE `role` (
	`id`  INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '角色表id,自增',
	`name` varchar(64) DEFAULT NULL COMMENT '角色名',
	PRIMARY KEY (`id`)
) ENGINE = INNODB auto_increment = 1 DEFAULT charset = utf8;

DROP TABLE
IF EXISTS `admin`;

CREATE TABLE `admin` (
	`id`  INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '管理员表id,自增',
	`role_id` INT UNSIGNED DEFAULT NULL COMMENT '角色id,外键',
	`name` VARCHAR (50) DEFAULT NULL COMMENT '管理员登录名',
	`password` VARCHAR (32) DEFAULT NULL COMMENT '管理员密码',
	`real_name` VARCHAR (50) DEFAULT NULL COMMENT '管理员真实名字',
	`email` VARCHAR (50) DEFAULT NULL COMMENT '管理员邮箱',
	`phone` VARCHAR (11) DEFAULT NULL COMMENT '管理员电话',
	`created` DATETIME DEFAULT NULL COMMENT '管理员创建日期',
	`updated` DATETIME DEFAULT NULL COMMENT '管理员更新日期',
	PRIMARY KEY (`id`),
	KEY `role_id` (`role_id`),
	CONSTRAINT `fk_user` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
	UNIQUE KEY `phone` (`phone`,`email`,`name`)
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;

DROP TABLE
IF EXISTS `type`;

CREATE TABLE `type` (
	`id`  INT NOT NULL auto_increment COMMENT '类别id,自增',
	`parent_id` INT DEFAULT NULL COMMENT '父类别id',
	`name` VARCHAR (50) DEFAULT NULL COMMENT '类别名称',
	`describe` VARCHAR (255) DEFAULT NULL COMMENT '类别描述',
	`grade` TINYINT UNSIGNED  DEFAULT 1 comment '类别等级,为1时表示一级类别',
  primary key(`id`)
)ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;
