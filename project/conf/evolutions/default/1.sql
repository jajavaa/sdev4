# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigint auto_increment not null,
  line_one                      varchar(255),
  line_two                      varchar(255),
  city                          varchar(255),
  county                        varchar(255),
  code                          varchar(255),
  country                       varchar(255),
  constraint pk_address primary key (id)
);

create table department (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  constraint pk_department primary key (id)
);

create table employee (
  email                         varchar(255) not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  salary                        varchar(255),
  dob                           timestamp,
  phone                         varchar(255),
  address_id                    bigint,
  department_id                 bigint,
  constraint uq_employee_address_id unique (address_id),
  constraint pk_employee primary key (email)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  started                       timestamp,
  deadline                      timestamp,
  constraint pk_project primary key (id)
);

alter table employee add constraint fk_employee_address_id foreign key (address_id) references address (id) on delete restrict on update restrict;

alter table employee add constraint fk_employee_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_employee_department_id on employee (department_id);


# --- !Downs

alter table employee drop constraint if exists fk_employee_address_id;

alter table employee drop constraint if exists fk_employee_department_id;
drop index if exists ix_employee_department_id;

drop table if exists address;

drop table if exists department;

drop table if exists employee;

drop table if exists project;

