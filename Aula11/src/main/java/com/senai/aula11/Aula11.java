/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senai.aula11;

/**
 *
 * @author charles
 */
public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Paulo");
        v1.setIdade(23);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1  = new Aluno();
        a1.setNome("Marcos");
        a1.setMaricula(0001);
        a1.setCurso("Banco de Dados");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMaricula(0002);
        b1.setNome("Anderson");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Prof. Carlos");
        p1.setIdade(53);
        p1.setSexo("M");
        p1.setEspecializacao("Mestre em Banco de Dados");
        p1.setSalario(23000);
        p1.fazerAniversario();
        System.out.println(p1.toString());
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Marcelo");
        t1.setMaricula(0003);
        t1.setRegistroProfissional(1234);
        t1.setCurso("Banco de Dados");
        t1.setIdade(23);
        t1.setSexo("M");
        t1.pagarMensalidade();
        System.out.println(t1.toString());
        
    }
}
