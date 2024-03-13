package GestionMantenimiento;
public class SensorMovimiento extends DispositivoSeguridad {
    private String animal;
    private int cantidad;

    public SensorMovimiento(String ubicacion, String animal, int cantidad) {
        super(ubicacion);
        this.animal = animal;
        this.cantidad = cantidad;
    }

    @Override
    public void activar() {

    }

    @Override
    public void desactivar() {

    }

    @Override
    public String verificarEstado() {
        return "El sensor de movimiento en " + ubicacion + " detecta " + cantidad + " " + animal;
    }
}