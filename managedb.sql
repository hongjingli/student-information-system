-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: managedb
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `classmessage`
--

DROP TABLE IF EXISTS `classmessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classmessage` (
  `CLASS` varchar(20) NOT NULL,
  `GRADE` varchar(20) NOT NULL,
  `SCOUNT` varchar(20) DEFAULT NULL,
  `SROOM` varchar(20) DEFAULT NULL,
  `BANZHUREN` varchar(20) DEFAULT NULL,
  `FUDAOYUAN` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`CLASS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classmessage`
--

LOCK TABLES `classmessage` WRITE;
/*!40000 ALTER TABLE `classmessage` DISABLE KEYS */;
INSERT INTO `classmessage` VALUES ('计算机科学与技术一班','2014','43','C14,C15','周小明','章轶凡'),('计算机科学与技术二班','2014','40','C14，C15','韦婷','章轶凡');
/*!40000 ALTER TABLE `classmessage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collegemessage`
--

DROP TABLE IF EXISTS `collegemessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collegemessage` (
  `XUEYUAN` varchar(20) NOT NULL,
  `XJIANJIE` varchar(40) DEFAULT NULL,
  `YUANZHANG` varchar(20) DEFAULT NULL,
  `OFFICE` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`XUEYUAN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collegemessage`
--

LOCK TABLES `collegemessage` WRITE;
/*!40000 ALTER TABLE `collegemessage` DISABLE KEYS */;
INSERT INTO `collegemessage` VALUES ('机械工程学院','机械工程学院从事机械','小军','B3'),('管理学院','管理学院从事管理','小红','B9'),('计算机工程学院','计算机学院从事计算机','小明','B1');
/*!40000 ALTER TABLE `collegemessage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `majormessage`
--

DROP TABLE IF EXISTS `majormessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `majormessage` (
  `ZHUANYE` varchar(20) NOT NULL,
  `JIANJIE` varchar(40) DEFAULT NULL,
  `MCOUNT` int(11) DEFAULT NULL,
  `CCOUNT` int(11) DEFAULT NULL,
  PRIMARY KEY (`ZHUANYE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `majormessage`
--

LOCK TABLES `majormessage` WRITE;
/*!40000 ALTER TABLE `majormessage` DISABLE KEYS */;
INSERT INTO `majormessage` VALUES ('网络工程','网络工程是网络通信的专业',160,4),('计算机科学与技术','计算机科学与技术是软硬件结合的专业',120,3),('软件工程','软件工程是软件开发的专业',50,1);
/*!40000 ALTER TABLE `majormessage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordinary`
--

DROP TABLE IF EXISTS `ordinary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordinary` (
  `uname` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordinary`
--

LOCK TABLES `ordinary` WRITE;
/*!40000 ALTER TABLE `ordinary` DISABLE KEYS */;
INSERT INTO `ordinary` VALUES ('admin1','1234'),('admin2','abcd');
/*!40000 ALTER TABLE `ordinary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `uname` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('201430089090','089090'),('201430089091','089091'),('201430089092','089092'),('201430089093','089093'),('201430089094','089094'),('201430089095','089095');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentmessage`
--

DROP TABLE IF EXISTS `studentmessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentmessage` (
  `SID` varchar(20) NOT NULL,
  `SNAME` varchar(20) NOT NULL,
  `XUEYUAN` varchar(20) NOT NULL,
  `ZHUANYE` varchar(20) NOT NULL,
  `GRADE` varchar(20) NOT NULL,
  `CLASS` varchar(20) NOT NULL,
  `PHONE` varchar(20) DEFAULT NULL,
  `DID` varchar(20) DEFAULT NULL,
  `uname` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  PRIMARY KEY (`SID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentmessage`
--

LOCK TABLES `studentmessage` WRITE;
/*!40000 ALTER TABLE `studentmessage` DISABLE KEYS */;
INSERT INTO `studentmessage` VALUES ('201430089090','邓颖聪','计算机工程学院','计算机科学与技术','2014','计算机科学与技术1班','617142','C15','201430089090','089090'),('201430089091','小明','计算机工程学院','软件工程','2014','软件工程1班','666661','C16','201430089091','089091'),('201430089092','小军','计算机工程学院','网络工程','2014','网络工程1班','666662','C14','201430089092','089092');
/*!40000 ALTER TABLE `studentmessage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `super`
--

DROP TABLE IF EXISTS `super`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `super` (
  `uname` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `super`
--

LOCK TABLES `super` WRITE;
/*!40000 ALTER TABLE `super` DISABLE KEYS */;
INSERT INTO `super` VALUES ('super1','123'),('super2','abc'),('super3','123abc');
/*!40000 ALTER TABLE `super` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-08 16:51:02
