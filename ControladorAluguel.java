package alugueldepatins;

import java.util.ArrayList;

public class ControladorAluguel {
    private ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
    private ArrayList<Integer> listaIds = new ArrayList<Integer>();
    
    public ControladorAluguel(){
        //alugueis = new ArrayList<Aluguel>();
    }
    public void incluirAluguel(Aluguel aluguel){
        alugueis.add(aluguel);
        listaIds.add(aluguel.obterIdAluguel());
    }
    public void excluirAluguel(Aluguel aluguel){
        alugueis.remove(aluguel);
    }
    
    public Aluguel selecionarAluguelPorId(int idAluguel){
        Aluguel aluguel = null;
        for (int i = 0; i < alugueis.size(); i++){
            if (alugueis.get(i).obterIdAluguel() == idAluguel){
                aluguel = alugueis.get(i);
                break;
            }
        }
        return aluguel;
    }
    
    public ArrayList<Aluguel> obterAluguel(){
        return alugueis;
    }
    
    //esse metodo é para retornar uma nova id para um novo aluguel
    public int obterTamanho(){
        if(listaIds.size() == 0){
            return 1;
        } else{
            int id = listaIds.get(listaIds.size() - 1) + 1;
            return id;
        }
        
        //return alugueis.size();
    }
    
    public int obterTamanhoAluguel(){
        return alugueis.size();
    }
}
