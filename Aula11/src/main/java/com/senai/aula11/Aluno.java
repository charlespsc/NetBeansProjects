
package com.senai.aula11;

/**
 *
 * @author charles
 */
public class Aluno extends Pessoa {
    private int maricula;
    private String curso;
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    public int getMaricula() {
        return maricula;
    }

    public void setMaricula(int maricula) {
        this.maricula = maricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
