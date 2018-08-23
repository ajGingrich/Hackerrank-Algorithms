-- Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.

select distinct CITY from STATION where CITY REGEXP '[a|e|i|o|u]$'
