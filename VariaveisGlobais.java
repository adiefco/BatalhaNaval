public class VariaveisGlobais {
   //VARIÁVEIS:

   static final int VAZIO = 0;
   static final int NAVIO_POSICIONADO = 1;
   static final int TIRO_CERTEIRO = 2;
   static final int TIRO_NA_AGUA = 3;
   static final int TIRO_CERTEIRO_NAVIO_POSICIONADO = 4;
   static final int TIRO_NA_AGUA_NAVIO_POSICIONADO = 5;

   static final int POSICAO_X = 0;
   static final int POSICAO_Y = 1;

   public static int tamanhoDoTabuleiroX = 10;
   public static int tamanhoDoTabuleiroY = 10;
   public static int quantidadeDeNavios = 10;
   public static int[][] tabuleiroJogador1 = new int[tamanhoDoTabuleiroX][tamanhoDoTabuleiroY];
   public static int[][] tabuleiroJogador2 = new int[tamanhoDoTabuleiroX][tamanhoDoTabuleiroY];
   public static int naviosJogador1 = quantidadeDeNavios;
   public static int naviosJogador2 = quantidadeDeNavios;
}
