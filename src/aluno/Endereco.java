/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author Fabio
 */
public class Endereco {
    public String rua;
    public int numero;
    public String bairro;
    public String Cidade;        

    public Endereco(String rua, int numero, String bairro, String Cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.Cidade = Cidade;
    }
    
}
