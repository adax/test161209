-- begin TEST_PARAISKA
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
)^
-- end TEST_PARAISKA
-- begin TEST_PARAISKOS_PREKE
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
    PAKUOTE_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end TEST_PARAISKOS_PREKE
-- begin TEST_PAKUOTE
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
)^
-- end TEST_PAKUOTE
