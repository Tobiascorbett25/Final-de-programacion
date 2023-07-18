public class Ejercicio3 {
    public static void main(String[] args) {

            cuentabancaria[] cuenta = new cuentabancaria[2];
            cuenta[0] = new cuentabancaria("Marcos", 250000);
            cuenta[1] = new cuentabancaria("Tobias", 45000);

            for (cuentabancaria objeto : cuenta) {
                System.out.println("El Nombre del usario es: " + objeto.getNumerodecuenta() + ". " + "El usario Posee un saldo de: " + objeto.getSaldo()+ " Pesos");
            }
        }
    }

    class cuentabancaria {
        private
        String numerodecuenta;
        int saldo;
        public
        cuentabancaria(String nc, int s){
            numerodecuenta = nc;
            saldo = s;

        }
        String getNumerodecuenta (){
            return numerodecuenta;
        }
        int getSaldo() {
            return saldo;
        }
    }



