package plataformalancamentofinanceiro.test;

import org.jboss.logging.Logger;

import plataformalancamentofinanceiro.connection.EntityManagerConnection;

public class EntityManagerConnectionTest {
	
	private static final Logger LOGGER = Logger.getLogger(EntityManagerConnectionTest.class);
	
	public static void main(String[] args) {
		entityManagerConnection();
	}
	
	public static void entityManagerConnection() {
		EntityManagerConnection entityManagerConnection = new EntityManagerConnection();
			getLogger().debug(entityManagerConnection.entityManagerConnection());
			getLogger().debug("Teste Finalizado!");
	}

	public static Logger getLogger() {
		return LOGGER;
	}
	
}
