CREATE TABLE user (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  first_name varchar(255) NOT NULL,
  last_name varchar(255) DEFAULT NULL,
  username varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY USERNAME_UNIQUE (username)
);

CREATE TABLE authority (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE user_authority (
  user_id bigint(20) NOT NULL,
  authority_id bigint(20) NOT NULL,
  CONSTRAINT user_authority_pk PRIMARY KEY (user_id, authority_id),
  CONSTRAINT FK_user FOREIGN KEY (user_id) REFERENCES user (id),
  CONSTRAINT FK_authority FOREIGN KEY (authority_id) REFERENCES authority (id)
);