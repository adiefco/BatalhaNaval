import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

   /*
   Jogador1 = COMPUTADOR;
   Jogador2 = USUÁRIO;
   */

   //VARIÁVEIS:
   static Scanner input = new Scanner(System.in);
   static String nomeJogador1, nomeJogador2;
   static int tamanhoDoTabuleiroX = 10, tamanhoDoTabuleiroY = 10;
   static int quantidadeDeNavios = 10;
   static int tabuleiroJogador1[][], tabuleiroJogador2[][];
   static int naviosJogador1, naviosJogador2;
   
   public static void limparTela() throws IOException, InterruptedException {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   }

   public static void obterNomeDoJogador() {
      
      nomeJogador1 = "COMPUTADOR";
      System.out.println("Digite o seu nome: ");
      nomeJogador2 = input.next();
      
      while (nomeJogador1.equals(nomeJogador2)) {
         System.out.println("");
         System.out.println("O seu nome não pode ser o mesmo da máquina!!!");
         System.out.println("Digite um nome diferente:");
         nomeJogador2 = input.next();
      }
   }
   
   public static int[][] retornarNovoTabuleiroVazio() {
      return new int[tamanhoDoTabuleiroX][tamanhoDoTabuleiroY];
   }
   
   public static void iniciandoTamanhoDosTabuleiros() {
      tabuleiroJogador1 = retornarNovoTabuleiroVazio();
      tabuleiroJogador2 = retornarNovoTabuleiroVazio();
   }
   
   public static void instanciarContadoresDeNaviosDosJogadores() {
      naviosJogador1 = quantidadeDeNavios;
      naviosJogador2 = quantidadeDeNavios;
   }

   public static void exibirNumerosDasColunasDosTabuleiros() {

      int numeroDaColuna = 0;
      String numerosDoTabuleiro = "|   | ";

      for(int i = 0; i < tamanhoDoTabuleiroY; i++) {
         numerosDoTabuleiro += (numeroDaColuna) + " | ";
         numeroDaColuna++;
      }
      System.out.println(numerosDoTabuleiro);
   }

   public static void exibirTabuleiro(String nomeDoJogador, int[][] tabuleiro, boolean seuTabuleiro) {
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

   public static void exibirTabuleiroDosJogadores() {
      exibirTabuleiro(nomeJogador1, tabuleiroJogador1, true);
      System.out.println("");
      exibirTabuleiro(nomeJogador2, tabuleiroJogador2, false);
   }

   public static void main(String[] args) throws Exception {
      limparTela();
      obterNomeDoJogador();
      iniciandoTamanhoDosTabuleiros();
      instanciarContadoresDeNaviosDosJogadores();
      exibirTabuleiroDosJogadores();

   }
}
