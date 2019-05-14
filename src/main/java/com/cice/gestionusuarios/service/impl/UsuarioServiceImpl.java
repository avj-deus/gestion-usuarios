package com.cice.gestionusuarios.service.impl;

import com.cice.gestionusuarios.controller.dto.UsuarioDTO;
import com.cice.gestionusuarios.repository.UsuarioRepository;
import com.cice.gestionusuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Long buscarUsuarioByLogin(UsuarioDTO usuarioDTO) {
        return usuarioRepository.buscarUsuarioByLogin(usuarioDTO.getUser(), usuarioDTO.getPass());
    }
}
