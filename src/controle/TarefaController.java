/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import modelo.Lista;

/**
 *
 * @author vanessalagomachado
 */
public class TarefaController {
    // método para adicionar um item na lista
    public List<Lista> addTarefa(Lista t, List<Lista> listaTarefas){
        listaTarefas.add(t);
        return listaTarefas;
    }
}
