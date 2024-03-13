package InteraccionVisitantes;

public class TourAves extends Tour {
    @Override
    public void realizarTour() {
        System.out.println("Bienvenidos al tour de aves. " +
                "Vamos a visitar el aviario tropical, el aviario de aves rapaces " +
                "y la casa de los pájaros cantores.");
        System.out.println("Además, vamos a ver el espectáculo de aves rapaces.");
        System.out.println("¡Esperamos que disfruten su visita!");
    }
}