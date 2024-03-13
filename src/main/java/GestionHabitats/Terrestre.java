package GestionHabitats;

public class Terrestre extends Habitat {
    public Terrestre(String nombre, double temperatura, double humedad) {
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
        return "Terrestre: " + getNombre();
    }
}