# 🎨 PARCIAL ARSW FINAL 


## 📖 Enunciado

Ejercicio Arquitectura Web, Microservicios, GUI, Mapas
Su compañía lo ha seleccionado para construir una aplicación que demuestre una simple arquitectura de Microservicios desplegada en Heroku para uno de los clientes más importantes.

Así, han decidido que usted debe construir una aplicación para consultar el estado del clima en lugares específicos de la tierra.  
La aplicación recibirá en un campo la descripción de una ciudad, por ejemplo “London” para Londres y deberá mostrar la información del clima para esa ciudad. 

Para esto utilice el API gratuito de [http://api.weatherapi.com/v1/current.json?key=83ec500b1d684130b61144058252207&q=Medellin&aqi=no](http://api.weatherapi.com/v1/current.json?key=83ec500b1d684130b61144058252207&q=Medellin&aqi=no) (Puede crear una cuenta para obtener la llave para realizar consultas). 

Se le pide que su implementación sea eficiente en cuanto a recursos así que debe implementar un caché que permita evitar hacer consultas repetidas al API externo. 
Una vez tenga la funcionalidad básica, extienda su implementación para incluir una funcionalidad para mostrar mapas de la ciudad con diferentes capas del clima (revise la funcionalidad del API de mapas de clima y el ejemplo anexo.). 
La implementación del mapa puede ir directamente a los servicios externos sin pasar por el servidor intermediario.

## ✨ Características

- **🎨 LLamado a la api**
- **🌈 Formato de respuesta json**: 
- **📱 Visualización del mapa de google**: 


## 📋 Prerrequisitos

Antes de ejecutar este proyecto, asegúrate de tener instalado:

- **Java** >= 17
- **mvn** >= ultima
- **spring boot** >= 3.5.3

## � Instalación y Configuración

### 1. Clonar el repositorio
```bash
git clone https://github.com/marzo245/demo.git
cd demo
```

### 2. Compilar proyecto
```bash
mvn pacakge
```

### 3. Ejecutar en modo desarrollo(localhost:8080)
```bash
mvn spring-boot:run
```

## 🎮 Ciclo de vida(prueba de uso)

### pantalla inical
<img width="1352" height="977" alt="image" src="https://github.com/user-attachments/assets/f5212fba-c0e1-4dc3-9561-cd4d37b317e2" />

### generando peticion

<img width="1348" height="162" alt="image" src="https://github.com/user-attachments/assets/daed8f96-f3b3-46b4-95b0-8faf4ea31a3c" />

## Probando otro lugar

<img width="1348" height="164" alt="image" src="https://github.com/user-attachments/assets/de108857-1072-40a8-8b93-41711983eee7" />


## 📁 Estructura del Proyecto

```
demo/
├── src/                    # Código fuente
│   ├───main
│      ├───java
│      │   └───com
│      │       └───example
│      │           └───demo
│      │                   Controller.java      #Defnicion de los endpoints
│      │                   DemoApplication.java   #clase principal o main
│      │                   HttpConnectionExample.java   #Encargado de hacer peticiones al api del clima
│      │                   Service.java # encargado logica
│      │
│      └───resources
│          │   application.properties
│          │
│          ├───static
│          │       index.html #Pagina principal
│          │       index.js  # encargado logica
│          │       style.css # encargado de mejorar visualmente
│          │
│          └───templates
└── README.md              # Documentación
```


## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo [LICENSE](LICENSE) para más detalles.

## 👨‍💻 Autor

Diego Chicuazuque Castiblanco


