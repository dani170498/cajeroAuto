package cajero;

public class claseHija_Deposito extends clasePadre_Abstracta{

    public void transacciones(){
        System.out.print("cuanto desea depositar");
        deposito();

        transacciones=getSaldo();
        setSaldo(transacciones+depositos);
        System.out.println("--------------------------------------");
        System.out.println("Deposito exitoso");
        System.out.println("Tu saldo actual es de: " + getSaldo());
        System.out.println("--------------------------------------");

    }
}
