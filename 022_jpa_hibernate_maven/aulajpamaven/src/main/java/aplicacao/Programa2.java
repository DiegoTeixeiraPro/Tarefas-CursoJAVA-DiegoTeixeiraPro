package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa2 {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		//Buscando um objeto pelo ID
		Pessoa p = em.find(Pessoa.class, 1);
		
		System.out.println(p);

		System.out.println("Feito");
		em.close();
		emf.close();
	}
}