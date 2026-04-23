# **Teoria de la complejidad**
---
## **Integrantes**

- Miguel Alexander Maza Sinchi
- Edwin Patricio Pintado Reinoso
- Galo Patricio Prieto Tapia
- Kevin Joel Sacaquirin Morocho
- Anderson Israel Vallejo Loja

---
## **¿Qué es la Teoría de la Complejidad?**

La teoría de la complejidad es una rama de la informática que analiza cómo aumenta el costo de un algoritmo a medida que crece el tamaño de su entrada. Para ello utiliza la notación Big-O, que describe el crecimiento del tiempo de ejecución y el uso de memoria. 

Su objetivo principal es comparar algoritmos y determinar cuál es más eficiente cuando los datos se vuelven grandes.

---
## **Eficiencia de algoritmos**

### Coste temporal

Es el tiempo que tarda un algoritmo en ejecutarse dependiendo del tamaño de la entrada.

### Coste espacial

Es la cantidad de memoria que utiliza un algoritmo durante su ejecución.

## **Factores de tiempo de ejecución**

El tiempo de ejecución no depende solo del código, sino de varios factores:

### Factores propios

Dependen del diseño del algoritmo:
-	Número de operaciones 
-	Estructuras de control (bucles, recursión) 
-	Estructuras de datos utilizadas 

### Factores circunstanciales

Son externos al algoritmo:
-	Hardware (CPU, RAM) 
-	Sistema operativo 
-	Lenguaje de programación 
-	Carga del sistema 

### Análisis teórico

Se estudia el algoritmo sin ejecutarlo, usando matemáticas.
Permite estimar su comportamiento con notaciones como Big O:
-	O → peor caso 
-	Ω → mejor caso 
-	Θ → caso promedio 

### Análisis experimental

Consiste en ejecutar el programa y medir su tiempo real.
Se prueba con diferentes tamaños de entrada (n = 100, 1000, 10000) para observar su crecimiento.

---
## **Notación Big O**

### ¿Qué es?

La notación Big O es una forma matemática de describir cómo crecen los recursos que utiliza un algoritmo (tiempo o memoria) en función del tamaño de entrada n.
Su objetivo es analizar el comportamiento del algoritmo cuando los datos aumentan, especialmente en escenarios grandes.

### Tipos de análisis (casos)

- Mejor caso (Ω – Omega)
Es el escenario más favorable posible para el algoritmo.
Representa el menor tiempo de ejecución.

- Peor caso (O – Big O)
Es el escenario más desfavorable.
Representa el límite superior del tiempo de ejecución.

- Caso promedio (Θ – Theta)
Representa el comportamiento esperado en condiciones normales.

### Notaciones importantes con ejemplos

- O(1) – Constante
El tiempo no depende del tamaño de entrada.
- O(n) – Lineal
Crece proporcionalmente al tamaño de entrada.
- O(n²) – Cuadrática
Dos bucles anidados.
- O(log n) – Logarítmica
Reduce el problema a la mitad en cada paso.
- O(n log n)
Combinación de recorrido + división del problema.

### En conclusión
- La notación Big O es fundamental para diseñar algoritmos escalables y evitar que el rendimiento se degrade al aumentar la cantidad de datos.
- Permite comparar soluciones y elegir la más eficiente antes de implementarla.

---
## Tipos de complejidad

### O(1) – Complejidad constante

La complejidad O(1) significa que el tiempo o espacio que utiliza un algoritmo no cambia sin importar el tamaño de la entrada (n).
Esto ocurre cuando el algoritmo ejecuta una cantidad fija de operaciones, sin depender de estructuras repetitivas o datos adicionales.

### O(n) – Complejidad lineal
La complejidad O(n) significa que el tiempo de ejecución crece de forma proporcional al tamaño de la entrada.
Si los datos aumentan, el número de operaciones aumenta en la misma proporción.

### O(n²) – Complejidad cuadrática
La complejidad O(n²) ocurre cuando un algoritmo tiene dos bucles anidados, donde cada uno depende de n.
Esto provoca que el número de operaciones crezca como n × n.

### O(log n) – Complejidad logarítmica
La complejidad O(log n) ocurre cuando el problema se reduce a la mitad en cada paso.
En lugar de revisar todos los elementos, el algoritmo descarta una gran parte del problema en cada iteración.
Es muy eficiente en grandes volúmenes de información.

### O(n log n) – Complejidad logarítmica lineal
La complejidad O(n log n) combina dos comportamientos:
-	Un proceso lineal O(n)
-	Un proceso logarítmico O(log n)
Esto significa que el algoritmo recorre todos los elementos, pero realiza divisiones o procesos logarítmicos dentro de ese recorrido.

### En resumen:
-	O(1) → constante (ideal)
-	O(log n) → muy eficiente
-	O(n) → crecimiento proporcional
-	O(n log n) → eficiente para grandes datos
-	O(n²) → ineficiente en grandes volúmenes

