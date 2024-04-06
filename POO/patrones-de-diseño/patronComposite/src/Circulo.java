package src;

public class Circulo  implements Figura{
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public Integer area() {
        return (int) (radio*radio*Math.PI);
    }
}
