CREATE TABLE `t_key_generator_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增长',
  `info` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='奇数主键生成表';
set session auto_increment_increment=2;
set session auto_increment_offset=1;
insert into `t_key_generator_1`   values(null,"test1");
insert into `t_key_generator_1`   values(null,"test1");