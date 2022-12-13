package cajero;

public class Main {
    public static void main(String[] args) {
    clasePadre_Abstracta mensajero = new claseHija_Retiro();
    mensajero.setSaldo(500);
    mensajero.operaciones();

    }
}