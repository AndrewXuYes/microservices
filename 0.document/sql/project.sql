CREATE TABLE `order`
(
    `id`              bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单id',
    `member_id`       bigint(20) NOT NULL,
    `product_id`      bigint(20)     DEFAULT NULL,
    `order_sn`        varchar(64)    DEFAULT NULL COMMENT '订单编号',
    `create_time`     datetime       DEFAULT NULL COMMENT '提交时间',
    `member_username` varchar(64)    DEFAULT NULL COMMENT '用户帐号',
    `total_amount`    decimal(10, 2) DEFAULT NULL COMMENT '订单总金额',
    `pay_amount`      decimal(10, 2) DEFAULT NULL COMMENT '应付金额（实际支付金额）',
    `status`          int(1)         DEFAULT NULL COMMENT '订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单',
    `note`            varchar(500)   DEFAULT NULL COMMENT '订单备注',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 31
  DEFAULT CHARSET = utf8 COMMENT ='订单表';

CREATE TABLE `product`
(
    `id`            bigint(20) NOT NULL AUTO_INCREMENT,
    `product_id`    bigint(20)  DEFAULT NULL,
    `product_name`  varchar(64) DEFAULT NULL,
    `product_price` int(1)      DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 13
  DEFAULT CHARSET = utf8 COMMENT ='产品表';

CREATE TABLE `user`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT,
    `username`    varchar(64) DEFAULT NULL COMMENT '用户名',
    `password`    varchar(64) DEFAULT NULL COMMENT '密码',
    `phone`       varchar(64) DEFAULT NULL COMMENT '手机号码',
    `status`      int(1)      DEFAULT NULL COMMENT '帐号启用状态:0->禁用；1->启用',
    `create_time` datetime    DEFAULT NULL COMMENT '注册时间',
    `gender`      int(1)      DEFAULT NULL COMMENT '性别：0->未知；1->男；2->女',
    PRIMARY KEY (`id`),
    UNIQUE KEY `idx_username` (`username`),
    UNIQUE KEY `idx_phone` (`phone`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8 COMMENT ='会员表';



