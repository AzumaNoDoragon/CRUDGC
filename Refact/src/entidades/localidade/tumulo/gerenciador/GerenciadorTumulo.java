package entidades.localidade.tumulo.gerenciador;

import java.util.Scanner;

import entidades.localidade.tumulo.controle.CRUDTumulo;

public class GerenciadorTumulo {
    private final TelaTumulo tt = new TelaTumulo(new Scanner(System.in));
    private final CRUDTumulo crudT = new CRUDTumulo();

    public void executar(){
        int opc;
        do{
            opc = tt.menu();

            switch (opc) {
                case 1:
                    crudT.create();
                    break;
                case 2:
                    crudT.read();
                    break;
                case 3:
                    crudT.listarTumulo();
                    break;
                case 4:
                    crudT.update();
                    break;
                case 5:
                    crudT.delete();
                    break;
                default:
                    if(opc != 0){
                        tt.msgOpcInvalida();
                    }
                    break;
            }
        }while(opc != 0);
    }
}
