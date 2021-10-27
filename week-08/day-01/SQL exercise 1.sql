select 
	reviewer.name,
    movie.title,
    rating.stars
from
	reviewer,
    movie,
    rating
where
	reviewer.rID = rating.rID
and
	rating.mID = movie.mID
group by 
	reviewer.name,
    movie.title
having 
	count(reviewer.name) = 2
and
	sum(rating.stars) - rating.stars < rating.stars;