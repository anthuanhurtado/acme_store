package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelArea;
import views.ViewArea;

public class ControllerArea implements ActionListener {
    
    public ViewArea view_area;
    public ModelArea model_area;
    
    public ControllerArea(ViewArea view_area, ModelArea model_area) {
        
        this.view_area = view_area;
        this.model_area = model_area;
        
        this.view_area.jbtn_calcular.addActionListener(this);
        init_view();
    }
    
        private void init_view() {
        model_area.getNumero1();
        this.view_area.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource () == this.view_area.jbtn_calcular) {
            
            if(view_area.jcb_area.getSelectedItem().equals("Esfera")) {
                Esfera();
            }
            
            else if (view_area.jcb_area.getSelectedItem().equals("Cubo")) {
                Cubo();
            }
            
            else if (view_area.jcb_area.getSelectedItem().equals("Prisma")) {
                Prisma();
            }
        }
    }
    
    public void Esfera () {
        Integer pi = Integer.parseInt(view_area.jtf_num1.getText());
        Integer radio = Integer.parseInt(view_area.jtf_num2.getText());
        
        String resultado = pi.toString(4 * pi * radio *2);
        
        model_area.setNumero1(pi);
        model_area.setNumero2(radio);
        
        model_area.setResultado(resultado);
        
        view_area.jtf_resultado.setText(resultado);
    }
    
    public void Cubo () {
        
        Integer numero = Integer.parseInt(view_area.jtf_num1.getText());
        Integer cuadrado = Integer.parseInt(view_area.jtf_num2.getText());
        
        String resultado = numero.toString(6 * numero * cuadrado * 2);
        
        model_area.setNumero1(numero);
        model_area.setNumero2(cuadrado);
        model_area.setResultado(resultado);
        
        view_area.jtf_resultado.setText(resultado);
    }
    
    public void Prisma () {
        
        Integer base = Integer.parseInt(view_area.jtf_num1.getText());
        Integer altura = Integer.parseInt(view_area.jtf_num2.getText());
        
        
        String resultado = base.toString(base * altura + 2 * base);
        
        model_area.setNumero1(base);
        model_area.setNumero2(altura);
        model_area.setResultado(resultado);
        
        view_area.jtf_resultado.setText(resultado);
    }
}