import java.util.Scanner;

// auxílio chatGPT
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorNumero = Integer.MIN_VALUE; 

        for (int i = 1; i < 6; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        sc.close();
        System.out.println("O maior número é: " + maiorNumero);
    }
}
