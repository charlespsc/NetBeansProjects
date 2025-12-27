
package com.senai.projetopessoas;

/**
 *
 * @author charles
 */
public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
    
    //Metodos
    public void cancelarMatricula(){
        System.out.println("Sua matricula sera cancelada!");
    }
    
    //Metodos Especiais (Getters e Setters)
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    /*@Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + '}';
    }*/
    
    
}
