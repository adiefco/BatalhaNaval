import java.util.Scanner;

public class ObterNomesDosJogadores {

   public String nomeJogador1 = "COMPUTADOR";
   public String nomeJogador2;

   public void obterNomeDoJogador() {
      System.out.println("Digite o seu nome: ");
      Scanner input = new Scanner(System.in);
      this.nomeJogador2 = input.next();
      
      while (nomeJogador1.equals(nomeJogador2)) {
         System.out.println("");
         System.out.println("O seu nome não pode ser o mesmo da máquina!!!");
         System.out.println("Digite um nome diferente:");
         nomeJogador2 = input.next();
      }
   }

   public String obterNomeComputador() {
      return nomeJogador1;
   }

   public String obterNomeJogador() {
      return nomeJogador2;
   }  
}
