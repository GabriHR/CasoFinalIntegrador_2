package GestionMantenimiento;
public abstract class DispositivoSeguridad {
    protected String ubicacion;
    protected boolean estado;

    public DispositivoSeguridad(String ubicacion) {
        this.ubicacion = ubicacion;
        this.estado = false;
    }

    public abstract void activar();

    public abstract void desactivar();

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isActivo() {
        return estado;
    }

    public abstract String verificarEstado();
}