package com.challenge3.msuser.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "CPF")
    private Integer cpf;

    @Column(name = "birthDate")
    private LocalDateTime birthDate;

    @Column(name = "email")
    private String email;

    @Column(name = "CEP")
    private Integer cep;

    @Column(name = "password")
    private Integer password;

    @Column(name = "active")
    private Boolean active;



}
