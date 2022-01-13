import java.util.Random;
import java.util.Scanner;

public class JogadasDoComputadorEJogador extends VariaveisGlobais {
   
   public static boolean validarPosicoesInseridasPeloJogador(int[] posicoes) {
      boolean retorno = true;
      if (posicoes[0] > tamanhoDoTabuleiroX -1) {
         retorno = false;
         System.out.println("A posição das letras não podem ser maior que " + (char) (tamanhoDoTabuleiroX + 64));
      }
      if (posicoes[1] > tamanhoDoTabuleiroY -1) {
         retorno = false;
         System.out.println("A posição numérica não podem ser maior que " + tamanhoDoTabuleiroY);
      }
      
      return retorno;
   }
   
   public static String receberValorDigitadoPeloJogador() {
      Scanner input = new Scanner(System.in);
      System.out.println("Digite a posição do seu tiro:");
      return input.next();
   }
   
   public static boolean validarTiroDoJogador(String tiroDoJogador) {
      int quantidadeDeNumeros = (tamanhoDoTabuleiroY >= 9) ? 1 : null;
      String expressaoDeVerificacao = "^[A-Za-z]{1}[0-9]{"+quantidadeDeNumeros+"}$";
      
      return tiroDoJogador.matches(expressaoDeVerificacao);
   }
   
   public static int[] retornarPosicoesDigitadasPeloJogador(String tiroDoJogador) {
      String tiro = tiroDoJogador.toLowerCase();
      int[] retorno = new int[2];
      retorno[POSICAO_X] = tiro.charAt(0) - 97;
      retorno[POSICAO_Y] = Integer.parseInt(tiro.substring(1));
      return retorno;
   }

   public static void inserirValoresDaAcaoNoTabuleiro(int[] posicoes, int numeroDoJogador) {
      if(numeroDoJogador == 1) {
         if (tabuleiroJogador1[posicoes[POSICAO_X]][posicoes[POSICAO_Y]] == NAVIO_POSICIONADO) {
            tabuleiroJogador1[posicoes[POSICAO_X]][posicoes[POSICAO_Y]] = TIRO_CERTEIRO;
            naviosJogador1--;
            System.out.println("Você acertou um navio!!!");
         } else {
            tabuleiroJogador1[posicoes[POSICAO_X]][posicoes[POSICAO_Y]] = TIRO_NA_AGUA;
            System.out.println("Você errou o tiro!");
         }
      } else {
         if (tabuleiroJogador2[posicoes[POSICAO_X]][posicoes[POSICAO_Y]] == NAVIO_POSICIONADO) {
            tabuleiroJogador2[posicoes[POSICAO_X]][posicoes[POSICAO_Y]] = TIRO_CERTEIRO;
            naviosJogador2--;
            System.out.println("COMPUTADOR acertou um navio!!!");
         } else {
            tabuleiroJogador2[posicoes[POSICAO_X]][posicoes[POSICAO_Y]] = TIRO_NA_AGUA;
            System.out.println("COMPUTADOR errou o tiro!");
         }
      }
   }
   
   public static boolean acaoDoJogador() {
      
      boolean acaoValida = true;
      String tiroDoJogador = receberValorDigitadoPeloJogador();
      if(validarTiroDoJogador(tiroDoJogador)) {
         int[] posicoes = retornarPosicoesDigitadasPeloJogador(tiroDoJogador);
         if(validarPosicoesInseridasPeloJogador(posicoes)) {  
            inserirValoresDaAcaoNoTabuleiro(posicoes, 1);
         } else {
            acaoValida = false;
         }

      } else {
         System.out.println("Posição Inválida");
         acaoValida = false;
      }

      return acaoValida;
   }

   public static void acaoDoComputador() {
      int[] posicoes = retornarJogadaDoComputador();
      inserirValoresDaAcaoNoTabuleiro(posicoes, 2);
   }
   
   public static int[] retornarJogadaDoComputador() {
      int[] posicoes = new int[2];
      posicoes[POSICAO_X] = retornarJogadaAleatoriaDoComputador(tamanhoDoTabuleiroX);
      posicoes[POSICAO_Y] = retornarJogadaAleatoriaDoComputador(tamanhoDoTabuleiroY);
      return posicoes;
   }

   public static int retornarJogadaAleatoriaDoComputador(int limite) {
      Random jogadaDoComputador = new Random();
      int numeroGerado = jogadaDoComputador.nextInt(limite);
      return (numeroGerado == limite) ? --numeroGerado : numeroGerado;
   }
}
