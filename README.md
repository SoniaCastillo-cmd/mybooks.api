# MyBooks API - v1.0

Sistema de biblioteca personal desarrollado con Spring Boot que demuestra una arquitectura MVC completa con persistencia de datos.

## Funcionalidades principales
- Base de datos H2 en memoria para almacenar libros
- Búsqueda por título (sin distinción de mayúsculas)
- Interfaz moderna con Thymeleaf y CSS3
- Alertas visuales para errores

## Tecnologías
- **Backend:** Java & Spring Boot
- **Base de datos:** Spring Data JPA & H2
- **Frontend:** Thymeleaf, HTML5, CSS3
- **Logs:** SLF4J

## Acceso a la base de datos
1. Inicia la aplicación
2. Ve a `http://localhost:8082/h2`
3. Usa la URL: `jdbc:h2:mem:test`