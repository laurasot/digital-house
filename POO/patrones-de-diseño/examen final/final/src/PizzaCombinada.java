import java.util.List;

public class PizzaCombinada extends Pizza {
    private List<PizzaSimple> pizzas;

    public PizzaCombinada(String nombre, String descripcion, List<PizzaSimple> pizzas) {
        super(nombre, descripcion);
        this.pizzas = pizzas;
    }

    public List<PizzaSimple> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaSimple> pizzas) {
        this.pizzas = pizzas;
    }

    public double getPrecio() {
        double precioMax = 0;
        for (PizzaSimple pizza : pizzas) {
            if (pizza.getPrecio() > precioMax) {
                precioMax = pizza.getPrecio();
            }
        }
        return precioMax;
    }
}
