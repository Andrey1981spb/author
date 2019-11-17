DROP TABLE IF EXISTS simple_int_column_part;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE simple_int_column_part
(
    id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    number           INTEGER         NOT NULL,
    value1           INTEGER,
    value2           INTEGER
);


