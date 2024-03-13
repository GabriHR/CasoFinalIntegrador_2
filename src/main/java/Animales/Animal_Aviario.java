package Animales;

public class Animal_Aviario extends Animal {
    boolean vuela;
    boolean pico;

    public Animal_Aviario(String nombre, String especie, String sexo, int edad, double peso, String habitat, String alimentacion, boolean vuela, boolean pico) {
        super(nombre, especie, sexo, edad, peso, habitat, alimentacion);
        this.vuela = vuela;
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public String getDescripcion() {
        return "Descripción del " + this.getNombre() + ": Especie - " + this.getEspecie() + ", Sexo - " + this.getSexo() + ", Edad - " + this.getEdad() + ", Peso - " + this.getPeso();
    }
}