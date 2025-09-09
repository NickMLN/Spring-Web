package com.curso.boot.demo_mvc.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@SuppressWarnings("serial")
@Table(name = "FUNCIONARIOS")
public class Funcionario {
    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFALT 0.00")
    private BigDecimal salario;

    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @Column(name = "data_saida", columnDefinition = "DATE")
    private LocalDate dataSaida;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_fk")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "cargo_id_fk")
    private Cargo cargo;
}
