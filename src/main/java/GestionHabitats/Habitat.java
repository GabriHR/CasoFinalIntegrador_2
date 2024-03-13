package GestionHabitats;

public abstract class Habitat {
    protected String nombre;
    protected int capacidad;
    protected double humedad;
    protected double temperatura;

    public Habitat(String nombre, double temperatura, double humedad) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public String getHabitat() {
        return "Habitat";
    }
}