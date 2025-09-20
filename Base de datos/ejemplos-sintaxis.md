-- <-- aquí se inicia un comentario.

-- seleccionar todas las columnas
select * from Customers;  -- buenas practicas from Customers, Orders,Shippings;
 
-- seleccionar columna especifica
select first_name, last_name from Customers;
 
-- seleccionar con alias
select first_name as apodo, last_name as apellido from Customers;

-- selecionar con distintos
select DISTINCT country from Customers;

-- seleccionar con un límite de 3, el límite es la cantidad de registros, no el ID del registro como tal.
select * from Orders LIMIT 3;

-- 



ejercicios en grupo:
1. Devuelve clientes cuya edad esté entre 25 y 35 años (incluyendo 25 y 35).
SELECT * 
FROM Customers 
WHERE age BETWEEN 25 AND 35;

2. Filtrar por múltiples valores específicos con IN
SELECT * 
FROM Orders 
WHERE item IN ('Keyboard', 'Mousepad');

3. Combina múltiples condiciones con AND. Solo devuelve registros que cumplan AMBAS condiciones: edad mayor a 25 Y país igual a 'USA'.
SELECT * FROM Customers 
WHERE age > 25 
AND country = 'USA';

4. Encuentra nombres que empiecen con 'J'.
SELECT * FROM Customers
WHERE first_name LIKE 'J%';

5. Ordena por una columna calculada (año de nacimiento aproximado). Se puede ordenar por expresiones matemáticas o funciones.
SELECT first_name, age, (2025 - age) as year_birth
FROM Customers 
order by year_birth 
asc;

6. Cuenta el número de filas en cada grupo. Muestra cuántos clientes hay por país
SELECT COUNT(*) FROM Customers
SELECT country, COUNT(*) FROM Customers GROUP BY country;

7. Combina múltiples funciones de agregación en una sola consulta: cuenta clientes, calcula promedio, mínimo y máximo de edad por país.




------

* Primero se filtra, luego se agrupa: uso de WHERE Y GROUP BY
* Se puede usar WHERE, GROUP BY y HAVING siempre y cuando sea en ese orden.
* 

-- 1. Solo WHERE (filtra filas antes de agrupar)
-- Queremos ver el gasto total de los clientes, pero solo considerando pedidos mayores de 300:
SELECT customer_id, SUM(amount) AS total_spent
FROM Orders
WHERE amount > 300
GROUP BY customer_id;
/*
Primero filtramos las filas de Orders para quedarnos solo con pedidos > 300, y luego sumamos por customer_id.
Por ejemplo, el pedido de Mouse (300) no se incluiría porque no es mayor de 300.
*/
 
-- 2. Solo HAVING (filtra grupos después de agrupar)
-- Queremos ver clientes cuyo gasto total (suma de todos sus pedidos) sea mayor de 500, sin filtrar pedidos individuales:
SELECT customer_id, SUM(amount) AS total_spent
FROM Orders
GROUP BY customer_id
HAVING SUM(amount) > 500;
/*
Primero agrupamos todos los pedidos de cada cliente, luego filtramos para dejar solo los clientes que gastaron más de 500 en total.
*/
-- 3. Mixto (WHERE + HAVING)
-- Queremos ver clientes con pedidos individuales > 300, y que su gasto total supere 500:
SELECT customer_id, SUM(amount) AS total_spent
FROM Orders
WHERE amount > 300
GROUP BY customer_id
HAVING SUM(amount) > 500;
/*
- WHERE amount > 300 elimina pedidos pequeños antes de agrupar.
- Luego HAVING SUM(amount) > 500 deja solo los clientes que suman más de 500 con los pedidos filtrados.
*/
 
/*
Diferencia clave con WHERE:
- WHERE filtra antes de agrupar (filtra filas).
- HAVING filtra después de agrupar (filtra grupos resultantes)
 
*/

------


-- 1. INNER JOIN
SELECT 
    c.customer_id,    -- ID del cliente desde tabla Customers (alias 'c')
    c.first_name,     -- Nombre desde tabla Customers
    c.last_name,      -- Apellido desde tabla Customers
    o.item,           -- Producto desde tabla Orders (alias 'o')
    o.amount          -- Precio desde tabla Orders
FROM Customers c      -- Tabla principal: Customers con alias 'c'
INNER JOIN Orders o   -- UNO con tabla Orders (alias 'o')
ON c.customer_id = o.customer_id;  -- CONDICIÓN: c.customer_id = o.customer_id


