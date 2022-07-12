package parteb;


    public class Circulo extends Figura{

        public Circulo (double cumprimento, double base, double altura) {
            super(cumprimento, base, altura);
        }

        public double calcularArea(double diametro) {
             diametro= Math.pi * raio * raio;
            return diametro;
        }

    }


