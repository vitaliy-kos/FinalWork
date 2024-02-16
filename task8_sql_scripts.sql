## Создание общей таблицы
CREATE TABLE human_friends (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    commands VARCHAR(45),
    birthday Date
);

## Создание таблиц подвидов
CREATE TABLE pets (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    commands VARCHAR(45),
    birthday DATE
);

CREATE TABLE packs (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    commands VARCHAR(45),
    birthday DATE
);

## Создание таблиц животных
CREATE TABLE dogs (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    commands VARCHAR(45),
    birthday DATE
);

CREATE TABLE cats (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    commands VARCHAR(45),
    birthday DATE
);

CREATE TABLE hamsters (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    commands VARCHAR(45),
    birthday DATE
);

CREATE TABLE horses (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    commands VARCHAR(45),
	birthday DATE
);

CREATE TABLE camels (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    commands VARCHAR(45),
	birthday DATE
);

CREATE TABLE donkeys (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    commands VARCHAR(45),
	birthday DATE
);