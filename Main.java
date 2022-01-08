import java.io.IOException;
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

   public static void main(String[] args) throws Exception {
      limparTela();
      obterNomeDoJogador();
   }
}
