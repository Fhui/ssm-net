select *
from items;

delete from items
where id = 10;


update items
set name = '台式机', price = 10000
where id = 1;


insert into orders (name, price, user_id) values ('手机', 1000, 1);

insert into orders (name, price, user_id) values ('ipad', 1000, 10);

insert into orders (name, price, user_id) values ('电脑', 1000, 10);

insert into orders (name, price, user_id) values ('电风扇', 1000, 16);

insert into orders (name, price, user_id) values ('电吹风', 1000, 16);

insert into orders (name, price, user_id) values ('袜子', 1000, 22);
insert into orders (name, price, user_id) values ('裤子', 5, 22);
insert into orders (name, price, user_id) values ('鞋', 111, 22);
insert into orders (name, price, user_id) values ('床单', 3555, 22);
insert into orders (name, price, user_id) values ('摄像头', 2222, 25);
insert into orders (name, price, user_id) values ('杯子', 7777, 26);

select
  u.username,
  u.sex,
  o.name,
  o.price
from orders o left join user u on o.user_id = u.id;

select
  u.username, u.sex, o.name, o.price
from
  orders o
  left join
  user u
    on
      o.id = u.id
where
  u.id = 10;



-- auto-generated definition
create table orders
(
  id      int auto_increment
    primary key,
  name    varchar(32)  null
  comment '商品名称',
  price   float(10, 1) null
  comment '商品定价',
  user_id int          null
)
  charset = utf8;



-- auto-generated definition
create table user
(
  id       int auto_increment
    primary key,
  username varchar(32)  null
  comment '用户名称',
  birthday date         null
  comment '生日',
  sex      char         null
  comment '性别',
  address  varchar(256) null
  comment '地址'
)
  charset = utf8;

