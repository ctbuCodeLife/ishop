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
) ENGINE = INNODB auto_increment = 1 DEFAULT charset = utf8 comment '角色表';


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
	`created` DATETIME DEFAULT NULL COMMENT '管理员创建时间',
	`updated` DATETIME DEFAULT NULL COMMENT '管理员更新时间',
	PRIMARY KEY (`id`),
	KEY `role_id` (`role_id`),
	CONSTRAINT `fk_role_admin` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
	UNIQUE KEY `admin_name_unique`(`name`)
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 comment '管理员表';

DROP TABLE
IF EXISTS `user`;

CREATE TABLE `user` (
	`id`  INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户表id,自增',
	`name` VARCHAR (50) DEFAULT NULL COMMENT '用户登录名',
	`password` VARCHAR (32) DEFAULT NULL COMMENT '用户密码',
	`real_name` VARCHAR (50) DEFAULT NULL COMMENT '用户真实名字',
	`email` VARCHAR (50) DEFAULT NULL COMMENT '用户邮箱',
	`phone` VARCHAR (11) DEFAULT NULL COMMENT '用户电话',
	`created` DATETIME DEFAULT NULL COMMENT '创建时间',
	`updated` DATETIME DEFAULT NULL COMMENT '更新时间',
	PRIMARY KEY (`id`),
	UNIQUE KEY `user_phone_unique`(`phone`),
    unique key `user_name_unique`(`name`)
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 comment '用户表';

DROP TABLE
IF EXISTS `type`;

CREATE TABLE `type` (
	`id`  INT unsigned NOT NULL auto_increment COMMENT '类别id,自增',
	`parent_id` INT unsigned  DEFAULT NULL COMMENT '父类别id',
	`name` VARCHAR (50) DEFAULT NULL COMMENT '类别名称',
	`describe` VARCHAR (255) DEFAULT NULL COMMENT '类别描述',
	`grade` TINYINT UNSIGNED  DEFAULT 1 comment '类别等级,为1时表示一级类别',
    `created` datetime default null comment '创建时间',
    `updated` datetime default null comment '更新时间',
  primary key(`id`),
  unique key  `type_name_unique`(`name`)
)ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 comment '类别表';

drop table if exists `product`;
create table `product`(
    `id` int unsigned not null auto_increment comment '商品id,自增',
    `type_id` int unsigned default null comment '类别id',
    `name` varchar(127) default null comment '商品名',
    `sub_title` varchar(255) default null comment '商品子标题',
    `image_src` varchar(255) default null comment '商品缩略图连接地址',
    `invent_number` int unsigned default 0 comment '库存数量',
	`month_sell_number` int unsigned default 0 comment '月销量',
    `order_link` varchar(200) default null comment '定购链接',
    `real_price` decimal(10,2) default 0.00 comment '商品原价',
    `sell_price` decimal(10,2) default 0.00 comment '商品实际价格',
    `is_recommend` int(1) default 0 comment '是否推荐到首页,0表示不推荐,1表示推荐,默认为0',
    `created` datetime default null comment '创建时间',
    `updated` datetime default null comment '更新时间',
    primary key(`id`),
    key `type_id` (`type_id`),
    CONSTRAINT `fk_type_id` FOREIGN KEY (`type_id`) REFERENCES `type` (`id`)
)ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 comment '商品表';
drop table if exists `property`;
create table `property`(
    `id` int unsigned not null auto_increment comment '商品参数id,主键自增',
    `type_id` int unsigned default null comment '类型id,来自类别表',
    `name` varchar(64) default null comment '商品参数名',
    `created` datetime default null comment '创建时间',
    `updated` datetime default null comment '更新时间',
    primary key(`id`),
    key(`type_id`),
    constraint `fk_porperty_type` foreign key(`type_id`) references `type`(`id`)
)ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 comment '商品参数名表';
drop table if exists `property_value`;
create table `property_value`(
    `id` int unsigned not null auto_increment comment '商品参数id,主键自增',
    `product_id` int unsigned default null comment '商品id,来自商品表',
    `value` varchar(64) default null comment '商品参数值',
    `created` datetime default null comment '创建时间',
    `updated` datetime default null comment '更新时间',
    primary key(`id`),
    key(`product_id`),
    constraint `fk_porperty_value_product` foreign key(`product_id`) references `product`(`id`)
)ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 comment '商品参数值表';
drop table if exists `order`;
create table `order`(
    `id` int(12)  unsigned not null auto_increment comment '订单id,主键自增',
    `user_id` int unsigned default null comment '用户id,外键',
    `admin_id` int unsigned default null comment '管理员id,外键',
    `product_price` decimal(10,2) default 0.0 comment '总价格',
    `traffic_price` decimal(10,2) default 0.0 comment '运费',
    `total_price` decimal(10.2) default 0.0 comment '总价',
    `status` varchar(16) comment '订单状态:未支付,已支付,待发货,已取消,已发货,已收货,未评论,已评论',
    `created` datetime default null comment '创建时间',
    `updated` datetime default null comment '更新时间',
    primary key(`id`),
    key(`user_id`,`admin_id`),
    constraint `fk_order_user` foreign key (`user_id`) references `user` (`id`),
    constraint `fk_order_admin` foreign key (`admin_id`) references `admin`(`id`)
)ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 comment '订单表';

drop table if exists `logist`;

create table `logist`(
    `id` int(12) unsigned not null auto_increment comment '物流id,主键自增',
    `order_id` int(12) unsigned default null comment '订单id,外键',
    `logist_name` varchar(50) default null comment '快递员姓名',
    `logist_phone` varchar(20) default null comment '快递员电话',
    `logist_content` text default null comment '物流信息,json格式',
    `created` datetime default null comment '创建时间',
    `updated` datetime default null comment '更新时间',
    primary key(`id`),
    key (`order_id`),
    constraint `fk_logist_order` foreign key(`order_id` ) references `order`(`id`)
)ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 comment '物流表'; 

drop table if exists `order_item`;

create table `order_item`(
    `id` int(14) unsigned not null auto_increment comment '订单项id,主键自增',
    `order_id` int(12) unsigned default null comment '订单id,来自订单表',
    `product_id` int unsigned default null comment '商品id,来自商品表',
    `product_num` int unsigned default 1 comment '商品数量',
    `total` decimal(10,2) default 0.0 comment '商品实际上总价',
    `remark` varchar(255) default null comment '备注',
    primary key (`id`),
    key(`order_id`,`product_id`),
    constraint `fk_order_item_order` foreign key (`order_id`) references `order`(`id`),
    constraint `fk_order_item_product` foreign key (`product_id`) references `product`(`id`) 
)engine = innodb auto_increment = 1 default charset = utf8 comment '订单详情表';
drop table if exists `receiver`;
create table `receiver`(
   `id` int(14) unsigned not null auto_increment comment '收货人表id,主键自增',
   `user_id` int unsigned default null comment '用户id,来自用户表',
   `name` varchar(64) default null comment '收货人姓名',
   `phone` varchar(20) default null comment '收货人电话',
   `address` varchar(255) default null comment '收货人详细地址,xx省xx市xx县xx镇+详细地址',
   `email` varchar(50) default null comment '收货人邮箱',
   `zipcode` varchar(10) default null comment '邮编',
   `is_default` int(1) default 1 comment '是否是默认收货地址,默认为1,表示为默认收货地址',
   `created` datetime default null comment '创建时间',
   `updated` datetime default null comment '更新时间',
   primary key(`id`),
   key(`user_id`),
   constraint `fk_receiver_user` foreign key(`user_id`) references `user`(`id`)
)engine = innodb auto_increment = 1 default charset = utf8 comment '收货人信息表';

drop table if exists `product_image`;
create table `product_image`(
   `id` int unsigned not null auto_increment comment '商品图片id,主键自增',
   `product_id` int unsigned default null comment '商品id,来自商品表',
   `image_type` varchar(32) default null comment '图片类别,single:商品缩略图,detail:商品详情图',   
   `image_name` varchar(64) default null comment '图片名',
   `image_link` varchar(255) default null comment '图片链接',
   primary key(`id`),
   key(`product_id`),
   constraint `fk_product_image_product` foreign key(`product_id`) references `product`(`id`)
 ) engine = innodb auto_increment = 1 default charset = utf8 comment '商品图片表';
 
 drop table if exists `leave`;
 create table `leave`(
   `id` int unsigned not null auto_increment comment '留言表id,主键自增',
   `product_id` int unsigned default null comment '商品id,来自商品表',
   `user_id` int unsigned default null comment '用户id,来自用户表',
   `subject` varchar(255) default null comment '留言主题',
   `content` text default null comment '留言内容',
   `ip` varchar(32) default null comment '留言者ip',
   `created` datetime default null comment '创建时间',
   `updated` datetime default null comment '更新时间',
   primary key(`id`),
   key(`product_id`,`user_id`),
   constraint `fk_leave_product` foreign key(`product_id`) references `product`(`id`),
   constraint `fk_leave_user` foreign key(`user_id`) references `user`(`id`)
 )engine = innodb auto_increment = 1 default charset = utf8 comment '留言表';
 
 drop table if exists `releave`;
 create table `releave`(
     `id` int unsigned not null auto_increment comment '回复留言表id,主键自增',
     `admin_id` int unsigned default null comment '管理员id,来自管理员表',
     `leave_id` int unsigned default null comment '留言id,来自留言表',
     `subject` varchar(64) default null comment '回复主题',
     `content` text default null comment '回复内容',
     `ip` varchar(32) default null comment '回复者ip',
     `created` datetime default null comment '创建时间',
   `updated` datetime default null comment '更新时间',
   primary key(`id`),
   key(`admin_id`,`leave_id`),
   constraint `fk_releave_admin` foreign key(`admin_id`) references `admin`(`id`),
   constraint `fk_releave_leave` foreign key(`leave_id`) references `leave`(`id`)
 )engine = innodb auto_increment = 1 default charset = utf8 comment '回复留言表';
 
 drop table if exists `deal`;
 create table `deal`(
    `id` int unsigned not null auto_increment comment ',成交表id,主键自增',
    `user_id` int unsigned default null comment '用户id,来自用户表',
    `product_id` int unsigned default null comment '商品id,来自商品表',
    `deal_time` datetime default null comment '成交时间',
    `is_opinioin` int(1) unsigned default 0 comment '是否好评,0:好评,1:中评,2:差评,默认好评',
     primary key(`id`),
    key(`product_id`,`user_id`),
   constraint `fk_deal_product` foreign key(`product_id`) references `product`(`id`),
   constraint `fk_deal_user` foreign key(`user_id`) references `user`(`id`)
 )engine = innodb auto_increment = 1 default charset = utf8 comment '成交表';
 
 drop table if exists `cart`;
 create table `cart`(
     `id` int unsigned not null auto_increment comment ',购物车表id,主键自增',
      `user_id` int unsigned default null comment '用户id,来自用户表',
      `product_id` int unsigned default null comment '商品id,来自商品表',
      `product_num` int unsigned default 1 comment '商品数量,默认为1',
      `is_buy` int(1) unsigned default 0 comment '0:未购买 1:提交订单后删除,默认未购买',
      `created` datetime default null comment '创建时间',
   `updated` datetime default null comment '更新时间',
   primary key(`id`),
  key(`product_id`,`user_id`),
   constraint `fk_cart_product` foreign key(`product_id`) references `product`(`id`),
   constraint `fk_cart_user` foreign key(`user_id`) references `user`(`id`)
 )engine = innodb auto_increment = 1 default charset = utf8 comment '购物车表';
 
 drop table if exists `collect`;
 create table `collect`(
     `id` int unsigned not null auto_increment comment '收藏夹表id,主键自增',
      `user_id` int unsigned default null comment '用户id,来自用户表',
      `product_id` int unsigned default null comment '商品id,来自商品表',
      `created` datetime default null comment '创建时间',
   `updated` datetime default null comment '更新时间',
   primary key(`id`),
  key(`product_id`,`user_id`),
   constraint `fk_collect_product` foreign key(`product_id`) references `product`(`id`),
   constraint `fk_collect_user` foreign key(`user_id`) references `user`(`id`)
 )engine = innodb auto_increment = 1 default charset = utf8 comment '收藏夹表';
 
 drop table if exists `sell`;
 create table `sell`(
    `id` int unsigned not null auto_increment comment '热销表id,主键自增',
    `product_id` int unsigned default null comment '商品id,来自商品表',
    `sell_num` int unsigned default 0 comment '商品月销量',
     primary key(`id`),
  key(`product_id`),
   constraint `fk_sell_product` foreign key(`product_id`) references `product`(`id`)
 )engine = innodb auto_increment = 1 default charset = utf8 comment '热销表';
