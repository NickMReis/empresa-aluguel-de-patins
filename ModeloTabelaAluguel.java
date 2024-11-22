package alugueldepatins;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaAluguel extends AbstractTableModel{
    private static final int COLUNA_IDALUGUEL = 0;
    private static final int COLUNA_CLIENTE = 1;
    private static final int COLUNA_PATINS = 2;
    private static final int COLUNA_HORAINICIO = 3;
    
    private String[] colunas = new String[]{"ID Aluguel","Cliente", "Patins", "Hora Inicio"};
    private ArrayList<Aluguel> tabelaAlugueis = new ArrayList<Aluguel>();
    
    public ModeloTabelaAluguel() {
        //this.tabelaAlugueis = new ArrayList<Aluguel>();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    @Override
    public int getRowCount(){
        return tabelaAlugueis.size();
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
        Aluguel aluguel = tabelaAlugueis.get(row);
        switch(col){
            case COLUNA_IDALUGUEL:
                return aluguel.obterIdAluguel();
            case COLUNA_CLIENTE:
                return aluguel.obterCliente();
            case COLUNA_PATINS:
                return aluguel.obterPatins();
            case COLUNA_HORAINICIO:
                return aluguel.obterHoraInicio();
        }
        return "";
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int column){
        Aluguel aluguel = tabelaAlugueis.get(row);
        switch(column){
            case COLUNA_IDALUGUEL:
                aluguel.alterarIdAluguel(Integer.parseInt(aValue.toString()));
                break;
            case COLUNA_CLIENTE:
                Cliente cliente = (Cliente) aValue;
                aluguel.alterarCliente(cliente);
                break;
            case COLUNA_PATINS:
                Patins patins = (Patins) aValue;
                aluguel.alterarPatins(patins);
                break;
            case COLUNA_HORAINICIO:
                aluguel.alterarHoraInicio(aValue.toString());
                break;
        }
    }

    public Aluguel obterAluguel(int indice){
        return tabelaAlugueis.get(indice);
    }
    
    public void incluirAluguel(Aluguel aluguel){
        tabelaAlugueis.add(aluguel);
        int ultimo = getRowCount()-1;
        fireTableRowsInserted(ultimo, ultimo);
        System.out.println(aluguel);
    }    
    
    public void atualizarAluguel(int indice, Aluguel aluguel){
        tabelaAlugueis.set(indice, aluguel);
        fireTableRowsUpdated(indice, indice);
    }
    
    public void excluirAluguel(int indice){
        tabelaAlugueis.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
}
