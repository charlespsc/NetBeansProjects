
package com.senai.aula12;

/**
 *
 * @author charles
 */
public class Peixe extends Animal {
    //Atributo de Peixe
    private String corEscama;
    
    public void soltandoBolha(){
        System.out.println("Soltando uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Peixe");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
        
}
