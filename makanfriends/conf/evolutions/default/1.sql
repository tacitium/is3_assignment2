# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table makan_user (
  nric                      varchar(255) not null,
  name                      varchar(255),
  constraint pk_makan_user primary key (nric))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table makan_user;

SET FOREIGN_KEY_CHECKS=1;

