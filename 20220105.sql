use ict_pratice;
use ict_pratice;

SELECT * FROM testtbl;

-- 지금 tsettbl 같은 경우 id를 수동으로 입력해주고 있습니다
-- 이 경우 매번 id값을 사용자가 계산해서 insert해야하기 때문에
-- 굉장히 불편한데 auto_increment 속성을 칼럼에 걸어주면
-- 데이터를 입력받지 못한다면 컴퓨터가 순차적으로 컬럼에 중복되지 않고
-- 증가하는 숫자를 자동 입력해줍니다.

CREATE TABLE testtbl2(

id int AUTO_INCREMENT PRIMARY KEY,
user_name varchar(3),
age int
);

-- id칼럼에는 auto_incremnt가 붙어있으므로 null로 처리해도 
-- 자동ㅇ로 1부터 1씩 증가함니다

INSERT INTO testtbl2 VALUES(null,'앒파카',4);
INSERT INTO testtbl2 VALUES(null,'에뮤',2);
INSERT INTO testtbl2 VALUES(null,'토끼',1);

-- 현재 3개의 데이터가 들어갔으므로 AUTO_INCREMENT의 다음 값은 4 입니다.
SELECT * FROM testtbl2;
-- 만약에 사용자가 임의로 값을 바꾸고 싶으면 ALTER TABLE를 이용해
-- AUTO_INCREMENT의 값을 수정할 수도 있습니다.

ALTER TABLE testtbl2 AUTO_INCREMENT= 1000;
-- 다음부터 값이 1000으로 바뀌게됨
INSERT INTO testtbl2 VALUES(null,'반달곰',10);
INSERT INTO testtbl2 VALUES(null,'산양',3);
INSERT INTO testtbl2 VALUES(null,'코끼리',4);
INSERT INTO testtbl2 VALUES(null,'사슴',6);



-- CMD(커맨드라인)에서 testtbl2 칼럼에 데이터를 3개 더 입력해주세요
-- 커맨드라인에서 조회까지 마쳐주세요

SELECT * FROM testtbl2;
-- 데이터 추가 확인

-- AUTO_INCREMENT는 기본적으로 1씩 증가하는데
-- 이 증가분을 수정하고 싶다면 서버측 변수인
-- @@auto_increment_increment를 바꿔야 합니다.
-- testtbl2와 모든 조건이 같고 이름만 testtbl3인 테이블을 하나 더 만들어주세요

CREATE TABLE testtbl3(
 id int AUTO_INCREMENT PRIMARY KEY,
 user_name varchar(3),
 age int
 );
 
 -- testtbl3의 초기 AUTO_INCREMENT값을 1500으로 고쳐보세요
 
 ALTER TABLE testtbl3 AUTO_INCREMENT = 1500; 
 -- 증가분을 1이 아닌 3으로 세팅하는법
 SET @@AUTO_INCREMENT_INCREMENT = 3;
 -- 동물 3마리를 testtbl3에 추가해주세요.
 
INSERT INTO testtbl3 VALUES(null,'다람쥐',1);
INSERT INTO testtbl3 VALUES(null,'코뿔소',2);
INSERT INTO testtbl3 VALUES(null,'버팔로',4);

SELECT * FROM testtbl2;
INSERT INTO testtbl2 VALUES(null,'청룡',22);
INSERT INTO testtbl2 VALUES(null,'백호',44);


 SET @@AUTO_INCREMENT_INCREMENT = 1;

-- 하나의 INSERT INTO구문으로 여러 row를 추가할때는 
-- VALUES 뒤쪽을 연달아 작성합니다.

INSERT INTO testtbl2 VALUES (null,'말',4),(null,'오리',3),(null,'닭',2);	

-- UPDATE 구문은 기존에 입력되어 있는 값을 변경할때 사용합니다.
-- WHERE 조건절을 걸지 않는다면, 칼럼 하나의 값을 전부 바꿉니다.
-- 따라서 일반적으로는 무조건 조건절과 조합해서 사용합니다.
-- UPDATE 테이블명 SET 칼럼1 = 바꿀값1, 칼럼2 = 바꿀값2...;

-- testtbl2와 user_name을 전부 '소'로 바꾸는 구문
UPDATE testtbl2 SET user_name = '말';
SELECT * FROM testtbl2;
-- 워크벤치에서 되지않지만 cmd에서는 사용할수있는 구문
-- 워크벤치 => 사용자가 실수로 모든값을 초기화하는 큰 실수를 할까봐 
-- 안전모드를 사용해 못하도록 막아놈
-- cmd에서는 안전모드 기능이 없으므로 바로 업데이트 가능

