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
  id                            bigint auto_increment not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  email                         varchar(255),
  phone                         varchar(255),
  address_id                    bigint,
  department_id                 bigint,
  constraint uq_employee_address_id unique (address_id),
  constraint pk_employee primary key (id)
);

create table employee_project (
  employee_id                   bigint not null,
  project_id                    bigint not null,
  constraint pk_employee_project primary key (employee_id,project_id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  start                         timestamp,
  end                           timestamp,
  constraint pk_project primary key (id)
);

create table project_employee (
  project_id                    bigint not null,
  employee_id                   bigint not null,
  constraint pk_project_employee primary key (project_id,employee_id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table employee add constraint fk_employee_address_id foreign key (address_id) references address (id) on delete restrict on update restrict;

alter table employee add constraint fk_employee_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_employee_department_id on employee (department_id);

alter table employee_project add constraint fk_employee_project_employee foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_employee_project_employee on employee_project (employee_id);

alter table employee_project add constraint fk_employee_project_project foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_employee_project_project on employee_project (project_id);

alter table project_employee add constraint fk_project_employee_project foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_project_employee_project on project_employee (project_id);

alter table project_employee add constraint fk_project_employee_employee foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_project_employee_employee on project_employee (employee_id);


# --- !Downs

alter table employee drop constraint if exists fk_employee_address_id;

alter table employee drop constraint if exists fk_employee_department_id;
drop index if exists ix_employee_department_id;

alter table employee_project drop constraint if exists fk_employee_project_employee;
drop index if exists ix_employee_project_employee;

alter table employee_project drop constraint if exists fk_employee_project_project;
drop index if exists ix_employee_project_project;

alter table project_employee drop constraint if exists fk_project_employee_project;
drop index if exists ix_project_employee_project;

alter table project_employee drop constraint if exists fk_project_employee_employee;
drop index if exists ix_project_employee_employee;

drop table if exists address;

drop table if exists department;

drop table if exists employee;

drop table if exists employee_project;

drop table if exists project;

drop table if exists project_employee;

drop table if exists user;

