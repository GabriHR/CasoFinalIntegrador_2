package Animales;

public class Animal {
    private String nombre;
    private String especie;
    private String sexo;
    private int edad;
    private double peso;
    private String habitat;
    protected String alimentacion;

    public Animal(String nombre, String especie, String sexo, int edad, double peso, String habitat, String alimentacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    @Override
    public String toString() {
        return "Animal: nombre=" + nombre + ", especie=" + especie + ", edad=" + edad;
    }
}