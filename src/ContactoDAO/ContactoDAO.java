/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactoDAO;

import java.util.List;
import modelo.Contacto;

/**
 *
 * @author Castelao
 */
public interface ContactoDAO {
    
    List<Contacto> getAllContacto();
    Contacto getContactoByNIF(String nif);
    boolean addContacto(Contacto c);
    boolean removeContacto(Contacto c);
    boolean updateContacto(Contacto c);
    
}
