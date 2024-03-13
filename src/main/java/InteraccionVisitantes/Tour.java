package InteraccionVisitantes;

import java.util.Scanner;

public class Tour {
    private final TourNinos tourNinos = new TourNinos();
    private final TourAves tourAves = new TourAves();
    private final TourMamiferos tourMamiferos = new TourMamiferos();

    public void realizarTour() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos al zoológico. Por favor, elige un tour:");
        System.out.println("1. Tour para niños");
        System.out.println("2. Tour de aves");
        System.out.println("3. Tour de mamíferos");

        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                tourNinos.realizarTour();
                break;
            case 2:
                tourAves.realizarTour();
                break;
            case 3:
                tourMamiferos.realizarTour();
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige un número del 1 al 3.");
                realizarTour();
                break;
        }
    }
}