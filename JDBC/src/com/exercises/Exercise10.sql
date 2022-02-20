Select orders.ord_no, customer.cust_name
from customer, orders
where customer.customer_id = orders.customer_id