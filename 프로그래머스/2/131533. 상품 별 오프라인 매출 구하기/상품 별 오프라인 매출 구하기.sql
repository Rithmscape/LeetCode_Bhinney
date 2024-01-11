select p.product_code, sum(os.sales_amount * p.price) as sales
from product as p
join offline_sale as os
on os.product_id = p.product_id
group by p.product_code
order by sales desc, product_code asc