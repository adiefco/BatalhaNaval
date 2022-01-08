import java.io.IOException;
import java.util.Scanner;

public class Main {

   //VARIÁVEIS:
   static String nomeJogador1, nomeJogador2;


   public static void limparTela() throws IOException, InterruptedException {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   }

   public static void obterNomeDoJogador() {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Digite o seu nome: ");
      nomeJogador1 = input.next();
      nomeJogador2 = "Computador";

      while (nomeJogador1.equals(nomeJogador2)) {
         System.out.println("");
         System.out.println("O seu nome não pode ser o mesmo da máquina!!!");
         System.out.println("Digite um nome diferente:");
         nomeJogador2 = input.next();
      }
   }

   public static void main(String[] args) throws Exception {
      limparTela();
      obterNomeDoJogador();
   }
}
