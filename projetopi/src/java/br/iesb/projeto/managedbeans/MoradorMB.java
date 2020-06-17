package br.iesb.projeto.managedbeans;

import br.iesb.projeto.entitybeans.Morador;
import br.iesb.projeto.entitybeans.MoradorFacade;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jairo
 */
@ManagedBean(name = "moradorMB")
@SessionScoped
public class MoradorMB implements Serializable {
    
    private MoradorFacade moradorDAO;

    private static final long serialVersionUID = 1L;

    private Morador morador;
    private List<Morador> lista;

    public List<Morador> getLista() {
        if (lista == null) {
            lista = moradorDAO.findAll();
        }
        return lista;
    }

    public void setLista(List<Morador> lista) {
        this.lista = lista;
    }

    public MoradorMB() {
        this.morador = new Morador();
        this.moradorDAO = new MoradorFacade();
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public String cancelar() {
        return "/pages/index?faces-redirect=true";
    }

    public String salvar() {

        return "/pages/ConsultarMoradores?faces-redirect=true";
    }

}
