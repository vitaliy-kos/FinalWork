## Удаление всех верблюдов из таблицы
DELETE FROM camels;
 
## Объединение таблицы лошадей и ослов в одну таблицу.
CREATE TABLE pack_animals AS (
    SELECT  *
    FROM horses 

    UNION 
    
    SELECT  *
    FROM donkeys
);