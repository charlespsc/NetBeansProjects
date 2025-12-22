package com.senai.aula05;

/**
 *
 * @author charles
 */
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(00000001);
        p1.setDono("Junior");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(00000002);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
        
    }
}
