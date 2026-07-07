# API REST - Soporte Técnico

## Descripción

Este proyecto consiste en una API REST desarrollada con Java y Spring Boot 3 para gestionar solicitudes de soporte técnico.

La aplicación permite registrar, consultar, actualizar y eliminar solicitudes, clientes y técnicos utilizando listas en memoria, sin necesidad de una base de datos.

---

## Tecnologías utilizadas

- Java 21
- Spring Boot 3
- Maven
- Swagger OpenAPI
- Postman
- GitHub

---

## Estructura del proyecto

```
src
 ├── controller
 ├── exception
 ├── model
 ├── service
 └── resources
```

---

## Funcionalidades

- Registrar clientes
- Consultar clientes
- Actualizar clientes
- Eliminar clientes

- Registrar técnicos
- Consultar técnicos
- Actualizar técnicos
- Eliminar técnicos

- Registrar solicitudes
- Consultar solicitudes
- Actualizar solicitudes
- Eliminar solicitudes

---

## Ejecutar el proyecto

Abrir la carpeta del proyecto y ejecutar:

```bash
.\mvnw spring-boot:run
```

La aplicación iniciará en:

```
http://localhost:8080
```

---

## Documentación Swagger

```
http://localhost:8080/swagger-ui/index.html
```

---

## Autor

Proyecto desarrollado como evaluación parcial del curso Desarrollo de Componentes del Negocio.