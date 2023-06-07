package jpags.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Pedido;
import jpags.domain.PedidoStatus;

public class AtualizarProduto {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); 

		Pedido pedido = em.find(Pedido.class, 1L);
		
		pedido.setStatus(PedidoStatus.EM_ROTA);

		em.getTransaction().commit();

		em.close();
		emf.close();

	}
}
