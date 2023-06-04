package jpags.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Consumidor;
import jpags.domain.Endereco;

public class CriarConsumidor {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Endereco endereco = new Endereco("Rua doutor albuquerque", "Proximo da academia", "SP", "SP", "Pacaembu");
		Consumidor consumidor = new Consumidor("52607499877", "Leonard Karic", "leoozera7@gmail.com" , 19, "11965823342", endereco);
		
		em.persist(consumidor);
		em.getTransaction().commit();

		em.close(); 
		emf.close();

	}
	
}
