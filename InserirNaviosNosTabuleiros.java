public class InserirNaviosNosTabuleiros extends VariaveisGlobais {
   public static void inserirOsNaviosNosTabuleirosDosJogadores() {
      RetornarTabuleiroComOsNavios tabuleiroComNavios = new RetornarTabuleiroComOsNavios();
      tabuleiroJogador1 = tabuleiroComNavios.retornarNovoTabuleiroComOsNavios();
      tabuleiroJogador2 = tabuleiroComNavios.retornarNovoTabuleiroComOsNavios();
   }
}
