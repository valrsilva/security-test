DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS authorities;
CREATE TABLE users(id integer identity, username varchar(50), password varchar(60), enabled boolean);
CREATE TABLE authorities(id integer identity, user_id integer, username varchar(50), authority varchar(60));
