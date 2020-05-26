package br.iesb.projeto.managedbeans;

import br.iesb.projeto.entitybeans.Unidade;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "unidadeMB")
@SessionScoped
public class UnidadeMB implements Serializable {

    private Unidade unidade;

    public UnidadeMB() {
        this.unidade = new Unidade();
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
     
    public String cancelar(){
        return "/pages/index?faces-redirect=true";
    }
    
    public String salvar(){
        
        return "/pages/ConsultarUnidades?faces-redirect=true";
    }
    
    
    
    
    

}
