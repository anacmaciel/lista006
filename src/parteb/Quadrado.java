package partb;

import parteb.Figura;
import parteb.FiguraGeometrica;

public class Quadrado extends Figura  implements FiguraGeometrica {

    private double lado;

    public Quadrado(double area, double perimetro, double lado) {
        super(area, perimetro);
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
