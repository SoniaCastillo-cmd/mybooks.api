MyBooks API - v1.0

Este es un sistema de gestión de biblioteca personal desarrollado con **Spring Boot**. Es un proyecto profesional que demuestra la implementación de una arquitectura MVC completa y persistencia de datos real.

##  Características de la Versión 1.0
* **Persistencia con H2:** Los libros se almacenan en una base de datos SQL en memoria.
* **Buscador Dinámico:** Filtro de búsqueda por título con manejo de mayúsculas/minúsculas.
* **UI Moderna:** Interfaz limpia diseñada con CSS3 y Thymeleaf.
* **Gestión de Errores:** Sistema de alertas visuales cuando un libro no existe en el catálogo.

##  Stack Tecnológico
* **Backend:** Java & Spring Boot.
* **Datos:** Spring Data JPA & H2 Database.
* **Frontend:** Thymeleaf, HTML5, CSS3.
* **Logs:** Implementación de SLF4J para trazabilidad.

##  Configuración
El proyecto utiliza un entorno H2. Para ver la base de datos en tiempo real:
1. Arranca la aplicación.
2. Accede a `http://localhost:8082/h2`.
3. JDBC URL: `jdbc:h2:mem:test`.