# 📱 Prototipo 2 - Intents en Android

## 👨‍💻 Autores
* *Nombres:* Joaquín Paredes, Ricardo Moreno
* *Asignatura:* Programación Android (Santo Tomás)
* *Versión de Android/AGP:* API 24+ / AGP 8+

## 🚀 Objetivo
Aplicación desarrollada para demostrar el uso correcto y validado de Intents Explícitos e Implícitos en Android, mejorando la navegación y la interacción con otras apps del sistema.

## 📋 Listado de Intents Implementados y Pasos de Prueba

### 🔗 5 Intents Implícitos
1. *Abrir Web (ACTION_VIEW):* Al presionar el botón, se abre el sitio web de Santo Tomás en el navegador por defecto.
2. *Llamar (ACTION_DIAL):* Al presionar el botón, se abre el marcador telefónico del dispositivo con un número listo para llamar.
3. *Mapa (ACTION_VIEW con geo:):* Al presionar el botón, se abren coordenadas específicas en Google Maps.
4. *Correo (ACTION_SENDTO):* Al presionar el botón, se abre la app de correo prellenando el destinatario y el asunto.
5. *Cámara (ACTION_IMAGE_CAPTURE):* Al presionar el botón, se abre la aplicación de la cámara para tomar una fotografía.

### 🔀 3 Intents Explícitos
1. *AyudaActivity:* Al presionar el botón, se navega internamente a una pantalla estática de guía de uso.
2. *DetalleActivity:* Al presionar el botón, se navega a una nueva vista y se envían datos String mediante putExtra(), los cuales se muestran en pantalla.
3. *ConfigActivity:* Al presionar el botón, se abre una pantalla de ajustes que incorpora un Toolbar con un botón funcional de "Atrás".

## 🖼️ Capturas de Pantalla



## 🛠️ Validaciones y Control de Errores
Todos los botones están envueltos en bloques try-catch (ActivityNotFoundException) para evitar cierres inesperados de la aplicación en caso de que el usuario no tenga la aplicación destino instalada.

## 📦 Instrucciones de Compilación y APK
El proyecto puede compilarse directamente desde Android Studio. El archivo ejecutable (APK) para pruebas se genera en la siguiente ruta:
app/build/outputs/apk/debug/app-debug.apk