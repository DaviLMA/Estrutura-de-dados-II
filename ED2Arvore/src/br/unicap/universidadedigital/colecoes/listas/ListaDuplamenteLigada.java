/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.universidadedigital.colecoes.listas;

import br.unicap.universidadedigital.colecoes.comum.No;
import br.unicap.universidadedigital.colecoes.comum.NoDuplamenteLigado;
import br.unicap.universidadedigital.colecoes.exceptions.PosicaoInvalidaException;

/**
 *
 * @author Davi
 */
public class ListaDuplamenteLigada <T> {
    
    
    private NoDuplamenteLigado<T> inicio;
    
    private NoDuplamenteLigado<T> fim;
    
    
    public ListaDuplamenteLigada(){
        this.inicio = null;
        this.fim = null;
    }
    
    
    public ListaDuplamenteLigada(T elementos[]) {
         for (T a : elementos) {
            //this.adicionaFim(a);
        }
    }
    
    
    public void adcionarFim(T valor){
        
        NoDuplamenteLigado<T> no = new NoDuplamenteLigado<>(valor);

        if(inicio==null){
            inicio = no;
        }else{
            no.setAnterior(fim);
            fim.setProximo(no);
        }
        
        fim = no;
    }
    
    
    
    public void adicionarInicio(T valor){
        
        NoDuplamenteLigado<T> no = new NoDuplamenteLigado<>(valor);

        inicio.setAnterior(no);
        no.setProximo(inicio);
        inicio = no;
        
        if (fim == null){
            fim = no;
        }
    }
    
    public void adicionaPos(T valor,int pos) throws PosicaoInvalidaException{
        if (pos==0){
           adicionarInicio(valor);
        } else {
            NoDuplamenteLigado<T> novo = new NoDuplamenteLigado<>(valor);
            NoDuplamenteLigado<T>  iterador = inicio;
            
            int count = 0;
            
            while(iterador != null ){
                if(count == pos-1){
                    break;
                }
                
                iterador = iterador.getProximo();
                count ++;
            }
            
            novo.setProximo(iterador);
            novo.setAnterior(iterador.getAnterior());
            
            
            novo.getAnterior().setProximo(novo);
            novo.getProximo().setAnterior(novo);
        }
    }
    
}
