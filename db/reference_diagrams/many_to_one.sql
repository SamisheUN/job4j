CREATE TABLE cars(
    id           SERIAL PRIMARY KEY,
    model_name   TEXT,
    fuel_type_id INT REFERENCES fuel_types(id)
);

CREATE TABLE fuel_types(
    id         SERIAL PRIMARY KEY,
    fuel_type  TEXT
);