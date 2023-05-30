package br.edu.catolica.PadraoDAO.Model;

import br.edu.catolica.PadraoDAO.Interface.InterfaceIdentificavel;

import java.util.UUID;

public class Carro implements InterfaceIdentificavel{
    private UUID id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;

    public Carro(){}

    public Carro(String marca, String modelo, int ano, String cor, double preco) {
        this.id = UUID.randomUUID();
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    /*Esse método 'setId' somente poderá ser utilizado pela classe MapeamentoDeObjetos
    *
    * @param id = Será cadastrado automaticamente com a criação do objeto.
    * @return 'chave-uuid'.
    */
    public void setId(UUID id){
        this.id = id;
    }
    public UUID getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                '}';
    }
}
