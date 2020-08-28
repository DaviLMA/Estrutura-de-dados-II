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
public class NoDuplamenteLigado<T> extends No<T>{
    
    private NoDuplamenteLigado<T> anterior;
    
    public NoDuplamenteLigado(T valor){
        super(valor);
        this.anterior = null;
    }
    
    public void setAnterior(NoDuplamenteLigado<T> anterior){
        this.anterior = anterior;
    }
    
    public NoDuplamenteLigado<T>  getAnterior(){
        return this.anterior;
    }
    
    @Override
    public NoDuplamenteLigado<T> getProximo(){
        return (NoDuplamenteLigado<T>) super.getProximo();
    }
}
