# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table makan_user (
  nric                      varchar(255) not null,
  name                      varchar(255),
  constraint pk_makan_user primary key (nric))
;

create table restaurant (
  rest_id                   integer auto_increment not null,
  name                      varchar(255),
  address                   varchar(255),
  postal_code               integer,
  phone                     integer,
  lat                       double,
  lng                       double,
  constraint pk_restaurant primary key (rest_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table makan_user;

drop table restaurant;

SET FOREIGN_KEY_CHECKS=1;

