/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author migue
 */
public class VFondo2 extends javax.swing.JPanel {

    /**
     * Creates new form VFondo2
     */
    public VFondo2() {
        initComponents();      
        this.setSize(599, 570);
    }

public void paintComponent(Graphics g){
   Dimension tam = getSize();
   ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/fondoDos.png/")).getImage());
   g.drawImage(ImagenFondo.getImage(), 0, 0, tam.width,tam.height,null);
   setOpaque(false);
   super.paintComponent(g);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
