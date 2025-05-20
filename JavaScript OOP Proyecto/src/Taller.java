import java.util.ArrayList;

// clase publica taller
public class Taller {
    // declaración de atributo privado lista que almacena los objetos de tipo Coche
    private ArrayList<Coche> coches;

    // constuctor clase taller
    public Taller() {
        this.coches = new ArrayList<>();
    }

    // método agregar coches
    public void agregarCoche(Coche coche) { // public void por que no devuelve. Parametro coche de tipo Coche
        if (coche != null) {
            coches.add(coche); //Evita agregar valor null
        }

    }

    // método entrega coches
    public Coche entregar(String duenio) throws CocheConAveriasException {
        for (int i = 0; i < coches.size(); i++) {
            Coche coche = coches.get(i);
                // verificar si duenio es null para evitar error
        if (coche.getDuenio().equals(duenio)) {
            if (coche.tieneAverias()) {
                throw new CocheConAveriasException("No se puede entregar el coche de " + duenio + " porque tiene averías");
            }
            coches.remove(i);
            return coche;
        }
        }
        throw new IllegalArgumentException("No se encontró coche con dueño: " + duenio + ".");
    }

    public ArrayList<Coche> getCoches() {
        return new ArrayList<>(coches);
    }
}
