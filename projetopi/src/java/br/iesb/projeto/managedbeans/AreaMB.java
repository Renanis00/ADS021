package br.iesb.projeto.managedbeans;

import br.iesb.projeto.entitybeans.Area;
import br.iesb.projeto.entitybeans.AreaFacade;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jairo
 */
@ManagedBean(name = "areaMB")
@SessionScoped
public class AreaMB implements Serializable {
    
    private AreaFacade areaDAO;

    private static final long serialVersionUID = 1L;

    private Area area;
    private List<Area> lista;

    public List<Area> getLista() {
        if (lista == null) {
            lista = areaDAO.findAll();
        }
        return lista;
    }

    public void setLista(List<Area> lista) {
        this.lista = lista;
    }

    public AreaMB() {
        this.area = new Area();
        this.areaDAO = new AreaFacade();
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String cancelar() {
        return "/pages/index?faces-redirect=true";
    }

 public String salvar(Area area) {
        if (area.getId()==0) {
            areaDAO.create(area);
        } else {
            areaDAO.edit(area);
        }
        lista = areaDAO.findAll();
        return "PesquisarAreas";
    }
    
  public String criar() {
        this.area = new Area();
        return "CadastrarAreas";
    }

     public String editar(Area area) {
        this.area = area;
        return "CadastrarAreas";
    }
   public void remover(Area are) {
        areaDAO.remove(area);
        this.lista = areaDAO.findAll();
    }

}

