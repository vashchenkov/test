# Задание

### Этап 1
Написать Rest-endpoint для сохранения информации о пользователе
(Полное имя, адрес электронной почты, имя для входа). Если поля
"адрес электронной почты" и/или "имя для входа" уже заняты, то необходимо вернуть ошибку с перечислением занятых полей.

### Этап 2
Изменить написанный ранее endpoint. Добавить параметр "заменить". Если этот параметр установлен в true, то необходимо перезаписать запись с такими же полями
"адрес электронной почты" и/или "имя для входа". Если данные поля заняты у разных пользователей, выдать ошибку, что операция не возможна.