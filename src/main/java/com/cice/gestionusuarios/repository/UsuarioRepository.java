package com.cice.gestionusuarios.repository;

import com.cice.gestionusuarios.repository.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    Long buscarUsuarioByLogin(String user, String pass);
}
