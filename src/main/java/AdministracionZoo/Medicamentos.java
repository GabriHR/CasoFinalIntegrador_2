package AdministracionZoo;

public class Medicina extends Recursos {
    private String uso;
    private boolean necesitaPrescripcion;
    private boolean esAntibiotico;

    public Medicina(String nombre, int cantidad, String uso, boolean necesitaPrescripcion, boolean esAntibiotico) {
        super(nombre, cantidad);
        this.uso = uso;
        this.necesitaPrescripcion = necesitaPrescripcion;
        this.esAntibiotico = esAntibiotico;
    }

    // getters y setters
}