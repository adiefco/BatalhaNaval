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

   public  void exibirTabuleiro(String nomeDoJogador, int[][] tabuleiro, boolean seuTabuleiro) {
      System.out.println("---------------------------------------------");
      System.out.println("              "+ nomeDoJogador +"            ");
      System.out.println("---------------------------------------------");

      exibirNumerosDasColunasDosTabuleiros();

      System.out.println("---------------------------------------------");

      String linhaDoTabuleiro = "|";
      char letraDaLinha = 65;

      for(int[] linha : tabuleiro) {
         System.out.print("| ");
         linhaDoTabuleiro = (letraDaLinha++) + " |";

         for (int coluna : linha) {
            switch (coluna) {
               case VAZIO:
                  linhaDoTabuleiro += "   |";
                  break;

               case NAVIO_POSICIONADO:
                  if (seuTabuleiro) {
                     linhaDoTabuleiro += " N |";
                     break;
                  } else {
                     linhaDoTabuleiro += "   |";
                     break;
                  }

               case TIRO_CERTEIRO:
                  linhaDoTabuleiro += " * |";
                  break;

               case TIRO_NA_AGUA:
                  linhaDoTabuleiro += " - |";
                  break;

               case TIRO_CERTEIRO_NAVIO_POSICIONADO:
                  linhaDoTabuleiro += " X |";
                  break;
               
               case TIRO_NA_AGUA_NAVIO_POSICIONADO:
                  linhaDoTabuleiro += " n |";
                  break;
            }
         }
         System.out.println(linhaDoTabuleiro);
         System.out.println("---------------------------------------------");
      }
   }
}
