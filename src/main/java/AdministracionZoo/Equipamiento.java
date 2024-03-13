package AdministracionZoo;

public class Equipamiento extends Recursos {
    private String tipoEquipamiento;

    public Equipamiento(String nombre, int cantidad, String tipoEquipamiento) {
        super(nombre, cantidad);
        this.tipoEquipamiento = tipoEquipamiento;
    }

    @Override
    public String getDescripcion() {
        return "Equipamiento: " + nombre + ", Cantidad: " + cantidad + ", Tipo: " + tipoEquipamiento;
    }
}