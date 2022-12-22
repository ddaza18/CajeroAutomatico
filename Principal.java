public class Principal {
    public static void main(String args[]) {
        Cajero mensajero = new Consulta();
        mensajero.setSaldoCuenta(100000);
        mensajero.operaciones();
    }
}
