SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `DOB` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `story` varchar(2500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of author
-- ----------------------------
INSERT INTO `author` VALUES ('1', 'Nam Cao', '1915 - 1951', 'Đại Hoàng, tỉnh Hà Nam', 'a');
INSERT INTO `author` VALUES ('2', 'Tố Hữu', '1920 - 2002', 'Hội An, Quảng Nam', null);
INSERT INTO `author` VALUES ('3', null, null, null, null);

-- ----------------------------
-- Table structure for book_detail
-- ----------------------------
DROP TABLE IF EXISTS `book_detail`;
CREATE TABLE `book_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `author_id` int(11) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  `store_id` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `publiced_year` date DEFAULT NULL,
  `producer_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_book_author` (`author_id`),
  KEY `fk_book_type` (`type_id`),
  KEY `fk_book_store` (`store_id`),
  KEY `fk_book_producer` (`producer_id`),
  CONSTRAINT `fk_book_author` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`),
  CONSTRAINT `fk_book_producer` FOREIGN KEY (`producer_id`) REFERENCES `producer` (`id`),
  CONSTRAINT `fk_book_store` FOREIGN KEY (`store_id`) REFERENCES `book_store` (`id`),
  CONSTRAINT `fk_book_type` FOREIGN KEY (`type_id`) REFERENCES `book_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_detail
-- ----------------------------
INSERT INTO `book_detail` VALUES ('1', 'Ba người bạn', '1', '8', '1', null, null, null);
INSERT INTO `book_detail` VALUES ('2', 'Một bữa no', '1', '8', '2', null, null, null);
INSERT INTO `book_detail` VALUES ('3', 'Bài học quét nhà', '1', '8', '3', null, null, null);
INSERT INTO `book_detail` VALUES ('4', 'Từ ấy', '2', '5', '4', null, '1946-04-15', null);
INSERT INTO `book_detail` VALUES ('5', 'Việt Bắc', '2', '5', '5', null, '1954-08-21', null);
INSERT INTO `book_detail` VALUES ('6', 'Gió lộng ', '2', '5', '6', null, '1961-11-23', null);

-- ----------------------------
-- Table structure for book_store
-- ----------------------------
DROP TABLE IF EXISTS `book_store`;
CREATE TABLE `book_store` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_id` varchar(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `enter_price` float DEFAULT NULL,
  `unit_price` float DEFAULT NULL,
  `disscount_price` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_store
-- ----------------------------
INSERT INTO `book_store` VALUES ('1', 'NC1000', '10', '100', '120', '2');
INSERT INTO `book_store` VALUES ('2', 'NC1001', '25', '84', '110', '5');
INSERT INTO `book_store` VALUES ('3', 'NC1002', '8', '78', '90', '0');
INSERT INTO `book_store` VALUES ('4', 'NC1003', '16', '65', '85', '2');
INSERT INTO `book_store` VALUES ('5', 'TH1001', '20', '80', '115', '2');
INSERT INTO `book_store` VALUES ('6', 'TH1002', '25', '45', '60', '0');
INSERT INTO `book_store` VALUES ('7', 'TH1003', '15', '66', '89', '2');
INSERT INTO `book_store` VALUES ('8', '', null, null, null, null);

-- ----------------------------
-- Table structure for book_type
-- ----------------------------
DROP TABLE IF EXISTS `book_type`;
CREATE TABLE `book_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_type
-- ----------------------------
INSERT INTO `book_type` VALUES ('1', 'Chính trị', null);
INSERT INTO `book_type` VALUES ('2', 'Khoa học giả tưởng', null);
INSERT INTO `book_type` VALUES ('3', 'Kinh Doanh', null);
INSERT INTO `book_type` VALUES ('4', 'Thiếu nhi', null);
INSERT INTO `book_type` VALUES ('5', 'Thơ', null);
INSERT INTO `book_type` VALUES ('6', 'Tiểu thuyết kinh dị ', null);
INSERT INTO `book_type` VALUES ('7', 'Sách giáo khoa', null);
INSERT INTO `book_type` VALUES ('8', 'Truyện ngắn', null);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_order_userID` (`user_id`),
  KEY `fk_order_userEmail` (`user_email`),
  CONSTRAINT `fk_order_userEmail` FOREIGN KEY (`user_email`) REFERENCES `user_detail` (`email`),
  CONSTRAINT `fk_order_userID` FOREIGN KEY (`user_id`) REFERENCES `user_detail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `order_id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL,
  `qualtity` int(11) NOT NULL,
  `unit_price` float DEFAULT NULL,
  `total_price` float NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `fk_orderDetail_book` (`book_id`),
  CONSTRAINT `fk_orderDetail_book` FOREIGN KEY (`book_id`) REFERENCES `book_detail` (`id`),
  CONSTRAINT `fk_orderDetail_order` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for producer
-- ----------------------------
DROP TABLE IF EXISTS `producer`;
CREATE TABLE `producer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of producer
-- ----------------------------

-- ----------------------------
-- Table structure for user_detail
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_type_id` int(11) DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_userDetail_user` (`user_type_id`),
  KEY `id` (`id`),
  KEY `email` (`email`),
  CONSTRAINT `fk_userDetail_user` FOREIGN KEY (`user_type_id`) REFERENCES `user_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_detail
-- ----------------------------

-- ----------------------------
-- Table structure for user_type
-- ----------------------------
DROP TABLE IF EXISTS `user_type`;
CREATE TABLE `user_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_type
-- ----------------------------