-- 코드를 입력하세요
SELECT I.ANIMAL_ID ANIMAL_ID,I.ANIMAL_TYPE ANIMAL_TYPE,I.NAME NAME 
FROM ANIMAL_INS I , ANIMAL_OUTS O
WHERE I.ANIMAL_ID = O.ANIMAL_ID
AND I.SEX_UPON_INTAKE <> O.SEX_UPON_OUTCOME