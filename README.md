# Desarrollo de Algoritmos

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

	public static String readLine(){}


# 18/04/18
Los constructores son públicas y estáticas por defecto en Java.

Las propias del tipo creo que son métodos estáticos

https://stackoverflow.com/questions/2649213/in-laymans-terms-what-does-static-mean-in-java

static means that the variable or method marked as such is available at the class level. In other words, you don't need to create an instance of the class to access it.




