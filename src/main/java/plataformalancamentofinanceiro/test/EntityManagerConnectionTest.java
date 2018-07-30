package plataformalancamentofinanceiro.test;

import plataformalancamentofinanceiro.connection.EntityManagerConnection;

public class EntityManagerConnectionTest {
	
	public static void main(String[] args) {
		entityManagerConnection();
	}
	
	public static void entityManagerConnection() {
		EntityManagerConnection entityManagerConnection = new EntityManagerConnection();
			System.out.println(entityManagerConnection.entityManagerConnection());
			System.out.println("Teste Finalizado!");
	}
	
}
