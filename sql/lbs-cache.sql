CREATE DATABASE `LbsCache` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE LbsCache;

CREATE TABLE `base_station_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `mcc` varchar(64) DEFAULT NULL,
  `mnc` varchar(64) DEFAULT NULL,
  `lac` varchar(64) DEFAULT NULL,
  `ci` varchar(64) DEFAULT NULL,
  `lon` varchar(64) DEFAULT NULL,
  `lat` varchar(64) DEFAULT NULL,
  `coord` varchar(32) DEFAULT NULL COMMENT '坐标系',
  `radius` varchar(64) DEFAULT NULL COMMENT '基站范围',
  `address` varchar(256) DEFAULT NULL COMMENT '位置名称',
  `cacheAge` varchar(128) DEFAULT NULL,
  `reserved2` varchar(128) DEFAULT NULL,
  `reserved3` varchar(128) DEFAULT NULL,
  `reserved4` varchar(128) DEFAULT NULL,
  `reserved5` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=940 DEFAULT CHARSET=utf8mb4 COMMENT='CREATE TABLE `base_station_info` (\n  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,\n  `mcc` varchar(64) DEFAULT NULL,\n  `mnc` varchar(64) DEFAULT NULL,\n  `lac` varchar(64) DEFAULT NULL,\n  `ci` varchar(64) DEFAULT NULL,\n  `lon` varchar(64) DEFAULT NULL,\n  `lat` varchar(64) DEFAULT NULL,\n  `coord` varchar(32) DEFAULT NULL COMMENT ''坐标系'',\n  `radius` varchar(64) DEFAULT NULL COMMENT ''基站范围'',\n  `address` varchar(256) DEFAULT NULL COMMENT ''位置名称'',\n  `cacheAge` varchar(128) DEFAULT NULL,\n  `reserved2` varchar(128) DEFAULT NULL,\n  `reserved3` varchar(128) DEFAULT NULL,\n  `reserved4` varchar(128) DEFAULT NULL,\n  `reserved5` varchar(128) DEFAULT NULL,\n  PRIMARY KEY (`id`)\n) ENGINE=InnoDB AUTO_INCREMENT=940 DEFAULT CHARSET=utf8mb4;';