-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: wxapi
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employer`
--

DROP TABLE IF EXISTS `employer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employer` (
  `eid` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `contact` varchar(11) NOT NULL,
  `linkman` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `introduction` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`eid`),
  UNIQUE KEY `eid_UNIQUE` (`eid`),
  UNIQUE KEY `contact_UNIQUE` (`contact`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employer`
--

LOCK TABLES `employer` WRITE;
/*!40000 ALTER TABLE `employer` DISABLE KEYS */;
INSERT INTO `employer` VALUES (100,'网易','123456','互联网','13000000000','佚名','www.wangyi@163.com','网易网址','网易地址','互联网公司'),(200,'腾讯','123456','互联网','18700000000','佚名','www.tencent@qq.com','腾讯网址','腾讯地址','互联网公司');
/*!40000 ALTER TABLE `employer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evaluation` (
  `evid` int NOT NULL AUTO_INCREMENT,
  `eeid` int NOT NULL,
  `esid` int NOT NULL,
  `begindate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `position` varchar(30) DEFAULT NULL,
  `content` varchar(50) DEFAULT NULL,
  `satisfaction` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`evid`),
  UNIQUE KEY `evid_UNIQUE` (`evid`),
  KEY `eeid_idx` (`eeid`),
  KEY `esid_idx` (`esid`),
  CONSTRAINT `eeid` FOREIGN KEY (`eeid`) REFERENCES `employer` (`eid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `esid` FOREIGN KEY (`esid`) REFERENCES `student` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluation`
--

LOCK TABLES `evaluation` WRITE;
/*!40000 ALTER TABLE `evaluation` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `infomation`
--

DROP TABLE IF EXISTS `infomation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `infomation` (
  `iid` int NOT NULL AUTO_INCREMENT,
  `isid` int NOT NULL,
  `ieid` int NOT NULL,
  `itid` int NOT NULL,
  `begindate` date NOT NULL,
  `enddate` date NOT NULL,
  `position` varchar(30) DEFAULT NULL,
  `certify` tinyint DEFAULT NULL,
  `score` int DEFAULT NULL,
  `salary` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`iid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `infomation`
--

LOCK TABLES `infomation` WRITE;
/*!40000 ALTER TABLE `infomation` DISABLE KEYS */;
/*!40000 ALTER TABLE `infomation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobs`
--

DROP TABLE IF EXISTS `jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jobs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `jeid` int NOT NULL,
  `ename` varchar(30) NOT NULL,
  `jname` varchar(30) NOT NULL,
  `location` varchar(30) DEFAULT NULL,
  `salary` varchar(30) NOT NULL,
  `requirement` varchar(30) NOT NULL,
  `detail` varchar(60) DEFAULT NULL,
  `contect` varchar(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `jid_UNIQUE` (`id`),
  KEY `jeid_idx` (`jeid`),
  CONSTRAINT `jeid` FOREIGN KEY (`jeid`) REFERENCES `employer` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobs`
--

LOCK TABLES `jobs` WRITE;
/*!40000 ALTER TABLE `jobs` DISABLE KEYS */;
INSERT INTO `jobs` VALUES (1,100,'网易','游戏策划','网易广州本部','面议','三不限','暂无','13000000000'),(2,200,'网易','游戏运营','网易广州本部','10K','三不限','暂无','13000000000');
/*!40000 ALTER TABLE `jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `log` (
  `lid` int NOT NULL AUTO_INCREMENT,
  `lsid` int NOT NULL,
  `begindate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `leid` int NOT NULL,
  `location` varchar(30) DEFAULT NULL,
  `position` varchar(30) DEFAULT NULL,
  `content` varchar(50) DEFAULT NULL,
  `sevaluation` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`lid`),
  UNIQUE KEY `lno_UNIQUE` (`lid`),
  KEY `sid_idx` (`lsid`),
  KEY `eid_idx` (`leid`),
  CONSTRAINT `leid` FOREIGN KEY (`leid`) REFERENCES `employer` (`eid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `lsid` FOREIGN KEY (`lsid`) REFERENCES `student` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recruitment`
--

DROP TABLE IF EXISTS `recruitment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recruitment` (
  `rid` int NOT NULL AUTO_INCREMENT,
  `rsid` int NOT NULL,
  `reid` int NOT NULL,
  `begindate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `internship` varchar(30) NOT NULL,
  PRIMARY KEY (`rid`),
  KEY `rsid_idx` (`rsid`),
  KEY `reid_idx` (`reid`),
  CONSTRAINT `reid` FOREIGN KEY (`reid`) REFERENCES `employer` (`eid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rsid` FOREIGN KEY (`rsid`) REFERENCES `student` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recruitment`
--

LOCK TABLES `recruitment` WRITE;
/*!40000 ALTER TABLE `recruitment` DISABLE KEYS */;
/*!40000 ALTER TABLE `recruitment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `gender` varchar(4) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `edu` varchar(30) DEFAULT NULL,
  `nation` varchar(30) DEFAULT NULL,
  `contact` varchar(11) NOT NULL,
  `nativeplace` varchar(30) DEFAULT NULL,
  `politicestatus` varchar(30) DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `major` varchar(30) DEFAULT NULL,
  `ability` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid_UNIQUE` (`id`),
  UNIQUE KEY `semail_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (100,'10000000','','男','2020-08-20','','','',NULL,NULL,'100','',NULL),(101,'101','101','男',NULL,'','','',NULL,NULL,'101','',NULL),(200,'200','200','男','2020-07-09','选项1','200','200',NULL,NULL,'200','200',NULL),(300,'300','300','男','2020-08-04','大专','300','300',NULL,NULL,'300','300',NULL),(500,'500','500','男','2020-08-06','本科','500','500',NULL,NULL,'500','500',NULL),(4565654,'456456566666','','男','2020-08-06','','45656','',NULL,NULL,'456456','',NULL),(171543200,'tao','12345678999999','女','2000-01-02','硕士','维吾尔族','13000000000','广东广州','团员','www.163@163.com','计科','吃'),(171543299,'99','99','男',NULL,'','','',NULL,NULL,'99','',NULL);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teach`
--

DROP TABLE IF EXISTS `teach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teach` (
  `teid` int NOT NULL AUTO_INCREMENT,
  `tsid` int NOT NULL,
  `ttid` int NOT NULL,
  `begindate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `sgrade` varchar(30) NOT NULL,
  PRIMARY KEY (`teid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teach`
--

LOCK TABLES `teach` WRITE;
/*!40000 ALTER TABLE `teach` DISABLE KEYS */;
/*!40000 ALTER TABLE `teach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) NOT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `nation` varchar(30) DEFAULT NULL,
  `contact` varchar(11) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `major` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tid_UNIQUE` (`id`),
  UNIQUE KEY `contact_UNIQUE` (`contact`),
  UNIQUE KEY `emain_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,NULL,'1',NULL,NULL,NULL,'456465465','45646466',NULL),(1715432,'涛','123456','男',30,'汉族','13000000000','www.teacher@qq.com','计科');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'wxapi'
--

--
-- Dumping routines for database 'wxapi'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-11 14:06:49
