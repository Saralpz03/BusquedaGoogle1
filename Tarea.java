/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongoogle;

import java.util.ArrayList;
import javafx.concurrent.Task;

/**
 *
 * @author FP Mañana A
 */
public class Tarea extends Task{

    @Override
    protected ArrayList<Contacto> call() throws Exception {
        ArrayList<Contacto> lista=AccesoBD.devolverContactos();
        return lista;
    }
    
}
