package com.UFMSPetSistemas.getpet.model.entities;

import java.util.Collection;
import model.AvaliacaoServico;

public class PrestacaoServico {

	private int id;

	private Date dataPrestacao;

	private int avaliacao;

	private String avaliacaoDescricao;

	private double valorServico;

	private Collection<UsuarioConsumidor> usuarioConsumidor;

	private AvaliacaoServico avaliacaoServico;

	private Collection<UsuarioServico> usuarioServico;

}
