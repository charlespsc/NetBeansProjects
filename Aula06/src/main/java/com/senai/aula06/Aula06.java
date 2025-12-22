package com.senai.aula06;

/**
 *
 * @author charles
 */
public class Aula06 {

    public static void main(String[] args) {
       ControleRemoto c = new ControleRemoto();
  
       c.ligar();
       c.play();

       c.maisVolume();
       c.maisVolume();
       
       c.abrirMenu();
       c.fecharMenu();
    }
}
