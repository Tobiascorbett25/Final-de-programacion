// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
            int numeros=1;
            int par=0;
            while(numeros<=100){
                if(numeros%2==0){
                    par++;
                    System.out.println(numeros);
                }
                numeros++;
            }
            System.out.println("Los numeros pares: "+numeros);
        }
}