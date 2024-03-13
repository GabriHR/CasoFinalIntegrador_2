package Animales;

public class Animal_Acuatico extends Animal {
    private String habilidad;
    private String genero;

    public Animal_Acuatico(String nombre, String especie, String sexo, int edad, double peso, String habitat, String alimentacion) {
        super(nombre, especie, sexo, edad, peso, habitat, alimentacion);
        this.habilidad = "puede nadar a gran velocidad";
        this.genero = "hembra";
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescripcion() {
        return "Descripción del " + this.getNombre() + ": Especie - " + this.getEspecie() + ", Sexo - " + this.getSexo() + ", Edad - " + this.getEdad() + ", Peso - " + this.getPeso();
    }

    public String getCondicionesClimatologicas() {
        return "Las condiciones climatológicas son ideales para un " + getNombre();
    }

    @Override
    public String toString() {
        return "Animal_Acuatico: " + getNombre() + ", Habitat: " + getHabitat();
    }

}