/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.universidadedigital.colecoes.arvores;

/**
 *
 * @author Davi
 */
public class NoArvoreBinaria <T extends Comparable<T>> {
    
    private T valor;
    private NoArvoreBinaria<T> esquerda;
    private NoArvoreBinaria<T> direita;
    
    
    public NoArvoreBinaria(T valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita  = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria<T> esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinaria<T> getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria<T> direita) {
        this.direita = direita;
    }
    
    public int compareTo(T valor){
        return this.valor.compareTo(valor);
    }
    
    @Override
    public String toString() {
        return valor.toString();
    }
}
