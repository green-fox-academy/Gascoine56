-- select title from movie where director = 'Steven Spielberg';

-- select distinct year from movie, rating where movie.mID = rating.mID and rating.stars > 3 order by year asc;

-- select title from movie where movie.mID not in (select mID from rating);

-- select name from reviewer, rating where reviewer.rID = rating.rID and ratingDate is null;

-- select name, title, stars, ratingDate from movie, rating, reviewer where reviewer.rID = rating.rID and rating.mID = movie.mID order by name, title, stars;

select 