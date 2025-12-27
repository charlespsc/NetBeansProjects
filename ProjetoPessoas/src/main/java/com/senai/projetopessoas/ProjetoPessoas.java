
package com.senai.projetopessoas;

/**
 *
 * @author charles
 */
public class ProjetoPessoas {

    public static void main(String[] args) {
        // Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setSexo("M");
        p1.setIdade(32);
        
        p2.setNome("Maria");
        p2.setIdade(18);
        p2.setCurso("Banco de Dados");
        
        p3.setNome("Pablo");
        p3.setSalario(2500.90f);
        
        
        p4.setNome("Fabiana");
        p4.setSexo("F");
        p4.setSetor("Estoque");
           
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
}
