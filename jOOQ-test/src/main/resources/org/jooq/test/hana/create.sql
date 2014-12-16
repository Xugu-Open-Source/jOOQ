DROP PROCEDURE p_author_exists/
DROP PROCEDURE p_unused/
DROP PROCEDURE p_create_author/
DROP PROCEDURE p_create_author_by_name/
DROP PROCEDURE p391/
DROP FUNCTION f_one/
DROP FUNCTION f_one_two/
DROP FUNCTION f_number/
DROP FUNCTION f317/
DROP FUNCTION f_tables1/
DROP FUNCTION f_tables2/
DROP FUNCTION f_tables3/
DROP FUNCTION f_tables4/
DROP FUNCTION f_tables5/

DROP VIEW v_author/
DROP VIEW v_book/
DROP VIEW v_library/

DROP TABLE t_dates/
DROP TABLE t_arrays/
DROP TABLE t_book_to_book_store/
DROP TABLE t_book_store/
DROP TABLE t_book/
DROP TABLE t_book_details/
DROP TABLE t_author/
DROP TABLE t_language/
DROP TABLE x_test_case_2025/
DROP TABLE x_test_case_85/
DROP TABLE x_unused/
DROP TABLE t_exotic_types/
DROP TABLE t_639_numbers_table/
DROP TABLE t_725_lob_test/
DROP TABLE t_785/
DROP TABLE "T_2845_CASE_sensitivity"/
DROP TABLE t_unsigned/
DROP TABLE t_booleans/
DROP TABLE t_identity/
DROP TABLE t_identity_pk/

CREATE COLUMN TABLE t_identity_pk (
  id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1),
  val int
)
/

ALTER TABLE t_identity_pk ADD CONSTRAINT pk_t_identity_pk PRIMARY KEY (id)
/

CREATE COLUMN TABLE t_identity (
  id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1),
  val int
)
/

CREATE TABLE t_dates (
  id int,
  d date,
  t time,
  ts timestamp,
  d_int int,
  ts_bigint bigint
)
/

ALTER TABLE t_dates ADD CONSTRAINT pk_t_dates PRIMARY KEY (id)
/

CREATE TABLE t_booleans (
  id int,
  one_zero int,
  true_false_lc varchar(5),
  true_false_uc varchar(5),
  yes_no_lc varchar(3),
  yes_no_uc varchar(3),
  y_n_lc char(1),
  y_n_uc char(1),
  vc_boolean varchar(1),
  c_boolean char(1),
  n_boolean int
)
/

ALTER TABLE t_booleans ADD CONSTRAINT pk_t_booleans PRIMARY KEY (id)
/

CREATE TABLE t_unsigned (
  u_byte smallint,
  u_short int,
  u_int bigint,
  u_long decimal(20)
)
/

CREATE TABLE t_language (
  cd CHAR(2) NOT NULL,
  description VARCHAR(50),
  description_english VARCHAR(50),
  id INTEGER NOT NULL
)
/

ALTER TABLE t_language ADD CONSTRAINT pk_t_language PRIMARY KEY (ID)
/

CREATE TABLE t_725_lob_test (
  ID int NOT NULL,
  LOB BLOB NULL
)
/

ALTER TABLE t_725_lob_test ADD CONSTRAINT pk_t_725_lob_test PRIMARY KEY (id)
/

CREATE TABLE t_785 (
  ID int,
  NAME varchar(50),
  VALUE varchar(50)
)
/

CREATE TABLE "T_2845_CASE_sensitivity" ( 
  id int,
  
  insensitive int,
  "UPPER" int,
  "lower" int,
  "Mixed" int
)
/

ALTER TABLE "T_2845_CASE_sensitivity" ADD CONSTRAINT pk_t_2845_case_sensitivity PRIMARY KEY (id)
/

CREATE TABLE t_author (
  ID INT,
  FIRST_NAME VARCHAR(50),
  LAST_NAME VARCHAR(50) NOT NULL,
  DATE_OF_BIRTH DATE,
  YEAR_OF_BIRTH INT,
  ADDRESS VARCHAR(50)
)
/

ALTER TABLE t_author ADD CONSTRAINT pk_t_author PRIMARY KEY (id)
/

CREATE TABLE t_book_details (
  ID INT
)
/

ALTER TABLE t_book_details ADD CONSTRAINT pk_t_book_details PRIMARY KEY (id)
/

CREATE TABLE t_book (
  ID INT,
  AUTHOR_ID INT NOT NULL,
  co_author_id int,
  DETAILS_ID INT,
  TITLE VARCHAR(400) NOT NULL,
  PUBLISHED_IN INT NOT NULL,
  LANGUAGE_ID INT NOT NULL DEFAULT 1,
  CONTENT_TEXT CLOB,
  CONTENT_PDF BLOB
)
/

