package jpags.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpags.domain.Consumidor;
import jpags.domain.Endereco;
import jpags.domain.Pedido;
import jpags.domain.PedidoStatus;
import jpags.domain.Produto;
import jpags.domain.Restaurante;

public class CriarPedido {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gs");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Restaurante restaurante = em.find(Restaurante.class, 1L);
		Consumidor consumidor = em.find(Consumidor.class, 1L);
		Produto produto = em.find(Produto.class, 1l);
		
		Endereco endereco = new Endereco("Rua doutor albuquerque", "Proximo da academia", "SP", "SP", "Pacaembu");
		Pedido pedido = new Pedido(endereco, restaurante, consumidor, produto, PedidoStatus.PENDENTE);
		
		em.persist(pedido);
		em.getTransaction().commit();

		em.close(); 
		emf.close();

	}
	
}
