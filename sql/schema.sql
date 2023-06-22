-- database
DROP DATABASE IF EXISTS member_service;
CREATE DATABASE member_service;

-- table
DROP TABLE IF EXISTS tbl_member CASCADE;
CREATE SEQUENCE seq_member;
CREATE TABLE tbl_member (
    member_num INTEGER PRIMARY KEY DEFAULT nextval('seq_member'),
    member_id VARCHAR(100) NOT NULL UNIQUE,
    member_name VARCHAR(20)
);