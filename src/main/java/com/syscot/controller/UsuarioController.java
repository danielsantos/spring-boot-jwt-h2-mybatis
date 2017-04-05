package com.syscot.controller;

import com.syscot.model.Usuario;
import com.syscot.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> consultarTodos() {
        return service.consultarTodos();
    }

    // TODO Usar o MyBatis com as querys em XML
    // TODO Fazer o inserir usuario (2 formas - com os dados na url ou no corpo da requisicao)

}
