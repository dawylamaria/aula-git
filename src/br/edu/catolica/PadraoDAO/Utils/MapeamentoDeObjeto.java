package br.edu.catolica.PadraoDAO.Utils;

import br.edu.catolica.PadraoDAO.Interface.InterfaceIdentificavel;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

public abstract class MapeamentoDeObjeto {

    public static <T extends InterfaceIdentificavel> T mapeador(Map<String, Object> dados, Class<T> classeModelo, UUID idObjeto) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        T modelo = classeModelo.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entrada : dados.entrySet()) {
            String chave = entrada.getKey();
            Object valor = entrada.getValue();
            System.out.println(chave);
            if (chave.equals("id")){
                System.out.println("Entando aquo");
                valor = idObjeto;
            }

            try {
                java.lang.reflect.Field campo = classeModelo.getDeclaredField(chave);
                campo.setAccessible(true);
                campo.set(modelo, valor);
            } catch (NoSuchFieldException e) {
                // Lidar com exceções, se necessário
                System.err.println(e.getMessage());
            }
        }

        modelo.setId(idObjeto);

        return modelo;
    }
}
