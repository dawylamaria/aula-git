package br.edu.catolica.PadraoDAO.Interface;

import java.util.ArrayList;
import java.util.UUID;

public interface InterfaceDAO<T> {
    boolean inserir(T objeto);

    ArrayList<T> listarTodos();

    T buscarPorId(UUID idObjeto);

    boolean remover(UUID idObjeto);

    boolean atualizar(UUID idObjeto,T objetoAtualizado);
}
