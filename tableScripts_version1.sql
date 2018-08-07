Begin Transaction


create table ADDRESS
(
  ID          int auto_increment
    primary key,
  STREET_NUM  int         not null,
  STREET_NAME varchar(50) not null,
  CITY        varchar(25) not null,
  ZIPCODE     int         not null,
  STATE       varchar(25) not null,
  COUNTRY     varchar(25) not null,
  constraint ADDRESS_ID_uindex
  unique (ID)
);

create table CAR
(
  ID        int auto_increment
    primary key,
  MAKE      varchar(50) null,
  MODEL     varchar(50) null,
  YEAR_MAKE varchar(50) null
);

create table LOOKUP
(
  ID          int auto_increment
    primary key,
  LOOKUP_TYPE varchar(50)  null,
  LOOKUP_DESC varchar(100) null,
  constraint LOOKUP_ID_uindex
  unique (ID)
);

create table REQUEST
(
  ID              int auto_increment
    primary key,
  REQUESTER_ID    int  null
  comment 'The User that requested this ride',
  RIDE_ID         int  null,
  ENROUTE_ADDR    int  null,
  CREATED_ON      date null,
  REQUEST__STATUS int  null,
  constraint REQUEST_ID_uindex
  unique (ID),
  constraint REQUEST_User_USER_ID_fk
  foreign key (ID) references ellenmacarpool.User (user_id),
  constraint REQUEST_RIDE_RIDE_ID_fk
  foreign key (RIDE_ID) references ellenmacarpool.TRIP (TRIP_ID),
  constraint REQUEST_ADDRESS_ID_fk
  foreign key (ENROUTE_ADDR) references ellenmacarpool.ADDRESS (id),
  constraint REQUEST_LOOKUP_ID_fk
  foreign key (REQUEST__STATUS) references ellenmacarpool.LOOKUP (id)
);

create index REQUEST_ADDRESS_ID_fk
  on REQUEST (ENROUTE_ADDR);

create index REQUEST_LOOKUP_ID_fk
  on REQUEST (REQUEST__STATUS);

create index REQUEST_RIDE_RIDE_ID_fk
  on REQUEST (RIDE_ID);

create table RIDE
(
  RIDE_ID         int auto_increment
    primary key,
  USER_CAR_ID     int  null
  comment 'driver of the car',
  CREATED_ON      date null,
  SEATS_OFFERED   int  null
  comment 'how many seats is available on this ride',
  RIDE_DEST_ADDR  int  null
  comment 'the address that the ride will end at',
  RIDE_START_ADDR int  null
  comment 'The address that the ride starts from',
  RIDE_START_TIME date null,
  constraint RIDE_RIDE_ID_uindex
  unique (RIDE_ID),
  constraint RIDE_User_USER_ID_fk
  foreign key (USER_CAR_ID) references ellenmacarpool.User (user_id),
  constraint RIDE_ADDRESS_ID_fk_2
  foreign key (RIDE_DEST_ADDR) references ellenmacarpool.ADDRESS (id),
  constraint RIDE_ADDRESS_ID_fk
  foreign key (RIDE_START_ADDR) references ellenmacarpool.ADDRESS (id)
);

create index RIDE_ADDRESS_ID_fk
  on RIDE (RIDE_START_ADDR);

create index RIDE_ADDRESS_ID_fk_2
  on RIDE (RIDE_DEST_ADDR);

create index RIDE_User_USER_ID_fk
  on RIDE (USER_CAR_ID);

create table User
(
  USER_ID        int auto_increment
    primary key,
  FIRST_NAME     varchar(50)            null,
  LAST_NAME      varchar(50)            null,
  USER_NAME      varchar(50)            not null,
  USER_PASSWORD  varchar(50)            not null,
  EMAIL          varchar(42)            null,
  PHONE_NO       varchar(10)            null,
  IS_DRIVER_FLAG varchar(1) default '0' null,
  DRIVING_LN     varchar(50)            null,
  constraint User_USER_ID_uindex
  unique (USER_ID)
);

commit;