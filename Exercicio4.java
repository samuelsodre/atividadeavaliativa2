public class Exercicio4 {
    public static void main(String[] args) {

        // declaração de variáveis
        int populacaoA = 80000;
        double crescimentoA = 0.03;
        int populacaoB = 200000;
        double crescimentoB = 0.015;
        int ano = 0;
        
        
        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA*crescimentoA;
            populacaoB += populacaoB*crescimentoB;
            ano += 1;
        }
  
      System.out.println(ano + " anos necessários para que a população do país A ultrapasse ou iguale a população do país B");
    }
}