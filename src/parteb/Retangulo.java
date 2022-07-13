package parteb;



public class Retangulo implements FiguraGeometrica {

 private double altura;
private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public  double calcularArea() {
        return base * altura;
    }

    public  double calcularPerimetro() {
        return 2 * (base + altura);
    }

}
