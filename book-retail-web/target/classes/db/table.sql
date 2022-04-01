create table a_book
(
    id        bigint auto_increment comment '主键'
        primary key,
    book_name varchar(255) default '' not null comment '书名',
    price     decimal      default 0  not null comment '价格',
    is_delete int          default 0  not null comment '是否删除'
)
    comment '书籍';

create table a_member
(
    id          bigint auto_increment comment '主键'
        primary key,
    user_name   varchar(50)  default '' not null comment '用户名',
    password    varchar(255) default '' not null comment '密码',
    phone       varchar(50)             null comment '手机号',
    member_type int          default 0  not null comment '会员等级',
    point   int    null comment '积分',
    is_delete   int          default 0  not null comment '是否删除'
)
    comment '用户';

create table a_order_item
(
    id       bigint auto_increment comment '主键'
        primary key,
    order_id bigint  null comment '订单主键',
    book_id  bigint  not null comment '书籍主键',
    price    decimal not null comment '价格'
)
    comment '订单明细';

create table a_order_master
(
    id          bigint auto_increment comment '主键'
        primary key,
    userId      bigint            null comment '用户ID',
    create_time datetime          not null comment '创建时间',
    order_price decimal default 0 not null comment '订单金额'
)
    comment '订单';

