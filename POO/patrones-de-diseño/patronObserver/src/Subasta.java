package src;

import java.util.ArrayList;
import java.util.List;

public class Subasta implements Observable {

    private int monto = 0;
    private String descripcion;

    private List<Observer> oferentes;

    public Subasta(int monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.oferentes = new ArrayList<>();
    }

    @Override
    public void agregar(Observer observer) {
        this.oferentes.add(observer);
    }

    @Override
    public void eliminar(Observer observer) {
        this.oferentes.remove(observer);
    }

    @Override
    public void notificarObserver() {
        for (Observer oferente : oferentes) {
            oferente.notificar( this.monto);
        }
    }
}
