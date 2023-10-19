package com.controle.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull
	@NotBlank
	private String nome;
	
	
	@NotNull
	@NotBlank
	@Email(message = "Informe seu email: ")
	private String email;
	
	@NotNull
	@NotBlank
	@Size(min = 8,max = 12, message="MInimo de 8 caracter")
	private String rg;
	
	@NotNull
	@NotBlank
	@Size(min = 8,max = 12, message="MInimo de 8 caracter")
	private String cpf;
	
	@NotNull
	@NotBlank
	private String telefone;
	
	@NotNull
	@NotBlank
	private String endereco;
}

	

