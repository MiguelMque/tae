package gui;
//paquetes de la gui
import java.applet.AudioClip;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PlayGame2 extends javax.swing.JFrame {
//constructor e inicializador de variables
    private VFondo2 fondoDos;
    private boolean caraUp = false;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    int contador;

    public PlayGame2() {//por default
        initComponents();
        VFondo2 fondoV2 = new VFondo2();
        this.add(fondoV2,BorderLayout.CENTER);
        this.pack();
        this.setLocationRelativeTo(this);
        setCards();
        setIntro();
              
    }
  
        
       private void setIntro() {//ubicacion del archivo de musica y reproduccion
        AudioClip sonido;
        
      
    }
                   private void correcto() {//ubicacion del archivo de musica y reproduccion
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/correcto.wav"));
        sonido.play();
    }
                   private void incorrecto() {//ubicacion del archivo de musica y reproduccion
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/incorrecto.wav"));
        sonido.play();
    }
                   private void contador8() {//ubicacion del archivo de musica y reproduccion
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/contador8.wav"));
        sonido.play();
    }
                    private void contador16() {//ubicacion del archivo de musica y reproduccion
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/contador16.wav"));
        sonido.play();
    }
                       private void contadormuchos() {//ubicacion del archivo de musica y reproduccion
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/contadormuchos.wav"));
        sonido.play();
    }
    private void setCards() {//guarda las cartas en cada boton
 
        btnC1.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 1 + ".png")));
        btnC2.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 2 + ".png")));
        btnC3.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 3 + ".png")));
        btnC4.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 4 + ".png")));
        btnC5.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 5 + ".png")));
        btnC6.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 6 + ".png")));
        btnC7.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 7 + ".png")));
        btnC8.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 8 + ".png")));
        btnC9.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 9 + ".png")));
        btnC10.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 10 + ".png")));
        btnC11.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 11 + ".png")));
        btnC12.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 12 + ".png")));
        btnC13.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 13 + ".png")));
        btnC14.setDisabledIcon(new ImageIcon(getClass().getResource("/img/c" + 14 + ".png")));
    }


    private void btnEnabled(JButton btn) {
//codificacion de la imagen oculta
        if (!caraUp) {
            btn.setEnabled(false);
            pbtn[0] = btn; //Array para establecer que fue la primera cara volteada
            caraUp = true;
            primerc = false;
        } else {
            btn.setEnabled(false);
            pbtn[1] = btn;  //Array para establecer que fue la segunda cara volteada
            primerc = true;
            pregwin();
              contador += 1;
        }
    }

    private void compare() {
        //compara la primera carta con la segunda
        if (caraUp && primerc) {

            if (((pbtn[0] == btnC1) && (pbtn[1] == btnC8) ) || ((pbtn[0] == btnC8) && (pbtn [1] == btnC1))) {
                
                 System.out.println("¡Excelente!");
                 correcto();
              
                } else if (((pbtn[0] == btnC2) && (pbtn[1] == btnC9) ) || ((pbtn[0] == btnC9) && (pbtn [1] == btnC2))) {
                   System.out.println("¡Excelente!"); 
                    correcto();
                } else if (((pbtn[0] == btnC3) && (pbtn[1] == btnC10) ) || ((pbtn[0] == btnC10) && (pbtn [1] == btnC3))) {
                   System.out.println("¡Excelente!"); 
                    correcto();
                } else if (((pbtn[0] == btnC4) && (pbtn[1] == btnC11) ) || ((pbtn[0] == btnC11) && (pbtn [1] == btnC4))) {
                   System.out.println("¡Excelente!"); 
                    correcto();
                } else if (((pbtn[0] == btnC5) && (pbtn[1] == btnC12) ) || ((pbtn[0] == btnC12) && (pbtn [1] == btnC5))) {
                   System.out.println("¡Excelente!"); 
                    correcto();
                } else if (((pbtn[0] == btnC6) && (pbtn[1] == btnC13) ) || ((pbtn[0] == btnC13) && (pbtn [1] == btnC6))) {
                   System.out.println("¡Excelente!"); 
                    correcto();
                } else if (((pbtn[0] == btnC7) && (pbtn[1] == btnC14) ) || ((pbtn[0] == btnC14) && (pbtn [1] == btnC7))) {
                    correcto();
                    System.out.println("¡Excelente!"); 
                    
                } 
             else {
                    incorrecto();
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true); //Cuando estamos en pbtn volteamos una cara y no deja editar
            
         
            }
        pbtn[0] = null;
        pbtn[1] = null;
        caraUp = false;
           
        }
       
    }

    private void reiniciar() {//reinicia el juego
        btnC1.setEnabled(true);
        btnC2.setEnabled(true);
        btnC3.setEnabled(true);
        btnC4.setEnabled(true);
        btnC5.setEnabled(true);
        btnC6.setEnabled(true);
        btnC7.setEnabled(true);
        btnC8.setEnabled(true);
        btnC9.setEnabled(true);
        btnC10.setEnabled(true);
        btnC11.setEnabled(true);
        btnC12.setEnabled(true);
        btnC13.setEnabled(true);
        btnC14.setEnabled(true);
        
        contador = 0;
    
        primerc = false;
        caraUp = false;
    }

    private void pregwin() {// puntuacion
        if (!btnC1.isEnabled() && !btnC2.isEnabled() && !btnC3.isEnabled() && !btnC4.isEnabled() && !btnC5.isEnabled() && !btnC6.isEnabled()
                && !btnC7.isEnabled() && !btnC8.isEnabled() && !btnC9.isEnabled() && !btnC10.isEnabled() && !btnC11.isEnabled()
                && !btnC12.isEnabled() && !btnC13.isEnabled() && !btnC14.isEnabled()) {

            if (contador < 8 ){ 
                contador8();
                JOptionPane.showMessageDialog(this, "¡Wow eres de otro mundo, terminaste con sólo " + contador + " intentos en responder!", "¡Excelente", JOptionPane.INFORMATION_MESSAGE);
       
            } else if (contador < 16 ){ 
                      contador16();
                    JOptionPane.showMessageDialog(this, "Nada mal, terminaste con " + contador + " intentos en responder, pero podrías volver a intentarlo.", "¡Bien!", JOptionPane.INFORMATION_MESSAGE);
              
                } else {
                contadormuchos();
                JOptionPane.showMessageDialog(this, "Terminaste con " + contador + " intentos en responder, vuelve al menú y repasa la teoría, vuelve a intentarlo.", "Repasa de nuevo", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnC3 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC12 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nivel 1");

        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC3.setBorder(null);
        btnC3.setBorderPainted(false);
        btnC3.setContentAreaFilled(false);
        btnC3.setFocusable(false);
        btnC3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC3MouseExited(evt);
            }
        });
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC2.setBorder(null);
        btnC2.setBorderPainted(false);
        btnC2.setContentAreaFilled(false);
        btnC2.setFocusable(false);
        btnC2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC2MouseExited(evt);
            }
        });
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });

        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC4.setBorder(null);
        btnC4.setBorderPainted(false);
        btnC4.setContentAreaFilled(false);
        btnC4.setFocusable(false);
        btnC4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC4MouseExited(evt);
            }
        });
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC1.setBorder(null);
        btnC1.setBorderPainted(false);
        btnC1.setContentAreaFilled(false);
        btnC1.setFocusable(false);
        btnC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC8.setBorder(null);
        btnC8.setBorderPainted(false);
        btnC8.setContentAreaFilled(false);
        btnC8.setFocusable(false);
        btnC8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC8MouseExited(evt);
            }
        });
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });

        btnC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC12.setBorder(null);
        btnC12.setBorderPainted(false);
        btnC12.setContentAreaFilled(false);
        btnC12.setFocusable(false);
        btnC12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC12MouseExited(evt);
            }
        });
        btnC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC12ActionPerformed(evt);
            }
        });

        btnC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC11.setBorder(null);
        btnC11.setBorderPainted(false);
        btnC11.setContentAreaFilled(false);
        btnC11.setFocusable(false);
        btnC11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC11MouseExited(evt);
            }
        });
        btnC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC11ActionPerformed(evt);
            }
        });

        btnC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC10.setBorder(null);
        btnC10.setBorderPainted(false);
        btnC10.setContentAreaFilled(false);
        btnC10.setFocusable(false);
        btnC10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC10MouseExited(evt);
            }
        });
        btnC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC10ActionPerformed(evt);
            }
        });

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC7.setBorder(null);
        btnC7.setBorderPainted(false);
        btnC7.setContentAreaFilled(false);
        btnC7.setFocusable(false);
        btnC7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC7MouseExited(evt);
            }
        });
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });

        btnC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC14.setBorder(null);
        btnC14.setBorderPainted(false);
        btnC14.setContentAreaFilled(false);
        btnC14.setFocusable(false);
        btnC14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC14MouseExited(evt);
            }
        });
        btnC14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC14ActionPerformed(evt);
            }
        });

        btnC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC9.setBorder(null);
        btnC9.setBorderPainted(false);
        btnC9.setContentAreaFilled(false);
        btnC9.setFocusable(false);
        btnC9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC9MouseExited(evt);
            }
        });
        btnC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC9ActionPerformed(evt);
            }
        });

        btnC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC6.setBorder(null);
        btnC6.setBorderPainted(false);
        btnC6.setContentAreaFilled(false);
        btnC6.setFocusable(false);
        btnC6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC6MouseExited(evt);
            }
        });
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });

        btnC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC13.setBorder(null);
        btnC13.setBorderPainted(false);
        btnC13.setContentAreaFilled(false);
        btnC13.setFocusable(false);
        btnC13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC13MouseExited(evt);
            }
        });
        btnC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC13ActionPerformed(evt);
            }
        });

        btnC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC5.setBorder(null);
        btnC5.setBorderPainted(false);
        btnC5.setContentAreaFilled(false);
        btnC5.setFocusable(false);
        btnC5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC5MouseExited(evt);
            }
        });
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver al nivel anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Volver al menú principal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Volver al menú del juego");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReiniciar.setText("Reiniciar el juego");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Seleccionar nivel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC14)
                                .addGap(18, 18, 18)
                                .addComponent(btnC9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnC6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnC12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnC10)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnC7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnC3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnC4))
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnC2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnC8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(228, 228, 228)
                                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar)
                    .addComponent(jButton6))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC4)
                            .addComponent(btnC3)
                            .addComponent(btnC2)
                            .addComponent(btnC8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnC11)
                                    .addComponent(btnC12)
                                    .addComponent(btnC10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnC1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC14)
                            .addComponent(btnC9)
                            .addComponent(btnC13)
                            .addComponent(btnC6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC7)
                            .addComponent(btnC5))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(615, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        btnEnabled(btnC13);
        System.out.println("Carta número once girada- Nivel 2");
    }//GEN-LAST:event_btnC13ActionPerformed

    private void btnC13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC13MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC13MouseExited

    private void btnC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC14ActionPerformed
        btnEnabled(btnC14);
        System.out.println("Carta númeor nueve girada- Nivel 2");
    }//GEN-LAST:event_btnC14ActionPerformed

    private void btnC14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC14MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC14MouseExited

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        btnEnabled(btnC9);
        System.out.println("Carta número diez girada- Nivel 2");
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC9MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC9MouseExited

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        btnEnabled(btnC10);
        System.out.println("Carta número ocho girada- Nivel 2");
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC10MouseExited

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        btnEnabled(btnC11);
        System.out.println("Carta número siete girada- Nivel 2");
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnC11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC11MouseExited

    private void btnC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC12ActionPerformed
        btnEnabled(btnC12);
        System.out.println("Carta número seis girada- Nivel 2");
    }//GEN-LAST:event_btnC12ActionPerformed

    private void btnC12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC12MouseExited

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        btnEnabled(btnC5);
        System.out.println("Carta número catorce girada- Nivel 2");
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC5MouseExited

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        btnEnabled(btnC6);
        System.out.println("Carta número doce girada- Nivel 2");
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC6MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC6MouseExited

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        btnEnabled(btnC7);
        System.out.println("Carta número trece girada- Nivel 2");
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC7MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC7MouseExited

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        btnEnabled(btnC8);
        System.out.println("Carta número cuatro girada- Nivel 2");
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC8MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC8MouseExited

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        btnEnabled(btnC4);
        System.out.println("Carta número dos girada- Nivel 2 ");
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC4MouseExited

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        btnEnabled(btnC3);
        System.out.println("Carta número uno girada- Nivel 2");
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC3MouseExited

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        btnEnabled(btnC2);
        System.out.println("Carta número tres girada- Nivel 2");
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC2MouseExited

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        btnEnabled(btnC1);//muestra la carta oculta
        System.out.println("Carta número cinco girada- Nivel 2");
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        // TODO add your handling code here:
        compare();//compara la primera carta con una condicion.
    }//GEN-LAST:event_btnC1MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
        new PlayGame().setVisible(true);
        System.out.println("Volver al menú anterior");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();//oculta la ventana
        menuInicio menuInicio = new menuInicio();
        menuInicio.setVisible(true);
        System.out.println("Volver al menú principal");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        System.out.println("Girar todas las cartas, sin mostrar el contenido");
        reiniciar();//reinicia el juego
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.out.println("Salida de la herramienta didáctica");
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       this.setVisible(false);
        new seleccionarNivelesGame().setVisible(true);  
        System.out.println("Seleccionar nivel");// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new menuConcentrese().setVisible(true);
        System.out.println("Volver al menú del juego");// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PlayGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayGame2().setVisible(true);//muetra la interfaz con la q se esta trabajando

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC12;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
