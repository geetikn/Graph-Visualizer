/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import static assign.Assign.*;
import static assign.click.*;
import static assign.first.animate;
import static assign.point.*;
import java.awt.Point;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author kaun_meet
 */
public class pathdisplay extends javax.swing.JFrame {

    static int[] squaree = new int[]{0, 0, 0, 0, 0};

//    static int squaree[]=new int[5] ;
//    squarre[/
    static int pluss[] = new int[]{0, 0, 0, 0, 0};

    static int trianglee[] = new int[]{0, 0, 0, 0, 0};
    static int crosss[] = new int[]{0, 0, 0, 0, 0};
    static int circlee[] = new int[]{0, 0, 0, 0, 0};
    static int currentpath = 0;
    int ii;
    static int choice[] = new int[5];

//for(ii=0;ii<5;ii++){
//    squaree[ii]=0;
//}
    static ArrayList<Integer> pathetic = new ArrayList<Integer>();
    static ArrayList<String> pathh = new ArrayList<>();
    static ArrayList<Integer> ans = new ArrayList<Integer>();

    /**
     * Creates new form pathdisplay
     */
    public pathdisplay() {
        initComponents();
//        squaree = 0;
//        pluss = 0;
//        trianglee = 0;
//        crosss = 0;

        int i = 0;
        int n = allvertex.size();
        String[] str = new String[n];
        for (i = 0; i < n; i++) {
            str[i] = allvertex.get(i).namevertex;
        }
        fromlist.setModel(new javax.swing.DefaultComboBoxModel<>(str));
        tolist.setModel(new javax.swing.DefaultComboBoxModel<>(str));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fromlist = new javax.swing.JComboBox<>();
        tolist = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        printing = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("From vertex");

        jLabel2.setText("To vertex");

        fromlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fromlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromlistActionPerformed(evt);
            }
        });

        tolist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Find Path");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        printing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printingActionPerformed(evt);
            }
        });

        jButton2.setText("circle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("sqare");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("plus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("cross");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("triangle");
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
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(fromlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tolist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addComponent(printing, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tolist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton3))
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(printing, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
static int countt = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        try {
        pathh.clear();
        ans.clear();
        pathetic.clear();
//            animate.clear();

        int fromindex = fromlist.getSelectedIndex();
        int toindex = tolist.getSelectedIndex();
        String ini = allvertex.get(fromindex).namevertex;
        String dest = allvertex.get(toindex).namevertex;
//        System.out.println(ini + " " + dest);
        int i = 0;
        int n = allvertex.size();
        int m = alledge.size();
//System.out.println(fromindex+" "+toindex);
        HashMap<String, Integer> stoi = new HashMap<>();
        HashMap<Integer, String> itos = new HashMap<>();
        int count = 0;

        for (i = 0; i < n; i++) {
            stoi.put(allvertex.get(i).namevertex, count);
            itos.put(count, allvertex.get(i).namevertex);
//            System.out.println(vertexlist.get(i).nameofvertex + " " + count);
            count++;
        }
        int[] dis = new int[n];
        int[] parent = new int[n];
        for (i = 0; i < n; i++) {
            dis[i] = -1;

        }

        ArrayList<saareedge> q = new ArrayList<>();

//        String ini = vertexlist.get(toindex).nameofvertex;
        q.add(new saareedge(ini, ini, 0));
        // char x='B';

        dis[stoi.get(ini)] = 0;
        parent[stoi.get(ini)] = stoi.get(ini);

        while (q.size() > 0) {
//            System.out.println("  fh ");
            int index = 0;
            // int i = 0;
            int sz = q.size();
//            System.out.println("sz" + sz);
            for (i = 0; i < sz; i++) {
//                if (q.get(i).weight < q.get(index).weight)
//                int ij = Integer.parseInt(q.get(i).weight);
//                int jj = Integer.parseInt(q.get(index).weight);
                int ij = q.get(i).weightedge;
                int jj = q.get(index).weightedge;
                if (ij < jj) {
                    index = i;
                }

            }
            saareedge temp = q.get(index);
            q.remove(index);
            ArrayList<saareedge> vv = new ArrayList<>();
            // int gh=temp.to - 'A';
//            int gh = 0;
//            if (temp.to.equals("B")) {
//                gh = 1;
//            }
//            if (temp.to.equals("C")) {
//                gh = 2;
//            }
            int gh = stoi.get(temp.tovertex);

//            System.out.println("gh" +temp.to+" " + gh);
            int ww = (temp.weightedge);
            if (dis[gh] == -1) {
                dis[gh] = ww;
                parent[gh] = stoi.get(temp.fromvertex);
            } else {
                if (ww < dis[gh]) {
                    dis[gh] = ww;
                    parent[gh] = stoi.get(temp.fromvertex);

                }
                // dis[gh]=Math.Min(dis[gh],temp.weight);
            }
            for (int j = 0; j < alledge.size(); j++) {
                int ss = stoi.get(alledge.get(j).tovertex);
//                if (edgelist.get(j).to.equals("B")) {
//                    ss = 1;
//                }
//                if (edge.get(j).to.equals("C")) {
//                    ss = 2;
//                }
//                System.out.println(j + " ss " + ss);

                if (temp.tovertex.equals(alledge.get(j).fromvertex) && (!alledge.get(j).tovertex.equals(temp.fromvertex)) && (dis[ss] == -1)) {
                    saareedge te = new saareedge(alledge.get(j).fromvertex, alledge.get(j).tovertex, (alledge.get(j).weightedge + temp.weightedge));
                    vv.add(te);
                }

            }
//            System.out.println("vv size  " + vv.size());

            for (i = 0; i < vv.size(); i++) {
                q.add(vv.get(i));
            }

        }
        if (dis[stoi.get(dest)] == -1) {
            String bh = dest + " can't be reached from " + ini;
            printing.setText(bh);
            JOptionPane.showMessageDialog(null, dest + " can't be reached from " + ini);

//            System.out.println(dest + " can't be reached from " + ini);
        } else {
            int p = stoi.get(dest);
            while (p != parent[p]) {
//                pathetic.add(p);

                pathh.add(itos.get(p));
                p = parent[p];
            }
            pathh.add((ini));

            int szz = pathh.size();
            String bb = "COST -> " + Integer.toString(dis[stoi.get(dest)]) + "\n" + "PAth    ";
//        bb=bb+"COST -> " + Integer.toString(dis[stoi.get(dest)]);
//        bb=bb+"\n";
//            System.out.println("COST -> " + dis[stoi.get(dest)]);
//bb=bb+"PAth \n";
//            System.out.println("PAth");
            for (i = szz - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(pathh.get(i) + " -> ");
                    bb = bb + pathh.get(i) + " -> ";
                } else {
                    System.out.print(pathh.get(i));
                    bb = bb + pathh.get(i);
                }
            }
            bb = bb + "\n";
            System.out.println("");

            printing.setText(bb);

//            for(i=szz-1;i>0;i--){
//                int j=i-1;
//                
//                int k;
//                
//                
//                
//                
//            }
//            animate.add(new Point(50, 400));
//            animate.add(new Point(500, 100));
            int siw = pathh.size();
            int j;
            ans.clear();
            for (i = siw - 1; i > 0; i--) {
                j = i - 1;
                String n1 = pathdisplay.pathh.get(i);
                String n2 = pathdisplay.pathh.get(j);

                int k = 0;
                for (k = 0; k < alledge.size(); k++) {
                    if (alledge.get(k).fromvertex.equals(n1) && alledge.get(k).tovertex.equals(n2)) {
                        ans.add(k);
                        break;
                    }
                }

            }
            System.out.println("ans ka size" + ans.size());
            for (i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " m ");
            }

            System.out.println("bfuyfuyfuyfuyfuf");
            for (i = 0; i < ans.size(); i++) {
//                    j = i + 1;

                int x1, y1, x2, y2;
                x1 = firstofedge.get(ans.get(i)).x;
                y1 = firstofedge.get(ans.get(i)).y;

                x2 = lastofedge.get(ans.get(i)).x;
                y2 = lastofedge.get(ans.get(i)).y;

                int per, base;
                per = y2 - y1;

                base = x2 - x1;

                int hyp = (per * per) + (base * base);
                double aw = Math.sqrt((double) hyp);
                int hyy = (int) aw;

                int k;
                int km = hyy;
                for (k = 1; k < hyy; k += 1) {

//                        int xs = (((k) * (base)) / (hyy));
                    int xs = (((k) * x2) + ((hyy - k) * (x1))) / hyy;

//int xxss;
//                        xxss = xs + x1;
                    int yyxx = (((k) * y2) + ((hyy - k) * (y1))) / hyy;
//                    is
                    animate[countt].add(new Point(xs, yyxx));
//                       count++;
                    System.out.println("gwg" + countt);
                }

            }
            countt++;

        }

//        } 
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        for (i = 0; i < n; i++) {
//            System.out.println("ri"+i + " " + dis[i]+"bhai"+parent[i]+"pappa");
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fromlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromlistActionPerformed

    private void printingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printingActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        choice[countt] = 1;

        circlee[currentpath] = 1;

//        circlee[currentpath] = 0;
        squaree[currentpath] = 0;
        pluss[currentpath] = 0;
        crosss[currentpath] = 0;
        trianglee[currentpath] = 0;
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        choice[countt] = 5;
//        squaree = 1;        // TODO add your handling code here:

        circlee[currentpath] = 0;
        squaree[currentpath] = 1;
        pluss[currentpath] = 0;
        crosss[currentpath] = 0;
        trianglee[currentpath] = 0;

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        choice[countt] = 2;
//        pluss = 1;        // TODO add your handling code here:
        circlee[currentpath] = 0;
        squaree[currentpath] = 0;
        pluss[currentpath] = 1;
        crosss[currentpath] = 0;
        trianglee[currentpath] = 0;

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        choice[countt] = 3;
        circlee[currentpath] = 0;
        squaree[currentpath] = 0;
        pluss[currentpath] = 0;
        crosss[currentpath] = 0;
        trianglee[currentpath] = 0;

        crosss[currentpath] = 1;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        choice[countt] = 4;
        circlee[currentpath] = 0;
        squaree[currentpath] = 0;
        pluss[currentpath] = 0;
        crosss[currentpath] = 0;
        trianglee[currentpath] = 0;

        trianglee[currentpath] = 1;
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(pathdisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pathdisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pathdisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pathdisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pathdisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> fromlist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField printing;
    private javax.swing.JComboBox<String> tolist;
    // End of variables declaration//GEN-END:variables
}
