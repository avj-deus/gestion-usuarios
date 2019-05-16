package com.cice.gestionusuarios.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_role")
public class RoleEntitiy {

    @Id
    @GeneratedValue
    private Long id;
    private String role;

    @OneToMany(mappedBy = "usuario")
    private UsuarioEntity user;
}
