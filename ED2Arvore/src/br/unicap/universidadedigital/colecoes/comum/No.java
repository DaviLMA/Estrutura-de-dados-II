/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.universidadedigital.colecoes.comum;

/**
 *
 * @author Davi 
 */

public class No <T> {
    
    private T valor;    
    private No proximo;
    
    
    public No(T valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return valor.toString();
    }
 
    @Override
    public No<T> clone() {
        No<T> novo = new No<>(valor);
        return novo;
    }
}
