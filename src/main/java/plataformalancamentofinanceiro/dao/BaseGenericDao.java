package plataformalancamentofinanceiro.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jboss.logging.Logger;

import plataformalancamentofinanceiro.connection.EntityManagerConnection;
import plataformalancamentofinanceiro.utility.ConstantantesUtility;
import plataformalancamentofinanceiro.utility.MensagensSistemaUtility;

/**
 * Responsavel por genrenciar, de forma generica, as operacoes de persistencia com o Banco de Dados.
 * @param <T>
 */
public class BaseGenericDao<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(BaseGenericDao.class);
	
	private static EntityManager entityManager;	
	private EntityTransaction entityTransaction;
	
	@SuppressWarnings("static-access")
	public BaseGenericDao() {
		this.entityManager = EntityManagerConnection.getEntityManager();
		this.entityTransaction = EntityManagerConnection.getEntityManager().getTransaction();
	}
	
	public T findOne(Class<T> object, Long codigo) {
		return getEntityManager().find(object, codigo);
	}
	
	/**
	 * Responsavel por realizar o cadastramento dos dados no Banco de Dados.
	 * @param object
	 * @return
	 */
	public boolean persist(T object) {
		try {
			getBeginTransaction();
				getEntityManager().persist(object);
			getCommitTransaction();
			recuperarMensagemSucesso();
			return true;
		}catch(Exception e) {
			recuperarMensagemError(e);
			return false;
		}
	}
	
	public void remove(Class<T> object, Long codigo) {
		T objectResult = findOne(object, codigo);
		try {
			getBeginTransaction();
				getEntityManager().remove(objectResult);
				getEntityManager().flush();
			getCommitTransaction();
		}catch(Exception e) {
			getRollbackTransaction();
		}
	}
	
	public void merge(T object) {
		try {
			getBeginTransaction();
				getEntityManager().merge(object);
			getCommitTransaction();
		}catch(Exception e) {
			getRollbackTransaction();
		}
	}
	
	// TODO IMPLEMENTAR METODO ABSTRATO PARA RETORNAR UMA LISTA DE DADOS PARA UMA DETERMINADA ENTIDADE PARA UMA DETERMINADA PESQUISA.
	public List<T> findAll() {
		return null;
	}
	
	public void getBeginTransaction() {
		if(entityManager.getTransaction().isActive() == false) {
			BaseGenericDao.entityManager.getTransaction().begin();
		}
	}

	public void getCommitTransaction() {
		entityManager.getTransaction().commit();
	}
	
	public void getRollbackTransaction() {
		entityManager.getTransaction().rollback();
	}
	
	public void getCloseEntityManager() {
		entityManager.close();
	}
	
	public void getCleanEntityManager() {
		entityManager.clear();
	}
	
	public void getFlushEntityManager() {
		entityManager.flush();
	}
	
	public void recuperarMensagemSucesso() {
		MensagensSistemaUtility.getMensagemInformacao(ConstantantesUtility.MESSAGE_VIEW_SUCESSO);
	}
	
	public void recuperarMensagemError(Exception e) {
		getLogger().error(MensagensSistemaUtility.recuperarMensagemError(e));
		MensagensSistemaUtility.getMensagemErro(MensagensSistemaUtility.recuperarMensagemError(e));
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void setEntityManager(EntityManager entityManager) {
		BaseGenericDao.entityManager = entityManager;
	}
	
	public EntityTransaction getEntityTransaction() {
		return entityTransaction;
	}
	
	public void setEntityTransaction(EntityTransaction entityTransaction) {
		this.entityTransaction = entityTransaction;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

}
