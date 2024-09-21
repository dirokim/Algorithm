-- 코드를 입력하세요
SELECT B.CATEGORY CATEGORY,
       SUM(K.SALES) TOTAL_SALES
FROM BOOK B,
BOOK_SALES K
WHERE TO_CHAR(K.SALES_DATE,'YYYY-MM') = '2022-01'
AND B.BOOK_ID = K.BOOK_ID
GROUP BY B.CATEGORY
ORDER BY B.CATEGORY