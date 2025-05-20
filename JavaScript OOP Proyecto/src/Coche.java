import java.time.LocalDate;
import java.util.ArrayList;

public class Coche {
    // atributos
    private String duenio;
    private LocalDate fecha;
    private ArrayList<String> averias;
    private String marca;


    public Coche(String duenio, LocalDate fecha, ArrayList averias, String marca) {
        this.duenio = duenio;
        this.fecha = fecha;
        this.averias = averias;
        this.marca = marca;

    }

    // devuelve true or false de un coche si tiene averias o no
    public boolean tieneAverias() {
        return averias != null && !averias.isEmpty();
    }
    // getters and setters
    public String getDuenio() { //devuelve nombre duenio del coche
        return duenio;
    }

    public void setDuenio() { //cambia nombre duenio del coche
        this.duenio = duenio;
    }

    public LocalDate getFecha() { //devuelve fecha del coche en el taller
        return fecha;
    }

    public ArrayList<String> getAverias() {
        return new ArrayList<>(averias); //devuelva una copia de la lista de coches
    }

    public void setAverias(ArrayList<String> averias) {
        this.averias = averias;

    }

    // Sobreescriir el mismo metodo cn toString()
    @Override
    public String toString() {
        return marca;
    }


}
