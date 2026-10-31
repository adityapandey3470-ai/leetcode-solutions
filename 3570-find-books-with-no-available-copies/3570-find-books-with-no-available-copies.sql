# Write your MySQL query statement below
 select l.book_id, l.title, l.author, l.genre,
 l.publication_year, count(b.book_id) as current_borrowers 
 from library_books l
 left join borrowing_records b
 on l.book_id = b.book_id
 and b.return_date is null
 group by b.book_id, l.title, l.author, l.genre, l.publication_year, l.total_copies
 having l.total_copies - current_borrowers = 0
 order by current_borrowers desc, l.title asc;