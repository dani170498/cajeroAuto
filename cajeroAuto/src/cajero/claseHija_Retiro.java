package cajero;

public class claseHija_Retiro extends clasePadre_Abstracta{
    @Override
    public void transacciones() {
        System.out.println("--------------------------------------");
        System.out.print("Cuanto dinero deseas retirar?");
        retiro();
        if(retiros <= getSaldo()){
            transacciones= getSaldo();
            setSaldo(transacciones-retiros);
            System.out.println("--------------------------------------");
            System.out.println("Retiro exitoso");
            System.out.println("Tu saldo actual es de: " + getSaldo());
            System.out.println("--------------------------------------");
        }else{
            System.out.println("--------------------------------------");
            System.out.println("No cuentas con saldo suficiente");
            System.out.println("--------------------------------------");
        }
    }
}
