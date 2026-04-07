-- Начальные данные
-- Права (rules)
INSERT INTO rules (name) VALUES ('право руководить');
INSERT INTO rules (name) VALUES ('право копать');
INSERT INTO rules (name) VALUES ('право просматривать все заявки');

-- Роли
INSERT INTO roles (name) VALUES ('инженер');
INSERT INTO roles (name) VALUES ('копатель');

-- Связь ролей и прав
INSERT INTO role_rules (role_id, rule_id) VALUES (1, 1);
INSERT INTO role_rules (role_id, rule_id) VALUES (1, 3);
INSERT INTO role_rules (role_id, rule_id) VALUES (2, 2);

-- Состояния заявок
INSERT INTO states (name) VALUES ('получена');
INSERT INTO states (name) VALUES ('в работе');
INSERT INTO states (name) VALUES ('выполнена');

-- Категории заявок
INSERT INTO categories (name) VALUES ('важная');
INSERT INTO categories (name) VALUES ('обычная');
INSERT INTO categories (name) VALUES ('срочная');

-- Начальные данные есть, остальное на всякий случай
-- Пользователи
INSERT INTO users (name, role_id) VALUES ('Алексей Иванов', 1);
INSERT INTO users (name, role_id) VALUES ('Иван Сидоров', 2);

-- Заявки
INSERT INTO items (name, user_id, category_id, state_id) 
VALUES ('Починить сервер в кабинете 404', 1, 1, 1);

INSERT INTO items (name, user_id, category_id, state_id) 
VALUES ('Выкопать яму возле склада', 2, 2, 1);