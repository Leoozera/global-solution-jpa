package jpags.application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Consumidor;

public class ListarConsumidores {
	
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		List<Consumidor> consumidores = em.createQuery("select c from consumidor c", Consumidor.class).getResultList();
		
		for (Consumidor consumidor : consumidores) {
			System.out.println(consumidor.getEmail());
		}



		em.close();
		emf.close();

	}

}
