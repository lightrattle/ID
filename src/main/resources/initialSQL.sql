/*
 Navicat Premium Data Transfer
 Source Server : 本地
 Source Server Type : MySQL
 Date: 2/23/2023 20:50:45
*/
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

/*创建人员表*/
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
    `userid` int(10) NOT NULL AUTO_INCREMENT,
    `nickname` varchar(5) NOT NULL,
    `username` varchar(10) NOT NULL,
    `password` varchar(25) NOT NULL,
    `status` int(1) NOT NULL DEFAULT 1,/*0管理员,1新用户，2答题通过用户*/
    PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

INSERT INTO `User`(userid, nickname, username, password, status) VALUES (1, '审核员', 'admin-0', '123456', 0);
INSERT INTO `User`(userid, nickname, username, password, status) VALUES (2, '浏览者', 'player-0', '123456', 1);
INSERT INTO `User`(userid, nickname, username, password, status) VALUES (3, '关注者', 'player-1', '123456', 1);
INSERT INTO `User`(userid, nickname, username, password, status) VALUES (4, '拉黑者', 'player-2', '123456', 1);
INSERT INTO `User`(userid, nickname, username, password, status) VALUES (5, '上传者', 'player-3', '123456', 2);

/*创建黑名单*/
DROP TABLE IF EXISTS `Blacklist`;
CREATE TABLE `Blacklist` (
    `blackid` int(10) NOT NULL AUTO_INCREMENT,
    `userid` int(10) NOT NULL,
    `blackuserid` int(10) NOT NULL,
    PRIMARY KEY (`blackid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

/*创建关注表*/
DROP TABLE IF EXISTS `Attention`;
CREATE TABLE `Attention` (
    `attentionid` int(10) NOT NULL AUTO_INCREMENT,
    `userid` int(10) NOT NULL,
    `attentionuserid` int(10) NOT NULL,
    PRIMARY KEY (`attentionid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

DROP TABLE IF EXISTS `Classify`;
CREATE TABLE `Classify` (
    `classifyid` int(10) NOT NULL AUTO_INCREMENT,
    `classifyname` varchar(125) NOT NULL,
    PRIMARY KEY (`classifyid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;
INSERT INTO `Classify`(classifyid, classifyname) VALUES (1, '风景');
INSERT INTO `Classify`(classifyid, classifyname) VALUES (3, '动漫');
INSERT INTO `Classify`(classifyid, classifyname) VALUES (4, '动物');

DROP TABLE IF EXISTS  `Images`;
CREATE TABLE `Images` (
    `imageid` int(10) NOT NULL AUTO_INCREMENT,
    `userid` int(10) NOT NULL,
    `classifyid` int(10) NOT NULL REFERENCES Classify(`classifyid`),
    `uptime` datetime NOT NULL,
    `image` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `zan` int(10) NULL DEFAULT 0,
    `cai` int(10) NULL DEFAULT 0,
    `status` int(1) NOT NULL NULL DEFAULT 0,
    PRIMARY KEY (`imageid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

DROP TABLE IF EXISTS `Comments`;
CREATE TABLE `Comments` (
    `commentid` int(10) NOT NULL AUTO_INCREMENT,
    `commentuserid` int(10) NOT NULL,
    `commenttime` datetime NOT NULL,
    `imageid` int(10) NOT NULL REFERENCES Images(`imageid`),
    `comment` varchar(250) NOT NULL,
    PRIMARY KEY (`commentid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

DROP TABLE IF EXISTS `Notices`;
CREATE TABLE `Notices` (
    `noticeid` int(10) NOT NULL AUTO_INCREMENT,
    `userid` int(10) NOT NULL,
    `noticetime` datetime NOT NULL,
    `status` int(1) NOT NULL NULL DEFAULT 0,/*0为未读， 1为已读*/
    `notice` varchar(125) NOT NULL,
    PRIMARY KEY (`noticeid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

SET FOREIGN_KEY_CHECKS = 1;