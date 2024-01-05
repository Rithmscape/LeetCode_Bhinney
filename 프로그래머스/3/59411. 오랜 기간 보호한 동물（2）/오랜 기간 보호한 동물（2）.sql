select i.animal_id, i.name
from animal_ins as i, animal_outs as o
where i.animal_id = o.animal_id
order by o.datetime - i.datetime desc
limit 2