package com.UFMSPetSistemas.getpet.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Usuario {
	private @Id @GeneratedValue
	Long id;

	@NotEmpty
	private String nomeCompleto;

	@NotNull
	private Date dataNascimento;

	@NotEmpty
	private String endereco;

	@NotEmpty
	private String cidade;

	@NotEmpty
	private String uf;

	@Email
	@NotEmpty
	private String email;

	@NotEmpty
	private String telefone;

	@NotEmpty
	private String senha;

}
