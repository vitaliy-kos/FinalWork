## Создание таблицы, в которой все животные.
CREATE TABLE all_animals AS (
        SELECT *, 'cats' AS from_table
        FROM cats
        UNION 
        SELECT *, 'dogs' AS from_table
        FROM dogs 
        UNION
        SELECT *, 'hamsters' AS from_table
        FROM hamsters
        UNION
        SELECT *, 'horses' AS from_table
        FROM horses
        UNION
        SELECT *, 'camels' AS from_table
        FROM camels
        UNION
        SELECT *, 'donkeys' AS from_table
        FROM donkeys;
);

## Создание таблицы, в которой все животные от 1 до 3 лет.

SELECT name,
       commands,
       birthday,
       TIMESTAMPDIFF(MONTH, birthday, NOW()) AS age
FROM all_animals
WHERE age BETWEEN 12 AND 36;

## Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

SELECT *
FROM all_animals;