CREATE TABLE roles (
    id   SERIAL PRIMARY KEY,
    name TEXT NOT NULL UNIQUE
);

CREATE TABLE rules (
    id   SERIAL PRIMARY KEY,
    name TEXT NOT NULL UNIQUE
);

CREATE TABLE role_rules (
    role_id INT REFERENCES roles(id),
    rule_id INT REFERENCES rules(id),
    PRIMARY KEY (role_id, rule_id)
);

CREATE TABLE users (
    id      SERIAL PRIMARY KEY,
    name    TEXT NOT NULL,
    role_id INT NOT NULL REFERENCES roles(id)
);

CREATE TABLE states (
    id   SERIAL PRIMARY KEY,
    name TEXT NOT NULL UNIQUE
);

CREATE TABLE categories (
    id   SERIAL PRIMARY KEY,
    name TEXT NOT NULL UNIQUE
);

CREATE TABLE items (
    id          SERIAL PRIMARY KEY,
    name        TEXT NOT NULL,
    user_id     INT NOT NULL REFERENCES users(id),
    category_id INT REFERENCES categories(id),
    state_id    INT REFERENCES states(id)
);

CREATE TABLE comments (
    id      SERIAL PRIMARY KEY,
    item_id INT NOT NULL REFERENCES items(id),
    comment TEXT NOT NULL
);

CREATE TABLE attachments (
    id        SERIAL PRIMARY KEY,
    item_id   INT NOT NULL REFERENCES items(id),
    name      TEXT NOT NULL,
    file_path TEXT NOT NULL
);