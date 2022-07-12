public class Quadrado extends Figura{
    public Quadrado (double cumprimento, double base, double altura) {
        super(cumprimento, base, altura);
    }

    public double  calcularArea(double lado) {

        return lado * lado;
    }
}
