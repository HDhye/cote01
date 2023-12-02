-- MYSQL

-- P59410
SELECT
       ANIMAL_TYPE
     , COALESCE(NAME, 'No name') AS NAME
     , SEX_UPON_INTAKE
  FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

-- P131528 나이 정보가 없는 회원 수 구하기
--USER_INFO 테이블에서 나이 정보가 없는 회원이 몇 명인지 출력하는 SQL문을 작성해주세요. 이때 컬럼명은 USERS로 지정해주세요.
SELECT COUNT(USER_ID) AS USERS FROM USER_INFO WHERE AGE IS NULL;
