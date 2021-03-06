DROP TABLE Board

CREATE TABLE Board
(
    no           INT              NOT NULL, 
    id           VARCHAR2(20)     NOT NULL, 
    title        VARCHAR2(100)    NULL, 
    content      CLOB             NULL, 
    writeDate    DATE             NULL, 
    viewCnt      INT              NULL, 
    CONSTRAINT BOARD_PK PRIMARY KEY (id)
)

CREATE SEQUENCE Board_SEQ
START WITH 1
INCREMENT BY 1;