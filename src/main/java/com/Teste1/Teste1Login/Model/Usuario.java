package com.Teste1.Teste1Login.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Usuario {

        // Atributos da classe
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @NotEmpty
        private String nome;

        @NotEmpty
        private String email;

        @NotEmpty
        private String senha;

        // Metodo Construtor
        public Usuario(){
                this.id = id;
                this.nome = nome;
                this.email = email;
                this.senha = senha;
        }

        // Metodos getters e setters
        public int getId(){
                return id;
        }

        public String getNome(){
                return nome;
        }

        public void setNome(String nome){
                this.nome = nome;
        }

        public String getEmail(){
                return email;
        }

        public void setEmail(String email){
                this.email = email;
        }

        public String getSenha(){
                return senha;
        }

        public void setSenha(String senha){
                this.senha = senha;
        }

}
