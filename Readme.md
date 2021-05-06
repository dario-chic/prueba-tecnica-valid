# DOCUMENTO DE GUÍA - PRUEBA TÉCNICA
# Por: Guillermo Andres De Mendoza Corrales

## 0. requerimientos

+ JDK 8
+ Node js 14+
+ Maven
+ Angular CLI 11+
+ Docker

## 1. Compilar proyecto front (Angular 11):

dependencias
```
npm install
```

```
cd ./Frontend/RegistryFront
ng build --prod
```
## 2. Compilar proyecto back (SpringBoot 4):

```
cd ./FBackend/RegistryBack
mvn clean install
```

## 3. Imagen docker: construir y correr

Build:
```
docker build -t springio/gs-spring-boot-docker .
```

Run:
```
docker run -d --name registry-app -p 8080:80 springio/gs-spring-boot-docker
```

## 4. Abrir aplicacion

En un navegador de internet, ir a http://localhost:8080/registry/#/home

## 5. Descripcion del servicio y su arquitectura

El presente proyecto esta compuesto de dos aplicativos:

+ Frontend: angular v11

construido mentiante modulos independientes para las vistas de "registro" y "consultas-procesar" de registros de personas, con servicios individuales para el manejo de recursos, redirecciones, navegacion y consultas por servicios web rest

+ Backend: java 8 - SpringBoot

implementacion por capas estrictas 'controlador', 'servicios de logica', 'repositorio' y 'entidad' priorizando los atributos de calidad de  escalabilidad y mantenibilidad. Adicionalmente se realizan todos sus servicios de formastateless mejorando la posibilidad de permitir el escalamiento horizontal

El repositorio de informacion es una base de datos ligera H2, la cual permite un desarrollo y testeo rapido del aplicativo y de sus funciones

Se implementan modelos (DTO) aparte de las entidades del proyecto, esto con el fin de independizar los contratos de los servicios WEB de las implementaciones en base de datos


## 6. Posibles mejoras

Si bien esta es la solucion a una prueba tecnica de ingreso, cabe resaltar algunas mejoras tecnicas y arquitectonicas del aplicativo:

+ dado que la base de datos seleccionada es una H2, en el caso de requerir escalar este servicio, se debera seleccionar una base de datos con capacidades superiores de almacenamiento y separar el frontend mediante despliegues separados del backend

+ el servicio de obtener registros deberia paginarse debido a la posibilidad de almacenar multiples registros sin limitaciones. No realice esta implementacion por falta de tiempo, ya que en el momento me encuentro con un trabajo de tiempo completo, dicto clases de pregrado de ciencias de la computacion y soy estudiante de ultimo semestre de maestria.

+ si bien una de las restricciones de esta prueba era utilizar el JDK v8, este deberia migrarse a versiones superiores, incluso seleccionando el JDK del proveedor de nube destinado para el proyecto objetivo.

+ implementar pruebas unitarias que den covertura al 100% de los metodos implementados