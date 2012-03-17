/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 *
 * @author User
 */
public class Venda {
private int cod;
    private Time hora;
    private Date data;
    private List<ItenVenda> itens;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItenVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItenVenda> itens) {
        this.itens = itens;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    }

