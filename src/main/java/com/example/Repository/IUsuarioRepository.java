package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Usuario;

@Repository("UsuarioRepository")
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

}
