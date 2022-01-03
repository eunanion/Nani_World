-- ict_practice를 쓰도록 해 주세요.
use ict_pratice;

-- 앞에 스키마명을 추가로 입력해 스키마명.테이블명 으로 조회도 가능함.
SELECT * FROM ict_pratice.usertbl;

-- 유저를 두 명만 더 추가해주세요.
-- 정보는 전부 여러분들이 알아서 집어넣어주시되, 키는 한 명은 160대로 해주세요.
INSERT INTO userTbl VALUES ('KDH', '씨맥', 1990, '서울', '01010101010', 169, '2021-05-03');
INSERT INTO userTbl VALUES ('LSH', '페이커', 1996, '경기', '01021212121', 186, '2021-06-30');
INSERT INTO userTbl VALUES ('SHM', '손흥민', 1992, '울산', '01021214121', 175, '2021-08-21');
INSERT INTO userTbl VALUES ('ESP', '에스파', 1995, '전주', '01021213121', 174, '2020-06-30');
INSERT INTO userTbl VALUES ('PJM', '박지민', 1999, '부산', '01021215121', 169, '2020-03-30');
INSERT INTO userTbl VALUES ('LDH', '이대호', 1984, '대구', '01021217121', 171, '2021-09-18');
INSERT INTO userTbl VALUES ('PHR', '표학렬', 1984, '부산', '01021217123', 168, '2021-03-18');
INSERT INTO userTbl VALUES ('GJC', '구자철', 1994, '제주', '01021217124', 177, '2020-04-18');
INSERT INTO userTbl VALUES ('KSY', '기성용', 1991, '대전', '01021217125', 183, '2021-09-18');
INSERT INTO userTbl VALUES ('KJV', '김자바', 1983, '서울', '01112341234', 171, '2020-08-15');
INSERT INTO userTbl VALUES ('ADR', '압둘라', 1995, '경기', '01012341234', 183, '2021-04-01');
INSERT INTO userTbl VALUES ('YSO', '야스오', 2001, '부산', '01043214321', 165, '2021-10-08');
INSERT INTO userTbl VALUES ('ZYA', '장위안', 1985, '부산', '01155555555', 164, '2020-02-28');
INSERT INTO userTbl VALUES ('SPR', '스프링', 1987, '강원', '01066666666', 184, '2021-12-31');
INSERT INTO userTbl VALUES ('JSP', '쟈스피', 1989, '전라', '01077777777', 177, '2022-01-01');
-- 새로 추가한 2명의 구매내역을 추가해주세요.
-- 2명 구매내역 합산 3개를 추가해주세요.
INSERT INTO buytbl VALUES (null, 'KDH', '방송용캠', '전자기기', 60000, 1);
INSERT INTO buyTbl (user_id, prod_name, group_name, price, amount)
	 VALUES ('LSH', '게임용마우스', '전자기기', 200000, 1);
INSERT INTO buytbl VALUES (null, 'LSH', '롤 스킨', '기타', 10000, 1);
SELECT * FROM buytbl;
SELECT * FROM usertbl;

-- 여태까지의 SELECT 구문은 조건 없이 모든 데이터를 다 조회했습니다.
-- 극단적인 경우 employees 테이블의 모든 row를 조회하다보니
-- 조회시간이 굉장히 오래 잡히는 케이스가 발생했습니다.
-- 따라서 조건에 맞도록 필터링을 할 수 있고, 이를 위해 사용하는 구문은 WHERE 구문입니다.
-- SELECT 컬럼명1, 컬럼명2 ... FROM 테이블명 WHERE 컬럼명=조건식;

-- 아래는 이름이 손흥민인 사람만 조회하는 구문입니다.
SELECT * FROM userTbl WHERE user_name = '손흥민';

-- 서울에 사는 사람만 조회해보세요.
SELECT * FROM usertbl WHERE addr = '서울';



-- 관계연산자를 이용해서 대소비교를 하거나
-- and, or을 이용해 조건 여러개를 연결할 수 있습니다.
-- 키 180이상인 사람만 조회해주세요.
SELECT * FROM usertbl WHERE height >= 180;

-- AND를 이용해 91 ~ 99년생까지만 조회하는 구문을 만들어보세요.
-- hint : 91보다는 크거나 같고, "그리고", 99보다는 작거나 같다
SELECT * FROM usertbl WHERE (1991 <= birthyear) AND (birthyear <= 1999);
SELECT * FROM usertbl WHERE birthyear BETWEEN 1991 AND 1999;


-- 위와 같이 숫자는 연속된 범위를 갖기 때문에 범위연산자로 처리가 가능하지만
-- addr같은 자료는 서울이 크다던가 영국이 작다던가하는 연산적 처리가 불가능합니다.
-- 먼저 지역이 서울이거나 혹은 화성인 사람의 정보를 WHERE절로 조회해주세요.

SELECT * FROM usertbl WHERE addr = "화성" OR addr = "서울";

-- in키워드를 사용하면 컬럼명 in(데이터 1,2,3,4...);
-- 특정 컬럼에 괄호에 담긴 데이터가 포함되는 경우를 전부 출력합니다
-- 경기 , 화성 , 영국에 있는 사람들만 in키워드로 조회해주세요.

SELECT * FROM usertbl WHERE addr IN ('화성','서울','런던');

