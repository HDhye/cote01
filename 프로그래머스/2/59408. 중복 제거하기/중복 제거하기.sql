-- 코드를 입력하세요
SELECT
    COUNT(NAME)
FROM (
    SELECT 
        NAME 
    FROM 
        ANIMAL_INS 
    WHERE 
        NAME IS NOT NULL 
    GROUP BY 
        NAME
) AS A;
