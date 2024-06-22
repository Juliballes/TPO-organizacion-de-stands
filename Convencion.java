import java.util.HashSet;

public class Convencion {

    private String nombre;

    HashSet <Salon> salones = new HashSet<>();

    public void agregarSalon (Salon salon) {
        salones.add(salon);
    }

    public Convencion(String nombre) {
        this.nombre = nombre;
        this.salones = salones;
    }
}
