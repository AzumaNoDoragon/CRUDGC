package model.pessoas.finado.model;

import model.pessoas.utils.Pessoas;

public class Finado extends Pessoas {
    private String dataFalecimento, causaMorte;
    private int idParente, idTumulo;

    public String getDataFalecimento() {
        return dataFalecimento;
    }

    public void setDataFalecimento(String dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }

    public String getCausaMorte() {
        return causaMorte;
    }

    public void setCausaMorte(String causaMorte) {
        this.causaMorte = causaMorte;
    }

    public int getIdParente() {
        return idParente;
    }

    public void setIdParente(int idParente) {
        this.idParente = idParente;
    }

    public int getIdTumulo() {
        return idTumulo;
    }

    public void setIdTumulo(int idTumulo) {
        this.idTumulo = idTumulo;
    }

}
