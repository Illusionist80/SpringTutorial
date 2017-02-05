-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.35-community

-- Create schema apu

CREATE DATABASE IF NOT EXISTS apu;
USE apu;


-- Definition of table `users`


DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` bit(1) NOT NULL,
  `id` int(40) unsigned NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- Dumping data for table `users`


INSERT INTO `users` (`username`,`password`,`enabled`,`id`) VALUES 
 ('apurav','apurav',0x01,3),
 ('apurav','apurav',0x00,4),
 ('apurav','apurav',0x00,6),
 ('apurav','apurav',0x00,7),
 ('apurav','apurav',0x00,80),
 ('apurav','apurav',0x00,90);

