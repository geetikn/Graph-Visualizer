/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import static assign.Assign.*;
import static assign.click.alledge;
import static assign.click.weigh;
import static assign.mark.*;
import static assign.point.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author kaun_meet
 */
public class modifyedge extends javax.swing.JFrame {

    /**
     * Creates new form modifyedge
     */
    public modifyedge() {
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
        jLabel2 = new javax.swing.JLabel();
        modify1 = new javax.swing.JTextField();
        modify2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        modify5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("From name");

        jLabel2.setText("To name");

        jLabel5.setText("New weight");

        modify5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(90, 90, 90))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel5)
                                .addGap(54, 54, 54)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(modify1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(modify2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(modify5, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton1)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(modify1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(modify2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(modify5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String a, b, c, d, e;
            a = modify1.getText().trim();
            b = modify2.getText().trim();
//c=modify3.getText().trim();
//d=modify4.getText().trim();
            e = modify5.getText().trim();
            int we = Integer.parseInt(e);
//int v=point.validnames(c, d);
            int v = 1;
            int v2 = point.validw(we);
            if (a.isEmpty() || b.isEmpty() || e.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All inputs are not provided");

//            System.out.println("All inputs are not provided");
            } else {
                if (v == -1) {
                    JOptionPane.showMessageDialog(null, "Error in new edge , as edge already exists");

//                System.out.println("Error in new edge , as edge already exists");
                } else if (v2 == -1) {
                    JOptionPane.showMessageDialog(null, "Weight can't be non-integer");

//                System.out.println("Weight can't be non-integer ");
                } else if (v2 == -2) {
                    JOptionPane.showMessageDialog(null, "Weight can't  negative");

//                System.out.println("Weight can't  negative");
                } else {
                    int f = checkedge(a, b);
                    if (f == -1) {
                        JOptionPane.showMessageDialog(null, "No such edge exixts");

//                    System.out.println("No such edge exixts");
                    } else {
//        edgelist.get(f).from=c;
//        edgelist.get(f).to=d;
//                    edgelist.get(f).weight = we;
//                    weigh.get(f) = (int)we;
                        weigh.set(f, we);

                        alledge.get(f).weightedge = we;

                        JOptionPane.showMessageDialog(null, "task done");

//System.out.println("task done");
                    }
                }
            }

//        for (int i = 0; i < vertexlist.size(); i++) {
//            System.out.println(vertexlist.get(i).nameofvertex);
//        }
//        for (int i = 0; i < edgelist.size(); i++) {
//            System.out.println(edgelist.get(i).from + " " + edgelist.get(i).to + " " + edgelist.get(i).weight);
//        }
//        for (int i = 0; i < vertexlist.size(); i++) {
//            System.out.println(vertexlist.get(i).nameofvertex);
//        }
//        for (int i = 0; i < edgelist.size(); i++) {
//            System.out.println(edgelist.get(i).from + " " + edgelist.get(i).to + " " + edgelist.get(i).weight);
//        }
//        // TODO add your handling code here:
            repaint();

            this.dispose();

        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void modify5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modify5ActionPerformed

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
            java.util.logging.Logger.getLogger(modifyedge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifyedge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifyedge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifyedge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modifyedge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField modify1;
    private javax.swing.JTextField modify2;
    private javax.swing.JTextField modify5;
    // End of variables declaration//GEN-END:variables
}
