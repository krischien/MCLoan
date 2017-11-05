/*
SQLyog Enterprise - MySQL GUI v7.13 
MySQL - 5.0.51b-community-nt-log : Database - ppc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`ppc` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ppc`;

/*Table structure for table `banks` */

DROP TABLE IF EXISTS `banks`;

CREATE TABLE `banks` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `code` varchar(45) default NULL,
  `name` varchar(45) default NULL,
  `address` longtext,
  `active` tinyint(4) default '1',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `banks` */

insert  into `banks`(`id`,`code`,`name`,`address`,`active`) values (1,'iidd','idd','ixdd',1),(2,'es','es','es',1),(3,'DVO-BDO-MATINA','BDO Matina','Matina, Davao City',1),(4,'MTI-BDO','BDO Mati','City of Mati, Davao Oriental',1),(5,'213ddsa','dasdsa','dasdsa',1),(6,'dsads','adsad','sadsads',1),(7,'fdsfasf','asdfdsafdasfasd','aaa',1),(8,'a','b','c',1),(9,'dd','dd','dd',1),(10,'ww','ww','ww',1),(11,'fff','ff','ff',1),(12,'xxx','xxx','xx',1),(13,'aaa','aaa','aaa',1);

/*Table structure for table `branches` */

DROP TABLE IF EXISTS `branches`;

