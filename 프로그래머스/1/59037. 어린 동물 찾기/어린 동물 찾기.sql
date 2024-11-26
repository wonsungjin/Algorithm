-- 코드를 입력하세요
SELECT Animal_id, Name
from animal_ins
where intake_condition != 'Aged'
order by animal_id;