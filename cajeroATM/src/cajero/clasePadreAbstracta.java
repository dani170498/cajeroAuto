package cajero;

public class clasePadre_Abstracta {
    protected int transacciones, retiros, depositos;
    private static int saldo;
    Scanner sc = new Scanner(System.in);
    public void operaciones(){

        int seleccion = 0;

        do{
            System.out.println("");
            System.out.println("1. Ingresar dinero en cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");
            System.out.println("Elige una opción");
            seleccion = sc.nextInt();
                switch(seleccion){

    case 1:
        System.out.println("Ingresa la cantidad a depositar");
        int cantidad = sc.nextInt();
        depositos++;
        saldo = saldo + cantidad;
        break;
    case 2:
        System.out.println("Ingresa la cantidad a retirar");
        int cantidad2 = sc.nextInt();
        retiros++;
        saldo = saldo - cantidad2;
        break;
    case 3:
        System.out.println("Tu saldo es de: " + saldo);
        break;
    case 4:
        System.out.println("Gracias por usar nuestros servicios");
        break;

    default:
        System.out.println("Opción no válida");
        break;

}

    }while(seleccion != 4);
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

    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }

}

