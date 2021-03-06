package com.algaworks.curso.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.model.Cliente;

public class ConsultandoComJPQL {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		List<Cliente> clientes =  em.createQuery("from Cliente where sexo = 'Masculino'",Cliente.class).getResultList();
		
		for(Cliente cliente : clientes) {
			System.out.println("Código: "+cliente.getId());
			System.out.println("Nome: "+cliente.getNome());
			System.out.println("Sexo: "+cliente.getSexo());
			System.out.println("------------------------");
		}
		

	}

}