-- like 연산자는 일종의 표현 양식을 만들어 줍니다.
-- like 연산자를 이용하면 %라고 불리는 와일드 카드나 혹은 _라고 불리는 
-- 와일드 카드 문자를 이용해 매칭되는 문자나 문자열을 찾습니다.

-- 채씨를 찾는 케이스(%는 몇글자가 오더라도 상관 없음)
-- 아래 구문은 채로 시작하는 모든 요소를 다 가져옵니다.
 
SELECT * FROM usertbl WHERE user_name like '%머%';
SELECT * FROM usertbl WHERE phone_number like '011%';

-- 두 글자만 찾는 케이스(_는 하나에 한 글자)

SELECT * FROM usertbl WHERE user_name like '___';
-- 언더바를 3개 - > 3글자 이름 추출 


-- user_id가 3글자이면서 H으로 끝나는 사람만 조회해보세요.

SELECT * FROM usertbl WHERE user_id like '__H';

-- 서브쿼리(하위쿼리)란 1차적 결과를 얻어놓고, 
-- 거기서 다시 조회구문을 중심해서 날리는것을 의미합니다.
-- 채종훈보다 키가 큰 사람을 조회하는 메시를 보겠습니다.

-- 원시적인 방법
-- 1. 채종훈의 키를 WHERE절을 이용해 확인한다.

SELECT height FROM usertbl where user_name = '채종훈'; 

-- 2. 확인한 채종훈의 키를 쿼리문에 넣는다.
-- 175보다 큰 사람의 이름과 키만 조회해보겠습니다

SELECT user_name, height FROM usertbl where height > 175;


-- 손흥민의 키를 조회하고 그 값을 눈으로 확인하고 구문을 만들어야 하기 때문에 불편함


-- 서브쿼리 활용 방법
-- 서브쿼리는 FROM절 다음에 ()를 이용해서
-- SELECT 구문을 한 번 더 활용합니다.

SELECT user_name, height FROM usertbl WHERE height >  
(SELECT height FROM usertbl where user_name = '채종훈');

-- 서브쿼리를 활용해 '페이커' 보다 먼저 태어난 사람들만 골라보세요

SELECT user_name,birthyear FROM usertbl WHERE birthyear < 
 (SELECT birthyear FROM usertbl where user_name = '페이커');
 
 
 -- 최대값은 max()로 구합니다.
 -- 현재 user_tbl 컬럼에서 나이가 적은 사람
 
 SELECT max(birthyear)  FROM usertbl;
 
 
 -- 2021년 가입자 중 키가 생년이 제일 빠른 사람보다 키가 큰 사람을 조회해주세요.
-- 날짜도 부등호로 조회 가능합니다
SELECT * FROM usertbl;
-- SELECT max(height) FROM usertbl WHERE
SELECT user_name FROM usertbl WHERE height < (SELECT height FROM usertbl WHERE birthyear = (SELECT max(birthyear) FROM usertbl WHERE reg_date LIKE '2021%'));

SELECT user_name from usertbl WHERE height > (SELECT min(height) FROM usertbl WHERE user_id like '%M%');


--  2021년 가입자 중 가입일이 가장 느린 사람보다 키가 큰 사람을 조회해주세요
-- 날짜도 부등호로 조회 가능합니다( 작다 : 이전날짜 크다: 이후날짜)
SELECT * FROM usertbl WHERE height  > (SELECT height FROM usertbl WHERE reg_date = 
  (SELECT min(reg_date) FROM usertbl WHERE reg_date like '2021%'));
  
-- ANY, ALL , SOME 구문은 서브쿼리와 조합해서 사용합니다.
-- 지역이 서울인 사람보다 키가 작은 사람을 찾는 쿼리문
-- 1.서울사람의 키 전체 리스트 가져오기
SELECT height FROM usertbl WHERE addr = '서울' ;
-- 위 구문을 서브쿼리로 해서 서울사람보다 키가 작은사람을 
-- 2. 해당 코드는 괄호안 데이터의 기준이 명확하지 않아 생기는 에러코드 입니다.
SELECT * FROM usertbl where height < (SELECT height FROM usertbl WHERE addr = '서울' );
-- any 구문을 사용하면 모든 데이터에 대하여 or로 처리가 됩니다
-- 개별값 모두에 대해 or처리가 붙고 그래서 아래와 같이 
-- (height < 169 )OR  (height < 171 ) OR (height <186)
-- 3개 조건이 or로 연결됩니다.
-- 186 보다 작은걸로 다 잡힌다. (3개 중 하나만 만족해야하니까)
-- ANY는 OR로 연결된다는 특성상 범위는 가장 넓은 조건 하나로 통일됩니다.

SELECT * FROM usertbl where height < ANY(SELECT height FROM usertbl WHERE addr = '서울' );
SELECT * FROM usertbl where height < SOME(SELECT height FROM usertbl WHERE addr = '서울' );
-- ANY와 SOME은 기능적으로 같다.

-- ALL 구문을 사용하면 169, 171, 186 모든 데이터에 대해 AND로 처리됩니다.
-- 개별값 모두에 대해 ANDㅊ처리가 붙고 그래서 아래와 같이
-- <<조건식을 직접 작성해주세요>>
-- 3개 조건이 AND로 연결됩니다.
-- <<현재 코드에서 몇 보다 작은 숫자가 다 잡혀나오는지 적어주세요>>

SELECT * FROM usertbl where height < ALL (SELECT height FROM usertbl WHERE addr = '서울' );
