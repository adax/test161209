create table TEST_PARAISKA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PAR_DATA timestamp not null,
    PAR_NR integer,
    BUSENA integer not null,
    BUSENOS_DATA timestamp not null,
    PASTABA varchar(255),
    KLAIDOS_PRANESIMAS varchar(255),
    --
    primary key (ID)
);
