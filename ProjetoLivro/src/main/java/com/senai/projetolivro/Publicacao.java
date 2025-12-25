
package com.senai.projetolivro;

/**
 *
 * @author charles
 */
public interface Publicacao {
    //Metodos Abstratos
    public void abrir();
    public void fechar();
    public void folhear(int p);
    public void avancarPag();
    public void voltarPag();
}
