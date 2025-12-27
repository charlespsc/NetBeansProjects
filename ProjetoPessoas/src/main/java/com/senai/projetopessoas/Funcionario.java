
package com.senai.projetopessoas;

/**
 *
 * @author charles
 */
public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Metodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    
    //Metodos Especiais (Getters e Setters)

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    /*@Override
    public String toString() {
        return "Funcionario{" + "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }*/
        
}
