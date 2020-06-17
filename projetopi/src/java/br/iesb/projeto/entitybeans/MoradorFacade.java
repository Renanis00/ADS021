package br.iesb.projeto.entitybeans;

import entitybeans.AbstractFacade;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MoradorFacade extends AbstractFacade<Morador> {

    @PersistenceContext(unitName = "projetopiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MoradorFacade() {
        super(Morador.class);
    }

}
