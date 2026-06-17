Una ruta que se parece mucho a cómo se desarrolla un proyecto real en una empresa, pero simplificada para un portafolio.

Tecnologías que usaría hoy (2026)

Lenguaje

Java 21 (LTS) 


Framework

Spring Boot 4.0.x (versión estable actual) 


Build Tool

Maven 3.9.x

Spring Boot requiere Maven 3.6.3 o superior 


Base de datos

PostgreSQL 17


ORM

Spring Data JPA

Hibernate (incluido por Spring Boot)


Seguridad

Spring Security

JWT


Migraciones de BD

Flyway


Documentación API

OpenAPI / Swagger


Testing

JUnit 5

Mockito


Contenedores

Docker Engine 28.x (o la última estable disponible)


Cloud

AWS EC2

AWS RDS PostgreSQL

AWS IAM


CI/CD

GitHub Actions


IDE

STS4 o IntelliJ IDEA Community



---

Fase 0 — Git

Antes de programar.

Aprende:

git init

git add

git commit

git push

git branch


Objetivo:

Tener tu repositorio:

spring-order-management

en GitHub.


---

Fase 1 — API básica

Tecnologías

Java 21

Spring Boot

Maven


Objetivo:

Crear una API que arranque.

Endpoints:

GET /products
POST /products
PUT /products/{id}
DELETE /products/{id}

Sin base de datos todavía.

Solo memoria.

Lo importante:

Controllers

Services

DTOs



---

Fase 2 — Persistencia

Agregar

PostgreSQL

Spring Data JPA


Objetivo:

Guardar productos en BD.

Aprender:

Entity

Repository

Relaciones


Por ejemplo:

User
Order
Product


---

Fase 3 — Modelo de negocio

Ahora sí construir el sistema.

Entidades:

User
Role
Product
Order
OrderItem

Relaciones:

User 1 -> N Order

Order 1 -> N OrderItem

Product 1 -> N OrderItem

Esto te enseña diseño de backend real.


---

Fase 4 — Seguridad

Agregar:

Spring Security

JWT


Objetivo:

Usuario

Puede:

consultar productos

crear órdenes


Admin

Puede:

crear productos

editar productos

eliminar productos


Aprenderás:

Authentication

Authorization

Roles



---

Fase 5 — Migraciones

Agregar:

Flyway


Objetivo:

No crear tablas manualmente.

Crear scripts:

V1__create_user.sql

V2__create_product.sql

V3__create_order.sql

Así trabajan muchas empresas.


---

Fase 6 — Testing

Agregar:

JUnit 5

Mockito


Objetivo:

Cubrir:

Services

Controllers


No necesitas 100%.

Con 15-20 pruebas buenas es suficiente.


---

Fase 7 — Documentación

Agregar:

OpenAPI / Swagger


Objetivo:

Entrar a:

/swagger-ui

y probar toda tu API.

Esto le encanta a los reclutadores.


---

Fase 8 — Docker

Ahora containerizas.

Crear:

Dockerfile

y

docker-compose.yml

Servicios:

aplicación Spring Boot

PostgreSQL


Objetivo:

Levantar todo con:

docker compose up


---

Fase 9 — AWS

Ahora despliegas.

EC2

Servidor Linux.

Dentro:

Docker
Docker Compose

Subes tu proyecto.

Ejecutas:

docker compose up -d

Ya estará en Internet.


---

Fase 10 — AWS profesional

Separar componentes.

EC2

Solo aplicación.

RDS PostgreSQL

Solo base de datos.

Arquitectura:

Internet
   |
EC2
(Spring Boot)
   |
RDS
(PostgreSQL)

Esto ya parece una arquitectura empresarial pequeña.


---

Fase 11 — CI/CD

Agregar:

GitHub Actions


Flujo:

git push

↓

Github Actions

↓

mvn test

↓

build

↓

deploy

Cada push despliega automáticamente.


---

Resultado final

El proyecto demostrará:

✅ Java 21

✅ Spring Boot

✅ REST APIs

✅ PostgreSQL

✅ JPA/Hibernate

✅ Spring Security

✅ JWT

✅ Flyway

✅ JUnit

✅ Mockito

✅ Swagger

✅ Git

✅ Docker

✅ AWS EC2

✅ AWS RDS

✅ GitHub Actions

Y lo más importante: todo estará conectado en un solo proyecto real.
