package com.janinechaves.cadastro_usuarios.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Data
@Table(name = "usuario")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;
}