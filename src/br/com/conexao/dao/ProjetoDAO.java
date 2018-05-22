package br.com.conexao.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.conexao.model.Projeto;

public class ProjetoDAO {
	
	public void adicionar(Projeto projeto) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("default");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(projeto);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
	
	}
	
	public void alterar(Projeto projeto) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("default");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(projeto);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
	
	}
	
	public void remover(Long id) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("default");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		Projeto Projeto = manager.find(Projeto.class, id);
		manager.remove(Projeto);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
	
	}
	
	public Projeto buscarPorId(Long id) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("default");
		EntityManager manager = fabrica.createEntityManager();
		
		Projeto Projeto = manager.find(Projeto.class, id);
		
		fabrica.close();
		manager.close();
		
		return Projeto;
	}
}
