import java.util.Scanner;

import GestionHabitats.Acuatico;
import GestionHabitats.Aviario;
import GestionHabitats.Terrestre;
import Animales.Animal_Acuatico;
import Animales.Animal_Aviario;
import Animales.Animal_Terrestre;
import AdministracionZoo.Alimento;
import AdministracionZoo.Equipamiento;
import AdministracionZoo.Medicamentos;
import AdministracionZoo.RecursosConcretos;
import GestionMantenimiento.Camaras;
import GestionMantenimiento.SensorMovimiento;

public class App {
    public static void main(String[] args) {
        // Crear instancias de diferentes habitats
// Crear instancias de diferentes habitats
        Acuatico acuatico = new Acuatico("Acuático", 25.0, 65.0);
        Aviario aviario = new Aviario("Jardín de las Aves", 20.0, 60.0);
        Terrestre terrestre = new Terrestre("Sabana Africana", 30.0, 70.0);

        // Crear instancias de Animales
        Animal_Acuatico animalAcuatico = new Animal_Acuatico("Delfín", "delfín", "macho", 8, 200.0, "oceano", "pescado");
        Animal_Terrestre animalTerrestre = new Animal_Terrestre("León", "felinos", "macho", 12, 190.0, "sabana", "carne", true, true, true, "Carnívoro");
        Animal_Aviario animalAviario = new Animal_Aviario("Águila", "accipítrido", "hembra", 5, 6.3, "montaña", "pequeños mamíferos", true, true);


        // Crear instancias de mantenimiento
        Alimento alimento1 = new Alimento("fruta de dragón", 10, "fruta exótica");
        Equipamiento equipamiento1 = new Equipamiento("Sistema de Climatizacion y Control Ambiental", 5, "equipo de alta tecnología");
        Medicamentos medicamento1 = new Medicamentos("antibiótico", 20, "medicamento para combatir infecciones");
        RecursosConcretos recurso1 = new RecursosConcretos("Equipo de transporte especializado ", 15);

        // Crear instancias de Camaras y SensorMovimiento
        Camaras camaraNorte = new Camaras("sección norte", true);
        Camaras camaraEste = new Camaras("la sección este", false);
        Camaras camaraOeste = new Camaras("la secció oeste", true);
        Camaras camaraSur = new Camaras("la sección sur", false);
        Camaras camaraPuertaPrincipal = new Camaras("la puerta principal", true);

        SensorMovimiento sensorDepredadores = new SensorMovimiento("el habitat de los depredadores", "leones", 3);
        SensorMovimiento sensorRapaces = new SensorMovimiento("la jaula de las rapaces", "águilas", 5);
        SensorMovimiento sensorPandas = new SensorMovimiento("la aula de los pandas", "pandas comiendo bambú", 2);

        // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario si es empleado o visitante
        System.out.println("Eres empleado o visitante? (Especifica 'empleado' o 'visitante'):");
        String tipoUsuario = scanner.nextLine();

        switch (tipoUsuario) {
            case "empleado":
                gestionEmpleado(scanner, animalAcuatico, animalTerrestre, animalAviario, aviario, terrestre, alimento1, equipamiento1, medicamento1, recurso1, camaraNorte, camaraEste, camaraOeste, camaraSur, camaraPuertaPrincipal, sensorDepredadores, sensorRapaces, sensorPandas);
                break;
            case "visitante":
                gestionVisitante(scanner);
                break;
            default:
                System.out.println("Tipo de usuario inválido.");
                break;
        }

        scanner.close();
    }

    private static void gestionEmpleado(Scanner scanner, Animal_Acuatico animalAcuatico, Animal_Terrestre animalTerrestre, Animal_Aviario animalAviario, Aviario aviario, Terrestre terrestre, Alimento alimento1, Equipamiento equipamiento1, Medicamentos medicamento1, RecursosConcretos recurso1, Camaras camaraNorte, Camaras camaraEste, Camaras camaraOeste, Camaras camaraSur, Camaras camaraPuertaPrincipal, SensorMovimiento sensorDepredadores, SensorMovimiento sensorRapaces, SensorMovimiento sensorPandas) {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Gestion de habitats");
        System.out.println("2. Rastreo de animales");
        System.out.println("3. Administracion de recursos");
        System.out.println("4. Mantenimiento de seguridad");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción de gestionar habitats:");
                System.out.println(aviario.getInformacionHabitat());
                System.out.println(terrestre.getInformacionHabitat());
                break;
            case 2:
                System.out.println("Has seleccionado la opción de rastreo de animales:");
                System.out.println(animalAcuatico.getDescripcion());
                System.out.println(animalTerrestre.getDescripcion());
                System.out.println(animalAviario.getDescripcion());
                break;
            case 3:
                System.out.println("Has seleccionado la opción de administración de recursos:");
                // Aquí puedes agregar el código para administrar recursos
                System.out.println(alimento1.getDescripcion());
                System.out.println(equipamiento1.getDescripcion());
                System.out.println(medicamento1.getDescripcion());
                System.out.println(recurso1.getDescripcion());
                break;
            case 4:
                System.out.println("Has seleccionado la opción de mantenimiento de seguridad:");
                // Aquí puedes agregar el código para el mantenimiento de seguridad
                System.out.println(camaraNorte.verificarEstado());
                System.out.println(camaraEste.verificarEstado());
                System.out.println(camaraOeste.verificarEstado());
                System.out.println(camaraSur.verificarEstado());
                System.out.println(camaraPuertaPrincipal.verificarEstado());
                System.out.println(sensorDepredadores.verificarEstado());
                System.out.println(sensorRapaces.verificarEstado());
                System.out.println(sensorPandas.verificarEstado());
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    private static void gestionVisitante(Scanner scanner) {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Tour sobre mamíferos");
        System.out.println("2. Tour sobre acuáticos");
        System.out.println("3. Tour para niños");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                tourMamiferos();
                break;
            case 2:
                showDelfinesFocas();
                break;
            case 3:
                alimentarElefantes();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    private static void tourMamiferos() {
        System.out.println("Bienvenido al tour de mamíferos. Aquí podrán ver a los mamíferos en su hábitat natural.");
        System.out.println("Podrán ver como se comportan los leones, tigres y osos.");
        System.out.println("Además podrán ver a los pandas comiendo bambú.");
        System.out.println("¡No se lo pierdan!");
    }

    private static void showDelfinesFocas() {
        System.out.println("Bienvenidos al show de delfines y focas. Aquí podrán ver a los delfines y focas realizar acrobacias.");
        System.out.println("¡Es un espectáculo que no se pueden perder!");
    }

    private static void alimentarElefantes() {
        System.out.println("Bienvenidos al tour para niños. Aquí podréis darle de comer a los elefantes.");
        System.out.println("Además, podréis ver a los animales más amigables del zoo.");
        System.out.println("¡A disfrutar niños!");
    }
}