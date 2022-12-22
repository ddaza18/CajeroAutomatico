public class Deposito extends Cajero {
    @Override
    public void transacciones() {
        Deposito();

        if (depositos <= 1005000 && depositos % 100 == 0) {
            transacciones = getsaldoCuenta();
            setSaldoCuenta(transacciones + depositos);
            System.out.println("Usted ha Depositado: " + depositos);
            System.out.println("Tu saldo actual es: " + getsaldoCuenta());
        } else {
            System.out.println("El deposito fue fallido, Intente Nuevamente");
        }
    }
}
