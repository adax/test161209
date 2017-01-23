-- alter table TEST_PARAISKOS_PREKE add column PAKUOTE_ID varchar(36) ^
-- update TEST_PARAISKOS_PREKE set PAKUOTE_ID = <default_value> ;
-- alter table TEST_PARAISKOS_PREKE alter column PAKUOTE_ID set not null ;
alter table TEST_PARAISKOS_PREKE add column PAKUOTE_ID varchar(36) not null ;
