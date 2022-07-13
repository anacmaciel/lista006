package parteb;

public abstract class Figura{
  private double area;
        private double perimetro;


    public Figura(double area, double perimetro) {
        this.area = calcularArea();
        this.perimetro = calcularPerimetro();
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
