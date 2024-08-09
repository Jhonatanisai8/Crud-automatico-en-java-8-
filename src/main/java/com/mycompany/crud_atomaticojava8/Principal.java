package com.mycompany.crud_atomaticojava8;

import com.mycompany.crud_atomaticojava8.iu.frmCrud;
import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) {
        // Crea una instancia del JFrame
        JFrame frame = new JFrame("Mi Aplicación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Establece el tamaño del JFrame

        // Crea una instancia de tu JPanel
        frmCrud fr = new frmCrud();
        // Agrega el JPanel al JFrame
        frame.add(fr);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }

}
