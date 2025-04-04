package entidades.localidade.tumulo.gerenciador;

import javax.swing.JButton;
import javax.swing.JFrame;

import gerenciadorPrincipal.TelaGerenciador;

public class TelaTumulo extends JFrame{
    private JButton jbCreate, jbRead, jbList, jbUpdate, jbDelete, jbVoltar;

    public TelaTumulo(){
        inicializarVariaveis();
        
        int fWidth = 300;
        int fHeight = 300;

        this.setTitle("Menu Cemitério");
        this.setLayout(null);
        this.setSize(fWidth, fHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Config dos tamanho dos botões e centralização dos 
        int jbHeight = 30;
        int jbWidth = 160;
        int jbX = (fWidth - jbWidth) / 2;
        int qtdBotoes = 5;
        // Config centralização dos botões
        int y = (fHeight / (qtdBotoes + 1) - (jbHeight / 2));
        if(y < 30){ y = 30; }

        for(int i = 0; i < qtdBotoes; i++){
            int jbY = y * (i + 1);
            int index = i;
            JButton button = switch (index){
                case 0 -> jbCreate;
                case 1 -> jbRead;
                case 2 -> jbList;
                case 3 -> jbUpdate;
                case 4 -> jbDelete;
                case 5 -> jbVoltar;
                default -> null;
            };
            if(button != null){
                button.setBounds(jbX, jbY, jbWidth, jbHeight);
                button.addActionListener(e -> {
                    switch(index){
                        case 0 -> new TelaGerenciador(); // TROCAR ENTIDADE
                        case 1 -> new TelaGerenciador(); // TROCAR ENTIDADE
                        case 2 -> new TelaGerenciador(); // TROCAR ENTIDADE
                        case 3 -> new TelaGerenciador(); // TROCAR ENTIDADE
                        case 4 -> new TelaGerenciador(); // TROCAR ENTIDADE
                        case 5 -> new TelaGerenciador();
                    }
                    dispose();
                });
                this.add(button);
            }
        };

        this.setVisible(true);
    }

    private void inicializarVariaveis(){
        jbCreate = new JButton("Cadastrar Túmulo.");
        jbRead = new JButton("Apresentar Túmulo.");
        jbList = new JButton("Listar Túmulo.");
        jbUpdate = new JButton("Alterar Túmulo.");
        jbDelete = new JButton("Deletar Túmulo.");
        jbVoltar = new JButton("Voltar");
    }
}
    /*public TelaTumulo(Scanner teclado) {
        super(teclado);
    }

    @Override
    public int menu(){
        System.out.println("Menu do Túmulo: ");
        System.out.println("1 - Cadastrar Túmulo.");
        System.out.println("2 - Apresentar Túmulo.");
        System.out.println("3 - Listar Túmulo.");
        System.out.println("4 - Alterar Túmulo.");
        System.out.println("5 - Deletar Túmulo.");
        System.out.println("0 - Voltar");
        int opc = teclado.nextInt(); teclado.nextLine();

        return opc;
    }

    public void setTumulo(Tumulo t){
        System.out.println("Digite o tipo do tumulo: ");
        t.setTipo(teclado.nextLine());
        System.out.println("Digite a data de ocupação: ");
        t.setDataOcupacao(teclado.nextLine());
        System.out.println("Digite a situação: ");
        t.setSituacao(teclado.nextLine());
        System.out.println("Digite o id do cemiterio: ");
        t.setIdCemiterio(teclado.nextInt()); teclado.nextLine();
        System.out.println("Digite o bloco do Tumulo: ");
        t.setRua(teclado.nextLine());
        System.out.println("Digite o número do Túmulo: ");
        t.setNumero(teclado.nextInt()); teclado.nextLine();
        System.out.println("Digite o id do defunto: ");
        t.setIdDefunto(teclado.nextInt()); teclado.nextLine();
    }
    
    public void getTumulo(Tumulo t){
        if(t != null){
            System.out.println("Tipo do tumulo: " + t.getTipo());
            System.out.println("Data de ocupação: " + t.getDataOcupacao());
            System.out.println("Situação: " + t.getSituacao());
            System.out.println("Id do cemiterio: " + t.getIdCemiterio());
            System.out.println("Id do defunto: " + t.getIdDefunto());
        } else {
            msgIdInexistente();
        }
    }*/