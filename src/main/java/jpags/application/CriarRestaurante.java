package jpags.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Endereco;
import jpags.domain.Restaurante;

public class CriarRestaurante {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Endereco endereco = new Endereco("Rua Henrique Schaumann", "3305", "SP", "SP", "Pinheiros");
		Restaurante restaurante = new Restaurante("Pastel da Mi", "O melhor pastel de SP", "3323213131231", 4.89, endereco	);
		
		em.persist(restaurante);
		em.getTransaction().commit();

		em.close(); 
		emf.close();

	}
	
}
