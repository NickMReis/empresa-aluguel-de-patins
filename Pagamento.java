package alugueldepatins;

public class Pagamento {
    private int idPagamento;
    private Devolucao devolucao;
    private float valorPagamento;
    private String formaPagamento;
    
    public int obterIdPagamento() {
        return idPagamento;
    }
    
    public float obterValorPagamento() {
        return valorPagamento;
    }

    public String obterFormaPagamento() {
        return formaPagamento;
    }

    public Devolucao obterDevolucao() {
        return devolucao;
    }
    
    public void alterarIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public void alterarDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }
    
    public void alterarValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public void alterarFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public String retornaPagamento(){
        Devolucao devolucao = obterDevolucao();
        Aluguel aluguel = devolucao.obterAluguel();
        String mensagemAluguelDevolucao = String.format("{ID do Aluguel: %d, Hora de Fim: %s, Danificado: %s, Preco Adicional: R$%.2f, Status Devolução: %s}", aluguel.obterIdAluguel(), devolucao.obterHoraFim(), devolucao.obterDanificado(), devolucao.obterPrecoAdicionalDano(), devolucao.obterStatusDevolucao());
        return "ID Pagamento: " + obterIdPagamento() + "\n" +
               "Detalhes Aluguel/Devolucao: " + mensagemAluguelDevolucao + "\n" +
               "Valor do Pagamento: R$" + obterValorPagamento() + "\n" +
                "Forma de Pagamento: " + obterFormaPagamento();
    }
}
