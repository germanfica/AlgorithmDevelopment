package ar.martin;

public class Arbol {

    private String nombre;
    private int altura;
    private int profRaices;
    private boolean frutos;
    private int tempMinima;

    //constructores
    public Arbol(String nombre) {
        this.nombre = nombre;
        nombre= null;
        altura = 0;
        profRaices = 0;
        frutos = true;
        tempMinima = 0;
    }

    public Arbol(String nom, int alt, int pRaices, boolean fr, int tMin) {
        nombre = nom;
        altura = alt;
        profRaices = pRaices;
        frutos = fr;
        tempMinima = tMin;
    }

    //modificadores
    public void setNombre(String n) {
        nombre = n;
    }

    public void setAltura(int high) {
        altura = high;
    }

    public void setprofRaices(int profRai) {
        profRaices = profRai;
    }

    public void setFrutos(boolean frut) {
        frutos = frut;
    }

    public void setTempMinima(int tempMin) {
        tempMinima = tempMin;
    }

    //observadores
    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    public int getProfRaices() {
        return profRaices;
    }

    public boolean getFrutos() {
        return  frutos;
    }

    public int getTempeMinima() {
        return tempMinima;
    }

    public String toString() {
        return nombre + " " + altura + " " + profRaices + " " + frutos + " " + tempMinima;
    }

    public boolean equals(Arbol e) {
        return nombre.equalsIgnoreCase(e.getNombre());

    }
}
