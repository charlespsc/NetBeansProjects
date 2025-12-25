
package com.senai.projetolivro;

/**
 *
 * @author charles
 */
public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Paulo", 43, "M");
        p[1] = new Pessoa("MAria", 25, "F");
        
        l[0] = new Livro("Aprendendo Java", "Jose de Alencar", 345, p[0]);
        l[1] = new Livro("POO para iniciantes", "MAria Aparecida", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Pedro Amado", 800, p[0]);
        
        System.out.println(l[0].detalhes());
    }
}
