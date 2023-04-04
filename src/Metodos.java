public class Metodos {
    public static void main(String[] args) {
            Cuenta miCuenta = new Cuenta();
            miCuenta.saldo = 300;
            miCuenta.depositar(200);
            System.out.println("TU NUEVO SALDO ES: " + miCuenta.saldo);

            miCuenta.retirar(100);
            System.out.println("TU NUEVO SALDO ES: " + miCuenta.saldo);

            Cuenta cuentaDeDario = new Cuenta ();
            cuentaDeDario.depositar(1000);
            if (cuentaDeDario.transferir(400, miCuenta)){
                    System.out.println("TRANSACCION EXITOSA");
            }else {
                    System.out.println("TRANSACCION RECHAZADA");
            }

            System.out.println("TU NUEVO SALDO ES: " + cuentaDeDario.saldo);
            System.out.println("TU NUEVO SALDO ES: " + miCuenta.saldo);
    }
}
