package com.cice.gestionusuarios.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Accessors(chain = true)
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String user;
    private String pass;

    @OneToOne
    @JoinColumn(name = "usuario_data_id") //la relacion se hace en base al nombre de la tabla
    private UsuarioDataEntity userData;

    @OneToOne
    @JoinColumn(name = "user_role")
    private RoleEntitiy role;
}
