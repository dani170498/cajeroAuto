package cajero;
import java.util.Scanner;
public abstract class clasePadre_Abstracta{
    protected int transacciones, retiros, depositos;
    private static int saldo;
    Scanner sc = new Scanner(System.in);
    public void operaciones(){
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("");
                System.out.println("1. Ingresar dinero en cuenta");
                System.out.println("2. Retirar dinero de la cuenta");
                System.out.println("3. Mostrar saldo");
                System.out.println("4. Salir");
                System.out.println("Elige una opción");
                seleccion = sc.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("----------------");
                    System.out.println("Opcion no valida");
                    System.out.println("----------------");
                }

                if(seleccion == 1) {
                    clasePadre_Abstracta mensajero = new claseHija_Deposito();
                    mensajero.transacciones();

                } else if (seleccion==2) {
                    clasePadre_Abstracta mensajero = new claseHija_Retiro();
                    mensajero.transacciones();
                } else if (seleccion == 3) {
                    clasePadre_Abstracta mensajero = new claseHija_Consulta();
                    mensajero.transacciones();
                } else if (seleccion == 4) {
                    System.out.println("---------------------------");
                    System.out.println("Gracias por usar nuestros servicios");
                    System.out.println("---------------------------");
                }


            } while (bandera == 0);
        } while (bandera != 2);

}
    //metodo para cantidad de retiro
    public void retiro(){
        retiros=sc.nextInt();
    }
    //metodo para cantidad de deposito
    public void deposito(){
        depositos=sc.nextInt();
    }


    public abstract void transacciones();
    //metodos get y set
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}