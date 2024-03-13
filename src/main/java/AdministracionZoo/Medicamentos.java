package AdministracionZoo;

public class Medicamentos extends Recursos {
    private String uso;

    public Medicamentos(String nombre, int cantidad, String uso) {
        super(nombre, cantidad);
        this.uso = uso;
    }

    @Override
    public String getDescripcion() {
        return "Medicamento: " + nombre + ", Cantidad: " + cantidad + ", Uso: " + uso;
    }
}