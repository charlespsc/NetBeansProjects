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
    }
}
