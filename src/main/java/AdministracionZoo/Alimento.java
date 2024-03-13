package AdministracionZoo;

public class Alimento extends Recursos {
    private String tipoAlimento;

    public Alimento(String nombre, int cantidad, String tipoAlimento) {
        super(nombre, cantidad);
        this.tipoAlimento = tipoAlimento;
    }

    @Override
    public String getDescripcion() {
        return "Alimento: " + nombre + ", cantidad: " + cantidad + ", tipo: " + tipoAlimento;
    }
}