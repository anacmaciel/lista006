package parteb;


    public class Circulo implements FiguraGeometrica{

private  double raio;


        public Circulo(double raio) {
            this.raio = raio;
        }


        public double getRaio() {
            return raio;
        }

        public void setRaio(double raio) {
            this.raio = raio;
        }

        public double calcularArea(double diametro) {
             diametro= 3.14 * raio * raio;
            return diametro;
        }

public  double calcularPerimetro() {
            return  2 * 3.14 * raio;
}

    }


