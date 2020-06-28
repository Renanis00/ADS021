/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.projeto.managedbeans;

import br.iesb.projeto.entitybeans.Morador;
import br.iesb.projeto.entitybeans.MoradorFacade;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 *
 * @author jairo
 */
@ManagedBean(name = "moradorMB")
@SessionScoped
public class MoradorMB {

    private MoradorFacade moradorDAO;

    private List<Morador> lista;

    private Morador morador;

    public MoradorMB() {
       moradorDAO = new MoradorFacade(); 
    }

    public List<Morador> getLista() {
        if (lista == null) {
            lista = moradorDAO.findAll();
        }
        return lista;
    }

    public void setLista(List<Morador> lista) {
        this.lista = lista;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public String criar() {
        this.morador = new Morador();
        return "CadastrarMoradores";
    }

    public String editar(Morador morador) {
        this.morador = morador;
        return "CadastrarMoradores";
    }

    public void remover(Morador morador) {
        moradorDAO.remove(morador);
        this.lista = moradorDAO.findAll();

    }

    public String salvar(Morador morador, boolean novo) {
        if (novo) {
            moradorDAO.create(morador);
        } else {
            moradorDAO.edit(morador);
        }
        lista = moradorDAO.findAll();
        return "ConsultarMoradores";
    }

}
