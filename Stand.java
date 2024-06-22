public class Stand {
    private int precioBase;
    private int id;
    private String tipo;
    private boolean tieneElectricidad;

    public int getPrecioBase() {
        return this.precioBase;
    }

    public boolean isTieneElectricidad() {
        return tieneElectricidad;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Stand(int precioBase, int id, String tipo, boolean tieneElectricidad) {
        this.precioBase = precioBase;
        this.id = id;
        this.tipo = tipo;
        this.tieneElectricidad = tieneElectricidad;
    }

    public int calcularPrecio() {
        if (this.tieneElectricidad == false) {
            return Salon.getPrecioBase() + this.getPrecioBase();
        } else {
            return Salon.getPrecioBase() + this.getPrecioBase() + Salon.getPrecioElectricidad();
        }
    }

}
