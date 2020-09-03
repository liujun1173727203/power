-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: power
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `name` varchar(32) DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `img` varchar(32) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `state` int(11) NOT NULL DEFAULT '1',
  `balance` float NOT NULL,
  `ic` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_record`
--

DROP TABLE IF EXISTS `customer_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_record` (
  `record_id` varchar(64) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `continue_time` float NOT NULL DEFAULT '0',
  `order_money` float NOT NULL,
  `refund_money` float NOT NULL DEFAULT '0',
  `start_time` datetime NOT NULL,
  `end_time` datetime NOT NULL,
  `pay_time` datetime NOT NULL,
  `after_pay_refund` float NOT NULL DEFAULT '0',
  `consume_power` float NOT NULL DEFAULT '0',
  `pay_way` int(11) NOT NULL,
  `end_waY` int(11) NOT NULL,
  `power` varchar(64) DEFAULT NULL,
  `for_agent` float NOT NULL,
  `for_property` float NOT NULL,
  `for_platform` float NOT NULL,
  `equip_id` int(11) NOT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_record`
--

LOCK TABLES `customer_record` WRITE;
/*!40000 ALTER TABLE `customer_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jack`
--

DROP TABLE IF EXISTS `jack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jack` (
  `equip_id` int(11) NOT NULL,
  `jack_id` int(11) DEFAULT NULL,
  `jack_state` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jack`
--

LOCK TABLES `jack` WRITE;
/*!40000 ALTER TABLE `jack` DISABLE KEYS */;
/*!40000 ALTER TABLE `jack` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `power_charge`
--

DROP TABLE IF EXISTS `power_charge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `power_charge` (
  `id` int(11) NOT NULL,
  `belong_country_id` int(11) NOT NULL,
  `card` varchar(64) DEFAULT NULL,
  `net_state` int(11) DEFAULT '0',
  `running_state` int(11) DEFAULT '0',
  `allow_quit` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `per_power` float DEFAULT NULL,
  `all_power` float DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `sim` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `power_charge`
--

LOCK TABLES `power_charge` WRITE;
/*!40000 ALTER TABLE `power_charge` DISABLE KEYS */;
/*!40000 ALTER TABLE `power_charge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `power_price`
--

DROP TABLE IF EXISTS `power_price`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `power_price` (
  `equip_id` int(11) NOT NULL,
  `price_card` float NOT NULL,
  `price_type` int(11) DEFAULT '0',
  `price` float DEFAULT NULL,
  `ptice_time` int(11) DEFAULT NULL,
  `max_power` float DEFAULT NULL,
  `price_name` varchar(64) DEFAULT NULL,
  `price_power` float DEFAULT NULL,
  `max_time` float DEFAULT NULL,
  `power_name` varchar(32) DEFAULT NULL,
  `power_max` int(32) DEFAULT NULL,
  `power_min` int(32) DEFAULT NULL,
  `power_time_percent` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `power_price`
--

LOCK TABLES `power_price` WRITE;
/*!40000 ALTER TABLE `power_price` DISABLE KEYS */;
/*!40000 ALTER TABLE `power_price` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suggestionle`
--

DROP TABLE IF EXISTS `suggestionle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suggestionle` (
  `name` varchar(32) NOT NULL,
  `phone` int(12) NOT NULL,
  `info` varchar(300) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `deal_time` datetime DEFAULT NULL,
  `state` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suggestionle`
--

LOCK TABLES `suggestionle` WRITE;
/*!40000 ALTER TABLE `suggestionle` DISABLE KEYS */;
/*!40000 ALTER TABLE `suggestionle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tips`
--

DROP TABLE IF EXISTS `tips`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tips` (
  `title` varchar(64) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `state` int(11) DEFAULT '0',
  `info` varchar(300) DEFAULT NULL,
  `come_from` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tips`
--

LOCK TABLES `tips` WRITE;
/*!40000 ALTER TABLE `tips` DISABLE KEYS */;
/*!40000 ALTER TABLE `tips` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(64) NOT NULL,
  `area` varchar(64) NOT NULL,
  `percent` float DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `enter_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `state` int(11) NOT NULL DEFAULT '0',
  `authority` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `nickname` varchar(20) DEFAULT NULL,
  `wechat_img` varchar(20) DEFAULT NULL,
  `pass` varchar(64) DEFAULT NULL,
  `pid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`),
  UNIQUE KEY `account_2` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'1173727203','南京',NULL,NULL,'2020-08-19 11:47:38',0,1,'admin',NULL,NULL,'123456',0),(2,'12231318731','南京',NULL,NULL,'2020-08-19 11:48:53',0,2,'visitor',NULL,NULL,NULL,0),(3,'admin','火星',NULL,NULL,'2020-08-21 00:03:06',0,1,'admin',NULL,NULL,'123456',1),(4,'test','南京',0,NULL,'2020-08-21 10:35:17',0,0,'test',NULL,NULL,NULL,0),(7,'test1','南京',0,NULL,'2020-08-21 10:42:53',0,0,'test1',NULL,NULL,'4d20b36bb13d40935084bd49dc8b72ef',0),(8,'test11','南京',0,NULL,'2020-08-21 10:46:59',0,0,'test11',NULL,NULL,'2f56221374c44f377cc425f04261f708',0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `warning`
--

DROP TABLE IF EXISTS `warning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `warning` (
  `equip_id` int(11) NOT NULL,
  `temperature` int(11) NOT NULL,
  `power` int(11) NOT NULL,
  `warning_time` datetime DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warning`
--

LOCK TABLES `warning` WRITE;
/*!40000 ALTER TABLE `warning` DISABLE KEYS */;
/*!40000 ALTER TABLE `warning` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `withdrawal_record`
--

DROP TABLE IF EXISTS `withdrawal_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `withdrawal_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `withdrawal_money` float NOT NULL,
  `actual_money` float NOT NULL,
  `beforeapply_money` float NOT NULL,
  `apply_type` varchar(32) NOT NULL,
  `apply_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `state` int(11) NOT NULL DEFAULT '0',
  `payee_name` varchar(32) NOT NULL,
  `bank` varchar(32) NOT NULL,
  `bank_card_number` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `withdrawal_record`
--

LOCK TABLES `withdrawal_record` WRITE;
/*!40000 ALTER TABLE `withdrawal_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `withdrawal_record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-23 12:11:46
