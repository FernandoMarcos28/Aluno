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
public class Aluno {
    public String nome;
    public String serio;
    public String periodo;
    public Endereco endereco;
    

    public Aluno(String nome,String serio, String periodo, Endereco endereco) {
        this.nome = nome;
        this.serio = serio;
        this.periodo = periodo;
        this.endereco = endereco;
    }
    
}
