SELECT * FROM character ORDER BY last_name ASC, first_name ASC;

--SELECT * FROM employee WHERE current = true ORDER BY last_name ASC, first_name ASC;   

--SELECT * FROM employee WHERE current = true ORDER BY salary DESC
--SELECT * FROM table_name ORDER BY column1 [, column2, column3, etc...] [ASC|DESC]
--Problem 1: Write a statement below to query the database for all characters. Make sure the results are in
--         * ascending order by last name, and first name as a tie-breaker.