# Desarrollo de Algoritmos
```java
// Cuál es la pieza más usada?
int índice, respuesta, anterior;

anterior = 0;

for(índice = 0; índice<= pieza.length-1 ;índice++)
{
	if(pieza[índice]>=anterior)
	{
		anterior = pieza[índice];
	}
}
```

# Apunte del día 11 de abril del 2018
﻿TDA (clase)
caracteristicas = atribtuos (variables instancias)
operaciones = acciones (métodos)

Alumno (objeto)
Materia (objeto)
Profesor (objeto)

Diagrama UML para definir clases (TDA)

get para obtener información
set para establecer información

Usar clase test (prueba) para testear

parteReal
parteImaginaria

En la implementación genero los test

Las constructoras son las de creación

Sobrecarga de Nombres de Métodos No todos los lenguajes lo tienen

TecladoIn.java no es un objecto ya que todos sus módulos son estáticos,
como por ejemplo:

```
public static String readLine(){}
```

# 18/04/18
Los constructores son públicas y estáticas por defecto en Java.

Las propias del tipo creo que son métodos estáticos

https://stackoverflow.com/questions/2649213/in-laymans-terms-what-does-static-mean-in-java

static means that the variable or method marked as such is available at the class level. In other words, you don't need to create an instance of the class to access it.

# Apunte 14/08/18
Antes de ir a Java, dibujar el problema, organizar las ideas en una hoja de papel.

# Recursión
- Caso base
- Se llama a si mismo
- Llamados siempre en un órden menor

La recursión es más lenta. Porque se necesita desapilar después. La recursión sirve para comprender mejor ciertos problemas complejos de entender. La recursión es más intuitiva. Apila
y desapilar lleva tiempo. Pero aveces la recursión es más intuitivo.

### Algoritmo de Reina o algoritmo vuelta atrás
Mínimo se necesitan 4.

1x1 (1 reina)
2x2 (1 reina)
3x3 (2 reinas)
4x4 (cuatro reinas)

### Ejemplo de un método recursivo que no retorna valores

Un método que reciba un número, ej 1123 y devuelta los digitos del número. O mejor que me de vuelva “uno”, “uno”, “dos” y “tres”.

```
pasarATexto(entero d)
// d es un dígito del 0 al 9
TEXTO nombreDelNúmero
SEGÚN d HACER
	CASO '0' nombreDelNúmero ← “cero”
	CASO '1': nombreDelNúmero← “uno”
	…
FIN SEGÚN
```

Composición y descomposicón. Voy a descomponer 1123  y sé el el último díjito va del 0 al 9.

Si n = 1123. El 3 sería n mod 10. Lo que queda sería n/10.

| n | n mod 10 | n/10 |
| - | -------- | ---- |
| n = 1123 | n mod 10 = 3 | n/10 = 112 |
| n = 112 | n mod 10 = 2 | n/10 = 11 |
| n = 11 | n mod 10 = 1 | n/10 = 1 |
| n = 1 | n mod 10 = 1 | n/10 = 0 |

```
// La recursón podría recotarse cuando n/10=0 ó n=0
MÓDULO mostrarNúmeroTexto(Entero n)
	SI (n>0)
		t1← pasarATexto(n mod 10)
		ESCRIBIR(t1)
		mostrarNúmeroTexto(n/10)
	FIN SI
FIN MÓDULO mostrarNúmeroTexto
```

### Arreglos recursivos

|   |   |   |   |   |   |   |   |   |   |
| - | - | - | - | - | - | - | - | - | - |
| 5 | 0 | 3 | 1 | 0 | 5 | 3 | 2 | 1 | 3 |

contarCeros(STRING[] v, int pos)

caso base 0 si pos -1
caso base longitud-1 si pos +1

