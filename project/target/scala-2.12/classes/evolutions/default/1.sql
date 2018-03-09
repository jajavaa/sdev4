# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigint auto_increment not null,
  line_one                      varchar(255) not null,
  line_two                      varchar(255) not null,
  city                          varchar(255) not null,
  county                        varchar(255) not null,
  code                          varchar(255) not null,
  country                       varchar(255) not null,
  constraint pk_address primary key (id)
);

create table department (
  id                            varchar(255) not null,
  title                         varchar(255) not null,
  constraint pk_department primary key (id)
);

create table project (
  id                            varchar(255) not null,
  name                          varchar(255) not null,
  start                         timestamp not null,
  end                           timestamp not null,
  constraint uq_project_name unique (name),
  constraint pk_project primary key (id)
);

create table project_user (
  project_id                    varchar(255) not null,
  user_id                       varchar(255) not null,
  constraint pk_project_user primary key (project_id,user_id)
);

create table user (
  role                          varchar(255) not null,
  id                            varchar(255) not null,
  first_name                    varchar(255) not null,
  last_name                     varchar(255) not null,
  password                      varchar(255) not null,
  email                         varchar(255) not null,
  phone                         varchar(255) not null,
  address_id                    bigint,
  department_id                 varchar(255),
  constraint uq_user_email unique (email),
  constraint uq_user_address_id unique (address_id),
  constraint pk_user primary key (id)
);

alter table project_user add constraint fk_project_user_project foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_project_user_project on project_user (project_id);

alter table project_user add constraint fk_project_user_user foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_project_user_user on project_user (user_id);

alter table user add constraint fk_user_address_id foreign key (address_id) references address (id) on delete restrict on update restrict;

alter table user add constraint fk_user_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_user_department_id on user (department_id);


# --- !Downs

alter table project_user drop constraint if exists fk_project_user_project;
drop index if exists ix_project_user_project;

alter table project_user drop constraint if exists fk_project_user_user;
drop index if exists ix_project_user_user;

alter table user drop constraint if exists fk_user_address_id;

alter table user drop constraint if exists fk_user_department_id;
drop index if exists ix_user_department_id;

drop table if exists address;

drop table if exists department;

drop table if exists project;

drop table if exists project_user;

drop table if exists user;

