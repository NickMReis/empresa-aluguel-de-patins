package alugueldepatins;

import java.util.ArrayList;


public class ControladorPatins {
    private ArrayList<Patins> listaPatins;
    
    public ControladorPatins(){
        listaPatins = new ArrayList<Patins>();
    }  
    
    public void incluirPatins(Patins patins){
        listaPatins.add(patins);
    }
    public void excluirPatins(Patins patins){
        listaPatins.remove(patins);
    }
    
    public Patins selecionarPatinsPorId(int idPatins){
        Patins patins = null;
        for (int i = 0; i < listaPatins.size(); i++){
            if (listaPatins.get(i).obterIdPatins() == idPatins){
                patins = listaPatins.get(i);
                break;
            }
        }
        return patins;
    }
    
    public ArrayList<Patins> obterPatins(){
        return listaPatins;
    }
}
