/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugueldepatins;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 06006873
 */
public class ModeloTabelaPatins extends AbstractTableModel{
    private static final int COLUNA_IDPATINS = 0;
    private static final int COLUNA_NUMEROPE = 1;
    private static final int COLUNA_QUANTIDADEDISPONIVEL = 2;
    private static final int COLUNA_PRECO = 3;
    private static final int COLUNA_STATUSDISPONIVEL = 4;
    
    private String[] colunas = new String[]{"ID Patins","Numero Pe", "Quantidade Disponivel", "Preço", "Status Disponivel"};
    private ArrayList<Patins> tabelaPatins;
    
    public ModeloTabelaPatins() {
        this.tabelaPatins = new ArrayList<Patins>();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    @Override
    public int getRowCount(){
        return tabelaPatins.size();
    }
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    @Override
    public Object getValueAt(int row, int col){
        Patins patins = tabelaPatins.get(row);
        switch(col){
            case COLUNA_IDPATINS:
                return patins.obterIdPatins();
            case COLUNA_NUMEROPE:
                return patins.obterNumeroPe();
            case COLUNA_QUANTIDADEDISPONIVEL:
                return patins.obterQuantidadeDisponivel();
            case COLUNA_PRECO:
                return patins.obterPreco();
            case COLUNA_STATUSDISPONIVEL:
                return patins.obterStatusDisponivel();
        }
        return "";
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int column){
        Patins patins = tabelaPatins.get(row);
        switch(column){
            case COLUNA_IDPATINS:
                patins.alterarIdPatins(Integer.parseInt(aValue.toString()));
                break;
            case COLUNA_NUMEROPE:
                patins.alterarNumeroPe(Integer.parseInt(aValue.toString()));
                break;
            case COLUNA_QUANTIDADEDISPONIVEL:
                patins.alterarQuantidadeDisponivel(Integer.parseInt(aValue.toString()));
                break;
            case COLUNA_PRECO:
                patins.alterarPreco(Float.parseFloat(aValue.toString()));
                break;
            case COLUNA_STATUSDISPONIVEL:
                patins.alterarStatusDisponivel(Boolean.parseBoolean(aValue.toString()));
                break;
        }
    }

    public Patins obterPatins(int indice){
        return tabelaPatins.get(indice);
    }
    
    public void incluirPatins(Patins patins){
        tabelaPatins.add(patins);
        int ultimo = getRowCount()-1;
        fireTableRowsInserted(ultimo, ultimo);
    }    
    
    public void atualizarPatins(int indice, Patins patins){
        tabelaPatins.set(indice, patins);
        fireTableRowsUpdated(indice, indice);
    }
    
    public void excluirPatins(int indice){
        tabelaPatins.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
}
