package GestionHabitats;

public class Acuatico extends Habitat {

    boolean puede_nadar;

    public Acuatico(float temperatura, float humedad, boolean limpieza, boolean puede_nadar) {
        super(temperatura, humedad, limpieza);
        this.puede_nadar = puede_nadar;
    }

    @Override
    public String toString() {
        return "Actuatico [puede_nadar=" + puede_nadar + "]";
    }

    public boolean isPuede_nadar() {
        return puede_nadar;
    }

    public void setPuede_nadar(boolean puede_nadar) {
        this.puede_nadar = puede_nadar;
    }
}