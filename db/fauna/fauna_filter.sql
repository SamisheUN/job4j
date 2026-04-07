-- Извлечение данных, у которых имя name содержит подстроку fish
SELECT * FROM fauna WHERE name LIKE '%fish%';
-- Извлечение данных, у которых средняя продолжительность жизни находится в диапазоне 10 000 и 21 000
SELECT * FROM fauna WHERE avg_age < 20000 AND avg_age > 10000;
-- Извлечение данных, у которых дата открытия не известна (null)
SELECT * FROM fauna WHERE discovery_date IS NULL;
-- Извлечение данных видов, у которых дата открытия раньше 1950 года
SELECT * FROM fauna WHERE EXTRACT(YEAR FROM discovery_date) < 1950;
