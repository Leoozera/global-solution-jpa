package jpags.application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Produto;

public class ListarProdutos {
	
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		List<Produto> produtos = em.createQuery("select p from produto p", Produto.class).getResultList();
		
		for (Produto produto : produtos) {
			System.out.println(produto.getTitulo());
		}



		em.close();
		emf.close();

	}

}
