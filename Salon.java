import java.util.HashSet;

public class Salon {
    private int precioBase;
    private int precioElectricidad;

    HashSet<Seccion> secciones = new HashSet<>();

    public void agregarSeccion(Seccion seccion) {
        secciones.add(seccion);
    }

    public Salon(int precioBase, int precioElectricidad) {
        this.precioBase = precioBase;
        this.precioElectricidad = precioElectricidad;
    }

    public int getPrecioElectricidad() {
        return precioElectricidad;
    }

    public int getPrecioBase() {
        return precioBase;
    }
}
