package br.iesb.projeto.managedbeans;

import br.iesb.projeto.entitybeans.Area;
import br.iesb.projeto.entitybeans.Unidade;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "areaMB")
@SessionScoped
public class AreaMB implements Serializable {

    private Area area;
    

    public AreaMB() {
    }
    

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String cancelar(){
        return "/pages/index?faces-redirect=true";
    }    
          
    
    

}
