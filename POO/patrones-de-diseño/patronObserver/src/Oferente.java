package src;

import java.util.List;

public class Oferente implements Observer{
    private String nombre;

    private String apellido;

    private String DNI;

    private int montoTope;


    @Override
    public String notificar(int mensaje) {
        if (mensaje < montoTope) {
            return "Nueva notificacion para : " + nombre + " - " + mensaje;
        }

    }
}
