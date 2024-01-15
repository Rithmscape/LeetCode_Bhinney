select c.car_id
from car_rental_company_car as c
left join car_rental_company_rental_history as h
on c.car_id = h.car_id
where c.car_type = "세단" and date_format(h.start_date, "%m") = "10"
group by car_id
order by car_id desc