package plataformalancamentofinanceiro.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import plataformalancamentofinanceiro.repository.BaseRepository;
import plataformalancamentofinanceiro.utility.ConstantantesUtility;

public class EntityManagerConnection extends BaseRepository {

	private static final long serialVersionUID = 1L;
	
	private static EntityManagerFactory entityManagerFactory;
	
	public EntityManagerConnection() { }
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory(ConstantantesUtility.NAME_PERSISTENCE_UNIT_MYSQL);
	}
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	public EntityManager entityManagerConnection() {
		return entityManagerFactory.createEntityManager();
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		EntityManagerConnection.entityManagerFactory = entityManagerFactory;
	}
	
	public void closeEntityManager(EntityManager entityManager) {
		entityManager.close();
	}
	
	public void closeEntityManagerFactory(EntityManager entityManager) {
		entityManager.getEntityManagerFactory().close();
	}
	
}
