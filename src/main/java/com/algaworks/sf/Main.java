package com.algaworks.sf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.algaworks.sf.model.Usuario;
import com.algaworks.sf.servico.UsuarioServico;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Main.class.getPackage().getName());
		
		Usuario usuario = new Usuario("Alexandre");
		
		UsuarioServico usuarioServico = applicationContext.getBean(UsuarioServico.class);		
		usuarioServico.cadastrar(usuario);
		
//		UsuarioServico usuarioServico2 = applicationContext.getBean(UsuarioServico.class);
//		
//		if (usuarioServico == usuarioServico2) {
//			System.out.println("Sim, são iguais!");
//		} else {
//			System.out.println("Não, não são iguais!");
//		}
		
		applicationContext.close();
		
		System.out.println("Fim!");
	}

}
