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


