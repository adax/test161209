create table TEST_PARAISKOS_PREKE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PARAISKA_ID varchar(36) not null,
    PREKE varchar(255) not null,
    KIEKIS decimal(19, 3) not null,
    --
    primary key (ID)
);
