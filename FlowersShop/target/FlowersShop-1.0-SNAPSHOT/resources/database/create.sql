CREATE TABLE users (
	id	 INTEGER unique not null primary key,
	login    VARCHAR(10) unique not null,
	password VARCHAR(30) not null,
	email    VARCHAR(15) unique not null);	

CREATE TABLE flower (
	id    INTEGER unique not null primary key,
	img   VARCHAR(20000) not null,
	name  VARCHAR(200) not null,
	type  VARCHAR(200) not null,
	price 	     INTEGER not null,
	quantity     INTEGER not null,
	descr VARCHAR(2000) not null);

CREATE TABLE shopping_cart_item (
	id         INTEGER unique not null primary key,
	user_id    INTEGER not null references users(id),
	flower_id  INTEGER not null references flower(id),
	quantity   INTEGER not null,
	total	   INTEGER);
	
CREATE TABLE delivery (
	id    INTEGER unique not null primary key,
	user_id    INTEGER references users(id),
	secondname VARCHAR(120) not null,
	name       VARCHAR(120) not null,
	lastname   VARCHAR(120) not null,
	country    VARCHAR(120) not null,
	city	   VARCHAR(120) not null,
	street     VARCHAR(120) not null,
	house      VARCHAR(120) not null,
	flat       VARCHAR(120) not null,
	phone      VARCHAR(120) not null);

CREATE TABLE sale (
	id INTEGER unique not null primary key,
	flower_id  INTEGER not null references flower(id),
	new_price  INTEGER not null);

CREATE TABLE message (
	id INTEGER unique not null primary key,
	user_id    INTEGER not null references users(id),
	theme 	VARCHAR(30) not null,
	text 	VARCHAR(1500) not null);
	
CREATE TABLE article (
	id INTEGER unique not null primary key,
	img    VARCHAR(20000),
	name   VARCHAR(120) not null,
	intro  VARCHAR(1000) not null,
	text   VARCHAR(20000) not null);

CREATE TABLE product (
	id INTEGER unique not null primary key,
	user_id    INTEGER not null references users(id),
	name  VARCHAR(200) not null,
	type  VARCHAR(200) not null,
	price INTEGER not null,
	descr VARCHAR(2000) not null,
	date VARCHAR(2000) not null);