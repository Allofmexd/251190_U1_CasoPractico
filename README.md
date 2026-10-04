# Cartelera de cine

Caso practico de la Unidad 1 de Estructuras de Datos. El programa muestra una
cartelera fija de cinco peliculas y permite consultar el listado completo o los
detalles de una pelicula.

## Requisito principal

La clase `Cartelera` declara el arreglo de objetos `Pelicula[] peliculas = new
Pelicula[5]`. Cada posicion almacena una instancia de `Pelicula`, y cada pelicula
contiene un objeto `Director`.

## Estructura

```text
src/cine/Director.java
src/cine/Pelicula.java
src/cine/Cartelera.java
src/cine/AplicacionCine.java
diagramas/diagrama_clases.puml
diagramas/diagrama_casos_uso.puml
```

Los archivos `.puml` son editables con PlantUML, la herramienta especializada
utilizada para elaborar los diagramas.

## Compilar y ejecutar

Desde la raiz del proyecto:

```powershell
javac -encoding UTF-8 -d out src/cine/*.java
java -cp out cine.AplicacionCine
```

## Funciones

- Consultar las cinco peliculas del fin de semana.
- Seleccionar una pelicula por numero.
- Consultar titulo, genero, duracion, director y pais de origen.
- Informar entradas no numericas, opciones incorrectas y numeros fuera de rango.
