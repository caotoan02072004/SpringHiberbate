create database BTL3
go

use BTL3;
go

create table accounts
(
    id int primary key identity,
	username varchar(100) NOT NULL,
	password varchar(200) NOT NULL,
	fullname varchar(200) NOT NULL,
	email varchar(200) NULL,
	phone varchar(200) NULL,
    avatar varchar(200) NULL,
    active bit,
    note ntext,
    birthday date,
    gender bit
);
go


--https://bcrypt-generator.com
INSERT INTO accounts(username, password, fullname, email, phone, avatar, active, note,gender) VALUES ('admin','$2a$12$2sB8qmMWOc2JZrfuiwcjLuNyLPbxIKsq2UXgNatoKt7rQCNLGVQZe','adminok','admin@gmail.com','0123456789','resources/images/user/avatar.jpg', 1, 'ok', 1);
INSERT INTO accounts(username, password, fullname, email, phone, avatar, active, note,gender) VALUES ('user','$2a$12$2sB8qmMWOc2JZrfuiwcjLuNyLPbxIKsq2UXgNatoKt7rQCNLGVQZe','userok','user@gmail.com','0123456789','resources/images/user/avatar.jpg', 1, 'ok', 1);
go


create table roles
(
    roleid int primary key identity,
    rolename varchar(20) NOT NULL
);
go

insert into roles(rolename) values('ROLE_ADMIN');
insert into roles(rolename) values('ROLE_USER');
go

create table accounts_roles
(
    id int primary key identity,
    accountid int NOT NULL,
    roleid int NOT NULL,
    foreign key(accountid) references accounts(id),
    foreign key(roleid) references roles(roleid)
);
go

insert into accounts_roles(accountid,roleid) values(1,1);
insert into accounts_roles(accountid,roleid) values(2,2);
go


create table Department(
	Id int identity primary key,
	Name nvarchar(150) NOT NULL,
	Status int
)
Go

select * from Department


insert into Department values(N'Nhận sự', 1)
insert into Department values(N'Quản lý', 1)
insert into Department values(N'Kế hoạch',0)
go

create table Level(
	Id int identity primary key,
	Name nvarchar(150) NOT NULL,
	Status int
)
Go

Select * from Level

insert into Level values(N'Nhân viên', 1)
insert into Level values(N'Quản lý', 1)
insert into Level values(N'Giám đốc',1)
Go

create table Certificate(
	Id int primary key identity,
	Name nvarchar(150),
	Image nvarchar(255),
	Address nvarchar(100),
	expiration_date nvarchar(200),
	Status int
)
Go

insert into Certificate values(N'Toeic', 'image', N'Hà Nội', N'4 năm', 1)
Go


create table Employee(
	Id int primary key identity,
	Name nvarchar(100),
	Image nvarchar(200),
	Birthday date,
	Address nvarchar(200),
	Phone varchar(20),
	Rank nvarchar(120),
	Salary float,
	Status int,
	Department_id int,
	Level_id int,
	Certificate_id int,
	foreign key (Level_id) references Level(Id),
	foreign key (Certificate_id) references Certificate(Id),
	foreign key (Department_id) references Department(Id)
)

insert into Employee values(N'Nguyễn Văn A', '1','2000-12-12', N'Hà Nội', '0963258741', N'Quản lý', 30000000, 1,3,1,1)

select * from accounts