# Proyecto Final - Agencia de Autos

## Descripción del Proyecto

Este proyecto es una aplicación web para gestionar una agencia de autos. Permite crear, leer, actualizar y eliminar información sobre clientes y vehículos. Está desarrollado utilizando Spring Boot y MongoDB para el backend, y proporciona una API RESTful para interactuar con los datos.

## Tecnologías Utilizadas

- **Backend**: Spring Boot
- **Base de Datos**: MongoDB
- **Maven**: Para la gestión de dependencias
- **Java**: Lenguaje de programación
- **Lombok**: Para reducir el código repetitivo

## Instalación

### Prerrequisitos

- JDK 11 o superior
- Maven
- MongoDB

### Instrucciones de Instalación

1. Clona el repositorio:
   ```sh
   git clone https://github.com/tu-usuario/tu-repo.git
Navega al directorio del proyecto:

sh
cd tu-repo
Configura las variables de entorno para MongoDB en el archivo application.properties:

properties
spring.data.mongodb.database=nombre_base_datos
spring.data.mongodb.uri=mongodb+srv://usuario:contraseña@cluster.mongodb.net
Compila y ejecuta la aplicación:

sh
mvn spring-boot:run
Uso de la API
Endpoints Disponibles
Clientes

Crear un Cliente
http
POST /api/clients/crear
Content-Type: application/json

{
    "firstname": "Luis",
    "lastName": "Magaña",
    "email": "Luis@gmail.com",
    "phoneNumber": "4444232323"
}
Listar Todos los Clientes
http
GET /api/clients
Obtener un Cliente por ID

http
GET /api/clients/{id}

Eliminar un Cliente por ID
http
DELETE /api/clients/{id}
Vehículos

Crear un Vehículo
http
POST /api/vehicles/crear
Content-Type: application/json

{
    "marca": "Toyota",
    "modelo": "Corolla",
    "año": 2021,
    "precio": 20000,
    "status": "Disponible"
}

Listar Todos los Vehículos

GET /api/vehicles

Obtener un Vehículo por ID
http
GET /api/vehicles/{id}

Eliminar un Vehículo por ID
http
DELETE /api/vehicles/{id}
