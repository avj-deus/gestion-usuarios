package com.cice.gestionusuarios.controller;

import com.cice.gestionusuarios.controller.dto.UsuarioDTO;
import com.cice.gestionusuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosResource {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(path = "/usuarios/login",method = RequestMethod.POST)
    public ResponseEntity<Long> login(@RequestBody UsuarioDTO usuario){
        ResponseEntity<Long> responseDTO = null;
        Long userId = usuarioService.buscarUsuarioByLogin(usuario);
        if(userId != null){
            responseDTO = ResponseEntity.ok(userId);
        } else {
            responseDTO = ResponseEntity.notFound().build();
        }
        return responseDTO;
    }


}
