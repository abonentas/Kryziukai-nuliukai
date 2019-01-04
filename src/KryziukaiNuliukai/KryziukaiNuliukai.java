/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KryziukaiNuliukai;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author admlkjust
 */
public class KryziukaiNuliukai extends javax.swing.JFrame {
private String PradetiZaidima = "X";
private int xCount = 0;
private int oCount = 0;
    /**
     * Creates new form KryziukaiNuliukai
     */
    public KryziukaiNuliukai() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
private void rezultatas()
{
    jblPlayerX.setText(String.valueOf(xCount));
    jblPlayerO.setText(String.valueOf(oCount));
}
    
private void zaidejas()
{
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        PradetiZaidima ="O";
    }
    else
         {
        PradetiZaidima ="X";
    }
}
private void LaimetiZaidima()
{
    String b1 = jButton1.getText();
    String b2 = jButton2.getText();
    String b3 = jButton3.getText();
    
    String b4 = jButton4.getText();
    String b5 = jButton5.getText();
    String b6 = jButton6.getText();
    
    String b7 = jButton7.getText();
    String b8 = jButton8.getText();
    String b9 = jButton9.getText();
    
    if(b1 == ("X") && b2 == ("X") && b3 ==("X"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: X laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        rezultatas();
        jButton1.setBackground(Color.YELLOW);
        jButton2.setBackground(Color.YELLOW);
        jButton3.setBackground(Color.YELLOW);
    }
    
    if(b1 == ("O") && b2 == ("O") && b3 ==("O"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: O laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        rezultatas();
        jButton1.setBackground(Color.YELLOW);
        jButton2.setBackground(Color.YELLOW);
        jButton3.setBackground(Color.YELLOW);
    }
    
    if(b4 == ("X") && b5 == ("X") && b6 ==("X"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: X laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        rezultatas();
        jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
    }
    
    if(b4 == ("O") && b5 == ("O") && b6 ==("O"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: O laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        rezultatas();
        jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
    }
    
    if(b7 == ("X") && b8 == ("X") && b9 ==("X"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: X laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        rezultatas();
        jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
    }
    
    if(b7 == ("O") && b8 == ("O") && b9 ==("O"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: O laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        rezultatas();
        jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
    }
    
    if(b1 == ("X") && b4 == ("X") && b7 ==("X"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: X laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        rezultatas();
        jButton1.setBackground(Color.MAGENTA);
        jButton4.setBackground(Color.MAGENTA);
        jButton7.setBackground(Color.MAGENTA);
    }
    
    if(b1 == ("O") && b4 == ("O") && b7 ==("O"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: O laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        rezultatas();
        jButton1.setBackground(Color.MAGENTA);
        jButton4.setBackground(Color.MAGENTA);
        jButton7.setBackground(Color.MAGENTA);
    }
    
    if(b2 == ("X") && b5 == ("X") && b8 ==("X"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: X laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        rezultatas();
        jButton2.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
        jButton8.setBackground(Color.PINK);
    }
    
    if(b2 == ("O") && b5 == ("O") && b8 ==("O"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: O laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        rezultatas();
        jButton2.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
        jButton8.setBackground(Color.PINK);
    }
    
    if(b3 == ("X") && b6 == ("X") && b9 ==("X"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: X laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        rezultatas();
        jButton3.setBackground(Color.MAGENTA);
        jButton6.setBackground(Color.MAGENTA);
        jButton9.setBackground(Color.MAGENTA);
    }
    
    if(b3 == ("O") && b6 == ("O") && b9 ==("O"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: O laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        rezultatas();
        jButton3.setBackground(Color.MAGENTA);
        jButton6.setBackground(Color.MAGENTA);
        jButton9.setBackground(Color.MAGENTA);
    }
    
    if(b1 == ("X") && b5 == ("X") && b9 ==("X"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: X laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        rezultatas();
        jButton1.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
        jButton9.setBackground(Color.PINK);
    }
    
    if(b1 == ("O") && b5 == ("O") && b9 ==("O"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: O laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        rezultatas();
        jButton1.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
        jButton9.setBackground(Color.PINK);
    }
    
    if(b3 == ("X") && b5 == ("X") && b7 ==("X"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: X laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        rezultatas();
        jButton3.setBackground(Color.cyan);
        jButton5.setBackground(Color.cyan);
        jButton7.setBackground(Color.cyan);
    }
    
    if(b3 == ("O") && b5 == ("O") && b7 ==("O"))
    {
        JOptionPane.showMessageDialog(this, "Žaidėjas: O laimėjo", "Kryžiukai ir nuliukai",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        rezultatas();
        jButton3.setBackground(Color.cyan);
        jButton5.setBackground(Color.cyan);
        jButton7.setBackground(Color.cyan);
    }
}

    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kryžiukai ir nuliukai");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kryžiukai ir nuliukai");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Žaidėjas: X");
        jPanel6.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new java.awt.BorderLayout());

        jblPlayerX.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("rezultatas");
        jblPlayerX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel12.setText("Žaidėjas: O");
        jPanel11.add(jLabel12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new java.awt.BorderLayout());

        jblPlayerO.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("rezultatas");
        jPanel12.add(jblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jButtonReset.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButtonReset.setText("Iš naujo paleisti žaidimą");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonReset);

        jButtonExit.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButtonExit.setText("Išėjimas");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonExit);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
            jButton1.setText(null);
            jButton2.setText(null);
            jButton3.setText(null);
            
            jButton4.setText(null);
            jButton5.setText(null);
            jButton6.setText(null);
            
            jButton7.setText(null);
            jButton8.setText(null);
            jButton9.setText(null);
            
            jButton1.setBackground(Color.LIGHT_GRAY);
            jButton2.setBackground(Color.LIGHT_GRAY);
            jButton3.setBackground(Color.LIGHT_GRAY);
            
            jButton4.setBackground(Color.LIGHT_GRAY);
            jButton5.setBackground(Color.LIGHT_GRAY);
            jButton6.setBackground(Color.LIGHT_GRAY);
            
            jButton7.setBackground(Color.LIGHT_GRAY);
            jButton8.setBackground(Color.LIGHT_GRAY);
            jButton9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButtonResetActionPerformed
 private JFrame frame;
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        frame = new JFrame("Išeiti iš kryžiukai ir nuliukai žaidimo");
        if(JOptionPane.showConfirmDialog(frame, "Ar tikrai norite išeiti iš žaidimo?", "Kryžiukai ir nuliukai",
                JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION){
        
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    jButton1.setText(PradetiZaidima);
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        jButton1.setForeground(Color.GREEN);
    }
    else
    {
        jButton1.setForeground(Color.BLUE);
    }
    zaidejas();
    LaimetiZaidima();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(PradetiZaidima);
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        jButton2.setForeground(Color.GREEN);
    }
    else
    {
        jButton2.setForeground(Color.BLUE);
    }
    zaidejas();
    LaimetiZaidima();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(PradetiZaidima);
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        jButton3.setForeground(Color.GREEN);
    }
    else
    {
        jButton3.setForeground(Color.BLUE);
    }
    zaidejas();
    LaimetiZaidima();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(PradetiZaidima);
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        jButton4.setForeground(Color.GREEN);
    }
    else
    {
        jButton4.setForeground(Color.BLUE);
    }
    zaidejas();
    LaimetiZaidima();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(PradetiZaidima);
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        jButton5.setForeground(Color.GREEN);
    }
    else
    {
        jButton5.setForeground(Color.BLUE);
    }
    zaidejas();
    LaimetiZaidima();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(PradetiZaidima);
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        jButton6.setForeground(Color.GREEN);
    }
    else
    {
        jButton6.setForeground(Color.BLUE);
    }
    zaidejas();
    LaimetiZaidima();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(PradetiZaidima);
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        jButton7.setForeground(Color.GREEN);
    }
    else
    {
        jButton7.setForeground(Color.BLUE);
    }
    zaidejas();
    LaimetiZaidima();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(PradetiZaidima);
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        jButton8.setForeground(Color.GREEN);
    }
    else
    {
        jButton8.setForeground(Color.BLUE);
    }
    zaidejas();
    LaimetiZaidima();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(PradetiZaidima);
    if (PradetiZaidima.equalsIgnoreCase("X"))
    {
        jButton9.setForeground(Color.GREEN);
    }
    else
    {
        jButton9.setForeground(Color.BLUE);
    }
    zaidejas();
    LaimetiZaidima();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(KryziukaiNuliukai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KryziukaiNuliukai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KryziukaiNuliukai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KryziukaiNuliukai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KryziukaiNuliukai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    // End of variables declaration//GEN-END:variables
}
