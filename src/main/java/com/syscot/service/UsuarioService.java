package com.syscot.service;

import com.syscot.model.Usuario;
import com.syscot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> consultarTodos() {
        try {
            Usuario u = new Usuario();
            u.setNome("Usuario_Teste");

            repository.inserir(u);

            return repository.listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
