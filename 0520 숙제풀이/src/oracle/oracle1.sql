

create sequence seq_user_info;
create sequence seq_user_atk_info;

drop table user_info;

create table user_info(
	idx		number,
	name	varchar2(10),
	age		number
);

create table user_atk_info(
	idx			number,
	user_idx	number,
	atk			number
)

insert into user_info (idx, name, age) values (?, ?, ?);

select idx, name, age from user_info;
select idx, user_idx, atk from user_atk_info;

update user_info set name = 'park' where idx = 1;

delete from user_info where idx = 2;

insert into user_info (idx, name, age) values (seq_user_info.nextVal, 'kum', 31);

insert into user_atk_info (idx, user_idx, atk) values (seq_user_atk_info.nextVal, 8, 90 );


select 
	ui.idx,
	ui.name,
	uai.atk
from user_info ui
join user_atk_info uai
on ui.idx = uai.user_idx
where uai.atk <= 60;





