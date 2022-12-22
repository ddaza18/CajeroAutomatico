public class Retiro extends Cajero {
    @Override
    public void transacciones() {
        Retiros();

        if (retiros < 100000) {
            if (retiros <= getsaldoCuenta()) {
                transacciones = getsaldoCuenta();
                setSaldoCuenta(transacciones - retiros);
                System.out.println("Usted ha retirado: " + retiros);
                System.out.println("Tu saldo actual es: " + getsaldoCuenta());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("No es posible retirar el monto.");
        }
    }
}
