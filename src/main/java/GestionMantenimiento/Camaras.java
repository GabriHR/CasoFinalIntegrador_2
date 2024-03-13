package GestionMantenimiento;
public class Camaras extends DispositivoSeguridad {
    private boolean encendido;

    public Camaras(String ubicacion, boolean encendido) {
        super(ubicacion);
        this.encendido = encendido;
    }

    @Override
    public void activar() {
        this.encendido = true;
    }

    @Override
    public void desactivar() {
        this.encendido = false;
    }

    @Override
    public String verificarEstado() {
        return "La cámara en " + ubicacion + " está " + (encendido ? "encendida" : "apagada");
    }
}