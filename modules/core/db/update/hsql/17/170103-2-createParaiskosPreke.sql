alter table TEST_PARAISKOS_PREKE add constraint FK_TEST_PARAISKOS_PREKE_PARAISKA foreign key (PARAISKA_ID) references TEST_PARAISKA(ID);
create index IDX_TEST_PARAISKOS_PREKE_PARAISKA on TEST_PARAISKOS_PREKE (PARAISKA_ID);