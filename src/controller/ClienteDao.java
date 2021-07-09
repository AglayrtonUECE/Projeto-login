/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;


public class ClienteDAO {
    
    List<Cliente> lista = new ArrayList<>();
    
    public void cadastrar(Cliente cliente){
        lista.add(cliente);
    }
    
    public void alterar(String nome){
       
    }
    
    public void remover(Cliente c){
       for (Cliente cliente : lista) {
            if(cliente.getNome() == c.getNome()){
                int i = lista.indexOf(cliente); //pega a posicao do objeto
                lista.remove(cliente); //remove o obejto
            }   
        }
    }
    
    public List<Cliente> listar(){
        return lista;
    }
}
