package com.senai.aula04;

/**
 *
 * @author charles
 */
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        //metodo acessor e sem metodo acessor (ACESSO PUBLIC ou PRIVATE)
        c1.setModelo("BIC");
        //c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        c1.status();
    }
}