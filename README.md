# Proyecto de Ejercicios Kotlin en Android Studio

Este repositorio contiene tres ejercicios desarrollados en Android Studio utilizando Kotlin. Cada ejercicio aborda aspectos fundamentales del desarrollo de aplicaciones Android, desde el diseño de interfaces hasta la navegación entre múltiples Activities.

---

## Ejercicio 1: Calculadora Funcional

**Descripción:**  
Implementación de una calculadora básica con un estilo "hacker". La aplicación permite realizar operaciones aritméticas (suma, resta, multiplicación y división) y muestra los resultados en tiempo real a medida que se ingresan los datos.

---

## Ejercicio 2: Segunda Aplicación y Menú Principal

**Descripción:**  
Desarrollo de una segunda aplicación (cronómetro) y creación de un menú principal que permita al usuario seleccionar entre la calculadora del Ejercicio 1 y la nueva aplicación. Se implementa la navegación entre Activities utilizando Intents.

- **Aplicación Secundaria:** Desarrollo de un cronómetro con un estilo visual similar al de la calculadora.
- **Menú Principal:** Diseño de un menú que ofrezca dos opciones:
  - **Activity 1:** Calculadora.
  - **Activity 2:** Cronómetro.
- **Navegación:** Implementación de la navegación eficiente entre Activities, asegurando la posibilidad de regresar al menú principal desde cada actividad mediante un botón "Regresar".
- **Ciclo de Vida:** Consideración y manejo adecuado de los métodos del ciclo de vida de Android (onCreate(), onDestroy(), onPause(), etc.).

---

## Ejercicio 3: Navegación Creativa entre Activities

**Descripción:**  
Implementación de una aplicación interactiva que simula la exploración del Sistema Solar. Al iniciar, se muestra una vista general del sistema y el usuario puede seleccionar un planeta para ver información detallada, como su diámetro y otros datos relevantes.

- **Jerarquía de Navegación:** La aplicación debe permitir explorar distintos niveles (por ejemplo: Galaxia → Sistema Solar → Planetas → Detalles).
- **Diseño Dinámico:** Cada nivel cuenta con un layout distinto que puede incluir fondos, gráficos o imágenes representativas.
- **Interacción:** En la vista de cada planeta, se incorpora un botón de "Datos Interesantes" que redirige a una Activity con información adicional.
- **Nota:** Solo se subieron capturas de pantalla de 3 planetas, pero la estructura es dinámica y se aplica de igual forma a todos los planetas, adaptándose la información e imágenes correspondientes.

---

## Tecnologías Utilizadas

- **Kotlin:** Lenguaje de programación principal.
- **Android Studio:** Entorno de desarrollo integrado (IDE) para Android.
- **XML:** Para el diseño de interfaces de usuario.
- **Intents:** Para la navegación entre Activities y el manejo del ciclo de vida de Android.

---

## Cómo Ejecutar la Aplicación

1. **Clonar el repositorio:**  
   ```bash
   git clone [https://github.com/DaniVegaM/appGalaxyAndroid/tree/main]
2. **Ejecutar el código utilizando Android Studio (NOTA: Las imagenes ya estan incluidas dentro de este repositorio, solo descarga y ejecuta)**
