import java.util.Scanner;

public class App{

    public static boolean verificaFibonacci(int num){
        
        int a = 0, b = 1;
        int seq = a + b;
        
        if (num == 0 || num == 1){
            return true;
        }
        
        while(seq <= num){
            if (seq == num){
                return true;
            }
            a = b;
            b = seq;
            seq = a + b;
        }

        return false;

    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numUsuario;


        System.out.println("Por favor, digite o número para descobrirmos se faz parte da sequencia de Fibonacci: ");
        numUsuario = teclado.nextInt();

        if (verificaFibonacci(numUsuario)){
            System.out.println("O número: " + numUsuario + " faz parte da sequencia de Fibonacci");
        }
        else {
            System.out.println("O número: " + numUsuario + " não faz parte da sequencia de Fibonacci");
        }

        teclado.close();

    }

}