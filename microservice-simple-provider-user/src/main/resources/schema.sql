drop table user if EXISTS ;
create table user (id BIGINT GENERATED  by DEFAULT as IDENTITY ,username VARCHAR(40),name VARCHAR(20),age INT,balance DECIMAL(10,2),PRIMARY key (id));