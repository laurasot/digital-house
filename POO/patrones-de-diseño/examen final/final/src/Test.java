import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        PizzaSimple pizzaMuzzarella = new PizzaSimple("Muzzarella", "Pizza con salsa de tomate, mozzarella y albahaca", 700);
        PizzaSimple pizzaMargaritaEspecial = new PizzaSimple("Margarita", "Pizza con salsa de tomate, mozzarella, albahaca y tomates cherry", 850);
        pizzaMargaritaEspecial.pizaEspecial();
        PizzaSimple pizzaAnana = new PizzaSimple("Ananá", "Pizza con salsa de tomate, mozzarella y ananá", 950);

        List<PizzaSimple> pizzasCombinadaLoca = Arrays.asList(pizzaMargaritaEspecial, pizzaAnana);
        PizzaCombinada pizzaCombinadaLoca = new PizzaCombinada("Loca", "Mitad Margarita y mitad Ananá", pizzasCombinadaLoca);

        System.out.println("Pizza Muzzarella: " + pizzaMuzzarella.getNombre() + " - Precio: $" + pizzaMuzzarella.getPrecio());
        System.out.println("Pizza Margarita Especial: " + pizzaMargaritaEspecial.getNombre() + " - Precio: $" + pizzaMargaritaEspecial.getPrecio());
        System.out.println("Pizza Ananá: " + pizzaAnana.getNombre() + " - Precio: $" + pizzaAnana.getPrecio());
        System.out.println("Pizza Combinada Loca: " + pizzaCombinadaLoca.getNombre() + " - Precio: $" + pizzaCombinadaLoca.getPrecio());

    }
}
