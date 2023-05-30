package br.edu.catolica.PadraoDAO.Model;

import br.edu.catolica.PadraoDAO.Interface.InterfaceIdentificavel;

import java.util.UUID;

public class Funcionario implements InterfaceIdentificavel {
    private UUID id;
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
