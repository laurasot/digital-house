package src;

public class Triangulo implements Figura {

    private int base;

    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Integer area() {

        int area = (this.base*this.altura)/2;
        return area;
    }
}
