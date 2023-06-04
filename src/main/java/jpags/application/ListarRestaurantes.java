package jpags.application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Restaurante;

public class ListarRestaurantes {
	
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		List<Restaurante> restaurantes = em.createQuery("select r from restaurante r", Restaurante.class).getResultList();
		
		for (Restaurante restaurante : restaurantes) {
			System.out.println(restaurante.getNome());
		}



		em.close();
		emf.close();

	}

}
