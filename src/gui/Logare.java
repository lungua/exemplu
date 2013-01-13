
package gui;

import test.*;
import ent.Salariati;
import gui.PaginaPrincipala;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import util.SetupEnterActionForAllButtons;


public class Logare extends javax.swing.JDialog {


    public Logare(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        SetupEnterActionForAllButtons enterButton= new SetupEnterActionForAllButtons();
        enterButton.setupEnter();
        try {
                UIManager.setLookAndFeel(
                        UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                System.err.println("Nu gasesc look and feel -ul sistemului.");
            }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        em = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ComputerServicePU").createEntityManager();
        salariatiQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT s FROM Salariati s");
        salariatiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : salariatiQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jTxtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPassTxt = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setText("User");

        jTxtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtUserKeyPressed(evt);
            }
        });

        jLabel2.setText("Parola");

        jPassTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassTxtKeyPressed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jPassTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = jTxtUser.getText().trim();
        String pass = jPassTxt.getText();
        Salariati sal = findListSalariati(user);
        if (sal != null) {
            String st = sal.getUtilizator().trim();
            if (sal.getUtilizator().trim().equals(user)) {
                if (sal.getParola().trim().equals(pass)) {
                    JOptionPane.showMessageDialog(this, "Sunteti " + sal.getNume() + " .Spor la lucru");
                    PaginaPrincipala pp = new PaginaPrincipala(sal);
                    pp.createAndShowGUI();
                    pp.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Parola gresita.Reveniti");
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Utilizator inexistent.Reveniti");
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Utilizator inexistent.Reveniti");
                System.exit(0);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtUserKeyPressed
        if (evt.getKeyCode() == 10) {
            jPassTxt.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTxtUserKeyPressed

    private void jPassTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassTxtKeyPressed
        if (evt.getKeyCode() == 10) {
            jButton1.requestFocusInWindow();
        }
    }//GEN-LAST:event_jPassTxtKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == 10) {
            jTxtUser.requestFocusInWindow();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
     jTxtUser.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus
    public Salariati findListSalariati(String wwnume) {
        List<Salariati> listSal = em.createQuery("SELECT s FROM Salariati s WHERE s.utilizator = :wnume").setParameter("wnume", wwnume).getResultList();
        Salariati sal = null;
        if (listSal.size() == 1) {
            sal = listSal.get(0);
        }
        return sal;
    }

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Logare dialog = new Logare(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager em;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPassTxt;
    private javax.swing.JTextField jTxtUser;
    private java.util.List<ent.Salariati> salariatiList;
    private javax.persistence.Query salariatiQuery;
    // End of variables declaration//GEN-END:variables
}
