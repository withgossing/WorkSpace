

-- 데이터베이스 생성
mysql> create database default character set UTF8;

-- localhost 에서 접속가능한 사용자 생성
mysql> create user 'bank01'@'localhost' identified by 'goribank01!';

-- 외부에서 접속 가능한 사용자 생성
mysql> create user 'bank01'@'%' identified by 'goribank01!';

-- 데이터베이스에 사용자 접속 권한 부여
mysql> grant all privileges on bank01.* to bank01@localhost;

-- account 테이블 생성
create table if not exists bank01.account (
    pid int not null auto_increment,
    accountName varchar(64),
    signUpDate varchar(8),
    customerPid int,
    primary key(pid)
    );

-- customer 테이블 생성
create table if not exists bank01.customer (
    pid int not null auto_increment,
    customerId varchar(32),
    customerName varchar(64),
    customerPassword varchar(64),
    customerEmail varchar(64),
    signUpDate varchar(8),
    primary key(pid)
    );


-- transaction 테이블 생성
create table if not exists bank01.transaction (
    pid int not null auto_increment,
    transactionDate varchar(8),
    transactionAmount bigint,
    accountPid int,
    primary key(pid)
    );