-- 워크벤치에서도 where절 없이 수정하고 싶으면 safe_update모드를 해체해야 합니다

SET SQL_SAFE_UPDATES = 0;

-- 특정 나이대의 user_name을 여러분들이 좋아하는 동물로 교체해주세요.
-- WHERE을 이용해 age를 필터링해주세요.
-- 하나의 나이대만 우선 고쳐주세요.
SELECT * FROM testtbl2;

UPDATE  testtbl2  SET user_name = '기린' WHERE id =2 ;
UPDATE  testtbl2  SET age = 6 WHERE id =2 ;
UPDATE  testtbl2  SET user_name = '코끼리' WHERE age between 5 and 6 ;
UPDATE  testtbl2  SET age = age/2;
-- 다시 원래 나이로 돌려보세요

-- DELETE FROM 구문은 데이터를 삭제하는 구문입니다.
-- SELECT는 특정한 컬럼들만 조회하거나, 전체를 모두 조회하는 등의
-- 경우의 수가 있었기 때문에 SELECT와 FROM 사이에 구체적인 컬럼명이나
-- 혹은 *을 붙여서 전체 칼럼을 조회했습니다.
-- DELETE 특징 컬럼만 삭제하는 경우가 없고 삭제할거면 전체 row를 삭제하거나
-- 삭제를 안 해 버리거나 이기 때문에
-- DELETE와 FROM 사이에 아무것도 적지 않습니다.
-- DELETE 역시 일반적으로 WHERE절과 함께 사용합니다.
-- WHERE 없이 사용시 해당 테이블의 전체 데이터를 다 삭제합니다.
-- ID 1에 해당하는 데이터만 삭제해보세요(WHERE)사용

DELETE FROM testtbl2 WHERE id =  1;
SELECT * FROM testtbl2;

-- limit을 사용하면 상위 n개만 삭제할수도 이ㅣㅆ습니다.
-- 검색 결과물 중 상위 2개만 삭제

DELETE FROM testtbl2 limit 2;

-- WHERE절 없이 삭제하면 테이블 내의 전체 데이터 삭제

DELETE FROM testtbl2;

-- DELETE FROM은 삭제할 때 시간이 조금 더 오래 걸리는 편인데 이유는
-- 트랜잭션 로그라는것을 한 로우마다 작성하기 때문입니다.
-- 다라서 속도를 끌어올리고 싶다면 TRUNCATE를 DELETE FROM 대신 쓰는 경우도 있습니다.

TRUNCATE TABLE testtbl2;

-- TRUNCATE와 DELETE FROM의 속도차이를 체험해보기 위해서
-- employees 테이블의 자료를 복사해보겠습니다.

CREATE TABLE testtbl4(
    id int,
    first_name varchar(50),
    last_name varchar(50)
    );
    
    INSERT INTO testtbl4 (SELECT emp_no, first_name, last_name FROM employees.employees);

  SELECT*FROM testtbl4;
  TRUNCATE TABLE testtbl4;
  
  -- CMD에서 DELETE FROM으로 삭제 후 소요시간을 적어주세요. 2.98sec
  -- CMD에서 TRUNCATE를 이용해 삭제 후 소요시간을 적어주세요 0.05sec 
  -- TRUNCATE는 데이터 삭제속도가 빠르지만 복구가 어렵다는 단점이 있다.
  
  
  -- DELETE -> 1.접속(30만번) 2.삭제(30만번) 3.접속해제(30만번) -> 총 30만 X 3 연산을 함. 접속과 접속해제에 리소스를 많이 잡게됨
  -- TRUNCATE 1.접속 2.삭제(30만번) 3. 접속해제 

  
-- 조건부로 데이터 입력하기
-- 예를 들어 100개의 데이터를 입력하려고 하는데 첫 번째 자료만
-- 기존 데이터의 ID와 중복되는 값이 있고, 이후 99건은 pk가 중복되지 않는다고 해도
-- SQL 시스템 상 전체 데이터가 입력되지 않는 문제가 발생합니다.
-- 따라서 이 때 중복되는 데이터 1건은 중복된다면 무시하고
-- 이 후 나머지 99개 데이터는 중단 없이 정상적으로 입력하도록 만들 수 있습니다.

CREATE TABLE membertbl(
 user_id VARCHAR(6) PRIMARY KEY,
 user_name VARCHAR(3) NOT NULL,
 addr VARCHAR(3) NOT NULL
);

-- MYSQL은 구문을 통째로 묶어서 실행할 경우 모두 실행하거나 모두 실행하지 않습니다.
INSERT INTO membertbl VALUES ('LSH','이상혁','서울');
INSERT INTO membertbl VALUES ('HS','허수','울산');
INSERT INTO membertbl VALUES ('JJH','정지훈','인천');

