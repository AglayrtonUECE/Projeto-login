
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pessoa;

//abstractTableModel é uma superclasse para trabalhar com a tabela
public class ClienteDao extends AbstractTableModel {

    private List<Pessoa> dados = new ArrayList<>();
    //defini a quantidade de colunas
    private String[] colunas = {"nome", "telefone"};

    @Override
    public int getRowCount() {
        return dados.size();//retorna o tamanho da coleação
    }

    @Override
    public int getColumnCount() {
        return colunas.length;//aqui vai aplicar quantas colunas vai ter
    }

    //apresenta os valores
    @Override
    public Object getValueAt(int linha, int coluna) {

        //em qual coluna estou
        switch (coluna) {
            case 0: //nesse indice apareça
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getTelefone();
        }
        return null;
    }

    //pega o nome da coluna para ser impressa
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void adicionarLinha(Pessoa p) {
        this.dados.add(p);
        //esse metodo atualiza toda vida que acontecer uma mudanca na tabela
        this.fireTableDataChanged();
    }

    public void removerLinha(int linha) {
        this.dados.remove(linha);
        //esse metodo remove toda vida que acontecer uma mudanca na tabela
        //ela pede o inicio e fim
        this.fireTableRowsDeleted(linha, linha);
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        //em qual coluna estou
        switch (coluna) {
            case 0: //nesse indice apareça
                 dados.get(linha).setNome((String)valor);
                break;
            case 1:
                 dados.get(linha).setTelefone((String) valor);
                break;
        }
        
        //atualizar a jtable
        this.fireTableRowsUpdated(linha, linha);
    }

}
