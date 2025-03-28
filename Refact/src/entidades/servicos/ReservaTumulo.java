package entidades.servicos;

import java.time.LocalDate;

public class ReservaTumulo extends ServicoTumulo{
    private int idPessoa;

    public ReservaTumulo(String responsavelServico, String descricao, String informacoesAdicionaris,
            String statusServico, LocalDate dataServico, int idServico, int idTumulo, int idPessoa) {
        super(responsavelServico, descricao, informacoesAdicionaris, statusServico, dataServico, idServico, idTumulo);
        this.idPessoa = idPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
}
