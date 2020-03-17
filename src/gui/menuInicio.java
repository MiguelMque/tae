
package gui;

public class menuInicio extends javax.swing.JFrame {

      
    
    public menuInicio() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Todos por un Aprendizaje Eficaz");
    }

  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        salirItem = new javax.swing.JMenuItem();
        menuTemas = new javax.swing.JMenu();
        conversionesItem = new javax.swing.JMenu();
        teoriaConversiones = new javax.swing.JMenuItem();
        practicaConversiones = new javax.swing.JMenuItem();
        vectoresItem = new javax.swing.JMenu();
        teoriaVectores = new javax.swing.JMenuItem();
        practicaVectores = new javax.swing.JMenuItem();
        dinamicaItem = new javax.swing.JMenu();
        teoriaDinamica = new javax.swing.JMenuItem();
        practicaDinamica = new javax.swing.JMenuItem();
        menuHerramienta = new javax.swing.JMenu();
        concentreseItem = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoMenu.png"))); // NOI18N

        menuInicio.setText("Inicio");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });

        salirItem.setText("Salir");
        salirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirItemActionPerformed(evt);
            }
        });
        menuInicio.add(salirItem);

        jMenuBar1.add(menuInicio);

        menuTemas.setText("Temas");

        conversionesItem.setText("Conversiones");

        teoriaConversiones.setText("Teoría");
        teoriaConversiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teoriaConversionesActionPerformed(evt);
            }
        });
        conversionesItem.add(teoriaConversiones);

        practicaConversiones.setText("Práctica");
        practicaConversiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practicaConversionesActionPerformed(evt);
            }
        });
        conversionesItem.add(practicaConversiones);

        menuTemas.add(conversionesItem);

        vectoresItem.setText("Vectores");

        teoriaVectores.setText("Teoría");
        teoriaVectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teoriaVectoresActionPerformed(evt);
            }
        });
        vectoresItem.add(teoriaVectores);

        practicaVectores.setText("Práctica");
        practicaVectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practicaVectoresActionPerformed(evt);
            }
        });
        vectoresItem.add(practicaVectores);

        menuTemas.add(vectoresItem);

        dinamicaItem.setText("Ejercicios de dinámica");

        teoriaDinamica.setText("Teoría");
        teoriaDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teoriaDinamicaActionPerformed(evt);
            }
        });
        dinamicaItem.add(teoriaDinamica);

        practicaDinamica.setText("Práctica");
        practicaDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practicaDinamicaActionPerformed(evt);
            }
        });
        dinamicaItem.add(practicaDinamica);

        menuTemas.add(dinamicaItem);

        jMenuBar1.add(menuTemas);

        menuHerramienta.setText("Herramienta didáctica");

        concentreseItem.setText("Concéntrese");
        concentreseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concentreseItemActionPerformed(evt);
            }
        });
        menuHerramienta.add(concentreseItem);

        jMenuBar1.add(menuHerramienta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teoriaConversionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teoriaConversionesActionPerformed
      teoriaConversiones teoriaConversiones =new teoriaConversiones();
      teoriaConversiones.setVisible(true);
      this.setVisible(false); 
        System.out.println("Se muestra la teoría de conversiones, a través de imagenes");
    }//GEN-LAST:event_teoriaConversionesActionPerformed

    private void practicaConversionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practicaConversionesActionPerformed
        practicaConversiones practicaConversiones= new practicaConversiones();
        practicaConversiones.setVisible(true);
        this.setVisible(false);
         System.out.println("Se muestra práctica de conversiones con la solución, a través de imagenes");
    }//GEN-LAST:event_practicaConversionesActionPerformed

    private void teoriaVectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teoriaVectoresActionPerformed
        teoriaVectores teoriaVectores = new teoriaVectores();
        teoriaVectores.setVisible(true);
        this.setVisible(false);
        System.out.println("Se muestra la teoría de vectores, a través de imagenes");
    }//GEN-LAST:event_teoriaVectoresActionPerformed

    private void practicaVectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practicaVectoresActionPerformed
        practicaVectores practicaVectores = new practicaVectores();
        practicaVectores.setVisible(true);
        this.setVisible(false);
        System.out.println("Se muestra práctica de vectores, a través de imagenes");
    }//GEN-LAST:event_practicaVectoresActionPerformed

    private void teoriaDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teoriaDinamicaActionPerformed
        teoriaDinamica teoriaDinamica = new teoriaDinamica();
        teoriaDinamica.setVisible(true);
        this.setVisible(false);
        System.out.println("Se muestra la teoría de dinámica, a través de imagenes");
    }//GEN-LAST:event_teoriaDinamicaActionPerformed

    private void practicaDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practicaDinamicaActionPerformed
        practicaDinamica practicaDinamica = new practicaDinamica();
        practicaDinamica.setVisible(true);
        this.setVisible(false);
        System.out.println("Se muestra práctica de dinámica, a través de imagenes");
    }//GEN-LAST:event_practicaDinamicaActionPerformed

    private void concentreseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concentreseItemActionPerformed
        menuConcentrese a = new menuConcentrese();
        a.setVisible(true);
        this.setVisible(false);
        System.out.println("Se muestra la herramienta didáctica, con diferentes opciones ");
    }//GEN-LAST:event_concentreseItemActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed

               
    }//GEN-LAST:event_menuInicioActionPerformed

    private void salirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirItemActionPerformed
       System.out.println("Salida de la herramienta didáctica");
       System.exit(0); 
        
    }//GEN-LAST:event_salirItemActionPerformed

    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem concentreseItem;
    private javax.swing.JMenu conversionesItem;
    private javax.swing.JMenu dinamicaItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuHerramienta;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuTemas;
    private javax.swing.JMenuItem practicaConversiones;
    private javax.swing.JMenuItem practicaDinamica;
    private javax.swing.JMenuItem practicaVectores;
    private javax.swing.JMenuItem salirItem;
    private javax.swing.JMenuItem teoriaConversiones;
    private javax.swing.JMenuItem teoriaDinamica;
    private javax.swing.JMenuItem teoriaVectores;
    private javax.swing.JMenu vectoresItem;
    // End of variables declaration//GEN-END:variables
}
