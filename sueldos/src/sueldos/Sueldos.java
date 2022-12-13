
//clase para sueldos
package sueldos;

    public class Sueldos {

        private String nombre;
        private int idNumero;
        private double basico;
        private double horasTrabajadas;

        public Sueldos(String n, int i) {
            nombre = n;
            idNumero = i;
        }

        public void setNombre(String n) {
            nombre = n;
        }

        public String getNombre() {
            return nombre;
        }

        public void setIdNumero(int i) {
            idNumero = i;
        }

        public int getIdNumero() {
            return idNumero;
        }

        public void setBasico(double p) {
            basico = p;
        }

        public double getBasico() {
            return basico;
        }

        public void setHorasTrabajadas(double h) {
            horasTrabajadas = h;
        }

        public double getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public double getSueldoBruto() {
            return basico + (horasTrabajadas * 10);
        }

    }



