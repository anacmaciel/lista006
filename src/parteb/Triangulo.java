package parteb;

public class Triangulo extends Figura{

    public Triangulo (double cumprimento, double base, double altura) {
        super(cumprimento, base, altura);
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return base*altura/2;
    }

}

