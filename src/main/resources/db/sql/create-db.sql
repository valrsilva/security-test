DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS authorities;
CREATE TABLE users(username varchar(50), password varchar(60), enabled boolean);
CREATE TABLE authorities(username varchar(50), authority varchar(60));
