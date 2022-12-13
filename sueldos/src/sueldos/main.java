package sueldos;

public class main {

        public static void main(String[] args) {
            // TODO code application logic here
            Sueldos sueldo1 = new Sueldos("Juan", 1);
            sueldo1.setBasico(1000);
            sueldo1.setHorasTrabajadas(10);
            System.out.println("El sueldo bruto de " + sueldo1.getNombre() + " es " + sueldo1.getSueldoBruto());
        }

}
