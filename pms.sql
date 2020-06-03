/*
 Navicat Premium Data Transfer

 Source Server         : phpMysql
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : pms

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 03/06/2020 11:29:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `idd` int(10) NOT NULL,
  `userid` varchar(10000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `imageURL` varchar(5000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `price` int(10) NOT NULL,
  `descc` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `title` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `codec` int(10) NOT NULL DEFAULT 0,
  `guige` int(10) NOT NULL,
  `renshu` int(10) NOT NULL,
  `pmswifi` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `chuangguige` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `hole` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `zhifu` int(10) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, 0, 'oLTa-4g-TCvI43bIlvNaLXRH5uCg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275345&di=3cd1d83368f955a8e0e8f5486c0d313f&imgtype=0&src=http%3A%2F%2Fpic.mt-bbs.com%2Fforum%2F201605%2F31%2F142024btrtt6jnncx0dnh5.jpg', 300, '高级房', '001', 1, 50, 2, '12345678', '1.5', '18', 0);
INSERT INTO `goods` VALUES (2, 0, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275345&di=20b8d5bf37ab08ae7fc3cafbfa6d0e16&imgtype=0&src=http%3A%2F%2Fimages4.c-ctrip.com%2Ftarget%2F2A03060000001ziwxC61F.jpg', 300, '高级房', '002', 0, 50, 2, '12345678', '1.5', '2', 0);
INSERT INTO `goods` VALUES (3, 0, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275345&di=3cd1d83368f955a8e0e8f5486c0d313f&imgtype=0&src=http%3A%2F%2Fpic.mt-bbs.com%2Fforum%2F201605%2F31%2F142024btrtt6jnncx0dnh5.jpg', 300, '高级房', '003', 0, 50, 2, '12345678', '1.5', '0', 0);
INSERT INTO `goods` VALUES (4, 0, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275346&di=01ce707741c3940d60afbecebea012d0&imgtype=0&src=http%3A%2F%2Fwww.ddyjdzx.com%2Fuploads%2Fallimg%2F170710%2F1-1FG009562XR.jpg', 300, '高级房', '004', 0, 50, 2, '12345678', '1.5', '0', 0);
INSERT INTO `goods` VALUES (5, 1, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275347&di=c070a5ed36c61adea0e3b37d227eaf60&imgtype=0&src=http%3A%2F%2Ffile106.mafengwo.net%2Fs7%2FM00%2FA9%2F1F%2FwKgB6lPQvVKAN88CAAXS4nIgcDE71.jpeg%3FimageMogr2%2Fstrip%257CimageMogr2%2Fthumbnail%2F%25211070x804r%2Fgravity%2FCenter%2Fcrop%2F%25211070x804%2Fquality%2F90', 300, '高级房', '005', 0, 50, 2, '12345678', '1.5', '6', 0);
INSERT INTO `goods` VALUES (6, 1, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275347&di=c070a5ed36c61adea0e3b37d227eaf60&imgtype=0&src=http%3A%2F%2Ffile106.mafengwo.net%2Fs7%2FM00%2FA9%2F1F%2FwKgB6lPQvVKAN88CAAXS4nIgcDE71.jpeg%3FimageMogr2%2Fstrip%257CimageMogr2%2Fthumbnail%2F%25211070x804r%2Fgravity%2FCenter%2Fcrop%2F%25211070x804%2Fquality%2F90', 300, '高级房', '006', 0, 50, 2, '12345678', '1.5', '0', 0);
INSERT INTO `goods` VALUES (7, 1, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275347&di=c070a5ed36c61adea0e3b37d227eaf60&imgtype=0&src=http%3A%2F%2Ffile106.mafengwo.net%2Fs7%2FM00%2FA9%2F1F%2FwKgB6lPQvVKAN88CAAXS4nIgcDE71.jpeg%3FimageMogr2%2Fstrip%257CimageMogr2%2Fthumbnail%2F%25211070x804r%2Fgravity%2FCenter%2Fcrop%2F%25211070x804%2Fquality%2F90', 300, '高级房', '007', 0, 50, 2, '12345678', '1.5', '0', 0);
INSERT INTO `goods` VALUES (8, 1, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275347&di=c070a5ed36c61adea0e3b37d227eaf60&imgtype=0&src=http%3A%2F%2Ffile106.mafengwo.net%2Fs7%2FM00%2FA9%2F1F%2FwKgB6lPQvVKAN88CAAXS4nIgcDE71.jpeg%3FimageMogr2%2Fstrip%257CimageMogr2%2Fthumbnail%2F%25211070x804r%2Fgravity%2FCenter%2Fcrop%2F%25211070x804%2Fquality%2F90', 300, '高级房', '008', 0, 50, 2, '12345678', '1.5', '0', 0);
INSERT INTO `goods` VALUES (9, 2, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275347&di=c070a5ed36c61adea0e3b37d227eaf60&imgtype=0&src=http%3A%2F%2Ffile106.mafengwo.net%2Fs7%2FM00%2FA9%2F1F%2FwKgB6lPQvVKAN88CAAXS4nIgcDE71.jpeg%3FimageMogr2%2Fstrip%257CimageMogr2%2Fthumbnail%2F%25211070x804r%2Fgravity%2FCenter%2Fcrop%2F%25211070x804%2Fquality%2F90', 300, '高级房', '009', 0, 50, 2, '12345678', '1.5', '2', 0);
INSERT INTO `goods` VALUES (10, 3, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275347&di=c070a5ed36c61adea0e3b37d227eaf60&imgtype=0&src=http%3A%2F%2Ffile106.mafengwo.net%2Fs7%2FM00%2FA9%2F1F%2FwKgB6lPQvVKAN88CAAXS4nIgcDE71.jpeg%3FimageMogr2%2Fstrip%257CimageMogr2%2Fthumbnail%2F%25211070x804r%2Fgravity%2FCenter%2Fcrop%2F%25211070x804%2Fquality%2F90', 300, '高级房', '010', 0, 50, 2, '12345678', '1.5', '0', 0);
INSERT INTO `goods` VALUES (11, 4, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275347&di=c070a5ed36c61adea0e3b37d227eaf60&imgtype=0&src=http%3A%2F%2Ffile106.mafengwo.net%2Fs7%2FM00%2FA9%2F1F%2FwKgB6lPQvVKAN88CAAXS4nIgcDE71.jpeg%3FimageMogr2%2Fstrip%257CimageMogr2%2Fthumbnail%2F%25211070x804r%2Fgravity%2FCenter%2Fcrop%2F%25211070x804%2Fquality%2F90', 300, '高级房', '011', 0, 50, 2, '12345678', '1.5', '0', 0);
INSERT INTO `goods` VALUES (12, 5, NULL, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590049275347&di=c070a5ed36c61adea0e3b37d227eaf60&imgtype=0&src=http%3A%2F%2Ffile106.mafengwo.net%2Fs7%2FM00%2FA9%2F1F%2FwKgB6lPQvVKAN88CAAXS4nIgcDE71.jpeg%3FimageMogr2%2Fstrip%257CimageMogr2%2Fthumbnail%2F%25211070x804r%2Fgravity%2FCenter%2Fcrop%2F%25211070x804%2Fquality%2F90', 300, '高级房', '012', 0, 50, 2, '12345678', '1.5', '0', 0);
INSERT INTO `goods` VALUES (13, 0, NULL, 'http://tmp/wx3d4200f27d153872.o6zAJs9YbmkACUz1yHMgmHC7fHQY.nC7eE0RYYpvS52dc0c6820270d73b82dd394e2e5ae8b.jpg', 500, 'undefined', '155', 0, 55, 5, '12345678', '3', '0', 0);

-- ----------------------------
-- Table structure for pms
-- ----------------------------
DROP TABLE IF EXISTS `pms`;
CREATE TABLE `pms`  (
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `holename` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `wifiname` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pms
-- ----------------------------
INSERT INTO `pms` VALUES ('15648933053', 'PMS大酒店', 'PMSWIFI');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `face_url` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `identify` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'oLTa-4g-TCvI43bIlvNaLXRH5uCg', 'star°时光', '15648933053', 'https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83erIiaFAKYV7Uvcc2kRUWmF3RWAicGuqbCACIQ9JAkk3jo27iaiabSIovSNWR4vkk14klHlQyHDz2TickhA/132', '1');

SET FOREIGN_KEY_CHECKS = 1;
