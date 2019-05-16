package com.cice.gestionusuarios.repository;

import com.cice.gestionusuarios.repository.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    @Query(value = "SELECT id FROM usuario WHERE user = :user AND pass = :pass", nativeQuery = true)
    Long buscarUsuarioByLogin(@Param(value = "user") String user, @Param(value = "pass")String pass);

    @Modifying
    @Transactional //ambos son obligatorios
    @Query(value = "INSERT INTO usuario (user, pass) VALUES(:user, :pass)", nativeQuery = true)
    Long crearNuevoUsuario(@Param(value = "user") String user, @Param(value = "pass") String pass);
}
