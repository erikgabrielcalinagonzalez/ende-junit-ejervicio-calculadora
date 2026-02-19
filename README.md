# Testing con Junit

Este es un ejemplo sencillo de pruebas unitarias usando Junit 5

Observa que este proyecto no tiene ninguna clase con el método `main`, no nos hace falta. Además, tampoco tiene ningún `scanner` ni ningún `print`.

Haz un fork de este proyecto en tu repositorio de Github y contesta a las siguientes preguntas:

1. ¿Qué sentido puede tener este proyecto y para que lo podrías usar?
    - Para praticar y aprnder los pasos sencillos de realizar un test controlado; Lo prodira usar para visualizar como es que se realizan este tipo de pruebas.

2. Revisa las pruebas de la suma y comenta lo que te parezca de interés
    - En las pruebas todas se realizan de manera exitosa, exceptuando la prueba 'sumarPositivosMal()', da este error porque esta puesto de manera prepensada mal para comprobar su funcionamiento erroneo, me es curioso. 
    Ademas en el Test 'sumar()' realiza dos pruebas diferentes de suma con el resultado 5 para ver que con datos diferentes de el mismo resultado, aparte de realizar uno en el que da un dato negativo.
    luego en el final de la clase se aprecia una 'exception', con la cual aun sucediendo una división por 0, en vez de dar error se redirije y suelta el comentario "La división por cero no está permitida", es interesante porque en un caso normal sin 'exception' deveria dar un error de programa, pero con ellá se puede aprovechar el error y usarlo como un detector.

3. Realiza un estudio de caja negra de la división e implementa las pruebas en junit: Se realizará en markdown.
    - Pruebas realizadas en junit:
    
    | Prueba | Resultado esperado | Resultado obtenido | Tipo de respuesta |
    | --- | --- | --- | --- |
    | 10/5 | 2 | 2 | Correcta |
    | -4/2 | -2 | -2 | Correcta |
    | 9/2 | 4.5 | 4 | Erronea |
    | 2/-3 | -0.6 | 0 | Erronea |
    
    - Conclusion:
        El el apartado de 'division' del programa no es capaz de devolver vaores decimales al calcular, transforma los resultados a enteros sin incluir estos decimales.


## Instrucciones

El alumno deberá hacer un fork de este proyecto e implementar la solución solicitada (preguntas y código).

>Se deberá utilizar este fichero, y los artefactos de código del proyecto, para resolver el ejercicio.


**Si no se puede acceder al repositorio la evaluación del ejercicio será de 0. No se evaluarán entregas modificadas/entregadas fuera del plazo establecido en la tarea**