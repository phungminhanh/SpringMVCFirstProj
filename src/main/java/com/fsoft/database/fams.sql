create database fams;
use fams;
CREATE TABLE user (
user_id int  PRIMARY KEY NOT NULL auto_increment,
user_name varchar(50) NOT NULL,
email varchar(50) NOT NULL,
password varchar(50) NOT NULL,
enabled TINYINT NOT NULL DEFAULT 1
)
