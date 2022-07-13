package parteb;


    public class Circulo extends Figura implements  FiguraGeometrica{

private  double raio;

        public Circulo(double area, double perimetro, double raio) {
            super(area, perimetro);
            this.raio = raio;
        }

        public double getRaio() {
            return raio;
        }

        public void setRaio(double raio) {
            this.raio = raio;
        }

        public double calcularArea() {

            return 3.14 * raio * raio;
        }

public  double calcularPerimetro() {
            return  2 * 3.14 * raio;
}

    }


