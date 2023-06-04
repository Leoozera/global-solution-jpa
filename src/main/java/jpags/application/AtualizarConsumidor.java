package jpags.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Consumidor;

public class AtualizarConsumidor {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); 

		Consumidor consumidor = em.find(Consumidor.class, 1L);
		
		consumidor.setNome("Leonard Karic Klovrza");

		em.getTransaction().commit();

		em.close();
		emf.close();

	}
}
