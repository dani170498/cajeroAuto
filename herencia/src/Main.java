public class Main {
    public static void main(String[] args) {
    Cliente Cliente = new Cliente();
        System.out.println("datos de cliente");
    Cliente.nombre="Jose perez";
    Cliente.edad=56;
    Cliente.telefono=89445698;
    Cliente.credito=15000;
        System.out.println(Cliente.nombre);
        System.out.println(Cliente.edad+" años");
        System.out.println(Cliente.telefono+" bolivia");
        System.out.println(Cliente.credito+" $");

        //trabajador
        System.out.println("datos trabajador");
    Trabajador Trabajador= new Trabajador();
    Trabajador.nombre="Daniel Arteaga";
    Trabajador.edad=24;
    Trabajador.telefono=77220757;
    Trabajador.salario=1500;
        System.out.println(Trabajador.nombre);
        System.out.println(Trabajador.edad+" años");
        System.out.println(Trabajador.telefono+" bolivia");
        System.out.println(Trabajador.salario+" $");
    }

}
class persona{
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends persona{
    int credito;
}

class Trabajador extends persona{
    int salario;

}
