public class PizzaSimple extends Pizza {
    private double precioBase;
    private boolean esEspecial;

    public PizzaSimple(String nombre, String descripcion, double precioBase) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esEspecial = false;
    }

    public void pizaEspecial() {
        this.esEspecial = true;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isEspecial() {
        return esEspecial;
    }

    public void setEspecial(boolean esEspecial) {
        this.esEspecial = esEspecial;
    }

    public double getPrecio() {
        return esEspecial ? precioBase * 1.7 : precioBase;
    }
}
