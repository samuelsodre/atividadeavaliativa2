import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {

    // declaração das variáveis
    Scanner ler = new Scanner(System.in);
    String usuario, senha;
    
    // validação de cadastro (usuário e senha não podem ser iguais)
    while (true) {
      System.out.println("Escolha um usuário: ");
      usuario = ler.nextLine();
      System.out.println("Escolha uma senha: ");
      senha = ler.nextLine();

      if (usuario.equals(senha)) {
        System.out.println("Erro. Seu usuário e senha não podem ser iguais. Tente novamente.");
        continue;
      } else {
        System.out.println("Cadastro realizado.");
        break;
      }
    }
    ler.close();   
  }
}
