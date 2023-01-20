SELECT artist, count(song) FROM song GROUP BY artist;
--SELECT (album) AVG(song) FROM song GROUP BY artist ORDER BY artist COUNT(song); 
--COUNT(song)




/**
         * Problem 1: Use the GROUP BY clause with the COUNT() aggregate function to query the song table for the
         * number of songs by each artist. Your SQL query should select both the artist column and the COUNT(song)
         * columns, while also leveraging the group by clause.
         *
         * HINT: You should avoid using the wild card (*) in your statement. All projected columns must either be used
         * in the GROUP BY clause or an aggregate function.

         SELECT manager, AVG(salary)
 *      FROM employees
 *      GROUP BY manager
 *      ORDER BY AVG(salary) DESC
         */