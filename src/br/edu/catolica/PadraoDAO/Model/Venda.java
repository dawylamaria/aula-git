package br.edu.catolica.PadraoDAO.Model;

import br.edu.catolica.PadraoDAO.Interface.InterfaceIdentificavel;

import java.time.LocalDateTime;
import java.util.UUID;

public class Venda implements InterfaceIdentificavel {
    private UUID id;
    private Carro carro;
    private Cliente cliente;
    private Funcionario vendedor;
    private LocalDateTime dataHoraVenda;
    private double valorVenda;

    public Venda(Carro carro, Cliente cliente, Funcionario vendedor, double valorVenda) {
        this.id = UUID.randomUUID();
        this.carro = carro;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataHoraVenda = LocalDateTime.now();
        this.valorVenda = valorVenda;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDateTime getDataHoraVenda() {
        return dataHoraVenda;
    }

    public void setDataHoraVenda(LocalDateTime dataHoraVenda) {
        this.dataHoraVenda = dataHoraVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", carro=" + carro +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", dataHoraVenda=" + dataHoraVenda +
                ", valorVenda=" + valorVenda +
                '}';
    }
}