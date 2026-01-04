
package com.senai.aula12;

/**
 *
 * @author charles
 */
public class Ave extends Animal {
    //Atributo da Ave
    private String corPena;
    
    //Metodo da Ave
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
    
    //Metodos sobrescritos de Animal - SuperClasse
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    //Metodos acessorios (Getters e Setters)
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
