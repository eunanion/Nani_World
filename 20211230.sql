/* 1. 데이터베이스 생성 명령 
DB생성시 한글을 쓸 수 있도록  -> default character set utf8; */
create database ict_pratice default character set utf8;

/* 우측 하단의 schemas 클릭 후, 새로고침 한 다음 ict_practice 우클릭
-> set as default sschemas를 클릭하세요. 이러면 현재 명령을 받을 DB로 지정됩니다.*/

/* default schema 지정은 명령어로도 할 수 있습니다.
use 스키마명; 을 사용하면 좌측 schemas에서 우클릭 후 default스키마  지정한
효과를 낼 수도 있습니다.*/
use sys;
use ict_practice;

/* 테이블 생성 명령
primary key - 컬럼의 주요 키를 뜻하며, 중복데이터를 방지합니다.
테이블 내의 하나의 컬럼은 반드시 primary key 속성을 가져야 합니다.
not null -> 데이터에 null 값이 들어오는것을 방지합니다.

/* 테이블은 클래스랑 구조가 비슷합니다. 클래스 내부의 멤버변수를 지정하듯이
테이블 요소를 지정해 줄 수 있습니다.*/
/* varchar 는 자바의 String과 호환됩니다. */

CREATE TABLE users(
    id varchar(20) primary key,
	pw varchar(20) not null,
    user_name varchar(30) not null,
    email varchar(80) 
    );
    
/* 데이터 적재하기 
INSERT INTO 테이블명(컬럼1 , 컬럼2 ... ) VALUES(컬럼1값..,컬럼2값..);
만약 모든 컬럼을 대상으로 지정시 컬럼은 생략하고 VALUES 이후 값ㅂ만 지정할수 있다
INSERT INTO 테이블명 VALUES(컬럼1값,컬럼2값...);*/

INSERT INTO users(id,pw,user_name, email) VALUES
 ('abc1244','asdf','김자바','asdasd@naver.com');
 
INSERT INTO users VALUES ('qwer123','qwer','쿼리문','asdqwe@aasda');

-- 한줄주석은 자바와 달리 -- 내용을 적어 작성할수 있습니다
-- 여러분들이 계정 3개를 더 넣어주시되,  1개의 계정은 이메일을 생략하고 넣어주세요

/* 데이터 조회하기
SELECT 컬럼1, 컬럼2, .... FROM 테이블명;
을 적으면 테이블에 적재된 데이터 조회 가능
SELECT * FROM 테이블명; 으로 조회시 해당 테이블의 전체 칼럼 조회가능 */

     SELECT * FROM users;
     INSERT INTO users VALUES ('qsdsd3','123er','쿼나니','asd123@aasda');
     INSERT INTO users VALUES ('qw32433','q43wer','유나니문','asd23@aasa');
     INSERT INTO users VALUES ('qwer123','q12wr','쿼리문','');
      SELECT * FROM users;
      
   INSERT INTO users VALUES ('qzzr423','q7665wr','쿼리문','');
   SELECT * FROM users;
   
-- 이메일을 없이 넣는 경우는 컬럼명을 반드시 표기해야합니다.
INSERT INTO users (id,pw, user_name) VALUES ('DSJ3UH23','ZZ3Z','고잉메리호');
INSERT INTO users VALUES('ASD2SDF','sdfds3z;','무당','sdfsd@fassdasd');
INSERT INTO users VALUES('SDFSDF32','SDFZzzsdf','구름',null);

SELECT * FROM users;

-- 조회구문에 조건을 걸기 위해서 WHERE이라는 구문을 사용합니다.
-- SELECT 조회컬럼 FROM테이블명 WHERE 컬럼명 = '조건에 맞는 값';
-- 이름이 김자바인 	 사람만 출력하기
SELECT * FROM users WHERE user_name ='김자바';
-- 여러분들의 기준으로 필터링 해보세요
-- 아이디가 XXX인 사람을 출력해 보세요

SELECT * FROM users WHERE id = 'javajava';

-- 조건 여러개를 걸 경우 AND,OR 키워드를 쓰면 됩니다.
-- 아이디가 mysqlsql이거나 혹은 유저이름이 김자비인것들을 얻어오기
SELECT * FROM users WHERE id = 'SDFSDF32' OR user_name ='김자바';

/* 데이터 수정하기 
UPDATE 테이블명 SET 컬럼명1 = '값1' 컬렴명2= '값2' .....;
주의할점은 WHERE구문 없이 사용하면 일괄적으로 컬럼 내의 모든 값이 다 바뀝니다.
*/

UPDATE users SET pw ='pppp'; -- safety 모드 활성화로 where없이 단독사용 불가,
SET SQL_SAFE_UPDATES = 0; -- 0이면 비활성화 1로 주면 다시 safety모드 활성화
SELECT* FROM users;

-- where구문을 이용해서 pw 칼럼의 값을 모두 다르게 바꿔주세여ㅛ

UPDATE users SET pw ='1111' where user_name = '김자바';
UPDATE users SET pw ='2222' where user_name = '무당';
UPDATE users SET pw ='3333' where user_name = '구름';
UPDATE users SET pw ='4444' where user_name = '고잉메리호';
UPDATE users SET pw ='5555' where user_name = '쿼리문';
UPDATE users SET pw ='6666' where user_name = '유나니문';

SELECT* FROM users;
-- 여러분들이 원하는 로우하나 골라서 데이터 2개를 바꿔보세요
UPDATE users SET pw ='oracle', email= 'asdqwe@aasda' where user_name = '유나니문';
UPDATE users SET pw ='dpgpfkeldi', user_name= '텔레토비' where user_name = '';

/* DELETE FROM 테이블명; 을 할 경우 테이블 전체 데이터가 싹 다 날라갑니다.
DELETE구문 역시 WHERE과 조합해서 사용해야 합니다.*/

DELETE FROM users WHERE user_name="김자바";

CREATE TABLE library(
    book_name varchar(30) primary key,
	book_price int(7) not null,
    book_pub	 varchar(20) not null,
    book_writer  varchar(10) not null,
    book_page int(5) not null
    );
    
INSERT INTO library(book_name,book_price,book_pub,book_writer,book_page) VALUES
 ('열역학',35000,'바름출판사','센겔',5000); -- 위에 book_name~book_page 까지 안 넣어도 되는 구문
INSERT INTO library VALUES ('재료역학',40000,'오름출판사','마이클',400);
INSERT INTO library VALUES ('정역학','32000','내림출판사','오바마',460);
INSERT INTO library VALUES ('유체역학','60000','반올림출판사','트럼프',560);
INSERT INTO library VALUES ('동역학','24000','천국출판사','링컨',800);
INSERT INTO library VALUES ('진동역학','35000','지옥출판사','케네디',965);

SELECT * FROM library;


