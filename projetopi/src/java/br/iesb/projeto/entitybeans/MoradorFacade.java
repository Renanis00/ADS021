package br.iesb.projeto.entitybeans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MoradorFacade extends AbstractFacade<Morador> {

    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MoradorFacade() {
        super(Morador.class);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetopiPU");
        em = emf.createEntityManager();    
    }

}
