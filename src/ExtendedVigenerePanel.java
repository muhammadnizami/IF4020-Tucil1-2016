
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template plaintextfile, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nim_13512501
 */
public class ExtendedVigenerePanel extends javax.swing.JPanel {

    /**
     * Creates new form ExtendedVigenerePanel
     */
    public ExtendedVigenerePanel() {
        initComponents();
        plaintextButtonGroup.add(jRadioButton1);
        plaintextButtonGroup.add(jRadioButton2);
        ciphertextButtonGroup.add(jRadioButton3);
        ciphertextButtonGroup.add(jRadioButton4);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jTextArea1.setVisible(false);
        jTextArea2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plaintextButtonGroup = new javax.swing.ButtonGroup();
        ciphertextButtonGroup = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jRadioButton1.setText("file");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("text");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setText("encrypt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("decrypt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label1.setText("key:");

        jRadioButton3.setText("text");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("file");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("choose file");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("choose file");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2)))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jTextArea1.setVisible(false);
        jButton3.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setVisible(true);
        jButton3.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:                                         
        char [] cipherText = null;
        if (jRadioButton4.isSelected()){
            if (ciphertextfile==null){
                JOptionPane.showMessageDialog(null, "please choose a file");
            }else            try {
                FileInputStream fis = new FileInputStream(ciphertextfile);
                cipherText = Helper.readStream(fis).toCharArray();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(StandardVigenerePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (jRadioButton3.isSelected())
            cipherText = jTextArea2.getText().toCharArray();
        else cipherText = new char[0];        
        char [] key = jTextField1.getText().toCharArray();
        char [] plaintext = null;
            try {
                ExtendedVigenereKey vigenereKey = new ExtendedVigenereKey(key);
                plaintext = vigenereKey.decrypt(cipherText);
                jTextArea1.setText(new String(plaintext));
            } catch (Exception ex) {
                Logger.getLogger(StandardVigenerePanel.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "invalid key: " + ex);
            }
        if (jRadioButton4.isSelected()){
            if (!plaintextfile.exists()){
                try {
                    plaintextfile.createNewFile();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    Logger.getLogger(ExtendedVigenerePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                FileOutputStream fos = new FileOutputStream(plaintextfile);
                PrintStream ps = new PrintStream(fos);
                ps.print(plaintext);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(ExtendedVigenerePanel.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        char [] plaintext = null;
        if (jRadioButton1.isSelected()){
            
            if (plaintextfile==null){
                JOptionPane.showMessageDialog(null, "please choose a file");
            }else           try {
                FileInputStream fis = new FileInputStream(plaintextfile);
                plaintext = Helper.readStream(fis).toCharArray();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(ExtendedVigenerePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (jRadioButton2.isSelected())
            plaintext = jTextArea1.getText().toCharArray();
        else plaintext = new char[0];
        char [] key = jTextField1.getText().toCharArray();
               
        char [] ciphertext = null;
            try {
                ExtendedVigenereKey vigenereKey = new ExtendedVigenereKey(key);
                ciphertext = vigenereKey.encrypt(plaintext);
                for (int i=0;i<ciphertext.length;i++)
                    System.out.println(ciphertext[i]);
                jTextArea2.setText(new String(ciphertext));
            } catch (Exception ex) {
                Logger.getLogger(StandardVigenerePanel.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "invalid key: " + ex);
            }
        if (jRadioButton4.isSelected()){
            if (!ciphertextfile.exists()){
                try {
                    ciphertextfile.createNewFile();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    Logger.getLogger(StandardVigenerePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                FileOutputStream fos = new FileOutputStream(ciphertextfile);
                PrintStream ps = new PrintStream(fos);
                ps.print(ciphertext);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(StandardVigenerePanel.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jTextArea2.setVisible(true);
        jButton4.setVisible(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        jTextArea2.setVisible(false);
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    File plaintextfile;
    File ciphertextfile;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            plaintextfile = fc.getSelectedFile();
            //This is where a real application would open the plaintextfile.
            jTextArea1.setText(plaintextfile.getAbsolutePath());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ciphertextfile = fc.getSelectedFile();
            //This is where a real application would open the plaintextfile.
            jTextArea2.setText(plaintextfile.getAbsolutePath());
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ciphertextButtonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private javax.swing.ButtonGroup plaintextButtonGroup;
    // End of variables declaration//GEN-END:variables
}
