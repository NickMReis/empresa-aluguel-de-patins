package alugueldepatins;

public class Devolucao {
    //private int idDevolucao;
    private Aluguel aluguel;
    private String horaFim;
    private boolean danificado;
    private float precoAdicionalDano;
    private float valorAluguel;
    private String formaPagamento;
    private boolean statusDevolucao;

    public Aluguel obterAluguel() {
        return aluguel;
    }

    public String obterHoraFim() {
        return horaFim;
    }

    public boolean obterDanificado() {
        return danificado;
    }

    public float obterPrecoAdicionalDano() {
        return precoAdicionalDano;
    }

    public float obterValorAluguel() {
        return valorAluguel;
    }

    public String obterFormaPagamento() {
        return formaPagamento;
    }

    public boolean obterStatusDevolucao() {
        return statusDevolucao;
    }

    public void alterarAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public void alterarHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public void alterarDanificado(boolean danificado) {
        this.danificado = danificado;
    }

    public void alterarPrecoAdicionalDano(float precoAdicionalDano) {
        this.precoAdicionalDano = precoAdicionalDano;
    }

    public void alterarValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void alterarFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void alterarStatusDevolucao(boolean statusDevolucao) {
        this.statusDevolucao = statusDevolucao;
    }
}
