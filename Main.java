import java.io.IOException;

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

      InserirNaviosNosTabuleiros naviosInseridosNoTabuleiro = new InserirNaviosNosTabuleiros();
      naviosInseridosNoTabuleiro.inserirOsNaviosNosTabuleirosDosJogadores();

      ExibirTabuleiroDosJogadores tabuleiroDosJogadores = new ExibirTabuleiroDosJogadores();

      boolean jogoAtivo = true;
      do {
         JogadasDoComputadorEJogador jogadas = new JogadasDoComputadorEJogador();
         tabuleiroDosJogadores.exibirTabuleiro(nomeJogador1, tabuleiroJogador1, false);//false
         System.out.println("*********************************************");
         tabuleiroDosJogadores.exibirTabuleiro(nomeJogador2, tabuleiroJogador2, true);
         if (jogadas.acaoDoJogador()) {
            if(naviosJogador2 <= 0) {
               System.out.println("");
               System.out.println("***" + nomeJogador1 + "*** Venceu o Jogo!!!");
               break;
            }
            jogadas.acaoDoComputador();
            if(naviosJogador1 <= 0) {
               System.out.println("");
               System.out.println("***" + nomeJogador2 + "*** Venceu o Jogo!!!");
               break;
            }
         }
      } while (jogoAtivo);
      tabuleiroDosJogadores.exibirTabuleiro(nomeJogador1, tabuleiroJogador1, true);
      tabuleiroDosJogadores.exibirTabuleiro(nomeJogador2, tabuleiroJogador2, true);

   }
}
