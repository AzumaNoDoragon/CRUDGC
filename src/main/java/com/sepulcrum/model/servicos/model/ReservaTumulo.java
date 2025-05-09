package com.sepulcrum.model.servicos.model;

import com.sepulcrum.model.servicos.model.utils.Servicos;

public class ReservaTumulo extends Servicos{
    private int idPessoa; // == Familiar

    public ReservaTumulo(String statusServicoStr, String tipoServicoStr, String descricao, String admCpf, String tumRua,
            String tumNumero, String cemCnpj, int idServico, int idPessoa) {
        super(statusServicoStr, tipoServicoStr, descricao, admCpf, tumRua, tumNumero, cemCnpj, idServico);
        this.idPessoa = idPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
}