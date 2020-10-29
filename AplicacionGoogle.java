/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongoogle;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author FP Mañana A
 */
public class AplicacionGoogle extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox h=new HBox(10);
        Button b=new Button("Mostrar");
        ProgressBar barra_proceso=new ProgressBar();
        barra_proceso.setProgress(0);
        TextField campo=new TextField();       
        
        VBox v=new VBox(20);
        
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                ArrayList<Contacto> lista=AccesoBD.devolverContactos();
                
                for(Contacto c: lista){
                    Label l=new Label(c.toString());
                    v.getChildren().add(l);
                }
                h.getChildren().add(v);
            }
        });
        h.getChildren().addAll(campo,b,barra_proceso);
        Scene escena=new Scene(h,300,300);
        stage.setScene(escena);
        stage.show();
    }
    
}
