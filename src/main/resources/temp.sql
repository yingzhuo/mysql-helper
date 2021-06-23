SELECT t.TABLE_SCHEMA AS 'database',
       t.TABLE_NAME   AS 'table',
       t.ENGINE       AS `engine`
FROM information_schema.`TABLES` AS t
WHERE t.TABLE_SCHEMA NOT IN ('sys', 'information_schema', 'performance_schema', 'mysql')
  AND t.ENGINE = 'InnoDB'