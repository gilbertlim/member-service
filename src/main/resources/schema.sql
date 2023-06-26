-- table
DROP TABLE IF EXISTS tbl_member CASCADE;
CREATE TABLE tbl_member (
    member_id VARCHAR(50) PRIMARY KEY UNIQUE,
    name VARCHAR(30) NOT NULL,
    email VARCHAR(50) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    address VARCHAR(50) NOT NULL
);