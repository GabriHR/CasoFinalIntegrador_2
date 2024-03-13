package AdministracionZoo;

public abstract class Recursos {
    protected String nombre;
    protected int cantidad;

    public Recursos(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public abstract String getDescripcion();
}