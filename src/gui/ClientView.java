
package gui;

import drepturiAcces.Acces;
import ent.Clienti;
import ent.Salariati;
import java.awt.Component;
import java.util.Vector;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import util.MyOwnFocusTraversalPolicy;
import util.SetupEnterActionForAllButtons;


public class ClientView extends javax.swing.JPanel {

    public Salariati wsal;
    static MyOwnFocusTraversalPolicy newPolicy;

  
    public ClientView(java.awt.Frame parent, boolean modal, Salariati wsal) {
        // super(parent, modal);

        initComponents();
        this.wsal = wsal;
        Acces ac = new Acces(wsal.getTip());

        if (ac.fc_accesSalariatiView(wsal.getTip())) {  //verifica daca utilizatorul are drepturi pt. acest modul

            Vector<Component> order = new Vector<Component>(6);
            order.add(jtxtNumeClient);
            order.add(jtxtAdresa);
            order.add(jtxtEmail);
            order.add(jtxtTelefon);
            order.add(jButtSave);
            order.add(jButtAdd);
            SetupEnterActionForAllButtons enterButton = new SetupEnterActionForAllButtons();
            enterButton.setupEnter();
            newPolicy = new MyOwnFocusTraversalPolicy(order);
        } else {
            JOptionPane.showMessageDialog(this, "Nu aveti drepturi pentru aceasta optiune..");
             this.disable();
            //System.exit(0);

        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        em = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ComputerServicePU").createEntityManager();
        clientiQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT c FROM Clienti c");
        clientiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(clientiQuery.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNume = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtIdClient = new javax.swing.JTextField();
        jtxtNumeClient = new javax.swing.JTextField();
        jtxtAdresa = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jtxtTelefon = new javax.swing.JTextField();
        jButtNext = new javax.swing.JButton();
        jButtPreview = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtAdd = new javax.swing.JButton();
        jButtSave = new javax.swing.JButton();
        jButtDel = new javax.swing.JButton();
        jButtNoSave = new javax.swing.JButton();
        jButtMod = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arabic Typesetting", 0, 48));
        jLabel1.setText("Clienti");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientiList, jListNume, "bindClienti");
        jListBinding.setDetailBinding(org.jdesktop.beansbinding.ELProperty.create("${nume}"));
        bindingGroup.addBinding(jListBinding);

        jScrollPane1.setViewportView(jListNume);

        jLabel2.setText("IdClient");

        jLabel3.setText("Nume Client");

        jLabel4.setText("Adresa");

        jLabel5.setText("Email");

        jLabel6.setText("Telefon");

        jtxtIdClient.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListNume, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idClient}"), jtxtIdClient, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtNumeClient.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListNume, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nume}"), jtxtNumeClient, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtNumeClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtNumeClientKeyPressed(evt);
            }
        });

        jtxtAdresa.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListNume, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.adresa}"), jtxtAdresa, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtAdresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtAdresaKeyPressed(evt);
            }
        });

        jtxtEmail.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListNume, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.email}"), jtxtEmail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtEmailKeyPressed(evt);
            }
        });

        jtxtTelefon.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListNume, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefon}"), jtxtTelefon, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtTelefon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtTelefonKeyPressed(evt);
            }
        });

        jButtNext.setText(">");
        jButtNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtNextActionPerformed(evt);
            }
        });

        jButtPreview.setText("<");
        jButtPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtPreviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNumeClient, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jtxtAdresa)
                            .addComponent(jtxtEmail)
                            .addComponent(jtxtIdClient, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtPreview)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtPreview)
                            .addComponent(jButtNext)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jtxtIdClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtNumeClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jtxtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtAdd.setText("Add");
        jButtAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtAddActionPerformed(evt);
            }
        });

        jButtSave.setText("Save");
        jButtSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtSave.setEnabled(false);
        jButtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtSaveActionPerformed(evt);
            }
        });

        jButtDel.setText("Del");
        jButtDel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtDelActionPerformed(evt);
            }
        });

        jButtNoSave.setText("NoSave");
        jButtNoSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtNoSave.setEnabled(false);
        jButtNoSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtNoSaveActionPerformed(evt);
            }
        });

        jButtMod.setText("Modify");
        jButtMod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtNoSave, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtNoSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtAddActionPerformed
 

        int n = JOptionPane.showConfirmDialog(this, "Adaugati Clientul?", "Adaugare client", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            jButtSave.setEnabled(true);
            jButtDel.setEnabled(false);
            jtxtNumeClient.setEnabled(true);
            jtxtAdresa.setEnabled(true);
            jtxtEmail.setEnabled(true);
            jtxtTelefon.setEnabled(true);
            jButtNext.setEnabled(false);
            jButtPreview.setEnabled(false);
            jListNume.setEnabled(false);
            jButtNoSave.setEnabled(true);
            jButtAdd.setEnabled(false);
            jButtMod.setEnabled(false);


            Clienti c = new Clienti();
            clientiList.add(c);
            c.setNume("ClientNou");
            bindingGroup.getBinding("bindClienti").unbind();
            bindingGroup.getBinding("bindClienti").bind();

            jListNume.setSelectedIndex(clientiList.indexOf(c));
            em.persist(c);
            this.setFocusTraversalPolicy(newPolicy);
        }


    }//GEN-LAST:event_jButtAddActionPerformed

    private void jButtPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtPreviewActionPerformed
        // TODO add your handling code here:
        int bb = jListNume.getMinSelectionIndex();
        if (bb != -1) {
            jListNume.setSelectedIndex(jListNume.getSelectedIndex() - 1);
            if (jListNume.getSelectedIndex() >= 0)// 1
            {

                jListNume.scrollRectToVisible(jListNume.getCellBounds(jListNume.getSelectedIndex(), jListNume.getSelectedIndex()));//2
            }
        }
    }//GEN-LAST:event_jButtPreviewActionPerformed

    private void jButtNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtNextActionPerformed

        int bb = jListNume.getMinSelectionIndex();
        if (bb != -1) {
            jListNume.setSelectedIndex(jListNume.getSelectedIndex() + 1);
            if (jListNume.getSelectedIndex() >= 0)// 1
            {

                jListNume.scrollRectToVisible(jListNume.getCellBounds(jListNume.getSelectedIndex(), jListNume.getSelectedIndex()));//2

            }
        }
    }//GEN-LAST:event_jButtNextActionPerformed

    private void jButtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtSaveActionPerformed

        int n = JOptionPane.showConfirmDialog(this, "Salvati Clientul?", "Salvati client", JOptionPane.YES_NO_OPTION);
        if (n == 0) {


            jButtAdd.setEnabled(true);
            jButtSave.setEnabled(false);
            jButtDel.setEnabled(true);
            jtxtNumeClient.setEnabled(false);
            jtxtAdresa.setEnabled(false);
            jtxtEmail.setEnabled(false);
            jtxtTelefon.setEnabled(false);
            jButtNext.setEnabled(true);
            jButtPreview.setEnabled(true);
            jListNume.setEnabled(true);
            jButtNoSave.setEnabled(false);
            jButtMod.setEnabled(true);
            Clienti clientCurent = clientiList.get(jListNume.getSelectedIndex()); // 1
            if (!em.contains(clientCurent)) {
                em.merge(clientCurent); // 1
            }
            em.getTransaction().begin(); // 2
            em.getTransaction().commit();
            jButtAdd.requestFocusInWindow();
        }
    }//GEN-LAST:event_jButtSaveActionPerformed

    private void jButtDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtDelActionPerformed

        int n = JOptionPane.showConfirmDialog(this, "Stergeti Clientul?", "Stergeti client", JOptionPane.YES_NO_OPTION);
        if (n == 0) {

            Clienti clientCurent = clientiList.get(jListNume.getSelectedIndex()); // 1
            em.getTransaction().begin(); // 1
            if (em.contains(clientCurent)) // 2
            {
                em.remove(clientCurent); //2
            }
            clientiList.remove(clientCurent); // 3
            em.getTransaction().commit(); // 1
            jButtAdd.requestFocusInWindow();
        }

    }//GEN-LAST:event_jButtDelActionPerformed

    private void jButtNoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtNoSaveActionPerformed

        refreshClienti();
        jButtSave.setEnabled(false);
        jtxtNumeClient.setEnabled(false);
        jtxtAdresa.setEnabled(false);
        jtxtEmail.setEnabled(false);
        jtxtTelefon.setEnabled(false);
        jButtPreview.setEnabled(true);

        jButtNext.setEnabled(true);
        jButtNoSave.setEnabled(false);
        jListNume.setEnabled(true);
        jButtAdd.setEnabled(true);
        jButtMod.setEnabled(true);
        this.setFocusTraversalPolicy(newPolicy);
        jButtAdd.requestFocusInWindow();
}//GEN-LAST:event_jButtNoSaveActionPerformed
    private void refreshClienti() {
        Integer idxComandaCurenta = jListNume.getSelectedIndex();
        clientiList.clear();
        em.clear();
        // reinterogarea bazei de date şi repopularea structurii principale de date
        clientiList.addAll(clientiQuery.getResultList());
        // reselectarea elementului curent la început în lista de navigare principală

        if (idxComandaCurenta >= 0) {
            jListNume.setSelectedIndex(idxComandaCurenta);
        } else {
            jListNume.setSelectedIndex(0);
        }
    }
    private void jButtModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtModActionPerformed

        jButtSave.setEnabled(true);
        jButtDel.setEnabled(false);
        jtxtNumeClient.setEnabled(true);
        jtxtAdresa.setEnabled(true);
        jtxtEmail.setEnabled(true);
        jtxtTelefon.setEnabled(true);
        jButtNext.setEnabled(false);
        jButtPreview.setEnabled(false);
        jListNume.setEnabled(false);
        jButtNoSave.setEnabled(true);
        jButtAdd.setEnabled(false);
        //jButtMod.setEnabled(false);
}//GEN-LAST:event_jButtModActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jButtSave.setEnabled(false);
        jtxtNumeClient.setEnabled(false);
        jtxtAdresa.setEnabled(false);
        jtxtEmail.setEnabled(false);
        jtxtTelefon.setEnabled(false);
        jButtNext.setEnabled(true);
        jButtPreview.setEnabled(true);
        jButtNoSave.setEnabled(false);
        jButtMod.setEnabled(true);
        jButtAdd.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void jtxtNumeClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNumeClientKeyPressed

        if (evt.getKeyCode() == 10) {
            jtxtAdresa.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtxtNumeClientKeyPressed

    private void jtxtAdresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAdresaKeyPressed
        if (evt.getKeyCode() == 10) {
            jtxtEmail.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtxtAdresaKeyPressed

    private void jtxtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEmailKeyPressed
        if (evt.getKeyCode() == 10) {
            jtxtTelefon.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtxtEmailKeyPressed

    private void jtxtTelefonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTelefonKeyPressed
        if (evt.getKeyCode() == 10) {
            jButtSave.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtxtTelefonKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Salariati sss = new Salariati();
                sss.setTip("administrator");
                ClientView dialog = new ClientView(new javax.swing.JFrame(), true, sss);
                if (dialog.wsal.getTip() == sss.getTip()) {
                    JFrame f = new JFrame("Clienti ");
                    f.setSize(700, 550);
                    f.add(dialog);
                    f.setVisible(true);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<ent.Clienti> clientiList;
    private javax.persistence.Query clientiQuery;
    private javax.persistence.EntityManager em;
    private javax.swing.JButton jButtAdd;
    private javax.swing.JButton jButtDel;
    private javax.swing.JButton jButtMod;
    private javax.swing.JButton jButtNext;
    private javax.swing.JButton jButtNoSave;
    private javax.swing.JButton jButtPreview;
    private javax.swing.JButton jButtSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jListNume;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtAdresa;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtIdClient;
    private javax.swing.JTextField jtxtNumeClient;
    private javax.swing.JTextField jtxtTelefon;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
