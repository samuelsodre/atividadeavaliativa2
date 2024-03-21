import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {

    // declaração de variáveis
    Scanner ler = new Scanner(System.in);
    String nome;
    int idade;
    double salario;
    char sexo, estadoCivil;

    // validação das informações (nome, idade, salário, sexo e estado civil)
    do {
      System.out.println("Digite seu nome (mais de 3 caracteres): ");
      nome = ler.nextLine();
    } while (nome.length() <= 3);

    do {
      System.out.println("Digite sua idade (entre 0 e 150): ");
      idade = ler.nextInt();
    } while (idade < 0 || idade > 150);

    do {
      System.out.println("Digite seu salário (maior que 0): ");
      salario = ler.nextDouble();
    } while (salario <= 0);
    
    do {
      System.out.println("Digite seu sexo (f/m): ");
      sexo = ler.next().charAt(0);
    } while (sexo != 'f' && sexo != 'm');

    do {
      System.out.println("Digite seu estado civil (s/c/v/d): ");
      estadoCivil = ler.next().charAt(0);
    } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

    ler.close();

    System.out.println("Cadastro feito. Confira seus dados:");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salário: " + salario);
    System.out.println("Sexo: " + sexo);
    System.out.println("Estado civil: " + estadoCivil);


  }
}