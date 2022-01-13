import java.util.Random;

public class RetornarTabuleiroComOsNavios extends VariaveisGlobais {
   public static int[][] retornarNovoTabuleiroComOsNavios() {
      
      int novoTabuleiro[][] = new int [tamanhoDoTabuleiroX][tamanhoDoTabuleiroY];
      int quantidadeRestanteDeNavios = quantidadeDeNavios;
      int x = 0, y = 0;
      Random numeroAleatorio = new Random();
      
      do {
         x = 0;
         y = 0;
         for(int[] linha : novoTabuleiro) {
            for (int coluna : linha) {
               if (numeroAleatorio.nextInt(100) < 10) {//VERIFICAÇÃO NESTA LINHA, TOTAL DE NAVIOS SUPERIOR OU JÁ CORRIGIDO.
                  if (coluna == VAZIO) {
                     novoTabuleiro[x][y] = NAVIO_POSICIONADO;
                     quantidadeRestanteDeNavios--;
                     break;
                  }
                  if (quantidadeRestanteDeNavios == 0) {
                     break;
                  }
               }
               y++;
            }
            y = 0;
            x++;
            if (quantidadeRestanteDeNavios == 0) {
               break;
            }
         }

      } while (quantidadeRestanteDeNavios > 0);

      return novoTabuleiro;
   }
}
