
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bryant Lee Tjandra
 */
public class final2 extends javax.swing.JFrame {

    /**
     * Creates new form final2
     */
    public final2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jCheckBox1 = new java.awt.Checkbox();
        jLabel2 = new javax.swing.JLabel();
        other1 = new javax.swing.JTextField();
        other2 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Jenis Bensin       :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Bensin", "Premium", "Pertalite", "Pertamax", "Pertamax Turbo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Konsumsi Bensin :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Motor", "Revo 110 FI", "Blade 125 FI", "Supra X 125 FI", "Beat ESP", "Beat ESP ISS", "Spacy PGM-FI", "Scoopy ESP", "Vario 110 ESP ", "Vario 125 ESP", "Vario 150 ESP", "Sonic 150", "New Verza", "New Mega Pro FI", "New CB150R Streetfire", "PCX 150", "Other" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Jarak                 :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jButton3.setText("Calculate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setText("Kapasitas Tangki :");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Motor", "Revo 110 FI", "Blade 125 FI", "Supra X 125 FI", "Beat ESP", "Beat ESP ISS", "Spacy PGM-FI", "Scoopy ESP", "Vario 110 ESP ", "Vario 125 ESP", "Vario 150 ESP", "Sonic 150", "New Verza", "New Mega Pro FI", "New CB150R Streetfire", "PCX 150", "Other" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jCheckBox1.setLabel("Pulang Pergi");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cooltext343519150609082.png"))); // NOI18N

        other1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                other1ActionPerformed(evt);
            }
        });

        other2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                other2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(other2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(other1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(other1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(other2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton3)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//ini codingnya
    int pilih;
    String jenisBensin;
    String jenisKonsumsi;
    int hargaBensin;
    double kapasitasTangki;
    double konsumsiMotor;
    double test;
    double test2;
    double test3;
    double test4;
    double out1;
    double out2;
    double out3;
    double out4;
    boolean PPcek = false;

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        pilih = jComboBox2.getSelectedIndex();
        switch (pilih) {
            case 1:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 62.2;
                break;
            case 2:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 61.8;
                break;
            case 3:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 61.8;
                break;
            case 4:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 58.5;
                break;
            case 5:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 63;
                break;
            case 6:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 41;
                break;
            case 7:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 61.9;
                break;
            case 8:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 59;
                break;
            case 9:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 59.5;
                break;
            case 10:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 52.9;
                break;
            case 11:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 40.90;
                break;
            case 12:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 48;
                break;
            case 13:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 46.2;
                break;
            case 14:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 37.87;
                break;
            case 15:
                jenisKonsumsi = String.valueOf(jComboBox2.getSelectedItem());
                konsumsiMotor = 50.7;
                break;
            case 16:
                jComboBox2.setVisible(false);
                other1.setVisible(true);
            /*default:
                JOptionPane.showMessageDialog(null, "Pilih jenis motor");
                jenisKonsumsi = "";
                konsumsiMotor = 0;
                break;*/
        }
        jLabel6.setText(String.valueOf("Konsumsi Bensin : " + konsumsiMotor + " km/liter"));
        jLabel6.setVisible(true);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        other1.setVisible(false);
        other2.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        pilih = jComboBox1.getSelectedIndex();
        switch (pilih) {
            case 1:
                jenisBensin = String.valueOf(jComboBox1.getSelectedItem());
                hargaBensin = 6450;
                break;
            case 2:
                jenisBensin = String.valueOf(jComboBox1.getSelectedItem());
                hargaBensin = 7650;
                break;
            case 3:
                jenisBensin = String.valueOf(jComboBox1.getSelectedItem());
                hargaBensin = 9850;
                break;
            case 4:
                jenisBensin = String.valueOf(jComboBox1.getSelectedItem());
                hargaBensin = 11200;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilih jenis bensin");
                jenisBensin = "";
                hargaBensin = 0;
                break;
        }
        jLabel5.setText(String.valueOf("Harga Bensin : Rp. " + hargaBensin));
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

// TODO add your handling code here:
        test3 = Double.parseDouble(jTextField2.getText());
        
        if(kapasitasTangki == 0 || konsumsiMotor == 0){
        kapasitasTangki = Double.parseDouble(other2.getText());
        konsumsiMotor = Double.parseDouble(other1.getText());
        }
        
        if (PPcek) {
            test3*=2;
        }

        //test = hargaBensin + konsumsiMotor + test2 + test3;

        out1 = test3 / konsumsiMotor;
        jLabel9.setText(String.valueOf("Pemakaian bensin per " + test3 + " km : " + out1 + " liter"));
        jLabel9.setVisible(true);

        out2 = out1 * hargaBensin;
        jLabel10.setText(String.valueOf("Harga bensin per " + test3 + " km : Rp. " + (int) out2));
        jLabel10.setVisible(true);

        out3 =  (out1 / kapasitasTangki) + 1;
        jLabel11.setText(String.valueOf("Anda harus mengisi bensin di pom sebanyak " + (int) out3 + " kali"));
        jLabel11.setVisible(true);

        out4 = kapasitasTangki * hargaBensin;
        jLabel12.setText(String.valueOf("Total biaya untuk membuat tangki bensin terisi penuh : Rp. " + (int) out4));
        jLabel12.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        pilih = jComboBox3.getSelectedIndex();
        switch (pilih) {
            case 1:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 4;
                break;
            case 2:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 4;
                break;
            case 3:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 4;
                break;
            case 4:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 4;
                break;
            case 5:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 4;
                break;
            case 6:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 5.5;
                break;
            case 7:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 4;
                break;
            case 8:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 3.7;
                break;
            case 9:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 5.5;
                break;
            case 10:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 5.5;
                break;
            case 11:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 4;
                break;
            case 12:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 12.2;
                break;
            case 13:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 12.3;
                break;
            case 14:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 12;
                break;
            case 15:
                jenisKonsumsi = String.valueOf(jComboBox3.getSelectedItem());
                kapasitasTangki = 8;
                break;
            case 16:
                jComboBox3.setVisible(false);
                other2.setVisible(true);
            /*default:
                JOptionPane.showMessageDialog(null, "Pilih jenis motor");
                jenisKonsumsi = "";
                konsumsiMotor = 0;
                break;*/
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
        if (jCheckBox1.getLabel().equalsIgnoreCase(jenisBensin)) {
            test3 = test3 * 2;
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        //evt = event
           //get.source = tercentang
           //getStsteChange = lakukana pergantian
        if (evt.getSource() == jCheckBox1) {
            if (evt.getStateChange() == 1) {
                PPcek = true;
            }else{
                PPcek = false;
            }
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void other1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_other1ActionPerformed
        // TODO add your handling code here:
       // konsumsiMotor = Double.parseDouble(other1.getText());
    }//GEN-LAST:event_other1ActionPerformed

    private void other2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_other2ActionPerformed
        // TODO add your handling code here:
       // kapasitasTangki = Double.parseDouble(other2.getText());
    }//GEN-LAST:event_other2ActionPerformed

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
            java.util.logging.Logger.getLogger(final2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(final2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(final2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(final2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new final2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private java.awt.Checkbox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField other1;
    private javax.swing.JTextField other2;
    // End of variables declaration//GEN-END:variables
}