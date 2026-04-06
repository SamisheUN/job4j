CREATE TABLE engineers ( id SERIAL PRIMARY KEY, name TEXT, hire_date DATE, grade CHAR(1), clothes_size INT );
INSERT INTO engineers (name, hire_date, grade, clothes_size) VALUES ('Max', '1999-01-01', 'A', 99);
UPDATE engineers SET name = 'Maxim Andreevich 'WHERE id = 1;
DELETE FROM engineers;