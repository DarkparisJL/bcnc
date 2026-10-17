# Pricing Service - Spring Boot 3 & Hexagonal Architecture

Servicio REST desarrollado con **Java 17** y **Spring Boot 3** que permite consultar el precio final aplicable de un producto en función de la cadena y la fecha de aplicación, resolviendo solapamientos mediante prioridades.

## Arquitectura y Tecnologías

- **Arquitectura Hexagonal (Ports & Adapters):** Separación clara entre el Dominio (reglas de negocio puras), la Capa de Aplicación (casos de uso) y la Capa de Infraestructura (adaptadores REST, persistencia JPA).
- **Spring Boot 3 & Java 17:** Framework y versión de Java de última generación para la construcción de microservicios.
- **Base de Datos H2:** Base de datos relacional en memoria inicializada automáticamente mediante scripts SQL (`schema.sql` y `data.sql`).
- **MapStruct:** Mapeo de objetos desacoplado, seguro en tiempo de compilación y de alto rendimiento entre Entidades JPA, Objetos de Dominio y DTOs REST.
- **Lombok:** Reducción del código repetitivo (getters, setters, constructores, etc.).
- **Gestión Global de Excepciones:** Controlador centralizado con `@RestControllerAdvice` para capturar excepciones de dominio y validaciones, devolviendo respuestas JSON estandarizadas (HTTP 404, 400, 500).
- **Principios SOLID & Clean Code.**

## Endpoints Disponibles

### Consultar Precio
* **URL:** `GET /api/prices`
* **Parámetros Query:**
    - `applicationDate`: Formato `yyyy-MM-dd-HH.mm.ss` (Ej: `2020-06-14-10.00.00`)
    - `productId`: Identificador numérico del producto (Ej: `35455`)
    - `brandId`: Identificador numérico de la cadena (Ej: `1`)

#### Ejemplo de Petición:
```bash
curl -X GET "http://localhost:8080/api/prices?applicationDate=2020-06-14-10.00.00&productId=35455&brandId=1"

# Pricing Service - Spring Boot 3 & Hexagonal Architecture

Servicio REST desarrollado con **Java 17** y **Spring Boot 3** que permite consultar el precio final aplicable de un producto en función de la cadena y la fecha de aplicación, resolviendo solapamientos de tarifas mediante prioridades.

---

## 🚀 Arquitectura y Tecnologías

- **Arquitectura Hexagonal (Ports & Adapters):** Separación clara entre el Dominio (reglas de negocio puras), la Capa de Aplicación (casos de uso) y la Capa de Infraestructura (adaptadores REST, persistencia JPA).
- **Spring Boot 3 & Java 17:** Framework y versión de Java de última generación para la construcción de microservicios.
- **Base de Datos H2:** Base de datos relacional en memoria inicializada automáticamente mediante scripts SQL (`schema.sql` y `data.sql`).
- **MapStruct:** Mapeo de objetos desacoplado, seguro en tiempo de compilación y de alto rendimiento entre Entidades JPA, Objetos de Dominio y DTOs REST.
- **Lombok:** Reducción del código repetitivo (getters, setters, constructores, etc.).
- **Gestión Global de Excepciones:** Controlador centralizado con `@RestControllerAdvice` para capturar excepciones de dominio y validaciones, devolviendo respuestas JSON estandarizadas (HTTP 404, 400, 500).
- **Principios SOLID & Clean Code.**

---