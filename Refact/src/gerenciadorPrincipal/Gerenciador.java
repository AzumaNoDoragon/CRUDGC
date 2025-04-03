package gerenciadorPrincipal;

import java.util.Scanner;
import entidades.localidade.cemiterio.gerenciador.GerenciadorCemiterio;
import entidades.localidade.tumulo.gerenciador.GerenciadorTumulo;
import entidades.pessoas.adm.gerenciador.GerenciadorAdm;
import entidades.pessoas.defunto.gerenciador.GerenciadorDefunto;
import entidades.servicos.gerenciadorServicos.GerenciadorServicos;

public class Gerenciador {
    private final TelaGerenciador tg = new TelaGerenciador(new Scanner(System.in));
    private final GerenciadorCemiterio gc = new GerenciadorCemiterio();
    private final GerenciadorAdm ga = new GerenciadorAdm();
    private final GerenciadorTumulo gt = new GerenciadorTumulo();
    private final GerenciadorDefunto gd = new GerenciadorDefunto();
    private final GerenciadorServicos gs = new GerenciadorServicos();

    public void executar(){
        int opc;
        do{
            opc = tg.menu();

            switch (opc) {
                case 1:
                    gc.executar();
                    break;
                case 2:
                    ga.executar();
                    break;
                case 3:
                    gt.executar();
                    break;
                case 4:
                    gd.executar();
                    break;
                case 5:
                    gs.executar();
                    break;
                case 0:
                    tg.msgSaida();
                    break;
                default:
                    if(opc != 0){
                        tg.msgOpcInvalida();
                    }
                    break;
            }
        }while (opc != 0);
    }
}