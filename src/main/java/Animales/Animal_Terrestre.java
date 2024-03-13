package Animales;

public class Animal_Terrestre extends Animal{

    boolean patas;
    boolean cola;
    boolean pelaje;
    String tipo_terrestre;

    public Animal_Terrestre(String nombre, String especie, String sexo, int edad, double peso, String habitat, String alimentacion, boolean patas, boolean cola, boolean pelaje, String tipo_terrestre) {
        super(nombre, especie, sexo, edad, peso, habitat, alimentacion);
    }

    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public String getTipo_terrestre() {
        return tipo_terrestre;
    }

    public void setTipo_terrestre(String tipo_terrestre) {
        this.tipo_terrestre = tipo_terrestre;
    }

    public String getDescripcion() {
        return "Descripción del " + this.getNombre() + ": Especie - " + this.getEspecie() + ", Sexo - " + this.getSexo() + ", Edad - " + this.getEdad() + ", Peso - " + this.getPeso();
    }
}