ALTER TABLE t_book ADD CONSTRAINT pk_t_book PRIMARY KEY (id)
/
ALTER TABLE t_book ADD CONSTRAINT fk_t_book_author_id FOREIGN KEY (AUTHOR_ID) REFERENCES T_AUTHOR(ID)
/
ALTER TABLE t_book ADD CONSTRAINT fk_t_book_co_author_id FOREIGN KEY (CO_AUTHOR_ID) REFERENCES T_AUTHOR(ID)
/
ALTER TABLE t_book ADD CONSTRAINT fk_t_book_details_id FOREIGN KEY (DETAILS_ID) REFERENCES T_BOOK_DETAILS(ID)
/
ALTER TABLE t_book ADD CONSTRAINT fk_t_book_language_id FOREIGN KEY (LANGUAGE_ID) REFERENCES T_LANGUAGE(ID)
/

CREATE TABLE t_book_store (
  name VARCHAR(400) NOT NULL
)
/

ALTER TABLE t_book_store ADD CONSTRAINT uk_t_book_store_name PRIMARY KEY (name)
/

CREATE TABLE t_book_to_book_store (
  book_store_name VARCHAR(400) NOT NULL,
  book_id INTEGER NOT NULL,
  stock INTEGER
)
/

ALTER TABLE t_book_to_book_store ADD CONSTRAINT pk_b2bs PRIMARY KEY (book_store_name, book_id)
/

ALTER TABLE t_book_to_book_store ADD CONSTRAINT fk_b2bs_bs_name 
  FOREIGN KEY (book_store_name)
  REFERENCES t_book_store (name)
  ON DELETE CASCADE
/
ALTER TABLE t_book_to_book_store ADD CONSTRAINT fk_b2bs_b_id
  FOREIGN KEY (book_id)
  REFERENCES t_book (id)
  ON DELETE CASCADE
/


CREATE COLUMN TABLE t_arrays (
  id integer not null,
  string_array VARCHAR(20) ARRAY,
  number_array INTEGER ARRAY,
  date_array DATE ARRAY
)
/


ALTER TABLE t_arrays ADD CONSTRAINT pk_t_arrays PRIMARY KEY (ID)
/

CREATE TABLE x_unused (
  ID INT NOT NULL,
  NAME VARCHAR(10) NOT NULL,
  BIG_INTEGER DECIMAL(25),
  ID_REF INT,
  CLASS INT,
  FIELDS INT,
  CONFIGURATION INT,
  U_D_T INT,
  META_DATA INT,
  TYPE0 INT,
  PRIMARY_KEY INT,
  PRIMARYKEY INT,
  NAME_REF VARCHAR(10),
  "FIELD 737" DECIMAL(25, 2),
  CONNECTION INT,
  PREPARED_STATEMENT INT
)
/

ALTER TABLE x_unused ADD CONSTRAINT pk_x_unused PRIMARY KEY (ID, NAME)
/
ALTER TABLE x_unused ADD CONSTRAINT uk_x_unused_id UNIQUE(ID)
/

CREATE TABLE t_exotic_types (
  ID INT NOT NULL,
  UU CHAR(36)
)
/
  
ALTER TABLE t_exotic_types ADD CONSTRAINT pk_t_exotic_types PRIMARY KEY(ID)
/

CREATE TABLE t_639_numbers_table (
  ID INT NOT NULL,
  BYTE TINYINT,
  SHORT SMALLINT,
  INTEGER INT,
  LONG BIGINT,
  BYTE_DECIMAL DECIMAL(2, 0),
  SHORT_DECIMAL DECIMAL(4, 0),
  INTEGER_DECIMAL DECIMAL(9, 0),
  LONG_DECIMAL DECIMAL(18, 0),
  BIG_INTEGER DECIMAL(22, 0),
  BIG_DECIMAL DECIMAL(22, 5),
  FLOAT REAL,
  DOUBLE DOUBLE
)
/

ALTER TABLE t_639_numbers_table ADD CONSTRAINT pk_t_639_numbers_table PRIMARY KEY (ID)
/

CREATE TABLE x_test_case_85 (
  id int NOT NULL,
  x_unused_id int,
  x_unused_name VARCHAR(10)
)
/

ALTER TABLE x_test_case_85 ADD CONSTRAINT pk_x_test_case_85 PRIMARY KEY (ID)
/
ALTER TABLE x_test_case_85 ADD CONSTRAINT fk_x_test_case_85 FOREIGN KEY(x_unused_id, x_unused_name) REFERENCES X_UNUSED(id, name)
/

CREATE TABLE x_test_case_2025 (
  ref_id int NOT NULL,
  ref_name VARCHAR(10) NOT NULL
)
/

ALTER TABLE x_test_case_2025 ADD CONSTRAINT fk_x_test_case_2025_1 FOREIGN KEY(ref_id) REFERENCES x_test_case_85(ID)
/
ALTER TABLE x_test_case_2025 ADD CONSTRAINT fk_x_test_case_2025_3 FOREIGN KEY(ref_id, ref_name) REFERENCES X_UNUSED(id, name)
/

