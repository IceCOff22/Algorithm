SELECT name, count(name) as "COUNT"
from animal_ins
group by name
having count(name) >= 2
order by name