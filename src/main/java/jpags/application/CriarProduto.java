package jpags.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Produto;

public class CriarProduto {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Produto produto = new Produto("Combo de salgados", "O melhor combo! surpresa e receba 6 pedidos novos", 30.00, 4);
		
		em.persist(produto);
		em.getTransaction().commit();

		em.close(); 
		emf.close();

	}
	
}
