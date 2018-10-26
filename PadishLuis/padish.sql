CREATE DATABASE  IF NOT EXISTS `padish` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `padish`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: padish
-- ------------------------------------------------------
-- Server version	5.7.21-log

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
-- Table structure for table `anuncios`
--

DROP TABLE IF EXISTS `anuncios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anuncios` (
  `idanuncios` int(11) NOT NULL AUTO_INCREMENT,
  `idusuario` int(11) DEFAULT NULL,
  `idtipo` int(11) DEFAULT NULL,
  `idmetodoenvio` int(11) DEFAULT NULL,
  `iddisponibilidad` int(11) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `foto` blob,
  `fecharegistro` date DEFAULT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `dimensiones` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idanuncios`),
  KEY `idusuario_idx` (`idusuario`),
  KEY `idtipo_idx` (`idtipo`),
  KEY `idmetodo_idx` (`idmetodoenvio`),
  KEY `iddisponibilidad_idx` (`iddisponibilidad`),
  CONSTRAINT `iddisponibilidad` FOREIGN KEY (`iddisponibilidad`) REFERENCES `disponibilidad` (`iddisponibilidad`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idmetodo` FOREIGN KEY (`idmetodoenvio`) REFERENCES `metodosenvio` (`idmetodosenvio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idtipo` FOREIGN KEY (`idtipo`) REFERENCES `tipoarticulo` (`idtipoarticulo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idusuario` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE SET NULL ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anuncios`
--

LOCK TABLES `anuncios` WRITE;
/*!40000 ALTER TABLE `anuncios` DISABLE KEYS */;
INSERT INTO `anuncios` VALUES (8,4,1,1,1,'xcvvvv','','2018-08-24','sdff','97889*9778');
/*!40000 ALTER TABLE `anuncios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `idchat` int(11) NOT NULL AUTO_INCREMENT,
  `idusuario1` int(11) DEFAULT NULL,
  `idusuario2` int(11) DEFAULT NULL,
  PRIMARY KEY (`idchat`),
  KEY `usuario_idx` (`idusuario1`),
  KEY `segundo_idx` (`idusuario2`),
  CONSTRAINT `segundo` FOREIGN KEY (`idusuario2`) REFERENCES `usuario` (`idusuario`) ON DELETE SET NULL ON UPDATE NO ACTION,
  CONSTRAINT `usuario` FOREIGN KEY (`idusuario1`) REFERENCES `usuario` (`idusuario`) ON DELETE SET NULL ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `citas`
--

DROP TABLE IF EXISTS `citas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `citas` (
  `idcitas` int(11) NOT NULL AUTO_INCREMENT,
  `idchat` int(11) DEFAULT NULL,
  `articulo` varchar(50) DEFAULT NULL,
  `dia` datetime DEFAULT NULL,
  PRIMARY KEY (`idcitas`),
  KEY `conexion_idx` (`idchat`),
  CONSTRAINT `conexion` FOREIGN KEY (`idchat`) REFERENCES `chat` (`idchat`) ON DELETE SET NULL ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citas`
--

LOCK TABLES `citas` WRITE;
/*!40000 ALTER TABLE `citas` DISABLE KEYS */;
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterios`
--

DROP TABLE IF EXISTS `criterios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `criterios` (
  `idCriterios` int(11) NOT NULL,
  `idAnuncio` int(11) DEFAULT NULL,
  `idEtiquetas` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCriterios`),
  KEY `idAnuncio_idx` (`idAnuncio`),
  KEY `idetiqueta_idx` (`idEtiquetas`),
  CONSTRAINT `idAnuncio` FOREIGN KEY (`idAnuncio`) REFERENCES `anuncios` (`idanuncios`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idetiqueta` FOREIGN KEY (`idEtiquetas`) REFERENCES `etiquetas` (`idetiquetas`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterios`
--

LOCK TABLES `criterios` WRITE;
/*!40000 ALTER TABLE `criterios` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disponibilidad`
--

DROP TABLE IF EXISTS `disponibilidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disponibilidad` (
  `iddisponibilidad` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iddisponibilidad`),
  UNIQUE KEY `descripcion_UNIQUE` (`descripcion`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disponibilidad`
--

LOCK TABLES `disponibilidad` WRITE;
/*!40000 ALTER TABLE `disponibilidad` DISABLE KEYS */;
INSERT INTO `disponibilidad` VALUES (1,'Disponible'),(3,'En proceso de entrega'),(2,'No disponible');
/*!40000 ALTER TABLE `disponibilidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado` (
  `idestado` int(11) NOT NULL AUTO_INCREMENT,
  `estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idestado`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,'Ciudad de Mexico');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas`
--

DROP TABLE IF EXISTS `etiquetas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas` (
  `idetiquetas` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idetiquetas`),
  UNIQUE KEY `descripcion_UNIQUE` (`descripcion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas`
--

LOCK TABLES `etiquetas` WRITE;
/*!40000 ALTER TABLE `etiquetas` DISABLE KEYS */;
/*!40000 ALTER TABLE `etiquetas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mensaje`
--

DROP TABLE IF EXISTS `mensaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mensaje` (
  `idmensaje` int(11) NOT NULL AUTO_INCREMENT,
  `idchat` int(11) DEFAULT NULL,
  `idusuario` int(11) DEFAULT NULL,
  `mensaje` varchar(200) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`idmensaje`),
  KEY `idchat_idx` (`idchat`),
  KEY `idusuario_idx` (`idusuario`),
  CONSTRAINT `idchat` FOREIGN KEY (`idchat`) REFERENCES `chat` (`idchat`) ON DELETE SET NULL ON UPDATE NO ACTION,
  CONSTRAINT `remitente` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensaje`
--

LOCK TABLES `mensaje` WRITE;
/*!40000 ALTER TABLE `mensaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `mensaje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metodosenvio`
--

DROP TABLE IF EXISTS `metodosenvio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `metodosenvio` (
  `idmetodosenvio` int(11) NOT NULL AUTO_INCREMENT,
  `metodo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idmetodosenvio`),
  UNIQUE KEY `metodo_UNIQUE` (`metodo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metodosenvio`
--

LOCK TABLES `metodosenvio` WRITE;
/*!40000 ALTER TABLE `metodosenvio` DISABLE KEYS */;
INSERT INTO `metodosenvio` VALUES (1,'Entrega por externo');
/*!40000 ALTER TABLE `metodosenvio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `municipio`
--

DROP TABLE IF EXISTS `municipio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `municipio` (
  `idMunicipio` int(11) NOT NULL AUTO_INCREMENT,
  `idEstado` int(11) DEFAULT NULL,
  `Municipio` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idMunicipio`),
  KEY `estado_idx` (`idEstado`),
  CONSTRAINT `estado` FOREIGN KEY (`idEstado`) REFERENCES `estado` (`idestado`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `municipio`
--

LOCK TABLES `municipio` WRITE;
/*!40000 ALTER TABLE `municipio` DISABLE KEYS */;
INSERT INTO `municipio` VALUES (1,1,'Miguel Hidalgo');
/*!40000 ALTER TABLE `municipio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `problemas`
--

DROP TABLE IF EXISTS `problemas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `problemas` (
  `idProblemas` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuario` int(11) DEFAULT NULL,
  `idTipopro` int(11) DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idProblemas`),
  KEY `usuario_idx` (`idUsuario`),
  KEY `tipo_idx` (`idTipopro`),
  KEY `usuario_idx1` (`idUsuario`),
  KEY `tipo_idx1` (`idTipopro`),
  CONSTRAINT `prousuario` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idusuario`) ON DELETE SET NULL ON UPDATE NO ACTION,
  CONSTRAINT `tipopro` FOREIGN KEY (`idTipopro`) REFERENCES `tipoproblema` (`idTipopro`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `problemas`
--

LOCK TABLES `problemas` WRITE;
/*!40000 ALTER TABLE `problemas` DISABLE KEYS */;
/*!40000 ALTER TABLE `problemas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoarticulo`
--

DROP TABLE IF EXISTS `tipoarticulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoarticulo` (
  `idtipoarticulo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtipoarticulo`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoarticulo`
--

LOCK TABLES `tipoarticulo` WRITE;
/*!40000 ALTER TABLE `tipoarticulo` DISABLE KEYS */;
INSERT INTO `tipoarticulo` VALUES (2,'Muletas'),(1,'Silla de ruedas');
/*!40000 ALTER TABLE `tipoarticulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoproblema`
--

DROP TABLE IF EXISTS `tipoproblema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoproblema` (
  `idTipopro` int(11) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipopro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoproblema`
--

LOCK TABLES `tipoproblema` WRITE;
/*!40000 ALTER TABLE `tipoproblema` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipoproblema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `idMunicipio` int(11) DEFAULT NULL,
  `Nombre` varchar(70) DEFAULT NULL,
  `Contraseña` varchar(70) DEFAULT NULL,
  `Correo` varchar(70) DEFAULT NULL,
  `CURP` varchar(45) DEFAULT NULL,
  `Foto` varchar(45) DEFAULT NULL,
  `Username` varchar(45) DEFAULT NULL,
  `CP` int(11) DEFAULT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  KEY `idmunicipio_idx` (`idMunicipio`),
  CONSTRAINT `idmunicipio` FOREIGN KEY (`idMunicipio`) REFERENCES `municipio` (`idMunicipio`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,1,'qwe','qwe','qwe','qwe','qwe','qwe',123,'qwe'),(2,1,'qwe','asd','asd','asd','asd','asd',23,'asd'),(4,1,'ert','rty','rty@qwe','ert','dd','ert',123,'ert');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-05  5:17:16
