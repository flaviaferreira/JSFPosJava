package facade;

import entidade.PessoaFisica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PessoaFisicaFacade extends AbstractFacade<PessoaFisica> {

    @PersistenceContext(name = "aulajsfposjavaPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public PessoaFisicaFacade(){
        super(PessoaFisica.class);
    }
}
