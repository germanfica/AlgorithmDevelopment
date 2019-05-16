package xyz.germanfica._2018._2nd.tp1;

/*
 * ¿Cuántos "estados civiles" existen y qué significan?
 * El estado civil es el lugar permanente que ocupa una persona en la sociedad que depende
 * de sus relaciones de familia y que lo habilita para ejecer derechos y contraer obligaciones.
 * 
 * Los estados civiles son:
 * -Hijo/a : se acredita con el certificado de nacimiento
 * -Padre o madre: se acredita con el certificado de nacimiento
 * -Soltero/a: no existe un certificado para acreditar este estado civil. Se puede acreditar
 * con una declaracion jurada ante un notario público
 * - Casado/a: se acredita con el certificado de matrimonio
 * - Viudo/a: se acredita con el certificado de matrimonio y el certificado de defuncion
 * - Divorciado/a: se acredita con el certificado de matrimonio, el cual debe contener la
 * subinscripcion de la sentencia judicial que declara el divorcio.
 * 
 * La filiacion es el vínculo jurídico que une a un hijo con su padre o madre, estableciendo
 * la relacion de parentesco señalada por la ley.
 * Por consiguiente, los certificados de nacimiento permiten acreditar el estado civil
 * del hijo, padre o madre, lo que constituye, como se señalo anteriormente, la filiacion.
 * Se hace presente que la expresion "filiacion civil" dice relacion con el otorgamiento
 * de documentos de identidad a las personas, a partir de la toma de impresion de sus diez
 * dedos, lo que constituye su ficha decadactilar. Estos documentos contienen los datos de
 * la inscripcion de nacimiento de la persona (nombres, apellidos y RUN). Por lo tanto, la
 * expresion no guarda ninguna relacion con la filiacion derivada del parentesco. La
 * expresion "filiacion penal" dice relacion con la apertura de un prontuario penal con
 * los delitos cometidos por una persona.
 * 
 * Link: http://www.registrocivil.cl/PortalOI/html/faq/Cod_Area_5/Cod_Tema_36/pregunta_204.html
 */
public class EstadoCivil {
	private boolean soltero;
	private boolean casado;
	private boolean viudo;
	private boolean divorciado;
	
	EstadoCivil() {
		this.soltero = false;
		this.casado = false;
		this.viudo = false;
		this.divorciado = false;
	}
	
	public boolean isSoltero() {
		return soltero;
	}
	public void setSoltero(boolean soltero) {
		this.soltero = soltero;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public boolean isViudo() {
		return viudo;
	}
	public void setViudo(boolean viudo) {
		this.viudo = viudo;
	}
	public boolean isDivorciado() {
		return divorciado;
	}
	public void setDivorciado(boolean divorciado) {
		this.divorciado = divorciado;
	}
}
