# Juego de Ahorcado en Java

## Descripción del Juego

El juego de Ahorcado es un clásico juego de adivinanza de palabras. El jugador debe intentar adivinar una palabra oculta letra por letra. Si la letra adivinada está en la palabra, se revela en su posición correspondiente. Si la letra no está en la palabra, el jugador pierde un intento. El juego continúa hasta que el jugador adivina toda la palabra o se queda sin intentos. Si el jugador adivina la palabra completa, gana. Si se acaban los intentos antes de adivinar la palabra, el jugador pierde.

## Pruebas - palabra a adivinar -->developer

Prueba ganadora!!
<p align = "center">
<img src="https://raw.githubusercontent.com/RendevMq/MyGIFS/main/correctAhorcado.gif" width=400>
</p>

Prueba fallida!!
<p align = "center">
<img src="https://raw.githubusercontent.com/RendevMq/MyGIFS/main/incorrectAhorcado.gif" width=400>
</p>

## Herramientas Utilizadas

Para desarrollar el juego de Ahorcado en Java, se utilizaron las siguientes herramientas y componentes:

1. **Clase Scanner**:
    - Utilizada para leer la entrada del usuario desde la consola.
    - Permite capturar las letras que el jugador ingresa para adivinar la palabra.

2. **Declaraciones y Asignaciones**:
    - Se realizaron para definir y asignar variables que controlan el estado del juego, como el número de intentos restantes, la palabra a adivinar, y las letras adivinadas.

3. **Arreglos**:
    - Se emplearon arreglos para almacenar las letras adivinadas correctamente y para manejar la palabra oculta.
    - Facilitó la comparación y actualización del estado de la palabra a medida que se adivinan las letras.

4. **Bucles**:
    - Utilizados para iterar a través de las letras de la palabra y los intentos del jugador.
    - Se implementaron bucles `for` y `while` para controlar el flujo del juego y verificar las letras ingresadas.

5. **Clase String y sus Métodos (valueOf, charAt, length)**:
    - La clase `String` y sus métodos fueron esenciales para manipular la palabra a adivinar y las letras ingresadas.
    - `valueOf`: Convertir valores a cadenas.
    - `charAt`: Obtener un carácter específico de una cadena.
    - `length`: Determinar la longitud de la cadena.

6. **Clase Character y su Método toLowerCase**:
    - Se utilizó para normalizar las letras ingresadas por el usuario, asegurando que todas se manejen en minúsculas.
    - `toLowerCase`: Convertir caracteres a minúsculas para facilitar las comparaciones.

## Cómo Jugar

1. Ejecuta el programa en tu entorno Java.
2. Ingresa letras una por una para adivinar la palabra oculta.
3. Si adivinas una letra correctamente, se revelará en la palabra.
4. Si fallas, perderás un intento.
5. El juego termina cuando adivinas toda la palabra o te quedas sin intentos.

¡Disfruta jugando al Ahorcado!

