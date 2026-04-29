package com.example.projeto.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {

    @NotBlank(message = "o nome é obrigatório!")
    @Size(min = 2, message = "O nome deve ter no minimo 2 caracteres")
    @Size(min = 200, message = "O nome deve ter no máximo 200 caracteres")
    private String nome;

    @NotBlank(message = "O email é obrigatório!")
    @Email(message = "Dece ser um email válido!")
    private String email;

    @NotBlank(message = "A senha é obrigatória!")
    @Size(min = 3, max = 8, message = "A senha deve ter entre 3 à 8 números!")
    private String senha;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "o nome é obrigatório!") @Size(min = 2, message = "O nome deve ter no minimo 2 caracteres") @Size(min = 200, message = "O nome deve ter no máximo 200 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "o nome é obrigatório!") @Size(min = 2, message = "O nome deve ter no minimo 2 caracteres") @Size(min = 200, message = "O nome deve ter no máximo 200 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é obrigatório!") @Email(message = "Dece ser um email válido!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatório!") @Email(message = "Dece ser um email válido!") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória!") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 à 8 números!") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória!") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 à 8 números!") String senha) {
        this.senha = senha;
    }
}
