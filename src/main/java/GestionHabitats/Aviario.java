package GestionHabitats;

public class Aviario extends Habitat {
    public Aviario(String nombre, double temperatura, double humedad) {
        super(nombre, temperatura, humedad);
    }

    public String getInformacionHabitat() {
        return "Habitat: " + this.getNombre() + ", Temperatura: " + this.getTemperatura() + ", Humedad: " + this.getHumedad();
    }

    public String getCondicionesClimatologicas() {
        return "Las condiciones climatológicas son ideales para un " + getNombre();
    }

    @Override
    public String toString() {
        return "Aviario: " + getNombre();
    }
}