# Proyecto Ventas

## Descripción

Aplicación Java Spring Boot para gestión de ventas y productos usando una base de datos SQL Server.

---

## Requisitos

- Java JDK 11 o superior  
- Maven  
- SQL Server activo con base de datos `tienda` creada  
- Credenciales de acceso a SQL Server (usuario y contraseña)  

---

## Configuración para ejecutar en tu máquina

1. **Clonar el repositorio**

2.  **Edita el archivo src/main/resources/application.properties y actualiza las siguientes propiedades:**
```js
spring.datasource.url=jdbc:sqlserver://TU_HOST\\NOMBRE_INSTANCIA;databaseName=tienda;encrypt=false;trustServerCertificate=true
spring.datasource.username=USUARIO_DB
spring.datasource.password=CONTRASEÑA_DB
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver

```
> [!IMPORTANT]
> - Reemplaza TU_HOST por el nombre o IP del servidor SQL Server
> - Usa doble barra invertida (\\) para separar el host y la instancia
> - Reemplaza NOMBRE_INSTANCIA por el nombre de la instancia SQL Server
> - Cambia USUARIO_DB y CONTRASEÑA_DB por tus credenciales válidas

3. **Construir y ejecutar la aplicación:**
```js
mvn clean install
mvn spring-boot:run
```
4. **Abre tu navegador y visita:**
```
http://localhost:8080
```
## 📋 Información Importante

> [!IMPORTANT]
> Debes ejecutar el script SQL manualmente para que la aplicación funcione correctamente.  



## 🗂️ Script de Base de Datos

El script SQL para crear la base de datos y las tablas está disponible en el Repositorio:

