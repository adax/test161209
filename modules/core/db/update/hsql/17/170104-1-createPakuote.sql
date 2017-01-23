create table TEST_PAKUOTE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    KODAS integer not null,
    PAVADINIMAS varchar(255) not null,
    --
    primary key (ID)
);
