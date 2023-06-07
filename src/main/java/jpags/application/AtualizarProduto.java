package jpags.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Produto;

public class AtualizarPedido {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); 

		Produto produto = em.find(Produto.class, 1L);
		
		produto.setPreco(29);

		em.getTransaction().commit();

		em.close();
		emf.close();

	}
}
