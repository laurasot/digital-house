package src;

public class Rectangulo implements Figura{
    private int alto;
    private int largo;


    public Rectangulo(int alto, int largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public Integer area() {
        return alto*largo;
    }
}
