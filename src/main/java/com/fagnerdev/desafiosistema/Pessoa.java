package com.fagnerdev.desafiosistema;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "pessoa")
public class Pessoa {


        @Id
        private Long id;
        private String nome;
        private Integer idade;
        private LocalDate dataNascimento;

        public Pessoa(){
        }

        public Pessoa(Long id, String nome, Integer idade, LocalDate dataNascimento) {
                this.id = id;
                this.nome = nome;
                this.idade = idade;
                this.dataNascimento = dataNascimento;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public Integer getIdade() {
                return idade;
        }

        public void setIdade(Integer idade) {
                this.idade = idade;
        }

        public LocalDate getDataNascimento() {
                return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
                this.dataNascimento = dataNascimento;
        }
}
