create table cls_knife
(
    id          bigint                                  not null
        primary key,
    name        text      default ''::character varying not null,
    code        text      default ''::character varying not null,
    is_deleted  boolean   default false                 not null,
    time_create timestamp default CURRENT_TIMESTAMP
);

alter table cls_knife
    owner to postgres;


create sequence if not exists cls_knife_id_seq;

alter sequence cls_knife_id_seq owner to postgres;

alter sequence cls_knife_id_seq owned by cls_knife.id;
