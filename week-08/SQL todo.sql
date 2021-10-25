CREATE table Todo(
id integer auto_increment, task text, completed boolean, primary key(id));

insert into Todo (task, completed) values("complete exercise", false);
insert into Todo (task, completed) values("have lunch", true);  
