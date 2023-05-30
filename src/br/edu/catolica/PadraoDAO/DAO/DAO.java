package br.edu.catolica.PadraoDAO.DAO;

import br.edu.catolica.PadraoDAO.Interface.InterfaceDAO;
import br.edu.catolica.PadraoDAO.Interface.InterfaceIdentificavel;
import java.util.ArrayList;
import java.util.UUID;

public class DAO<T extends InterfaceIdentificavel> implements InterfaceDAO<T>{

    ArrayList<T> base = new ArrayList<>();

    public DAO() {}

    @Override
    public boolean inserir(T objeto) {
        return base.add(objeto);
    }

    @Override
    public ArrayList<T> listarTodos() {
        for (T objeto: this.base) {
            System.out.println(objeto);
        }
        return base;
    }

    @Override
    public T buscarPorId(UUID idObjeto) {

        for (T objeto : base) {
            if (objeto.getId().equals(idObjeto) ) {
                return objeto;
            }
        }
        return null;
    }

    @Override
    public boolean remover(UUID idObjeto) {
        T objeto = this.buscarPorId(idObjeto);
        return base.remove(objeto);
    }

    @Override
    public boolean atualizar(UUID idObjeto, T objetoAtualizado){
        T objeto = this.buscarPorId(idObjeto);
        if (objeto == null){
            return false;
        }
        int posicao = this.base.indexOf(objeto);
        this.base.set(posicao, objetoAtualizado);
        return true;
    }


}
