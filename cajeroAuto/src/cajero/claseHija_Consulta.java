package cajero;

public class claseHija_Consulta extends clasePadre_Abstracta{
    @Override
    public void transacciones(){
        System.out.println("--------------------------------------");
        System.out.println("Tu saldo actual es de: " + getSaldo());
        System.out.println("--------------------------------------");
    }
}

