use sakila;
select * from actor where first_name like 'Scarlett';
select * from actor where last_name like 'Johansson';
select   last_name from actor;
select count(distinct last_name) as "total last name" from actor;
select last_name from actor group by last_update last_name having count(last_name)=1;
select * from actor;
select last_name from actor group by last_name having count(last_name)>1;
select first_name from staff;
select * from film;
select * from category;
desc category;
select * from film_category;
select avg(length) from film;

select avg(length),name from film, film_category f , category c where film.film_id=f.film_id and f.category_id=c.category_id
group by name; 
select return_date,title from film f, rental r, inventory i where r.inventory_id=i.inventory_id 
and f.film_id = i.film_id and title="Academy Dinosaur";
select * from film natural join inventory;