CREATE TABLE `branches` (
  `id` int(13) NOT NULL auto_increment,
  `code` varchar(50) default NULL,
  `name` varchar(50) default NULL,
  `description` varchar(50) default NULL,
  `active` tinyint(4) default '1',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `branches` */

/*Table structure for table `character_reference` */

DROP TABLE IF EXISTS `character_reference`;

CREATE TABLE `character_reference` (
  `id` int(11) NOT NULL auto_increment,
  `client_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `contact_no` varchar(30) NOT NULL,
  `address` text NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `character_reference` */

insert  into `character_reference`(`id`,`client_id`,`name`,`contact_no`,`address`) values (1,1,'RENE','NONE','NONE');

/*Table structure for table `client_bak` */

DROP TABLE IF EXISTS `client_bak`;

CREATE TABLE `client_bak` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `tempId` int(10) unsigned default NULL,
  `accountNo` varchar(45) default NULL,
  `firstname` varchar(45) default NULL,
  `middlename` varchar(45) default NULL,
  `lastname` varchar(45) default NULL,
  `gender` varchar(45) default NULL,
  `civilStatus` varchar(45) default NULL,
  `birthdate` date default NULL,
  `mobileNo` varchar(45) default NULL,
  `landline` varchar(45) default NULL,
  `emailAddress` varchar(45) default NULL,
  `businessAddress` longtext,
  `street` longtext,
  `barangay` longtext,
  `cityProvince` longtext,
  `cedula` varchar(45) default NULL,
  `placeIssued` longtext,
  `dateIssued` date default NULL,
  `spouseName` varchar(45) default NULL,
  `spouseBirthdate` date default NULL,
  `spouseDateOfDeath` date default NULL,
  `characterReferenceName` varchar(45) default NULL,
  `characterReferenceAddress` longtext,
  `characterReferenceContactNumber` varchar(45) default NULL,
  `photo` longtext,
  `dateCreated` datetime default NULL,
  `dateEdited` datetime default NULL,
  `active` tinyint(1) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `client_bak` */

insert  into `client_bak`(`id`,`tempId`,`accountNo`,`firstname`,`middlename`,`lastname`,`gender`,`civilStatus`,`birthdate`,`mobileNo`,`landline`,`emailAddress`,`businessAddress`,`street`,`barangay`,`cityProvince`,`cedula`,`placeIssued`,`dateIssued`,`spouseName`,`spouseBirthdate`,`spouseDateOfDeath`,`characterReferenceName`,`characterReferenceAddress`,`characterReferenceContactNumber`,`photo`,`dateCreated`,`dateEdited`,`active`) values (5,4,'PPC-000004','Ritchie Ian','Reporial','Simplicio','Male','Married','1993-04-28','s','s','','','s','ss','s','','','2015-08-06','sd','2015-07-15','1111-11-11','s','s','s',NULL,'2015-07-19 10:17:24','2015-07-19 10:17:24',1),(6,5,'PPC-000005','Juan','Cruz','Test','Female','Married','2015-07-07','1','1','1','1','1','1','1','1','1','2015-07-02','a','2015-07-10','1111-11-11','a','a','1',NULL,'2015-07-19 15:33:17','2015-07-19 15:33:17',1),(7,6,'PPC-000006','a','a','a','Male','Married','1974-07-03','1','1','1','1','11','1','1','1','1','1111-11-11','q','2015-07-19','1111-11-11','1','1','1',NULL,'2015-07-19 15:45:48','2015-07-19 15:45:48',1),(8,7,'PPC-000007','q','w','e','Female','Married','2015-07-26','r','t','y','o','p','a','s','u','i','2015-07-27','g','2015-07-29','2015-07-30','h','j','k',NULL,'2015-07-19 16:38:58','2015-07-19 16:38:58',1),(9,8,'PPC-000008','abc','a','a','Male','Married','2015-07-19','a','a','a','a','a','a','a','a','a','2015-07-19','q','2015-07-19','2015-07-19','q','q','q',NULL,'2015-07-19 16:50:53','2015-07-19 16:50:53',1),(10,9,'PPC-000009','Gilbert','Eggggg','Arnaiz','Male','Widow','1978-03-23','09215385326','8283915','giltech_engineering@yahoo.com','mandug','timawa','mandug','davao del sur','388990---==','davao','2015-07-07','pureficacion','1940-08-19','1111-11-11','Mamords','matina','09989871266',NULL,'2015-07-19 17:02:45','2015-07-19 17:02:45',1),(11,10,'PPC-000010','Tirso','s','ss','Male','Single','1950-07-19','123','123','123','123','123','123','123','123','123','2015-07-25','wer','2015-07-25','2015-07-25','6r','tyfy','gfcg',NULL,'2015-07-25 12:09:22','2015-07-25 12:09:22',1);

/*Table structure for table `clients` */

DROP TABLE IF EXISTS `clients`;

CREATE TABLE `clients` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `account_no` varchar(45) default NULL,
  `firstname` varchar(45) default NULL,
  `middlename` varchar(45) default NULL,
  `lastname` varchar(45) default NULL,
  `gender` varchar(45) default NULL,
  `civil_status` varchar(45) default NULL,
  `birthdate` date default '0000-00-00',
  `mobile_no` varchar(45) default NULL,
  `landline` varchar(45) default NULL,
  `email_address` varchar(45) default NULL,
  `business_address` longtext,
  `street` longtext,
  `barangay` longtext,
  `city_province` longtext,
  `cedula` varchar(45) default NULL,
  `place_issued` longtext,
  `date_issued` date default '0000-00-00',
  `spouse_name` varchar(45) default NULL,
  `spouse_birthdate` date default '0000-00-00',
  `spouse_date_of_death` date default '0000-00-00',
  `photo` longtext,
  `date_created` datetime default NULL,
  `date_updated` datetime default NULL,
  `active` tinyint(1) default NULL,
  `client_bank` varchar(50) default NULL,
  `branch_id` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `clients` */

insert  into `clients`(`id`,`account_no`,`firstname`,`middlename`,`lastname`,`gender`,`civil_status`,`birthdate`,`mobile_no`,`landline`,`email_address`,`business_address`,`street`,`barangay`,`city_province`,`cedula`,`place_issued`,`date_issued`,`spouse_name`,`spouse_birthdate`,`spouse_date_of_death`,`photo`,`date_created`,`date_updated`,`active`,`client_bank`,`branch_id`) values (1,'MCP-000001','TARCISIO','L','JUBANE','Male','Married','1944-08-15','NONE','NONE','NONE','NONE','NONE','PUNTALINAO','BANAY-BANAY DAVAO ORIENTAL','NONE','NONE','2015-10-07','CATALINA','2015-10-07','2015-10-07',NULL,'2015-10-07 16:11:45','2015-10-07 16:11:45',1,'3',0);

/*Table structure for table `dependents` */

DROP TABLE IF EXISTS `dependents`;

CREATE TABLE `dependents` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `client_id` int(10) unsigned default NULL,
  `name` varchar(45) default NULL,
  `birthdate` date default '0000-00-00',
  `date_created` datetime default NULL,
  `date_updated` datetime default NULL,
  `active` tinyint(1) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `dependents` */

/*Table structure for table `loan` */

DROP TABLE IF EXISTS `loan`;

CREATE TABLE `loan` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `clientId` int(10) unsigned default NULL,
  `pnNo` varchar(45) default NULL,
  `date` date default NULL,
  `monthlyAmmortization` double(10,2) default NULL,
  `monthlyChange` double(10,2) default NULL,
  `loanType` varchar(45) default NULL,
  `loanTerm` double(10,2) default NULL,
  `grossLoan` double(10,2) default NULL,
  `interest` double(10,2) default NULL,
  `principal` double(10,2) default NULL,
  `processingFee` double(10,2) default NULL,
  `otherDeduction` varchar(45) default NULL,
  `amountOfCheck` double(10,2) default NULL,
  `firstDue` date default NULL,
  `lastDue` date default NULL,
  `branch_id` int(13) default NULL,
  `active` tinyint(1) default '1',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `loan` */

insert  into `loan`(`id`,`clientId`,`pnNo`,`date`,`monthlyAmmortization`,`monthlyChange`,`loanType`,`loanTerm`,`grossLoan`,`interest`,`principal`,`processingFee`,`otherDeduction`,`amountOfCheck`,`firstDue`,`lastDue`,`branch_id`,`active`) values (1,1,'PN-000001','2015-10-07',3100.00,3100.00,'New',18.00,55800.00,25110.00,30690.00,2790.00,'0.0',27900.00,'2015-11-07','2017-04-07',1,1);

/*Table structure for table `pensions` */

DROP TABLE IF EXISTS `pensions`;

CREATE TABLE `pensions` (
  `id` int(11) NOT NULL auto_increment,
  `client_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `others` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `pension_no` varchar(45) NOT NULL,
  `bank_id` int(10) NOT NULL,
  `bank_account_no` varchar(45) NOT NULL,
  `monthly_pension` double NOT NULL,
  `date_remittance` int(11) NOT NULL,
  `branch_id` int(13) default NULL,
  `active` tinyint(1) default '1',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `pensions` */

insert  into `pensions`(`id`,`client_id`,`name`,`others`,`type`,`pension_no`,`bank_id`,`bank_account_no`,`monthly_pension`,`date_remittance`,`branch_id`,`active`) values (1,1,'SSS','Specify Pension','Retirement','Retirement',3,'NONE',3200,15,0,1);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL auto_increment,
  `roleName` varchar(45) default NULL,
  `description` varchar(45) default NULL,
  `active` tinyint(1) default '1',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(13) NOT NULL auto_increment,
  `username` varchar(45) default NULL,
  `password` varchar(45) default NULL,
  `firstname` varchar(45) default NULL,
  `middlename` varchar(45) default NULL,
  `lastname` varchar(45) default NULL,
  `birthdate` date default NULL,
  `contactNo` varchar(45) default NULL,
  `picture` longblob,
  `roleId` int(13) default NULL,
  `active` tinyint(1) default '1',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `users` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
