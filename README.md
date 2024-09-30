# Тестовое задание Library API

Разработка CRUD Web API для имитации библиотеки (создание, изменение, удаление, получение).

## Основной функционал

1. Получение списка всех книг;
2. Получение определённой книги по её Id;
3. Получение книги по её ISBN;
4. Добавление новой книги;
5. Изменение информации о существующей книге;
6. Удаление книги.

## Запуск программы

1. клонирование репозитория `git clone https://github.com/uluanaparf/testing_task.git`
2. добавление файла `application.properties` в пакет resources
3. настройка файла `application.properties`
```properties
# ===============================
# DATABASE
# ===============================
spring.application.name=library_api

spring.datasource.url = jdbc:mysql://localhost:3306/db_name
spring.datasource.username=your_username
spring.datasource.password=yourpassword

# ===============================
# JPA / HIBERNATE
# ===============================
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```
4. Запустите проект
## Используемые технологии

1. Spring, Boot, MVC
2. ORM: Hibernate, Spring Data, Jpa
3. RDBMS: MySQL
4. DTO
5. Swagger
6. Auntentification via Bearer Token

___

### Swagger UI
Для тестирования и проверки работы запросов необходимо перейти по адрессу http://localhost:8080/swagger-ui/index.html

___

### Получение токена
Для получения доступа необходимо зарегестрироваться с помощью эндпоинта API/User/register.

В тело запроса введите логин и пароль необходимом формате:
```
{
    "username": "User1",
    "password": "Userpassword"
}
```
Затем с помощью эндпоинта API/User/login получите токен введя в тело запроса свои данные:
```
{
    "username": "User1",
    "password": "Userpassword"
}
```
После получения токена его необходимо ввести в поле аунтентификации в формате 
Bearer <token>
___
