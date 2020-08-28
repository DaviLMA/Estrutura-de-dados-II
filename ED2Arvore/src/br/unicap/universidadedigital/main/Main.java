/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicap.universidadedigital.main;

import br.unicap.universidadedigital.alunos.entidades.Aluno;
import br.unicap.universidadedigital.alunos.controladores.ControladorAluno;
import br.unicap.universidadedigital.colecoes.arvores.ArvoreBinariaBusca;
import br.unicap.universidadedigital.colecoes.comum.No;
import br.unicap.universidadedigital.colecoes.listas.ListaDuplamenteLigada;
import br.unicap.universidadedigital.colecoes.listas.ListaSimplesmenteLigada;
import br.unicap.universidadedigital.colecoes.listas.iteradores.IteradorListaSimplesmenteLigada;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Davi
 */
public class Main {
    
    static Aluno[] alunos = {
        new Aluno("Catapóbio",  "00000000000", 22, "000000", 600.00f, 0.00f),//0
        new Aluno("Saponácio",  "11111111111", 23, "111111", 300.00f, 0.00f),//1
        new Aluno("Fulustreco", "22222222222", 20, "222222", 1500.00f, 10.00f),//2
        new Aluno("Coníglio",   "33333333333", 17, "333333", 4400.00f, 30.00f),//3
        new Aluno("Austin",     "44444444444", 22, "444444", 3000.00f, 30.00f),//4
        new Aluno("Antonio",    "55555555555", 22, "555555", 400.00f, 0.00f),//5
        new Aluno("Tj",         "66666666666", 40, "666666", 545.00f, 0.00f),//6
        new Aluno("Márcio",     "77777777777", 12, "777777", 560.00f, 10.00f),//7
        new Aluno("Ana",        "88888888888", 20, "888888", 800.00f, 15.00f),//8
        new Aluno("Maria",      "99999999999", 15, "999999", 1500.00f, 100.00f),//9
    
    };
      
     
    
    //Coesão <- 
    
    //Camada de Integracao -> Controlador -> Coleção (GENÉRICA)
      
    public static void main(String[] args) {
        
        
        ControladorAluno alunoControler = new ControladorAluno(alunos);
        System.out.println("Soma das mensalidades: R$ " + alunoControler.totalMensalidades());
        
        
        IteradorListaSimplesmenteLigada<Aluno> iteradorAlunosComDesconto = alunoControler.alunosComDesconto();
        
        StringBuilder json = new StringBuilder();
        json.append("[");
        while(iteradorAlunosComDesconto.existeProximo()){
            Aluno aluno = iteradorAlunosComDesconto.getProximo();
            json.append(aluno).append(",\n");
        }
        json.append("]");
        
        
        System.out.println(json);
        
        
        
        
        
        ArvoreBinariaBusca<Aluno> arvore = new ArvoreBinariaBusca<>();
        
        arvore.adicionar(alunos[4]);
        arvore.adicionar(alunos[2]);
        arvore.adicionar(alunos[7]);
        arvore.adicionar(alunos[1]);
        arvore.adicionar(alunos[3]);
        arvore.adicionar(alunos[5]);
        arvore.adicionar(alunos[8]);
        
        //Chave de busca
        Aluno busca = arvore.localizar(new Aluno("888888"));
        
        
        
        
    } 
    
}