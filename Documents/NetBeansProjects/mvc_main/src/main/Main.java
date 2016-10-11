package main;

import models.*;
import views.*;
import controllers.*;
import javax.swing.JPanel;

public class Main {
    
    ModelArea modelarea;
    ViewArea viewarea;
    ControllerArea controllerarea;
    
    ModelVolumen modelvolumen;
    ViewVolumen viewvolumen;
    ControllerVolumen controllervolumen;
    
    ModelPerimetro modelperimetro;
    ViewPerimetro viewperimetro;
    ControllerPerimetro controllerperimetro;
    
    public static void main(String [] amh) {
        
        ModelArea modelArea = new ModelArea();
        ViewArea viewarea = new ViewArea();
        ControllerArea controlleArea = new ControllerArea(viewarea, modelArea);
        
        ModelVolumen modelvolumen = new ModelVolumen();
        ViewVolumen viewvolumen = new ViewVolumen();
        ControllerVolumen controllervolumen = new ControllerVolumen(viewvolumen, modelvolumen);
        
        ModelPerimetro modelperimetro = new ModelPerimetro();
        ViewPerimetro viewperimetro = new ViewPerimetro();
        ControllerPerimetro controllerperimetro = new ControllerPerimetro(viewperimetro, modelperimetro);
        
        
        
        JPanel  views[] = new JPanel [3];
        
        views  [0] = viewvolumen;
        views  [1] = viewarea;
        views  [2] = viewperimetro;
        
        
        ViewMain main = new ViewMain();
        ControllerMain controller = new ControllerMain(main, views);
    }
}