package br.iesb.projeto.entitybeans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AreaFacade extends AbstractFacade<Area> {

    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreaFacade() {
        super(Area.class);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetopiPU");
        em = emf.createEntityManager();    
    }

}
