package cajero;

public class claseHijaConsulta extends clasePadre_Abstracta{
    @Override
    public void transacciones(){
        System.out.println("-----------------------");
        System.out.println("tu saldo actual es: "+ getSaldo());
        System.out.println("-----------------------");

    }
}

