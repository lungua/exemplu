package gui;

import drepturiAcces.Acces;
import ent.Clienti;
import ent.Furnizori;
import ent.Materiale;
import ent.Salariati;
import java.awt.Component;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import util.MyOwnFocusTraversalPolicy;
import util.SetupEnterActionForAllButtons;

public class ReceptiiMaterialeView extends javax.swing.JPanel {

    static MyOwnFocusTraversalPolicy newPolicy;
    public Salariati wsal;

    public ReceptiiMaterialeView(java.awt.Frame parent, boolean modal, Salariati wsal) {
        //super(parent, modal);
        this.wsal = wsal;
        Acces ac = new Acces(wsal.getTip());
        if (ac.fc_accesRecepriiMaterialeView(wsal.getTip())) {
            initComponents();
            Vector<Component> order = new Vector<Component>(5);
            order.add(jtxtCantitate);
            order.add(jtxtPret);
            order.add(jButtSave);
            order.add(jButtMod);
            SetupEnterActionForAllButtons enterButton = new SetupEnterActionForAllButtons();
            enterButton.setupEnter();
            newPolicy = new MyOwnFocusTraversalPolicy(order);
        } else {
            JOptionPane.showMessageDialog(this, "Nu aveti drepturi pentru aceasta optiune..");
            this.disable();
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        em = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ComputerServicePU").createEntityManager();
        materialeQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT m FROM Materiale m");
        materialeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : materialeQuery.getResultList();
        furnizoriQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT f FROM Furnizori f");
        furnizoriList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : furnizoriQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMaterial11 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtIdFurnizor = new javax.swing.JTextField();
        jtxtNumeMaterial = new javax.swing.JTextField();
        jtxtPret = new javax.swing.JTextField();
        jtxtStoc = new javax.swing.JTextField();
        jButtNext = new javax.swing.JButton();
        jButtPreview = new javax.swing.JButton();
        jCboFurnizori = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jtxtIntrari = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtIesiri = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jtxtCantitate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtAdd = new javax.swing.JButton();
        jButtSave = new javax.swing.JButton();
        jButtDel = new javax.swing.JButton();
        jButtNoSave = new javax.swing.JButton();
        jButtMod = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arabic Typesetting", 0, 48));
        jLabel1.setText("Receptii Materiale");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, materialeList, jListMaterial11, "bindMaterial1");
        jListBinding.setDetailBinding(org.jdesktop.beansbinding.ELProperty.create("${nume}"));
        bindingGroup.addBinding(jListBinding);

        jScrollPane1.setViewportView(jListMaterial11);

        jLabel2.setText("IdFurnizor");

        jLabel3.setText("Material");

        jLabel4.setText("Pret");

        jLabel5.setText("Stoc");

        jtxtIdFurnizor.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterial11, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idMaterial}"), jtxtIdFurnizor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtNumeMaterial.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterial11, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nume}"), jtxtNumeMaterial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtPret.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterial11, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.pret}"), jtxtPret, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtPret.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtPretKeyPressed(evt);
            }
        });

        jtxtStoc.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterial11, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.stocMaterial}"), jtxtStoc, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

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

        jCboFurnizori.setEnabled(false);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, furnizoriList, jCboFurnizori);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterial11, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.furnizori}"), jCboFurnizori, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel6.setText("Furnizor");

        jtxtIntrari.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterial11, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.intrariMaterial}"), jtxtIntrari, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel7.setText("TotalIntrariMateriale");

        jLabel8.setText("TotalIesiriMateriale");

        jtxtIesiri.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterial11, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cantitate}"), jtxtIesiri, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jButton1.setText("AddMateriale");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtxtCantitate.setEnabled(false);
        jtxtCantitate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtCantitateKeyPressed(evt);
            }
        });

        jLabel9.setText("IntrariMateriale");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButtNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtPreview))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jButton1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCboFurnizori, 0, 212, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtxtCantitate, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtPret, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtIntrari, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtIesiri, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtStoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtIdFurnizor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNumeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtIdFurnizor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtNumeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jCboFurnizori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtxtCantitate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtPret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtIntrari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtxtIesiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtStoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtNext)
                    .addComponent(jButtPreview))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtAdd.setText("Add");
        jButtAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtAdd.setEnabled(false);
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
        jButtDel.setEnabled(false);
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
                .addContainerGap(358, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtAddActionPerformed
        int n = JOptionPane.showConfirmDialog(this, "Adaugati Receptie Materialul?", "Adaugare receptii", JOptionPane.YES_NO_OPTION);
        if (n == 0) {

            this.setFocusTraversalPolicy(newPolicy);
        }

    }//GEN-LAST:event_jButtAddActionPerformed

    private void jButtPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtPreviewActionPerformed
        int bb = jListMaterial11.getMinSelectionIndex();
        if (bb != -1) {
            jListMaterial11.setSelectedIndex(jListMaterial11.getSelectedIndex() - 1);
            if (jListMaterial11.getSelectedIndex() >= 0)// 1
            {

                jListMaterial11.scrollRectToVisible(jListMaterial11.getCellBounds(jListMaterial11.getSelectedIndex(), jListMaterial11.getSelectedIndex()));//2
            }
        }
    }//GEN-LAST:event_jButtPreviewActionPerformed

    private void jButtNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtNextActionPerformed
        int bb = jListMaterial11.getMinSelectionIndex();
        if (bb != -1) {
            jListMaterial11.setSelectedIndex(jListMaterial11.getSelectedIndex() + 1);
            if (jListMaterial11.getSelectedIndex() >= 0)// 1
            {
                jListMaterial11.scrollRectToVisible(jListMaterial11.getCellBounds(jListMaterial11.getSelectedIndex(), jListMaterial11.getSelectedIndex()));//2
            }
        }
    }//GEN-LAST:event_jButtNextActionPerformed

    private void jButtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtSaveActionPerformed
        int n = JOptionPane.showConfirmDialog(this, "Salvati Materialul?", "Salvati client", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            jButtAdd.setEnabled(false);
            jButtSave.setEnabled(false);
            jButtDel.setEnabled(false);
            jtxtNumeMaterial.setEnabled(false);
            jCboFurnizori.setEnabled(false);
            jtxtPret.setEnabled(false);
            jtxtCantitate.setEnabled(false);
            jtxtStoc.setEnabled(false);
            jtxtIntrari.setEnabled(false);
            jtxtIesiri.setEnabled(false);

            jButtNext.setEnabled(true);
            jButtPreview.setEnabled(true);
            jListMaterial11.setEnabled(true);
            jButtNoSave.setEnabled(false);
            jButtMod.setEnabled(true);

            Materiale materialeCurent = materialeList.get(jListMaterial11.getSelectedIndex()); // 1
            materialeCurent.setPret(Integer.parseInt(jtxtPret.getText()));
            int cant = Integer.parseInt(jtxtCantitate.getText());
            int intrariMaterial;
            if (!(materialeCurent.getIntrariMaterial() == null)) {
                intrariMaterial = materialeCurent.getIntrariMaterial();
            } else {
                intrariMaterial = 0;
            }
            materialeCurent.setIntrariMaterial(intrariMaterial + cant);
            if (materialeCurent.getIesiriMaterial() == null) {
                materialeCurent.setIesiriMaterial(0);
            }
            int vmat = materialeCurent.getIntrariMaterial() - materialeCurent.getIesiriMaterial();
            materialeCurent.setStocMaterial(vmat);
            if (!em.contains(materialeCurent)) {
                em.merge(materialeCurent); // 1
            }
            em.getTransaction().begin(); // 2
            em.getTransaction().commit();
            jtxtCantitate.setText("0");
        }
        jButtMod.requestFocusInWindow();
    }//GEN-LAST:event_jButtSaveActionPerformed

    private void jButtDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtDelActionPerformed
        int n = JOptionPane.showConfirmDialog(this, "Stergeti Materialul?", "Stergeti client", JOptionPane.YES_NO_OPTION);
        if (n == 0) {

            Materiale materialeCurent = materialeList.get(jListMaterial11.getSelectedIndex()); // 1
            em.getTransaction().begin(); // 1
            if (em.contains(materialeCurent)) // 2
            {
                em.remove(materialeCurent); //2
            }
            materialeList.remove(materialeCurent); // 3
            em.getTransaction().commit(); // 1
        }

    }//GEN-LAST:event_jButtDelActionPerformed

    private void jButtNoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtNoSaveActionPerformed
        refreshIntrariMateriale();
        jButtSave.setEnabled(false);
        jtxtNumeMaterial.setEnabled(false);
        jCboFurnizori.setEnabled(false);

        jtxtPret.setEnabled(false);
        jtxtCantitate.setEnabled(false);

        jtxtStoc.setEnabled(false);
        jtxtIntrari.setEnabled(false);
        jtxtIesiri.setEnabled(false);

        jButtPreview.setEnabled(true);
        jButtNext.setEnabled(true);
        jButtNoSave.setEnabled(false);
        jListMaterial11.setEnabled(true);
        jButtAdd.setEnabled(false);
        jButtMod.setEnabled(true);
        jButtDel.setEnabled(false);
        jButtMod.requestFocusInWindow();
        this.setFocusTraversalPolicy(newPolicy);
}//GEN-LAST:event_jButtNoSaveActionPerformed

    private void jButtModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtModActionPerformed
        if (jListMaterial11.getSelectedIndex() != -1) {
            jButtSave.setEnabled(true);
            jButtDel.setEnabled(false);
            jtxtNumeMaterial.setEnabled(false);
            jCboFurnizori.setEnabled(false);

            jtxtPret.setEnabled(true);
            jtxtCantitate.setEnabled(true);

            jtxtStoc.setEnabled(false);
            jtxtIntrari.setEnabled(false);
            jtxtIesiri.setEnabled(false);

            jButtNext.setEnabled(false);
            jButtPreview.setEnabled(false);
            jListMaterial11.setEnabled(false);
            jButtNoSave.setEnabled(true);
            jButtAdd.setEnabled(false);
            jButtMod.setEnabled(false);
            this.setFocusTraversalPolicy(newPolicy);
        } else {
            JOptionPane.showMessageDialog(this, "Nu ati selectat un material");
            jButtSave.setEnabled(false);
            jtxtNumeMaterial.setEnabled(false);
            jCboFurnizori.setEnabled(false);
            jButtAdd.setEnabled(false);

            jtxtPret.setEnabled(false);
            jtxtCantitate.setEnabled(false);

            jtxtStoc.setEnabled(false);
            jtxtIntrari.setEnabled(false);
            jtxtIesiri.setEnabled(false);

            jButtNext.setEnabled(true);
            jButtPreview.setEnabled(true);
            jButtNoSave.setEnabled(false);
            jButtMod.setEnabled(true);
            jButtMod.requestFocusInWindow();
        }
}//GEN-LAST:event_jButtModActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButtSave.setEnabled(false);
        jtxtNumeMaterial.setEnabled(false);
        jCboFurnizori.setEnabled(false);
        jButtAdd.setEnabled(false);

        jtxtPret.setEnabled(false);
        jtxtCantitate.setEnabled(false);

        jtxtStoc.setEnabled(false);
        jtxtIntrari.setEnabled(false);
        jtxtIesiri.setEnabled(false);

        jButtNext.setEnabled(true);
        jButtPreview.setEnabled(true);
        jButtNoSave.setEnabled(false);
        jButtMod.setEnabled(true);
        jButtMod.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MaterialeView dialog = new MaterialeView(new javax.swing.JFrame(), true, wsal);
        JFrame f = new JFrame("Materiale ");
        f.setSize(700, 550);
        f.add(dialog);
        f.setVisible(true);
        refreshIntrariMateriale1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtCantitateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantitateKeyPressed
        if (evt.getKeyCode() == 10) {
            jtxtPret.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtxtCantitateKeyPressed

    private void jtxtPretKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPretKeyPressed
        if (evt.getKeyCode() == 10) {
            jButtSave.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtxtPretKeyPressed
    private void refreshIntrariMateriale() {

        Integer idxMaterial = jListMaterial11.getSelectedIndex();
        Materiale mat;
        if (idxMaterial != -1) {
            mat = materialeList.get(idxMaterial);
        } else {
            mat = materialeList.get(0);
        }
        materialeList.clear();
        materialeList.addAll(materialeQuery.getResultList());
        bindingGroup.getBinding("bindMaterial1").unbind();
        bindingGroup.getBinding("bindMaterial1").bind();
        jtxtCantitate.setText("");

        int indfurn = materialeList.indexOf(mat);
        if (indfurn != -1) {
            jListMaterial11.setSelectedIndex(idxMaterial);
        } else {
            jListMaterial11.setSelectedIndex(0);
        }
    }

    private void refreshIntrariMateriale1() {
        Integer idxMaterial = jListMaterial11.getSelectedIndex();
        materialeList.clear();
        materialeList.addAll(materialeQuery.getResultList());


        jListMaterial11.setEnabled(true);
        bindingGroup.getBinding("bindMaterial1").unbind();
        bindingGroup.getBinding("bindMaterial1").bind();
        jtxtCantitate.setText("");

        jListMaterial11.setSelectedIndex(materialeList.size() - 1);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Salariati sss = new Salariati();
                sss.setTip("administrator");
                ReceptiiMaterialeView dialog = new ReceptiiMaterialeView(new javax.swing.JFrame(), true, sss);
                if (dialog.wsal.getTip() == sss.getTip()) {
                    JFrame f = new JFrame("Receptii Materiale ");
                    f.setSize(700, 550);
                    f.add(dialog);
                    f.setVisible(true);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager em;
    private java.util.List<ent.Furnizori> furnizoriList;
    private javax.persistence.Query furnizoriQuery;
    private javax.swing.JButton jButtAdd;
    private javax.swing.JButton jButtDel;
    private javax.swing.JButton jButtMod;
    private javax.swing.JButton jButtNext;
    private javax.swing.JButton jButtNoSave;
    private javax.swing.JButton jButtPreview;
    private javax.swing.JButton jButtSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCboFurnizori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListMaterial11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtCantitate;
    private javax.swing.JTextField jtxtIdFurnizor;
    private javax.swing.JTextField jtxtIesiri;
    private javax.swing.JTextField jtxtIntrari;
    private javax.swing.JTextField jtxtNumeMaterial;
    private javax.swing.JTextField jtxtPret;
    private javax.swing.JTextField jtxtStoc;
    private java.util.List<ent.Materiale> materialeList;
    private javax.persistence.Query materialeQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
