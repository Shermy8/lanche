/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author positivo
 */
public class ModeloJframe1 {
    private String nome;
    private int troco;
    private double preco;
    String lista;
    Object[] listin;

    public Object[] getListin() {
        return listin;
    }

    public void setListin(Object[] listin) {
        this.listin = listin;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    public int getTroco() {
        return troco;
    }
    public double getPreco(){
        return preco;
    }
    public String getLista() {
        return lista;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTroco (int troco) {
        this.troco = troco;
    }
    public void setPreco (double preco) {
        this.preco = preco;
    }
    public void setLista(String lista) {
        this.lista = lista;
    }
}
