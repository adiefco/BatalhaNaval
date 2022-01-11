public class ExibirTabuleiroDosJogadores extends VariaveisGlobais {

   public void exibirNumerosDasColunasDosTabuleiros() {

      int numeroDaColuna = 0;
      String numerosDoTabuleiro = "|   | ";

      for(int i = 0; i < tamanhoDoTabuleiroY; i++) {
         numerosDoTabuleiro += (numeroDaColuna) + " | ";
         numeroDaColuna++;
      }
      System.out.println(numerosDoTabuleiro);
   }

   public  void exibirTabuleiro(String nomeDoJogador, int[][] tabuleiro) {
      System.out.println("---------------------------------------------");
      System.out.println("              "+ nomeDoJogador +"            ");
      System.out.println("---------------------------------------------");

      exibirNumerosDasColunasDosTabuleiros();

      System.out.println("---------------------------------------------");

      String linhaDoTabuleiro = "| ";
      char letraDaLinha = 65;

      for(int[] linha : tabuleiro) {
         System.out.print("| ");
         linhaDoTabuleiro = (letraDaLinha++) + " |  ";
         for (int coluna : linha) {
            linhaDoTabuleiro += " |  ";
         }
         
         System.out.println(linhaDoTabuleiro);
         System.out.println("---------------------------------------------");
      }
   }
}
