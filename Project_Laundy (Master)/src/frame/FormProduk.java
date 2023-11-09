package frame;
public class FormProduk extends javax.swing.JFrame {

    public FormProduk() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Navigasi = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        BahanBaku = new javax.swing.JLabel();
        Member = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Navigasi1 = new javax.swing.JLabel();
        Pengeluaran = new javax.swing.JLabel();
        Navigasi2 = new javax.swing.JLabel();
        Produk1 = new javax.swing.JLabel();
        Navigasi3 = new javax.swing.JLabel();
        Navigasi4 = new javax.swing.JLabel();
        Navigasi5 = new javax.swing.JLabel();
        Navigasi7 = new javax.swing.JLabel();
        Navigasi8 = new javax.swing.JLabel();
        Navigasi9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Navigasi10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TextBox = new javax.swing.JLabel();
        TextBox1 = new javax.swing.JLabel();
        TextBox2 = new javax.swing.JLabel();
        TextBox3 = new javax.swing.JLabel();
        Frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1360, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Navigasi.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi.setText("Tarif Service");
        Navigasi.setToolTipText("");
        Navigasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NavigasiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NavigasiMousePressed(evt);
            }
        });
        getContentPane().add(Navigasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, 40));

        Back.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/Back 1.png"))); // NOI18N
        Back.setText(" Back");
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 170, 60));

        BahanBaku.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        BahanBaku.setForeground(new java.awt.Color(255, 255, 255));
        BahanBaku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/Bahan Baku.png"))); // NOI18N
        BahanBaku.setText(" Bahan Baku");
        getContentPane().add(BahanBaku, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 60));

        Member.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Member.setForeground(new java.awt.Color(255, 255, 255));
        Member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/Member.png"))); // NOI18N
        Member.setText(" Member");
        getContentPane().add(Member, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, 50));

        User.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/User.png"))); // NOI18N
        User.setText(" User");
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 60));

        Navigasi1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi1.setText("Master > Tambah Produk");
        Navigasi1.setToolTipText("");
        Navigasi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navigasi1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Navigasi1MousePressed(evt);
            }
        });
        getContentPane().add(Navigasi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 290, 40));

        Pengeluaran.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Pengeluaran.setForeground(new java.awt.Color(255, 255, 255));
        Pengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/Pengeluaran.png"))); // NOI18N
        Pengeluaran.setText(" Pengeluaran");
        getContentPane().add(Pengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, 60));

        Navigasi2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi2.setText("Input Produk");
        Navigasi2.setToolTipText("");
        Navigasi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navigasi2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Navigasi2MousePressed(evt);
            }
        });
        getContentPane().add(Navigasi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 40));

        Produk1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Produk1.setForeground(new java.awt.Color(255, 255, 255));
        Produk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/Produk.png"))); // NOI18N
        Produk1.setText(" Produk");
        Produk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Produk1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Produk1MousePressed(evt);
            }
        });
        getContentPane().add(Produk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        Navigasi3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi3.setText(":");
        Navigasi3.setToolTipText("");
        Navigasi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navigasi3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Navigasi3MousePressed(evt);
            }
        });
        getContentPane().add(Navigasi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 10, 60));

        Navigasi4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi4.setText("Nama Service");
        Navigasi4.setToolTipText("");
        Navigasi4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navigasi4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Navigasi4MousePressed(evt);
            }
        });
        getContentPane().add(Navigasi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 40));

        Navigasi5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi5.setText("Jenis Service");
        Navigasi5.setToolTipText("");
        Navigasi5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navigasi5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Navigasi5MousePressed(evt);
            }
        });
        getContentPane().add(Navigasi5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, 40));

        Navigasi7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi7.setText(":");
        Navigasi7.setToolTipText("");
        Navigasi7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navigasi7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Navigasi7MousePressed(evt);
            }
        });
        getContentPane().add(Navigasi7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 10, 60));

        Navigasi8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi8.setText(":");
        Navigasi8.setToolTipText("");
        Navigasi8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navigasi8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Navigasi8MousePressed(evt);
            }
        });
        getContentPane().add(Navigasi8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 10, 60));

        Navigasi9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi9.setText(":");
        Navigasi9.setToolTipText("");
        Navigasi9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navigasi9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Navigasi9MousePressed(evt);
            }
        });
        getContentPane().add(Navigasi9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 10, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Rp.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, 20));

        Navigasi10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Navigasi10.setText("ID Service");
        Navigasi10.setToolTipText("");
        Navigasi10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navigasi10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Navigasi10MousePressed(evt);
            }
        });
        getContentPane().add(Navigasi10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, 40));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 520, 20));

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 520, 20));

        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 490, 20));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 520, 20));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/Delete.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 120, 30));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/Back.png"))); // NOI18N
        jButton3.setText("Kembali");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 120, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/Simpan.png"))); // NOI18N
        jButton1.setText("Simpan");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 120, 30));

        TextBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/TextBoxs.png"))); // NOI18N
        TextBox.setToolTipText("");
        TextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBoxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextBoxMousePressed(evt);
            }
        });
        getContentPane().add(TextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, 40));

        TextBox1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/TextBoxs.png"))); // NOI18N
        TextBox1.setToolTipText("");
        TextBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBox1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextBox1MousePressed(evt);
            }
        });
        getContentPane().add(TextBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, 40));

        TextBox2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/TextBoxs.png"))); // NOI18N
        TextBox2.setToolTipText("");
        TextBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBox2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextBox2MousePressed(evt);
            }
        });
        getContentPane().add(TextBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, 40));

        TextBox3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TextBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/IconMaster/TextBoxs.png"))); // NOI18N
        TextBox3.setToolTipText("");
        TextBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBox3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextBox3MousePressed(evt);
            }
        });
        getContentPane().add(TextBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, 40));

        Frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/Frame/Frame.png"))); // NOI18N
        Frame.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Frame.setDisabledIcon(null);
        Frame.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Frame.setMinimumSize(new java.awt.Dimension(680, 384));
        getContentPane().add(Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        Frame.getAccessibleContext().setAccessibleName(""); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NavigasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavigasiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NavigasiMouseClicked

    private void NavigasiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavigasiMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NavigasiMousePressed

    private void Produk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Produk1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Produk1MouseClicked

    private void Produk1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Produk1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Produk1MousePressed

    private void Navigasi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi1MouseClicked

    private void Navigasi1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi1MousePressed

    private void Navigasi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi2MouseClicked

    private void Navigasi2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi2MousePressed

    private void Navigasi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi3MouseClicked

    private void Navigasi3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi3MousePressed

    private void Navigasi4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi4MouseClicked

    private void Navigasi4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi4MousePressed

    private void Navigasi5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi5MouseClicked

    private void Navigasi5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi5MousePressed

    private void TextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBoxMouseClicked

    private void TextBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBoxMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBoxMousePressed

    private void Navigasi7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi7MouseClicked

    private void Navigasi7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi7MousePressed

    private void Navigasi8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi8MouseClicked

    private void Navigasi8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi8MousePressed

    private void Navigasi9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi9MouseClicked

    private void Navigasi9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi9MousePressed

    private void Navigasi10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi10MouseClicked

    private void Navigasi10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navigasi10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Navigasi10MousePressed

    private void TextBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBox1MouseClicked

    private void TextBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBox1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBox1MousePressed

    private void TextBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBox2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBox2MouseClicked

    private void TextBox2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBox2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBox2MousePressed

    private void TextBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBox3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBox3MouseClicked

    private void TextBox3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBox3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBox3MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduk().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel BahanBaku;
    private javax.swing.JLabel Frame;
    private javax.swing.JLabel Member;
    private javax.swing.JLabel Navigasi;
    private javax.swing.JLabel Navigasi1;
    private javax.swing.JLabel Navigasi10;
    private javax.swing.JLabel Navigasi2;
    private javax.swing.JLabel Navigasi3;
    private javax.swing.JLabel Navigasi4;
    private javax.swing.JLabel Navigasi5;
    private javax.swing.JLabel Navigasi7;
    private javax.swing.JLabel Navigasi8;
    private javax.swing.JLabel Navigasi9;
    private javax.swing.JLabel Pengeluaran;
    private javax.swing.JLabel Produk1;
    private javax.swing.JLabel TextBox;
    private javax.swing.JLabel TextBox1;
    private javax.swing.JLabel TextBox2;
    private javax.swing.JLabel TextBox3;
    private javax.swing.JLabel User;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}