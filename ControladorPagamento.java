package alugueldepatins;

import java.util.ArrayList;

public class ControladorPagamento {
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    
    public ControladorPagamento(){
        //alugueis = new ArrayList<Aluguel>();
    }
    public void incluirPagamento(Pagamento pagamento){
        pagamentos.add(pagamento);
    }
    public void excluirPagamento(Pagamento pagamento){
        pagamentos.remove(pagamento);
    }
    
    public Pagamento selecionarPagamentoPorId(int idPagamento){
        Pagamento pagamento = null;
        for (int i = 0; i < pagamentos.size(); i++){
            if (pagamentos.get(i).obterIdPagamento() == idPagamento){
                pagamento = pagamentos.get(i);
                break;
            }
        }
        return pagamento;
    }
    
    public ArrayList<Pagamento> obterPagamentos(){
        return pagamentos;
    }
    
    public int obterTamanhoPagamento(){
        return pagamentos.size();
    }
}
