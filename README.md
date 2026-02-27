# Testing con Junit

Este es un ejemplo sencillo de pruebas unitarias usando Junit 5

Observa que este proyecto no tiene ninguna clase con el método `main`, no nos hace fatal. Además, tampoco tiene ningún `scanner` ni ningún `print`.

Haz un fork de este proyecto en tu repositorio de Github y contesta a las siguientes preguntas:

1. ¿Qué sentido puede tener este proyecto y para que lo podrías usar?

- Este prollecto es necerario para la realización de operaciones logicas en gestion de datos, se usara para las cuentas evaluativas de la empresa.


2. Revisa las pruebas de la suma y comenta lo que te parezca de interés

- Las pruebas comprueban valores basicos de manera adecuada para comprobar el correcto funcionamiento de la suma, es interesante que se halla realizado solo una prueba de error en vez de más de una.


3. Realiza un estudio de caja negra de la división e implementa las pruebas en junit: Se realizará en markdown.

    1. Clases de equivalencia
        valores validos de -100 hasta 100
        valores no validos de -inf hasta -100 y de +inf hasta 100

    2. Análisis de valores límites
        - valor minimo -100
        - valor maximo 100
        - valor de prueba 59

|Clase equivalencia |  Prefijo  |  Límite   |  Código   |   Valor   |
|---|---|---|---|---|
|   Valor Válido    |   CEev    |   < 59    |   CEev1   |    35     |
|                   |           |   = 59    |   CEev2   |    59     |
|                   |           |   > 59    |   CEev3   |    80     |
|                   |           |  = -100   |   CEev2   |   -100    |
|                   |           |  = 100    |   CEev2   |    100    |
|   Valor No válido |   CEei    |  < -100   |   CEei1   |    -145   |
|                   |           |  > 100    |   CEei2   |    187    |

    3. Conjetura de errores
        - No se detecta ninguna en estos momentos.

    4. Generar casos de prueba

|Caso de prueba |   Entrada: a  | Entrada: b |   Salida  |
|---|---|---|---|
|  CP1          |    35        |   35     |   1      |
|  CP2          |    59        |        |   59      |
|  CP3          |    80        |        |   80      |
|  CP4          |   -100       |        |   -100    |
|  CP5          |    100       |        |   100     |
|  CP6          |    -145      |        |   error   |
|  CP7          |    187       |        |   error   |



## Instrucciones

El alumno deberá hacer un fork de este proyecto e implementar la solución solicitada (preguntas y código).

>Se deberá utilizar este fichero, y los artefactos de código del proyecto, para resolver el ejercicio.


**Si no se puede acceder al repositorio la evaluación del ejercicio será de 0. No se evaluarán entregas modificadas/entregadas fuera del plazo establecido en la tarea**