
import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {

    // declaraçao das variáveis
    Scanner ler = new Scanner(System.in);
    int nota;
    
    // validação se a nota digitada está no intervalo inteiro de 0-10
    while (true) {
      System.out.println("Digite uma nota entre 0 e 10: "); 
      nota = ler.nextInt();
      if (nota < 0 || nota > 10) {
        System.out.println("Valor inválido. Digite uma nota entre 0 e 10: ");
        continue;
      } else {
        System.out.println("Valor válido.");
        break;
      }
    }
    ler.close();
  }
}