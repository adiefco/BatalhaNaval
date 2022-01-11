import java.io.IOException;
import java.util.Scanner;

public class Main extends VariaveisGlobais {

   /*
   Jogador1 = COMPUTADOR;
   Jogador2 = USUÁRIO;
   */

   public static void limparTela() throws IOException, InterruptedException {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   }

   public static void main(String[] args) throws Exception {
      limparTela();

      ObterNomesDosJogadores jogadores = new ObterNomesDosJogadores();
      String nomeJogador1 = jogadores.obterNomeComputador();
      jogadores.obterNomeDoJogador();
      String nomeJogador2 = jogadores.obterNomeJogador();

      ExibirTabuleiroDosJogadores tabuleiroDosJogadores = new ExibirTabuleiroDosJogadores();
      tabuleiroDosJogadores.exibirTabuleiro(nomeJogador1, tabuleiroJogador1);
      tabuleiroDosJogadores.exibirTabuleiro(nomeJogador2, tabuleiroJogador2);
   }
}
