package com.syscot.repository;

import com.syscot.model.Usuario;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UsuarioRepository {

    @Select("SELECT * FROM usuario")
    List<Usuario> listar();

    @Insert("insert into usuario (nome) values(#{nome})")
    int inserir(Usuario usuario);

}
