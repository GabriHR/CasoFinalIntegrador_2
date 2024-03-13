package AdministracionZoo;

public class RecursosConcretos extends Recursos {
    public RecursosConcretos(String nombre, int cantidad) {
        super(nombre, cantidad);
    }

    @Override
    public String getDescripcion() {
        return "Recurso: " + getNombre() + ", Cantidad: " + getCantidad();
    }
}