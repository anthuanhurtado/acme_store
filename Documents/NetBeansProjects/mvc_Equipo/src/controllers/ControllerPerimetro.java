/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import models.ModelPerimetro;
import views.ViewPerimetro;
import convert.Convertidor;

/**
 *
 * @author PC-12
 */
public class ControllerPerimetro implements ActionListener {
        
    Convertidor convertidor = new Convertidor();
    
    public ViewPerimetro viewPerimetro;
    public ModelPerimetro modelPerimetro;
    
       public ControllerPerimetro(ViewPerimetro viewPerimetro, ModelPerimetro modelPerimetro) {
        this.modelPerimetro = modelPerimetro;
        this.viewPerimetro = viewPerimetro;
        
        this.viewPerimetro.jbtn_calcular.addActionListener(this);
        init_view();
    }
    
        private void init_view() {
        modelPerimetro.getNumero1();
        this.viewPerimetro.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource () == this.viewPerimetro.jbtn_calcular) {
            
            if(viewPerimetro.jcb_figuras.getSelectedItem().equals("Esfera")) {
                Esfera();
            }
            
            else if (viewPerimetro.jcb_figuras.getSelectedItem().equals("Cubo")) {
                Cubo();
            }
            
            else if (viewPerimetro.jcb_figuras.getSelectedItem().equals("Prisma")) {
                Prisma();
            }
        }
    }
    
    public void Esfera () {
        
        Integer pi = Integer.parseInt(viewPerimetro.jtf_num1.getText());
        Integer radio = Integer.parseInt(viewPerimetro.jtf_altura.getText());
        
        String resultado = pi.toString(2 * pi * radio);
        
        modelPerimetro.setNumero1(pi);
        modelPerimetro.setNumero2(radio);
        
        modelPerimetro.setResultado(resultado);
        
        viewPerimetro.jtf_resultado.setText(resultado);
    }
    
    public void Cubo () {
        
        Integer numero = Integer.parseInt(viewPerimetro.jtf_num1.getText());
        Integer cuadrado = Integer.parseInt(viewPerimetro.jtf_altura.getText());
        
        String resultado = numero.toString(numero*numero*numero);
        
        modelPerimetro.setNumero1(numero);
        modelPerimetro.setNumero2(cuadrado);
        modelPerimetro.setResultado(resultado);
        
        viewPerimetro.jtf_resultado.setText(resultado);
    }
    
    public void Prisma () {
        
        int pi = 3;
        Integer base = Integer.parseInt(viewPerimetro.jtf_num1.getText());
        
        
        String resultado = base.toString(pi * base);
        
        modelPerimetro.setNumero1(base);
        modelPerimetro.setNumero2(pi);
        modelPerimetro.setResultado(resultado);
        
        viewPerimetro.jtf_resultado.setText(resultado);
    }
}