-- 추가 데이터를 입력하되 한 건은 중복, 두 건은 중복 없도록 세팅
INSERT IGNORE INTO membertbl VALUES ('LSH','이상혁','서울');
INSERT IGNORE INTO membertbl VALUES ('KHK','김혁규','경기');
INSERT IGNORE INTO membertbl VALUES ('PDH','박도현','충청');
-- IGNORE는 기존 데이터를 유지하고 신규데이터를 막는구문이었는데
-- 이미 존재하는 데이터가 있어도 신규데이터로 경신해서 넣고샆운 경우
SELECT * FROM membertbl;

-- 만약 primary key가 겹치면 무시하고 그렇지 않으면 입력해주는 코드로 변환
-- INSERT와 INTO 사이에 IGNORE

INSERT IGNORE INTO membertbl VALUES ('LSH','이성혁','제주');
-- ON DUPLICATE KEY UPDATE 구문을 쓰면 됩니다.
INSERT INTO membertbl VALUES ('LHR','이효리','제주')
         ON DUPLICATE KEY UPDATE user_name = '이효리',  addr ='제주';

SELECT * FROM membertbl;

-- ON DUPLICATE KEY UPDATE는 자료가 없으면 INSERT INTO에 적힌대로 데이터를 넣고
-- 자료가 겹치는 상황인 경우에 ON DUPLICATE KEY UPDATE를 실행하는 구문이기 때문에
-- 만약 데이터가 겹치지 않아도 잘 작동합니다
-- 기존 테이블 요소와 겹치지 않는것을 넣어서 잘 돌아가는지 CMD를 이용해 실행한 후 확인해주세요.


-- [사용자 관리하기]
-- 현재 root계정은 모든 권한(수정,삭제,조회,변경,계정생성 등)
-- 을 가지고 있는 계정입니다.
-- 그렇지만 모든 사람이 모든 건한을 가지는 일은 그만큼 DB접근이 용이해져 위험을 내포하고 있으며
-- 작년 초에도 유명게임사에서 DB를 날려먹는 사건이 발생할 만큼
-- 일정 규모 이상의 개발사에서는 직급이나 권한별로 DB계정을 나눠서 관리합니다
-- 이제 ROOT가 아닌 사용자를 만들고, 그 사용자에 대해서
-- 권한부여를 하는방법과 권한 개념에 대해 알아보겠습니다.

-- WORKBENCH에서 계정생성 및 권한부여하기
-- 1.좌측의 NAVIGATOR에서 ADMINISTRATION 탭을 클릭 합니다.
-- 2. Users and Privileges를 클릭합니다.
-- 3. 열리는 화면에서 좌하단 Add Account를 클릭한 다음
--    Login name, password 등을 입력합니다.
-- 4. 우하단 apply를 누르면 계정생성이 완료됩니다.
-- 5. Account Limit는 시간당 기능 사용 가능 횟수를 설정합니다.
-- 6. Administrative Roles는 어떤 구문 실행까지 허용할지입니다.

-- CMD 환경에서 생성하는 경우는
-- CREATE USER 계정명@'%' IDENTIFIED BY '비밀번호';
-- GRANT ALL on *.* TO 계정명@'%' WITH GRANT OPTTION;
-- 위 두 줄을 이용해서 생성할수도 있습니다.
-- ict2 계정은 CMD환경에서 만들어주세요. 비밀번호는 ictICT03 입니다.


-- 계정 접속 방법
-- 커맨드라인 접속시 mysql -u 계정명 -p로 연결가능alter
-- 접속 후 show databases; 를 이용해 DB목록 확인가능
-- use mysql;
-- SELECT user, host FROM user; 를 할 경우 생성된 계정목록 조회가능
show databases; --  DB목록조회

-- icttest 계정을 만들어주세요. 권한은 따로주지마세요.

-- 계정 권한주기
-- GRANT 권한1, 권한2 .. ON DB명.테이블명 TO 아이디@'%';
-- ict_pratice 데이터베이스의 testtbl3 테이블에 대한 SELECT,DELETE 권한을

-- WORKBENCH에서 계정 권한주기
-- NAVIGATOR하단 Administration에서 유저 선택 후 Administrative Roles에서 주고싶은 
-- 권한과 명령어를 선택할수 있습니다.

-- cmd에서 icttest계정을 하나 새로 만들어주세여ㅕ
-- GRANT SELECT, DELETE ON ict_pratice.testtbl3 to icttest @'%';
-- GRANT 권한1,권한2... ON 디비명.테이블명 TO 계정명@'%';

