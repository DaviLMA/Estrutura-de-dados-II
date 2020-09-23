/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreavl;

/**
 *
 * @author Davi Araújo
 */
public class Main {
    public static void main(String[] args) {
        
        ArvoreAvl nova = new ArvoreAvl();
        nova.inserir(2);
        System.out.println(nova.inorder());
        
        nova.inserir(4);
        System.out.println(nova.inorder());
        
        nova.inserir(0);
        System.out.println(nova.inorder());
        nova.inserir(1);
        nova.inserir(13);
        nova.inserir(6);
        nova.inserir(5);
        nova.inserir(9);
        nova.inserir(20);
        System.out.println(nova.inorder());
        nova.remover(2);
        System.out.println(nova.inorder());
    }
}
