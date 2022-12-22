import java.util.Scanner;

//Clase abstracta principal del cajero
public abstract class Cajero {
    protected int transacciones, retiros, depositos;
    private static int saldoCuenta;
    Scanner entradaDatos = new Scanner(System.in);

    public void operaciones() {
        int opt = 0;
        do {
            System.out.println("|##### CAJERO AUTOMATICO ######|");
            System.out.println("|1.Consulta de saldo           |");
            System.out.println("|2.Retiro                      |");
            System.out.println("|3.Deposito                    |");
            System.out.println("|4.Salir                       |");

            // Con el nextInt leemos los datos de tipo entero
            opt = entradaDatos.nextInt();

            switch (opt) {

                case 1:
                    Cajero mensaje = new Consulta();
                    mensaje.transacciones();
                    break;

                case 2:
                    Cajero mensajero = new Retiro();
                    mensajero.transacciones();
                    break;

                case 3:
                    Cajero mensajeroT = new Deposito();
                    mensajeroT.transacciones();
                    break;

                case 4:
                    System.out.println("Gracias por operar con nosotros.");
                    break;
                default:
                    System.out.println("Digite una opcion valida");
            }

        } while (opt != 4);
    }

    // Funcion Retiros
    public void Retiros() {
        System.out.println("¿Cuanto desea Retirar?");
        retiros = entradaDatos.nextInt();
    }

    // Funcion Deposito
    public void Deposito() {
        System.out.println("¿Cuanto desea Depositar?");
        depositos = entradaDatos.nextInt();
    }

    public abstract void transacciones();

    public int getsaldoCuenta() {

        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {

        this.saldoCuenta = saldoCuenta;
    }
}
