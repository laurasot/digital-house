package src;

public interface Observable {
    public void agregar(Observer observer);
    public void eliminar(Observer observer);
    public void notificarObserver();
}
