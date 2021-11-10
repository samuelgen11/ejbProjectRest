package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Padrone;

@Stateless
public class PadroneDao /*implements Dao<Padrone>*/ {
	
	@PersistenceContext(unitName = "persistenceUnit1") // tipo 'inject'
	private EntityManager em;
	
	public Padrone get(int id) {
		return em.find(Padrone.class, id);
	}

//	@Override
	public List<Padrone> getAll() {
		return em.createNamedQuery("findAllOwners", Padrone.class)
				.getResultList();
	}

//	@Override
	public void save(Padrone t) {
		em.persist(t);
	}

//	@Override
	public void update(Padrone t) {//
		em.merge(t);
	}

//	@Override
	public void delete(Padrone t) {
		em.remove(t);
	}
}
