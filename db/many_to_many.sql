CREATE TABLE cars(
id SERIAL PRIMARY KEY,
model_name TEXT,
);
 
CREATE TABLE configs(
id SERIAL PRIMARY KEY,
name TEXT
);
 
CREATE TABLE cars_configs(
id SERIAL PRIMARY KEY,
 config_id INT REFERENCES configs(id),
 car_id INT REFERENCES cars(id),
);