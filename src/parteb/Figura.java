package parteb;

public abstract class Figura{
  private double cumprimento;
        private double base;
        private double altura;

        public Figura(double cumprimento, double base, double altura) {
            this. cumprimento=cumprimento;
            this.base = 15;
            this.altura = 10;
        }

        public double getCumprimento() {
            return cumprimento;
        }
        public void setCumprimento (double cumprimento) {
            this.cumprimento = cumprimento;
        }

        public double getBase () {
            return base;
        }

        public void setBase (double base) {
            this.base = base;
        }

        public double getAltura () {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }


    }



