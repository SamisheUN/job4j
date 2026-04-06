CREATE TABLE cars(
id SERIAL PRIMARY KEY,
model_name TEXT,
document_id INT UNIQUE REFERENCES documents(id) 
);
 
CREATE TABLE documents(
id SERIAL PRIMARY KEY,
name TEXT
);