package com.algaworks.sf.servico.impl;

import org.springframework.stereotype.Service;

import com.algaworks.sf.model.Usuario;
import com.algaworks.sf.servico.UsuarioServico;

@Service
public class UsuarioServicoImpl implements UsuarioServico {

	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuário: " + usuario);
	}

}
