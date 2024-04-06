package src;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposite implements Figura {
    List<Figura> figuraCompleja;

    private String nombre;

    public FiguraComposite( String nombre) {
        this.figuraCompleja = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarFigura(Figura figura){
        figuraCompleja.add(figura);
    }

    @Override
    public Integer area() {
        return figuraCompleja.stream().mapToInt(Figura::area).sum();
    }
}
