-- 코드를 입력하세요
SELECT FLAVOR
FROM (
    SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL_ORDER FROM (
        SELECT
        FLAVOR
        ,TOTAL_ORDER
        FROM FIRST_HALF
        UNION ALL
        SELECT
        FLAVOR
        ,SUM(TOTAL_ORDER)
        FROM JULY GROUP BY FLAVOR
        ) B GROUP BY FLAVOR
    ) A 
ORDER BY TOTAL_ORDER DESC LIMIT 3