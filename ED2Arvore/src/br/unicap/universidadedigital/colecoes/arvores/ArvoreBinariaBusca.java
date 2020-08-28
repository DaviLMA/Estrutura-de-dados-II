/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.universidadedigital.colecoes.arvores;

import br.unicap.universidadedigital.colecoes.listas.ListaSimplesmenteLigada;

/**
 *
 * @author Davi
 */
public class ArvoreBinariaBusca<    T extends Comparable<T>> {

    private NoArvoreBinaria<T> raiz;

    public T localizar(T valor) {
        return localizarP(raiz, valor);
    }

    ///5555
    private T localizarP(NoArvoreBinaria<T> raiz, T valor) {
        // Considera apenas a subárvore que tem raiz x
        if (raiz == null) {
            return null;
        }

        int cmp = raiz.compareTo(valor);

        if (cmp < 0) {
            return localizarP(raiz.getEsquerda(), valor);
        } else if (cmp > 0) {
            return localizarP(raiz.getDireita(), valor);
        } else {
            return raiz.getValor();
        }

    }

    public void deletar(T valor) {
        raiz = deleteRec(raiz, valor);
    }

    private NoArvoreBinaria<T> deleteRec(NoArvoreBinaria<T> raiz,T valor) {

        /* Base Case: If the tree is empty */
        if (raiz == null) {
            return raiz;
        }
        /* Otherwise, recur down the tree */
        int cmp = raiz.compareTo(valor);
        if (cmp < 0) {
            raiz.setEsquerda(deleteRec(raiz.getEsquerda(), valor));
        }    
        else if (cmp > 0) {
            raiz.setDireita(deleteRec(raiz.getDireita(), valor));           
        }    
        // if key is same as raiz's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (raiz.getEsquerda() == null) {
                return raiz.getDireita();
            } else if (raiz.getDireita() == null) {
                return raiz.getEsquerda();
            }

            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            raiz.getValor() = minValue(raiz.getDireita());

            // Delete the inorder successor 
            raiz.setDireita(deleteRec(raiz.getDireita(), raiz.getValor()));
        }

        return raiz; 
        
    

    

    

    public void adicionar(T valor) {
        this.raiz = adicionarP(this.raiz, valor);
    }

    private NoArvoreBinaria<T> adicionarP(NoArvoreBinaria<T> raiz, T valor) {
        // Considera apenas a subárvore com raiz x
        // Devolve a raiz da nova subárvore
        if (raiz == null) {
            return new NoArvoreBinaria<T>(valor);
        }

        int cmp = raiz.compareTo(valor);

        if (cmp < 0) {
            raiz.setEsquerda(adicionarP(raiz.getEsquerda(), valor));
        } else if (cmp > 0) {
            raiz.setDireita(adicionarP(raiz.getDireita(), valor));
        } else {
            raiz.setValor(valor);
        }

        return raiz;
    }

    /*   
        Pré-ordem (ou profundidade):

        Visita a raiz
        Percorre a subárvore esquerda em pré-ordem
        Percorre a subárvore direita em pré-ordem
   
        Pré-ordem => 8, 3, 1, 6, 4, 7, 10, 14, 13
     */
    public ListaSimplesmenteLigada<T> getPreOrdem() {
        ListaSimplesmenteLigada<T> retorno = new ListaSimplesmenteLigada<>();
        getPreOrdem(this.raiz, retorno);
        return retorno;
    }

    private void getPreOrdem(NoArvoreBinaria<T> raiz, ListaSimplesmenteLigada<T> lista) {
        if (raiz == null) {
            return;
        }
        lista.adicionaFim(raiz.getValor());
        getPreOrdem(raiz.getEsquerda(), lista);
        getPreOrdem(raiz.getDireita(), lista);
    }

    /*   
        Ordem Simétrica (Em ordem):

        Percorre a subárvore esquerda em ordem simétrica
        Visita a raiz
        Percorre a subárvore direita em ordem simétrica
   
        Ordem simétrica => 1, 3, 4, 6, 7, 8, 10, 13, 14 (chaves ordenadas)
     */
    public ListaSimplesmenteLigada<T> getEmOrdem() {
        ListaSimplesmenteLigada<T> retorno = new ListaSimplesmenteLigada<>();
        getEmOrdem(this.raiz, retorno);
        return retorno;
    }

    private void getEmOrdem(NoArvoreBinaria<T> raiz, ListaSimplesmenteLigada<T> lista) {
        if (raiz == null) {
            return;
        }
        getEmOrdem(raiz.getEsquerda(), lista);
        lista.adicionaFim(raiz.getValor());
        getEmOrdem(raiz.getDireita(), lista);
    }

    /*   
        Pós-ordem:

        Percorre a subárvore esquerda em pós-ordem
        Percorre a subárvore direita em pós-ordem
        Visita a raiz
   
        Pós-ordem => 1, 4, 7, 6, 3, 13, 14, 10, 8
     */
    public ListaSimplesmenteLigada<T> getPosOrdem() {
        ListaSimplesmenteLigada<T> retorno = new ListaSimplesmenteLigada<>();
        getPosOrdem(this.raiz, retorno);
        return retorno;
    }

    private void getPosOrdem(NoArvoreBinaria<T> raiz, ListaSimplesmenteLigada<T> lista) {
        if (raiz == null) {
            return;
        }
        getPosOrdem(raiz.getEsquerda(), lista);
        getPosOrdem(raiz.getDireita(), lista);
        lista.adicionaFim(raiz.getValor());
    }

}
