package parteb;

public class Quadrado implements FiguraGeometrica {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double  calcularArea() {

        return lado * lado;
    }

    public double calcularPerimetro() {

        return 4 * lado;
    }
}
