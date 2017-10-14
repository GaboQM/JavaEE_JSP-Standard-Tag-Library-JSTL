/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabo.corp.com.bean;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author gaboqm
 */
@Stateless
public class Lista {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public List lista;
    public Lista(){
        lista=new ArrayList();
        lista.add("Gabo Quiroga");
        lista.add("Josue Garcia");
        lista.add("Claudia Trejo");
        lista.add("Ernesto Diaz");
        lista.add("Aldo Herrera");
        
        
    }
    public List getListaNombres(){
        
        return lista;
    }
    
}
