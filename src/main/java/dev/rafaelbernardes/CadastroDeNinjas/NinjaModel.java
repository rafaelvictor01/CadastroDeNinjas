package dev.rafaelbernardes.CadastroDeNinjas;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_ninja")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel() { }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}
