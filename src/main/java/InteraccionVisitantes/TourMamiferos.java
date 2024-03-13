package InteraccionVisitantes;

public class TourMamiferos extends Tour {
    @Override
    public void realizarTour() {
        System.out.println("Bienvenidos al tour de mamíferos. " +
                "Vamos a visitar el hábitat de los grandes felinos, " +
                "el hábitat de los primates y la casa de los osos.");
        System.out.println("Además, vamos a ver el espectáculo de leones marinos.");
        System.out.println("¡Esperamos que disfruten su visita!");
    }
}
