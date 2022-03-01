create sequence if not exists player_seq start 1 increment 1;

create table if not exists players (
    id bigint primary key default nextval('player_seq'),
    name varchar not null
);