CREATE VIEW V_LIBRARY (AUTHOR, TITLE) AS
SELECT T_AUTHOR.FIRST_NAME || ' ' || T_AUTHOR.LAST_NAME, T_BOOK.TITLE
FROM T_AUTHOR JOIN T_BOOK ON T_BOOK.AUTHOR_ID = T_AUTHOR.ID
/

CREATE VIEW v_author AS
SELECT * FROM t_author
/

CREATE VIEW v_book AS
SELECT * FROM t_book
/

CREATE FUNCTION f_one ()
RETURNS p_result INT
LANGUAGE SQLSCRIPT
READS SQL DATA
AS
BEGIN
  p_result := 1;
END
/

CREATE FUNCTION f_one_two ()
RETURNS p_result1 INT, p_result2 INT
LANGUAGE SQLSCRIPT
READS SQL DATA
AS
BEGIN
  p_result1 := 1;
  p_result2 := 2;
END
/

CREATE FUNCTION f_number (n integer)
RETURNS p_result INT
LANGUAGE SQLSCRIPT
READS SQL DATA
AS
BEGIN
  p_result := n;
END
/

CREATE FUNCTION f317 (p1 INT, p2 INT, p3 INT, p4 INT)
RETURNS p_result INT
LANGUAGE SQLSCRIPT
READS SQL DATA
AS
BEGIN
  p_result := 1000 * p1 + 100 * p2 + p4;
END
/

CREATE PROCEDURE p_author_exists (IN author_name VARCHAR(50), OUT result INT)
LANGUAGE SQLSCRIPT
READS SQL DATA
AS
BEGIN 
  SELECT COUNT(*) INTO result
    FROM t_author
   WHERE first_name LIKE author_name
      OR last_name LIKE author_name;
END
/

CREATE PROCEDURE p_create_author_by_name (IN first_name VARCHAR(50), IN last_name VARCHAR(50))
LANGUAGE SQLSCRIPT
AS
BEGIN
    INSERT INTO T_AUTHOR (ID, FIRST_NAME, LAST_NAME)
    VALUES ((SELECT MAX(ID)+1 FROM T_AUTHOR), first_name, last_name);
END
/

CREATE PROCEDURE p_create_author()
LANGUAGE SQLSCRIPT
AS
BEGIN
    call p_create_author_by_name('William', 'Shakespeare');
END
/

CREATE PROCEDURE p_unused (IN in1 VARCHAR(50), OUT out1 INT, INOUT out2 INT)
LANGUAGE SQLSCRIPT
READS SQL DATA
AS
BEGIN
    out1 := 0;
    out2 := 0;
END
/


CREATE PROCEDURE p391 (
    i1 INTEGER, INOUT io1 INTEGER, OUT o1 INTEGER,
    OUT o2 INTEGER, INOUT io2 INTEGER, i2 INTEGER)
LANGUAGE SQLSCRIPT
READS SQL DATA
AS
BEGIN
  o1 := io1;
  io1 := i1;

  o2 := io2;
  io2 := i2;
END
/



CREATE FUNCTION f_tables1
RETURNS TABLE (
    column_value INTEGER
)
LANGUAGE SQLSCRIPT
AS
BEGIN
    RETURN SELECT 1 column_value FROM SYS.DUMMY;
END
/

CREATE FUNCTION f_tables2
RETURNS TABLE (
    column_value BIGINT
)
LANGUAGE SQLSCRIPT
AS
BEGIN
    RETURN SELECT 1 column_value FROM SYS.DUMMY;
END
/

CREATE FUNCTION f_tables3
RETURNS TABLE (
    column_value VARCHAR(1)
)
LANGUAGE SQLSCRIPT
AS
BEGIN
    RETURN SELECT '1' column_value FROM SYS.DUMMY;
END
/

CREATE FUNCTION f_tables4 (in_id INTEGER)
RETURNS TABLE (
    id INTEGER,
    title VARCHAR(400)
)
LANGUAGE SQLSCRIPT
AS
BEGIN
    RETURN SELECT b.id, b.title
    FROM t_book b
    WHERE in_id IS NULL OR b.id = in_id
    ORDER BY b.id;
END
/

CREATE FUNCTION f_tables5 (v1 INTEGER, v2 INTEGER, v3 INTEGER)
RETURNS TABLE (
    v INTEGER,
    s INTEGER
)
LANGUAGE SQLSCRIPT
AS
BEGIN
    RETURN 
    SELECT :v1 v, :v1 s FROM SYS.DUMMY
    UNION ALL
    SELECT :v1 v, :v1 + :v2 s FROM SYS.DUMMY
    UNION ALL
    SELECT :v1 v, :v1 + :v2 + :v3 s FROM SYS.DUMMY;
END
/
