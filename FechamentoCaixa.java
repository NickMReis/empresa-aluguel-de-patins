package alugueldepatins;

import java.util.ArrayList;

public class FechamentoCaixa {
    private ArrayList<Devolucao> totaisPorFormaPagamento;
    private float somaCaixa;
    private float somaFicha;
    private boolean coincidem;
    
    public ArrayList<Devolucao> obterTotaisPorFormaPagamento() {
        return totaisPorFormaPagamento;
    }

    public float obterSomaCaixa() {
        return somaCaixa;
    }

    public float obterSomaFicha() {
        return somaFicha;
    }

    public boolean obterCoincidem() {
        return coincidem;
    }

    public void alterarTotaisPorFormaPagamento(ArrayList<Devolucao> totaisPorFormaPagamento) {
        this.totaisPorFormaPagamento = totaisPorFormaPagamento;
    }

    public void alterarSomaCaixa(float somaCaixa) {
        this.somaCaixa = somaCaixa;
    }

    public void alterarSomaFicha(float somaFicha) {
        this.somaFicha = somaFicha;
    }

    public void alterarCoincidem(boolean coincidem) {
        this.coincidem = coincidem;
    }
}
