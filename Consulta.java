public class Consulta extends Cajero {
    // @override para indicar que el método está anulando su método de clase
    // principal,
    @Override
    public void transacciones() {
        System.out.println("| Su saldo actual es: " + getsaldoCuenta());
    }
}
