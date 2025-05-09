package com.sepulcrum.model.servicos.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.sepulcrum.model.servicos.controller.GerenciadorServicos;

public class TelaSelectServico extends JFrame{
    protected JButton jbBusca, jbCancelar;
    protected JTextField jtfId;
    protected JLabel jlId;
    protected int fWidth, fHeight, qtdBotoes, id;

    public TelaSelectServico(int seletor, int seletorCrud){
        inicializarVariaveis();

        // Janela
        this.setLayout(null);
        this.setSize(fWidth, fHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Config dos tamanho dos botões
        int jbHeight = 30;
        int jbWidth = 160;
        int jbX = (fWidth - jbWidth) / 2;

        // Config centralização dos botões
        int y = (fHeight / (qtdBotoes + 1) - (jbHeight / 2));
        if(y < 30){ y = 30; }

        for(int i = 0; i < qtdBotoes; i++){
            int jbY = y * (i + 1);
            jbX = 50;
            label(i, jbX, jbY, jbWidth, jbHeight);
        };
        for(int i = 0; i < qtdBotoes; i++){
            int jbY = y * (i + 1);
            jbX = 160;
            jbWidth = 300;
            text(i, jbX, jbY, jbWidth, jbHeight);
        };
        for(int i = 0; i < qtdBotoes; i++){
            int jbY = y * (i + 2);
            if(i == 1){jbY = jbY - 15;}
            jbWidth = 150;
            button(seletorCrud, seletor, i, jbX + 70, jbY, jbWidth, jbHeight);
        };
        
        this.setVisible(true);
    }

    private void label(int i, int jbX, int jbY, int jbWidth, int jbHeight){
        JLabel label = switch (i){
            case 0 -> jlId;
            default -> null;
        };
        if(label != null){
            label.setBounds(jbX, jbY, jbWidth, jbHeight);
            this.add(label);
        }
    }

    protected void text(int i, int jbX, int jbY, int jbWidth, int jbHeight){
        JTextField text = switch (i){
            case 0 -> jtfId;
            default -> null;
        };
        if(text != null){
            text.setBounds(jbX, jbY, jbWidth, jbHeight);
            this.add(text);
        }
    }

    protected void button(int seletorCrud, int seletor, int i, int jbX, int jbY, int jbWidth, int jbHeight){
        int index = i;
        JButton button = switch (index){
            case 0 -> jbBusca;
            case 1 -> jbCancelar;
            default -> null;
        };
        if(button != null){
            defineBotoes(seletorCrud, seletor, button, index, jbX, jbY, jbWidth, jbHeight);
        }
    }

    protected void defineBotoes(int seletorCrud, int seletor, JButton button, int index, int jbX, int jbY, int jbWidth, int jbHeight){
        GerenciadorServicos gs = new GerenciadorServicos();
        button.setBounds(jbX, jbY, jbWidth, jbHeight);
        button.addActionListener(_ -> {
            switch(index){
                case 0 -> {
                    try{
                        id = getId();
                        TelaRegistroServico trs = new TelaRegistroServico(seletor, seletorCrud, id);
                        gs.getExumacao(trs, id);
                        //new TelaRegistroServico(seletor, seletorCrud, id);
                    } catch (NumberFormatException | IndexOutOfBoundsException ex) {
                        dispose();
                        JOptionPane.showMessageDialog(this, "ID inválido ou inexistente.", "Erro", JOptionPane.ERROR_MESSAGE);
                        new TelaGerenciadorServico(seletor);
                    }
                }
                case 1 -> new TelaGerenciadorServico(seletor);
            }
            dispose();
        });
        this.add(button);
    }

    protected void inicializarVariaveis(){
        //Configura tamanho da janela e botões
        fWidth = 500;
        fHeight = 300;
        qtdBotoes = 3;

        // Janela
        this.setTitle("Seleção");

        // Button
        jbBusca = new JButton("Buscar");
        jbCancelar = new JButton("Cancelar");

        // Label
        jlId = new JLabel("Busca por id: ");

        // Text Field
        jtfId = new JTextField();
    }

    public int getId() {
        return Integer.parseInt(jtfId.getText());
    }
}