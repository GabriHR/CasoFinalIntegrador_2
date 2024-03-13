package GestionHabitats;

public class Acuatico extends Habitat {
    public Acuatico(String nombre, double temperatura, double humedad) {
        super(nombre, temperatura, humedad);
    }

    public String getCondicionesClimatologicas() {
        return "Las condiciones climatológicas son ideales para un " + getNombre();
    }

    @Override
    public String toString() {
        return "Animal_Acuatico: " + getNombre() + ", Habitat: " + getHabitat();
    }
}