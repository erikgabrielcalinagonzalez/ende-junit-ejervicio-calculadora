# Testing con Junit

Este es un ejemplo sencillo de pruebas unitarias usando Junit 5

Observa que este proyecto no tiene ninguna clase con el método `main`, no nos hace fatal. Además, tampoco tiene ningún `scanner` ni ningún `print`.

Haz un fork de este proyecto en tu repositorio de Github y contesta a las siguientes preguntas:

1. ¿Qué sentido puede tener este proyecto y para que lo podrías usar?

- El objetivo del proyecto es comprobar que los métodos de una clase funcionan correctamente mediante pruebas unitarias con JUnit.

- Ademas no se necesita un método main porque no es un programa que se ejecute manualmente, sino que está diseñado para ser ejecutado por las pruebas, al ser así tampoco es necesario el Scanner ni print, proque ningun usuario va a ver ni interactuar con el programa.

    - Este proyecto se puede usar para:
        - Verificar que una clase funciona correctamente.
        - Detectar errores antes de entregar el software.
        - Comprobar que futuros cambios no rompan el código.
        - Automatizar pruebas en integración continua.


2. Revisa las pruebas de la suma y comenta lo que te parezca de interés

    - Se comprueba de manera adecuada el funcionamiento de la suma con el uso del assertEquals, sin embargo no detecto ninguna prueba de comprovación de negativos o de sumas con 0, aunque en la suma no de excepciones deveria probarse.

3. Realiza un estudio de caja negra de la división e implementa las pruebas en junit: Se realizará en markdown.

    1. Clases de equivalencia
        - Entradas
            - Dividendo a
            - Divisor b

        - valores validos 
            - cualquier división positiva o negativa
            - 0 entre cualquier valor
        
        - valores no validos 
            - cualquier división entre 0 (se dara la excepción)

    1. Análisis de valores límites
        - 0
        - 1
        - -1
        - mismo numero 7/7
        - divisor de 0

|Clase equivalencia |  Prefijo  |  Límite   |  Código   |   Valores   |
|---|---|---|---|---|
|   Valor Válido    |   CEev    |   X/X    |   CEev1   |    7/7     |
|                   |           |   X/-Y   |   CEev2   |    5/-7    |
|                   |           |   -X/Y   |   CEev3   |    -8/4    |
|                   |           |  -X/-Y   |   CEev2   |    -9/-24  |
|                   |           |   0/X    |   CEev2   |    0/20    |
|   Valor No válido |   CEei    |   X/0    |   CEei1   |    10/0    |


3. Conjetura de errores
    - Posibles errores:
        1. No controlar la división entre 0.
        2. Calcular mal el signo cuando hay números negativos.
        3. No devolver 0 correctamente cuando el dividendo es 0.
        4. Problemas de precisión si la división es entera.

4. Generar casos de prueba

|Caso de prueba |   Entrada |   Salida  |
|---|---|---|
|  CP1          |    7/7    |   1       |
|  CP2          |    5/-7   |   0       |
|  CP3          |    -8/4   |   -2      |
|  CP4          |   -24/-3  |   8       |
|  CP5          |    0/20   |   100     |
|  CP6          |    10/0   |   Error (excepción)   |



## Instrucciones

El alumno deberá hacer un fork de este proyecto e implementar la solución solicitada (preguntas y código).

>Se deberá utilizar este fichero, y los artefactos de código del proyecto, para resolver el ejercicio.


**Si no se puede acceder al repositorio la evaluación del ejercicio será de 0. No se evaluarán entregas modificadas/entregadas fuera del plazo establecido en la tarea**