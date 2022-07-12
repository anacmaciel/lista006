package parteb;



public class Retangulo extends Figura{

    public Retangulo (double cumprimento, double base, double altura) {
        super(cumprimento, base, altura);
    }


    public double calcularArea(double base, double altura) {
        return base*altura;
    }

}
