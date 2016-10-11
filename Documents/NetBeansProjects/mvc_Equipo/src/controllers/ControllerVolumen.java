package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelVolumen;
import views.ViewVolumen;

public class ControllerVolumen implements ActionListener {
    
    public ViewVolumen view_volumen;
    public ModelVolumen model_volumen;
    
    public ControllerVolumen(ViewVolumen view_volumen, ModelVolumen model_volumen) {
        
        this.view_volumen = view_volumen;
        this.model_volumen = model_volumen;
        
        this.view_volumen.jbtn_calcular.addActionListener(this);
        init_view();
    }
    
        private void init_view() {
        model_volumen.getNumero1();
        model_volumen.getNumero2();
        this.view_volumen.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource () == this.view_volumen.jbtn_calcular) {
            
            if(view_volumen.jcb_figuras.getSelectedItem().equals("Esfera")) {
                Esfera();
            }
            
            else if (view_volumen.jcb_figuras.getSelectedItem().equals("Cubo")) {
                Cubo();
            }
            
            else if (view_volumen.jcb_figuras.getSelectedItem().equals("Prisma")) {
                Prisma();
            }
        }
    }
    
    public void Esfera () {
        
        Integer pi = Integer.parseInt(view_volumen.jtf_num1.getText());
        Integer radio = Integer.parseInt(view_volumen.jtf_altura.getText());
        
        String resultado = pi.toString( 4/3 * pi * radio * 2);
        
        model_volumen.setNumero1(pi);
        model_volumen.setNumero2(radio);
        model_volumen.setResultado(resultado);
        
        view_volumen.jtf_resultado.setText(resultado);
    }
    
    public void Cubo () {
        
        Integer numero1 = Integer.parseInt(view_volumen.jtf_num1.getText());
        Integer numero2 = Integer.parseInt(view_volumen.jtf_altura.getText());
        
        String resultado = numero1.toString(numero1 * numero2 * 3);
        
        model_volumen.setNumero1(numero1);
        model_volumen.setNumero2(numero2);
        model_volumen.setResultado(resultado);
        
        view_volumen.jtf_resultado.setText(resultado);
    }
    
    public void Prisma () {
        
        Integer base = Integer.parseInt(view_volumen.jtf_num1.getText());
        Integer altura = Integer.parseInt(view_volumen.jtf_altura.getText());
        
        String resultado = base.toString( base * altura);
        
        model_volumen.setNumero1(base);
        model_volumen.setNumero2(altura);
        model_volumen.setResultado(resultado);
        
        view_volumen.jtf_resultado.setText(resultado);
    }
}