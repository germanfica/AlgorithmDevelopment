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

Autor: Germán Fica
