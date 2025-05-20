import java.lang.reflect.Array;
import java.util.ArrayList;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Taller taller = new Taller();

        // Coche con averías
        ArrayList<String> averias = new ArrayList<>();
        averias.add("Cristales rotos");
        averias.add("Batería muerta");
        averias.add("Nuematicos pinchados");
        averias.add("Motor pierde aceite");
        averias.add("Radiador pierde liquido");
        averias.add("Motor no arranca");
        averias.add("Radio no funciona");
        averias.add("Pastillas de freno gastadas");
        averias.add("Correa de distribución rota");

        // Coche 1
        Coche Mitsubishi = new Coche("Pablo", LocalDate.of(2025,05,19), averias, "Mitsubishi");

        // Coche 2
        ArrayList<String> averiasRenault = new ArrayList<>();
        averiasRenault.add(averias.get(8));
        Coche Renault = new Coche("Juan", LocalDate.of(2025,05,19), averiasRenault, "Renault");

        // Coche 3
        ArrayList<String> averiasCitroen = new ArrayList<>();
        averiasCitroen.add(averias.get(0));
        averiasCitroen.add(averias.get(1));
        averiasCitroen.add(averias.get(2));
        Coche Citroen = new Coche("Sara", LocalDate.of(2025,05,19), averiasCitroen, "Citroen");

        // Coche 4

        Coche Honda = new Coche("Gianni", LocalDate.of(2025,05,19), null, "Honda");

        System.out.println("Lista de averías comunes: " + averias);
        System.out.println("Averias de coche Renault: " + Mitsubishi.getAverias());
        System.out.println("Averias de coche Renault: " + Renault.getAverias());
        System.out.println("Averías de coche Citroen: " + Citroen.getAverias());
        System.out.println("Averias de coche Honda: " + Honda.tieneAverias());

        System.out.println("\n");
        System.out.println("Ejecutando métodos de la clase Taller()");

        taller.agregarCoche(Mitsubishi);
        taller.agregarCoche(Renault);
        taller.agregarCoche(Citroen);
        taller.agregarCoche(Honda);


        try {
            System.out.println("Entregando coche de Pablo... ");
            Coche cocheEntregado = taller.entregar("Pablo");
            System.out.println("Coche entregado");
        } catch(CocheConAveriasException e){
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Entregando coche de Juan...");
            Coche cocheEntregado = taller.entregar("Juan");
            System.out.println("Coche Entregado");
        } catch(CocheConAveriasException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Entregando coche de Sara...");
            Coche cocheEntregado = taller.entregar("Sara");
            System.out.println("Coche entregado");
        } catch(CocheConAveriasException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Entregando coche de Gianni...");
            Coche cocheEntregado = taller.entregar("Gianni");
            System.out.println("Coche entregado correctamente.");
        } catch(CocheConAveriasException e) {
            System.out.println("Error: " +  e.getMessage());
        }

        System.out.println("Lista de coches en el taller: " + taller.getCoches());



    }
}