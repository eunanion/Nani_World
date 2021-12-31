-- employees를 사용 스키마로 지정해주세요

use employees;

-- employees 내부의 employees 테이블을 조회해주세요.
-- sql구문은 명령구문은 무조건 대문자 테이블명이나 호칭 등은
-- 소문자로 작성하는것이 관례입니다.
-- 무조건 지키지 않아도 실행은 가능하지만, 가독성을 위해서 되도록이면 지켜주세요.
SELECT * FROM employees;

-- 원래 테이블 조회할때는 스키마명. 테이블명으로 모두 표기해야 합니다.
-- ex) SELECT employees.employees; 하지만, use employees를 사용했기떄문에, employees 하나만 써서 하위문서로 바로 호출

-- 컬럼을 전체가 아닌 임의로 가져올때는 컬럼명을 ,로 구분합니다.
-- 이 경우 모든 컬럼이 아닌 일부 컬럼만 조회할 수도 있으며
-- 심지어 한 개의 컬럼만 조히하는 등 개수조절도 가능합니다.

SELECT last_name FROM employees;

-- cmd 환경에서는 좌측 스키마창처럼 스키마 목록을 보여주지 못하므로
-- 아래 명령어를 이용해 schemas 목록을 확인할 수 있습니다.
-- cmd wjqthrqjq  mysql -u root -p

SHOW DATABASES;

SHOW TABLE STATUS;

-- 특정 테이블의 칼럼 정보를 조회하고 싶다면 아래 명렁어를 씁니다.
-- DESCRIBE 테이블명; 혹은 DESC 테이블명;
DESCRIBE employees;

-- ict_practice를 디폴트 스키마로 잡아주세요
use ict_pratice;

CREATE TABLE userTbl(
user_id varchar(8) PRIMARY KEY,
user_name varchar(10) NOT NULL,
birthYear int(4) NOT NULL,
addr varchar(4) NOT NULL,
phone_number varchar(11),
height int(3),
reg_date DATE
);


CREATE TABLE buyTbl(
order_number INT AUTO_INCREMENT PRIMARY KEY,
user_id varchar(8) NOT NULL,
prod_name varchar(6) NOT NULL,
group_name varchar(4) ,
price int(7) NOT NULL,
amount int(3) NOT NULL,
FOREIGN KEY(used_id) REFERENCES userTbbl(user_id)
);
 
 DROP TABLE userTbl;
 DROP TABLE buyTbl;
 
 CREATE TABLE userTbl(
user_id varchar(8) PRIMARY KEY,
user_name varchar(10) NOT NULL,
birthYear int(4) NOT NULL,
addr varchar(4) NOT NULL,
phone_number varchar(11),
height int(3),
reg_date DATE
);


CREATE TABLE buyTbl(
order_number INT AUTO_INCREMENT PRIMARY KEY,
user_id varchar(8) NOT NULL,
prod_name varchar(6) NOT NULL,
group_name varchar(4) ,
price int(7) NOT NULL,
amount int(3) NOT NULL,
FOREIGN KEY(user_id) REFERENCES userTbl(user_id)
);

drop table userTbl;
-- 회원부터 집어넣었음.
INSERT INTO userTbl VALUES('CJH','채종훈',2000,'경기','01111111111',175,'2020=03-05');
INSERT INTO userTbl VALUES('SHM','손흥민',1992,'런던','01111333331',184,'2021-12-05');
INSERT INTO userTbl VALUES('EM','일론머스크',1971,'화성','01144444111',180,'2021=03-07');
 SELECT * FROM userTbl;
 -- 가입한 회원이 물건을 산 이력이 남도록 하겠습니다
 INSERT INTO buyTbl VALUES(null,'CJH','기계식키보드','주변기기',200000,1);
 -- order_number는 값을 null로 주면 AUTO_INCREMNET에 의해 자동으로 1씩 증가된 값을 배정받음.
  INSERT INTO buyTbl VALUES(null,'CJH','듀얼모니터','전자기기',20000,1);
  
  -- 없는 회원 아이디로 INSERT를 시도해보겠습니다.
  INSERT INTO buyTbl VALUES(null,'SHM','유니폼','의류',300000,1);
  INSERT INTO buyTbl VALUES(null,'EM','도지코인','가상화폐',5000,100000);


 
 
  SELECT * FROM buyTbl;

 -- PRIMARY KEY(주요 키)
 -- 각 테이블을 대표할 수 있는 대표데이터를 지정하는 커럶에 붙이는 제약조건 입니다.
 -- 모든 테이블은 무조건 하나의 PRIMARY KEY를 갖는다
 -- PRIMARY KEY는 자동으로 중복을 방지하고, NULL도 들어올수 없으므로 NOT NULL도 겸한다.
 
 -- AUTO_INCREMENT(자동증가)ㄱ3
 -- INT (정수)자료형이 붙은 칼럼에만 붙일 수 있고, 이게 붙은 칼럼은 자동으로 1씩 증가하는 숫자를 배정받습니다
 -- 시작은 1 입니다.
 -- INSERT INTO 구문이 실행될 때 마다 해당 컴럼에 들어갈 숫자를 자동으로 배정해줍니다.
 -- 한 번 쓰인 숫자는 다시는 사용되지 않습니다.
 
 
 -- FOREIGN KEY(외래 키)
 -- 쇼핑몰의 구매자는 반드시 회원이어야 합니다.
 -- 특정 테이블에 존재하는 값만 해당 칼럼에 들여올 수 있도록 거는 제약조건
 -- FOREIGN KEY를 거는 칼럼의 자료형과 크기는 참조하는 쪽과 원본 모두 같아야 합니다.
 -- 참조컬럼에 있는 값만(userTbl의 user_id에 존재하는 값만) buyTbl의 user_id에 올 수 있습니다.
 