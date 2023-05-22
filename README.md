# Aplicación de Productos

Esta es una aplicación de ejemplo para gestionar productos utilizando Java, Spring Framework y una base de datos en memoria (H2 Database). Permite crear, actualizar, consultar y eliminar productos a través de endpoints HTTP.

## Requisitos técnicos

- Java 8 o superior
- Spring Framework
- H2 Database

## Funcionalidades

- Crear un producto con los siguientes campos: nombre, descripción, precio, cantidad.
- Actualizar un producto existente.
- Consultar un producto por ID o por nombre.
- Eliminar un producto existente.
- Consultar todos los productos ordenados por precio.

## Estructura del proyecto

El proyecto sigue una estructura de capas para separar las responsabilidades:

- `src/main/java/com.example.producto`: Contiene los paquetes y las clases Java del proyecto.
  - `controller`: Controladores que manejan las peticiones HTTP y exponen los endpoints.
  - `dto`: Objetos DTO utilizados para transferir datos entre las capas.
  - `model`: Entidades JPA que representan los objetos de la base de datos.
  - `repository`: Interfaces de repositorio para interactuar con la base de datos.
  - `service`: Interfaces y clases de servicio para la lógica de negocio.

- `src/main/resources`: Contiene los archivos de configuración y recursos.
  - `application.properties`: Archivo de configuración de Spring Boot.
  
## Configuración

Antes de ejecutar la aplicación, asegúrate de tener instalado Java y Maven. Además, no se requiere configuración adicional para la base de datos H2 Database, ya que está configurada para ejecutarse en memoria.

## Uso
Puedes utilizar herramientas como Postman para interactuar con los endpoints de la aplicación. A continuación se muestra un resumen de los endpoints disponibles:

GET /productos: Consulta los productos disponibles. 
POST /productos: Crea un nuevo producto enviando un objeto JSON en el cuerpo de la solicitud. Con el siguiente Body, JSON: 
{
    "nombre":"hola",
    "descripcion":"holassss",
    "precio": 12.00,
    "cantidad": 20
}
PUT /productos/{id}: Actualiza un producto existente especificando su ID en la URL y enviando los datos actualizados en un objeto JSON en el cuerpo de la solicitud.
GET /productos/{id}: Consulta un producto por su ID.
GET /productos/buscar?nombre={nombre}: Consulta un producto por su nombre.
GET /productos/ordenarPorPrecio: Consulta todos los productos ordenados por precio.
DELETE /productos/{id}: Elimina un producto por su ID.
