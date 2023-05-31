package br.edu.catolica.PadraoDAO.Main;


/*
* PROJETO DE DESENVOLVIMENTO DE UMA CONCESSIONÁRIA DE CARROS
* */

import br.edu.catolica.PadraoDAO.DAO.ClienteDAO;
import br.edu.catolica.PadraoDAO.DAO.EstoqueCarrosDAO;
import br.edu.catolica.PadraoDAO.Model.Carro;
import br.edu.catolica.PadraoDAO.Utils.MapeamentoDeObjeto;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import br.edu.catolica.PadraoDAO.Model.Cliente;
import br.edu.catolica.PadraoDAO.DAO.ClienteDAO;
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {


        Carro carro1 = new Carro("Boa", "Bonito", 2023, "Preto", 250000);
        Carro carro2 = new Carro("Ruim", "Feio", 2023, "Rosa", 250000);
        Carro carro3 = new Carro("Mais ou menos", "Fofinho", 2023, "Azul", 250000);

        EstoqueCarrosDAO estoque = new EstoqueCarrosDAO();

        estoque.inserir(carro1);
        estoque.inserir(carro2);
        estoque.inserir(carro3);

        ArrayList<Carro> carros =  estoque.listarTodos();

        Cliente cliente1 = new Cliente("dawyla", " qualquer", "123456");
        Cliente cliente2 = new Cliente("vitor", " qualquer", "789987");

        ClienteDAO clienteDAO = new ClienteDAO();

        clienteDAO.inserir(cliente1);
        clienteDAO.inserir(cliente2);

        ArrayList<Cliente> clientes =  clienteDAO.listarTodos();

        System.out.println("\nPROCESSO DE ATUALIZAÇÃO\n");

        Map<String, Object> carroMap = new HashMap<>();

        Carro carroAtualizar = estoque.buscarPorId(carros.get(1).getId());
        System.out.println(carroAtualizar);
        carroMap.put("marca", carroAtualizar.getMarca());
        carroMap.put("modelo", carroAtualizar.getModelo());
        carroMap.put("ano", carroAtualizar.getAno());
        carroMap.put("cor", carroAtualizar.getCor());
        carroMap.put("preco", 10000);


        Carro carroAtualizado = MapeamentoDeObjeto.mapeador(carroMap, Carro.class, carroAtualizar.getId());

        estoque.atualizar(carroAtualizar.getId(), carroAtualizado);

        System.out.println("ATUALIZAÇÃO FINALIZADA\n");

        estoque.listarTodos();



    }
}
