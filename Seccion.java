import java.util.HashSet;
import java.util.stream.Collectors;

public class Seccion {
    private String nombre;

    HashSet<Stand> stands = new HashSet<>();

    public Seccion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Stand> getStands() {
        return stands;
    }

    public void agregarStand (Stand stand) {
        stands.add(stand);
    }

    HashSet<Stand> standschicos = (HashSet<Stand>) stands.stream().filter(x -> x.getTipo() == "chico").collect(Collectors.toSet());
    HashSet<Stand> standsmedianos = (HashSet<Stand>) stands.stream().filter(x -> x.getTipo() == "mediano").collect(Collectors.toSet());
    HashSet<Stand> standsgrandes = (HashSet<Stand>) stands.stream().filter(x -> x.getTipo() == "grnade").collect(Collectors.toSet());

}
