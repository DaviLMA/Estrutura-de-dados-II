/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.universidadedigital.colecoes.pilhas;

import br.unicap.universidadedigital.colecoes.exceptions.ItemNaoEncontradoException;
import br.unicap.universidadedigital.colecoes.listas.ListaSimplesmenteLigada;
import br.unicap.universidadedigital.colecoes.comum.No;

/**
 *
 * @author Davi
 */
public class Pilha {
    
    ListaSimplesmenteLigada elementos = new ListaSimplesmenteLigada();
    
    public void inserir(No no){
        this.elementos.adicionaInicio(no); //by pass
    }
    
    
    public No remover() throws ItemNaoEncontradoException{
        return this.elementos.removerInicio();
    }
    
}
