
package com.senai.aula13;

/**
 *
 * @author charles
 */
public class Mamifero extends Animal {
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
}
