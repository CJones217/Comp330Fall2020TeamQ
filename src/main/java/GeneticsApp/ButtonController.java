package GeneticsApp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.awt.*;

public class ButtonController {

    public void handle(ActionEvent actionEvent) {

        if(actionEvent.getSource().toString().contains("Import File")){
            System.out.println("import pressed");
        }
        else if(actionEvent.getSource().toString().contains("Export File")){
            System.out.println("export pressed");
        }
        else if(actionEvent.getSource().toString().contains("Explore Graph")){
            System.out.println("exploreGraphButton pressed");
        }
        else if(actionEvent.getSource().toString().contains("Add Person")){
            System.out.println("addPerson pressed");
        }
        else if(actionEvent.getSource().toString().contains("Display Graph")){
            System.out.println("displayGraph pressed");
        }
    }
}