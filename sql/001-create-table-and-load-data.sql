DROP TABLE IF EXISTS countries;
CREATE TABLE countries (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  PRIMARY KEY(id)
);
INSERT INTO countries (name) VALUES ('America');
INSERT INTO countries (name) VALUES ('Canada');
INSERT INTO countries (name) VALUES ('Mexico');
INSERT INTO countries (name) VALUES ('China');
INSERT INTO countries (name) VALUES ('Korea');
INSERT INTO countries (name) VALUES ('Africa');
