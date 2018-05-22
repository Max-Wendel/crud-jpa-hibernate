package br.com.conexao.EntityManagerFactory;

import javax.persistence.Persistence;

public class CriarTabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("default");
	}
}
