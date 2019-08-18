DELETE FROM user where id = -1;
INSERT INTO user (id, first_name, last_name, username, password) VALUES (-1, "Dima", "Myroniuk", "test@test.com", "$2a$10$CYWMwktm2a0RrLvcKT.xCerQPtJ40h.Hemkm0rHyRqJMMzxpS/yU.");

DELETE FROM authority where id in (-1, -2);
INSERT INTO authority (id, name) VALUES (-1, "ROLE_ADMIN");
INSERT INTO authority (id, name) VALUES (-2, "ROLE_USER");

INSERT INTO user_authority (user_id, authority_id) VALUES (-1, -1);