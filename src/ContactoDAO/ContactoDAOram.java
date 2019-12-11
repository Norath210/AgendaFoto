/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactoDAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Contacto;

/**
 *
 * @author Castelao
 */
public class ContactoDAOram implements ContactoDAO{
    private static ContactoDAOram instance;
    private static ArrayList<Contacto> contactos;
    
    private ContactoDAOram(){      
    }
    public static ContactoDAOram getInstanceOf(){
        if (instance == null){
            contactos = new ArrayList<>();
            instance = new ContactoDAOram();
        }
        return instance;
    }    
    
    @Override
    public List<Contacto> getAllContacto() {
        return contactos;
    }

    @Override
    public Contacto getContactoByNIF(String nif) {        
        for(Contacto c: contactos){
            if (c.getNif().equals(nif)){
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean addContacto(Contacto c) {
       return contactos.add(c);
    }

    @Override
    public boolean removeContacto(Contacto c) {
        return contactos.remove(c);
    }

    @Override
    public boolean updateContacto(Contacto c) {
        int indice;
        if ((indice =contactos.indexOf(c)) ==-1){
            return false;
        }
        contactos.set(indice, c);
        return true;
    }
    
}
