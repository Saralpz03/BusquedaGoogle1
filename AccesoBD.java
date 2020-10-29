/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongoogle;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FP Mañana A
 */
public class AccesoBD {

    

    static ArrayList<Contacto> devolverContactos() {
        ArrayList<Contacto> lista=new ArrayList<>();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        Contacto c=new Contacto("Ana","Perez");
        Contacto c1=new Contacto("Ana","Perez");
        Contacto c2=new Contacto("Ana","Perez");
        lista.add(c);lista.add(c1);lista.add(c2);
        return lista;
    }
    
}
