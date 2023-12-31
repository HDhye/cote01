-- 코드를 입력하세요
SELECT 
HOUR, COALESCE(COUNT, 0)
FROM (SELECT
@hour := @hour + 1 AS HOUR
FROM ANIMAL_OUTS A, (SELECT @hour :=-1 FROM DUAL) NN LIMIT 24) A
LEFT JOIN (
SELECT 
HOUR(DATETIME) AS HOUR, COUNT(ANIMAL_ID) AS COUNT
    FROM ANIMAL_OUTS 
    GROUP BY HOUR) B USING(HOUR)
GROUP BY HOUR
ORDER BY 1